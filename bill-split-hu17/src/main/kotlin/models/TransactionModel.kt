package models

import io.ebean.Model
import javax.persistence.Entity
import javax.persistence.ForeignKey
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class TransactionModel(
    @Id
    var tId:Int,
    var tBillId:Int,
    var tUser1 : Int,
    var tUser2: Int,
    var tAmount: Double
) : Model()
{
    @ManyToOne()
//    lateinit
    lateinit var bill : BillModel
}