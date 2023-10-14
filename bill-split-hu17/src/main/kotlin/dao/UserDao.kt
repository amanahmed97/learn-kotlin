package dao

import io.ebean.Database
import models.UserModel
import models.query.QUserModel

class UserDao(val db : Database){

    fun add(user : UserModel): UserModel{
        db.save(user)
        return db.find( UserModel::class.java, user.userId)!!
    }

    fun get(id : Int): UserModel? {
        var test = QUserModel().userName.equalTo("user1").findOne()
        return db.find( UserModel::class.java, id)
    }

    fun update(user : UserModel): UserModel {
        var userOld  = db.find( UserModel::class.java, user.userId)
        db.update(user)
        return db.find( UserModel::class.java, user.userId)!!
    }

    fun delete(id : Int): Boolean {

        return db.delete(db.find( UserModel::class.java, id))
    }

}

/*
            return db.find( UserModel::class.java, user.userId)
            .where().eq("userId",user.userId)
            .findOne()
 */