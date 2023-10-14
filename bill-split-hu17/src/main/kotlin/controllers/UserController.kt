package controllers

import io.ebean.Database
import models.Customer
import models.Test
import models.Users
import services.Service
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/api/v1/user")
@Produces(MediaType.APPLICATION_JSON)
class UserController(private var service: Service, val db : Database) {

//
//    @GET
//    fun getUserApi(user: Users): Users {
////    var func = Service()
////    service.addUser(0,"user1","user1@gmail.com","9731648271",0.0)
//    return service.userList.get(user.userId)
//    }
//
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
////    fun postApi(@QueryParam("name") name : String): String {
////        println("NAME :" + name)
//    fun postUserApi(user : Users): Users {
////        var service = Service()
//        println("NAME :" + user.userName)
//        var response : Int = service.addUser(user.userId,user.userName,user.userEmail,user.userPhone,user.userTotalBalance)
//        var userList = service.userList
//        println("ADDED NAME : "+ userList.get(0).userName)
//        //return user
//        return userList.get(user.userId)
//    }
//
//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    fun putUserApi(user : Users) : Users {
//        var response : String = service.updateUser(user.userId,user.userName,user.userEmail,user.userPhone,user.userTotalBalance)
//        var userList = service.userList
//        //return user
//        return userList.get(user.userId)
//    }
//
//    @DELETE
//    @Consumes(MediaType.APPLICATION_JSON)
//    fun deleteUserApi(user : Users) : String {
//        var response : String = service.deleteUser(user.userId)
//        var userList = service.userList
//        //return user
//        return "User Deleted"
//    }
//
//    @Path("/testdb")
//    @GET
//    fun testApi() : String {
//        val customer = Customer()
//        customer.name  = "Hello entity bean"
//        val test = Test(0,"")
//        test.name  = "Hello entity bean"
////        customer.delete();
//        db.save(customer)
//        db.save(test)
//        return "DB TESTED"
//    }


}

/*JSON Data :
    {
        "userId" : 0,
        "userName" : "user1",
        "userEmail" : "user1@gmail.com",
        "userPhone" : "9731627631",
        "userTotalBalance" : 0.0
    }
*/