package models

import io.ebean.Model
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.OneToMany

@Entity
class BillModel(
    @Id
    var billId: Int,
//    var billUsers: List<Int>,
    var billPaidBy: Int,
    var billAmount: Double,
    var groupId: Int,
    var billStatus: Boolean

) : Model() {
    @OneToMany(mappedBy = "bill")
    var transaction: MutableList<TransactionModel> = mutableListOf()
    @ManyToMany
    var users : MutableList<UserModel>  = mutableListOf<UserModel>()//<UserModel>
//    var users : MutableList<UserModel>
}