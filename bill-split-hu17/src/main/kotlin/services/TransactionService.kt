package services

import dao.TransactionDao
import models.TransactionModel
import models.query.QTransactionModel


class TransactionService(val transactionDao: TransactionDao){
    fun addTransaction(transaction : TransactionModel) {
//        var transaction = TransactionModel(id,name,email,phone,totalBal)
        return transactionDao.add(transaction)
    }

    fun getTransaction(id : Int): TransactionModel {
        return transactionDao.get(id)!!
    }

    fun updateTransaction(transaction : TransactionModel) {
//        var transaction = TransactionModel(id,name,email,phone,totalBal)
        return transactionDao.update(transaction)
    }

    fun totalBalance(userid : Int): Double {
        var transactionList = mutableListOf<TransactionModel>()
        transactionList = transactionDao.totalBalance()

        var totalAmount : Double = 0.0
        for(t in transactionList){
            if(t.tUser1 == userid){
                totalAmount += t.tAmount
            }
        }
        return totalAmount
    }

    fun individualBalance(userid1 : Int,userid2 : Int): Double {
        var transactionList = mutableListOf<TransactionModel>()
        transactionList = transactionDao.totalBalance()

        var individualAmount : Double = 0.0
        for(t in transactionList){
            if(t.tUser1 == userid1 && t.tUser2 == userid2){
                individualAmount += t.tAmount
            }
        }
        return individualAmount
    }
}