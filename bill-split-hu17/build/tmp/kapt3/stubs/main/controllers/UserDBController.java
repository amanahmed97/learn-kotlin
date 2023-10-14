package controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcontrollers/UserDBController;", "", "service", "Lservices/UserService;", "(Lservices/UserService;)V", "deleteUserApi", "", "user", "Lmodels/Users;", "getUserApi", "Lmodels/UserModel;", "postUserApi", "putUserApi", "bill-split-hu17"})
@javax.ws.rs.Produces(value = {"application/json"})
@javax.ws.rs.Path(value = "/api/v2/user")
public final class UserDBController {
    private services.UserService service;
    
    @org.jetbrains.annotations.Nullable()
    @javax.ws.rs.GET()
    public final models.UserModel getUserApi(@org.jetbrains.annotations.NotNull()
    models.Users user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Consumes(value = {"application/json"})
    @javax.ws.rs.POST()
    public final java.lang.String postUserApi(@org.jetbrains.annotations.NotNull()
    models.UserModel user) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @javax.ws.rs.Consumes(value = {"application/json"})
    @javax.ws.rs.PUT()
    public final models.UserModel putUserApi(@org.jetbrains.annotations.NotNull()
    models.Users user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Consumes(value = {"application/json"})
    @javax.ws.rs.DELETE()
    public final java.lang.String deleteUserApi(@org.jetbrains.annotations.NotNull()
    models.Users user) {
        return null;
    }
    
    public UserDBController(@org.jetbrains.annotations.NotNull()
    services.UserService service) {
        super();
    }
}