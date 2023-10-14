package controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u0007J\u0012\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcontrollers/TransactionDBController;", "", "service", "Lservices/TransactionService;", "(Lservices/TransactionService;)V", "userIndividualBalance", "", "userId1", "", "userId2", "userTotalBalance", "userId", "bill-split-hu17"})
@javax.ws.rs.Produces(value = {"application/json"})
@javax.ws.rs.Path(value = "/api/v2/transaction")
public final class TransactionDBController {
    private services.TransactionService service;
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.POST()
    @javax.ws.rs.Path(value = "/total-balance")
    public final java.lang.String userTotalBalance(@javax.ws.rs.QueryParam(value = "userId")
    int userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.POST()
    @javax.ws.rs.Path(value = "/individual-balance")
    public final java.lang.String userIndividualBalance(@javax.ws.rs.QueryParam(value = "userId1")
    int userId1, @javax.ws.rs.QueryParam(value = "userId2")
    int userId2) {
        return null;
    }
    
    public TransactionDBController(@org.jetbrains.annotations.NotNull()
    services.TransactionService service) {
        super();
    }
}