package dao

import io.ebean.Database
import models.BillModel


class BillDao(val db : Database){

    fun add(bill : BillModel) : BillModel{
        db.save(bill)
        return db.find( BillModel::class.java, bill.billId)!!
    }

    fun get(id : Int): BillModel {
        return db.find( BillModel::class.java, id)!!
    }

    fun update(bill : BillModel) : BillModel {
        var billOld  = db.find( BillModel::class.java, bill.billId)
        db.update(bill)
        return db.find( BillModel::class.java, bill.billId)!!
    }

    fun delete(id : Int): Boolean {

        return db.delete(db.find( BillModel::class.java, id))
    }

}