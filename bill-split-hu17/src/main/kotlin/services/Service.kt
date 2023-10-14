package services

import models.Bills
import models.Transactions
import models.Users
import javax.ws.rs.*

//@Path("/")
class Service{

//    var userList = mutableListOf<Users>()
//    var billList = mutableListOf<Bills>()
//    var transactionList = mutableListOf<Transactions>()
//
//    //@Path("/add-user")
//    //@POST
//    fun addUser(id: Int, name: String, email: String, phone: String,totalBal:Double): Int {
//        var user = Users(id,name,email,phone,totalBal)
//        userList.add(id,user)
//        return userList.get(id).userId
//    }
//
//    //@Path("/get-user")
//    //@GET
//    fun getUser(id: Int): Int {
//
//        return userList.get(id).userId
//    }
//
//    //@Path("/update-user")
//    //@PUT
//    fun updateUser(id: Int, name: String, email: String, phone: String,totalBal:Double): String {
//        var user = userList.get(id)
//        userList.get(id).userName = name
//        userList.get(id).userEmail = email
//        userList.get(id).userPhone = phone
//        return userList.get(id).userEmail
//    }
//
//    //@Path("/delete-user")
//    //@DELETE
//    fun deleteUser(id: Int): String {
//        println("DELETED : ${userList.get(id).userId}")
//        userList.removeAt(id)
//        return "Deleted"
//    }
//
//    //Bills
//
//    fun addBill(id: Int, users: List<Int>, paidBy: Int,amount: Double, gid: Int, status:Boolean): Int {
//        var bill = Bills(id, users, paidBy,amount,gid,status)
//        billList.add(0,bill)
//        userList.get(paidBy).userTotalBalance += (amount-(amount/users.size))
//        for (u in users){
//            if(u != paidBy){
//                userList.get(u).userTotalBalance += -(amount/users.size)
//            }
//        }
//
//        return billList.get(0).billId
//    }
//
//    fun getBill(id: Int): Int {
//
//        return billList.get(0).billId
//    }
//
//    fun updateBill(id: Int, users: List<Int>, paidBy: Int,amount: Double, gid: Int,status:Boolean): Double {
//        var bill = billList.get(id)
//        userList.get(paidBy).userTotalBalance -= (billList.get(id).billAmount -(billList.get(id).billAmount/users.size))
//        for (u in users){
//            if(u != paidBy){
//                userList.get(u).userTotalBalance -= -(billList.get(id).billAmount/users.size)
//            }
//        }
//
//        billList.get(id).billUsers = users
//        billList.get(id).billPaidBy = paidBy
//        billList.get(id).billAmount = amount
//        billList.get(id).groupId = gid
//        billList.get(id).billStatus = status
//
//        userList.get(paidBy).userTotalBalance += amount
//        for (u in users){
//            if(u != paidBy){
//                userList.get(u).userTotalBalance += -(amount/users.size)
//            }
//        }
//
//        return billList.get(id).billAmount
//    }
//
//    fun deleteBill(id: Int): String {
//        println("DELETED : ${billList.get(id).billId}")
//
//        userList.get(billList.get(id).billPaidBy).userTotalBalance -= (billList.get(id).billAmount -(billList.get(id).billAmount/billList.get(id).billUsers.size))
//        for (u in billList.get(id).billUsers){
//            if(u != billList.get(id).billPaidBy){
//                userList.get(u).userTotalBalance -= -(billList.get(id).billAmount/billList.get(id).billUsers.size)
//            }
//        }
//        billList.removeAt(id)
//        return "Deleted"
//    }
//
//    fun settleBill(id: Int): String {
//
//        userList.get(billList.get(id).billPaidBy).userTotalBalance -= billList.get(id).billAmount
//
//        for (u in billList.get(id).billUsers){
//            if(u != billList.get(id).billPaidBy){
//                userList.get(u).userTotalBalance += (billList.get(id).billAmount/billList.get(id).billUsers.size)
//            }
//        }
//        billList.get(id).billStatus = false
//        return "Bill Settled"
//    }

}
