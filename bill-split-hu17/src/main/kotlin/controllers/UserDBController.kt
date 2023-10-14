package controllers

import io.ebean.Database
import models.UserModel
import models.Users
import services.Service
import services.UserService
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/api/v2/user")
@Produces(MediaType.APPLICATION_JSON)
class UserDBController(private var service: UserService) {


    @GET
    fun getUserApi(user: Users): UserModel? {
        return service.getUser(user.userId)
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun postUserApi(user : UserModel): String {
        service.addUser(user.userId,user.userName,user.userEmail,user.userPhone,user.userTotalBalance)
//       var response =  service.getUser(user.userId)
        return "User Added"
//       return service.getUser(user.userId)
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    fun putUserApi(user : Users) : UserModel? {
        service.updateUser(user.userId,user.userName,user.userEmail,user.userPhone,user.userTotalBalance)
        return service.getUser(user.userId)
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    fun deleteUserApi(user : Users) : String {
        service.deleteUser(user.userId)
        return "User Deleted"
    }
}