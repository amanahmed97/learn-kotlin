package dao

import io.ebean.Database
import models.TransactionModel

class TransactionDao(val db : Database){

    fun add(transaction : TransactionModel) {

        return db.save(transaction)
    }

    fun get(id : Int): TransactionModel {
        return db.find( TransactionModel::class.java, id)!!
    }

    fun update(transaction : TransactionModel) {
        var transactionOld  = db.find( TransactionModel::class.java, transaction.tId)
        return db.update(transaction)
    }

    fun delete(id : Int): Boolean {

        return db.delete(db.find( TransactionModel::class.java, id))
    }

    fun totalBalance(): MutableList<TransactionModel> {
        return db.find(TransactionModel::class.java).findList()
    }

}