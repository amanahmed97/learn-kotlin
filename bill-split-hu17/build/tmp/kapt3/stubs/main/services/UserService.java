package services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ.\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lservices/UserService;", "", "userDao", "Ldao/UserDao;", "(Ldao/UserDao;)V", "getUserDao", "()Ldao/UserDao;", "addUser", "Lmodels/UserModel;", "id", "", "name", "", "email", "phone", "totalBal", "", "deleteUser", "", "getUser", "updateUser", "bill-split-hu17"})
public final class UserService {
    @org.jetbrains.annotations.NotNull()
    private final dao.UserDao userDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final models.UserModel addUser(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, double totalBal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.UserModel getUser(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.UserModel updateUser(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, double totalBal) {
        return null;
    }
    
    public final boolean deleteUser(int id) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dao.UserDao getUserDao() {
        return null;
    }
    
    public UserService(@org.jetbrains.annotations.NotNull()
    dao.UserDao userDao) {
        super();
    }
}