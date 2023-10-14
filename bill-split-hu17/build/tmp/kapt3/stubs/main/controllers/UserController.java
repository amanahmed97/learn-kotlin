package controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcontrollers/UserController;", "", "service", "Lservices/Service;", "db", "Lio/ebean/Database;", "(Lservices/Service;Lio/ebean/Database;)V", "getDb", "()Lio/ebean/Database;", "bill-split-hu17"})
@javax.ws.rs.Produces(value = {"application/json"})
@javax.ws.rs.Path(value = "/api/v1/user")
public final class UserController {
    private services.Service service;
    @org.jetbrains.annotations.NotNull()
    private final io.ebean.Database db = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.Database getDb() {
        return null;
    }
    
    public UserController(@org.jetbrains.annotations.NotNull()
    services.Service service, @org.jetbrains.annotations.NotNull()
    io.ebean.Database db) {
        super();
    }
}