package models

import io.ebean.Model
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToMany

@Entity
class UserModel(
    @Id
    var userId: Int,
    var userName: String,
    var userEmail: String,
    var userPhone: String,
    var userTotalBalance: Double,
    @ManyToMany
    var bill : List<BillModel>  =  mutableListOf<BillModel>()

) : Model()