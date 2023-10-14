package models

import io.ebean.Model
import javax.persistence.Entity
import javax.persistence.Id

class Users(var userId: Int, var userName: String, var userEmail: String, var userPhone: String,var userTotalBalance: Double) {
//    constructor() : this(-1, "", "", "", -1.1);
//    var userId : Int = userId
//    var userName : String = ""
//    var userEmail : String = ""
//    var userPhone : String = ""

}

class Bills(var billId: Int,var billUsers: List<Int>,var billPaidBy: Int,var billAmount: Double,var groupId: Int,var billStatus: Boolean) {
//    constructor() : this(-1, emptyList(), -1,-1.0, -1,false);
//    var billId : Int = -1
//    var billUsers = mutableListOf<Users>()
//    var billAmount : Double = -1.1
//    var groupId : Int =-1

}

class Groups(var groupId: Int,var groupUsers: List<Users>,var bills: List<Bills>) {
//    var groupId : Int =-1
//    var groupUsers = mutableListOf<Users>()
//    var bills = mutableListOf<Bills>()

}

class Transactions(var tId:Int, var tBillId:Int,var tUser1 : Int, var tUser2: Int, var tAmount: Double){
}

//class Settle(var tId:Int, var tBillId:Int,var tUser1 : Int, var tUser2: Int, var tAmount: Double)

@Entity
class Customer : Model() {

    @Id
    var id: Long = 0

    var name: String? = null

}

@Entity
class Test  (
    @Id
    var id: Long,
    var name: String
): Model()
