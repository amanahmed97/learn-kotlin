package services

import dao.UserDao
import models.UserModel

class UserService(val userDao: UserDao){

    fun addUser(id: Int, name: String, email: String, phone: String,totalBal:Double): UserModel {
        var user = UserModel(id,name,email,phone,totalBal)
//        userDao.add(user)
        return userDao.add(user)
    }

    fun getUser(id : Int): UserModel {
        return userDao.get(id)!!
    }

    fun updateUser(id: Int, name: String, email: String, phone: String,totalBal:Double): UserModel {
        var user = UserModel(id,name,email,phone,totalBal)

        return userDao.update(user)
//        userDao.get(id)!!
    }

    fun deleteUser(id: Int): Boolean {

        return userDao.delete(id)
    }
}