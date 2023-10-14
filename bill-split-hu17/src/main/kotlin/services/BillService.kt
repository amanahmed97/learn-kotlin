package services

import dao.BillDao
import dao.UserDao
import models.BillModel
import models.Bills
import models.TransactionModel
import models.UserModel


class BillService(val billDao: BillDao,val userService: UserService,val transactionService: TransactionService) {

    fun addBill(id: Int, users: List<Int>, paidBy: Int,amount: Double, gid: Int, status:Boolean): BillModel {

        var bill = BillModel(id, paidBy,amount,gid,status)

        var usersList =  mutableListOf<UserModel>()
        var transactionList = mutableListOf<TransactionModel>()
        for(u in users){
            usersList.add(userService.getUser(u))
            var transaction = TransactionModel(0,id,u,paidBy,-(amount/(users.size+1)))
            transaction.bill = bill
            //transactionService.addTransaction(transaction)
            transactionList.add(transaction)
            transaction = TransactionModel(0,id,paidBy,u,(amount/(users.size+1)))
            transaction.bill = bill
            //transactionService.addTransaction(transaction)
            transactionList.add(transaction)
        }
//        bill.users.add(id,userService.getUser(paidBy))
        bill.users = usersList
        bill.transaction = transactionList
        billDao.add(bill)

        for(t in transactionList){
            transactionService.addTransaction(t)
        }


        return billDao.add(bill)
    }

    fun getBill(id : Int): BillModel {
        var billModel = billDao.get(id)
//        var bills = Bills(billModel.billId,billModel.billUsers,billModel.billPaidBy,billModel.billAmount,billModel.groupId,billModel.billStatus)
        return billDao.get(id)
    }

    fun updateBill(id: Int, users: List<Int>, paidBy: Int,amount: Double, gid: Int, status:Boolean): BillModel {

        var bill = billDao.get(id)
        bill.billAmount = amount

        for(t in bill.transaction){
            if(t.tAmount < 0){
                t.tAmount = -(amount/(users.size+1))
            }
            if(t.tAmount > 0){
                t.tAmount = (amount/(users.size+1))
            }

            transactionService.updateTransaction(t)
        }

        return billDao.update(bill)
    }

    fun deleteBill(id: Int): BillModel {

        var bill = billDao.get(id)
        bill.billAmount = 0.0

        for(t in bill.transaction){
            if(t.tAmount < 0){
                t.tAmount = 0.0
            }
            if(t.tAmount > 0){
                t.tAmount = 0.0
            }

            transactionService.updateTransaction(t)
        }
        bill.billStatus = false

        return billDao.update(bill)
    }

    fun settleBill(settle : TransactionModel): BillModel {

        var bill = billDao.get(settle.tBillId)


        for(t in bill.transaction){
            if(t.tUser1 == settle.tUser1 && t.tUser2 == settle.tUser2){
                t.tAmount += (settle.tAmount)
            }
            if(t.tUser1 == settle.tUser2 && t.tUser2 == settle.tUser1){
                t.tAmount += -(settle.tAmount)
            }

            transactionService.updateTransaction(t)
        }

        return billDao.update(bill)
    }
}