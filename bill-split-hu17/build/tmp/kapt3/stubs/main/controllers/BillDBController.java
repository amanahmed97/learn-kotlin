package controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcontrollers/BillDBController;", "", "service", "Lservices/BillService;", "(Lservices/BillService;)V", "deleteBillApi", "", "bill", "Lmodels/Bills;", "getBillApi", "postBillApi", "putBillApi", "settleBillApi", "settle", "Lmodels/TransactionModel;", "bill-split-hu17"})
@javax.ws.rs.Produces(value = {"application/json"})
@javax.ws.rs.Path(value = "/api/v2/bill")
public final class BillDBController {
    private services.BillService service;
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.GET()
    public final models.Bills getBillApi(@org.jetbrains.annotations.NotNull()
    models.Bills bill) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Consumes(value = {"application/json"})
    @javax.ws.rs.POST()
    public final java.lang.String postBillApi(@org.jetbrains.annotations.NotNull()
    models.Bills bill) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Consumes(value = {"application/json"})
    @javax.ws.rs.PUT()
    public final java.lang.String putBillApi(@org.jetbrains.annotations.NotNull()
    models.Bills bill) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Consumes(value = {"application/json"})
    @javax.ws.rs.DELETE()
    public final java.lang.String deleteBillApi(@org.jetbrains.annotations.NotNull()
    models.Bills bill) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Consumes(value = {"application/json"})
    @javax.ws.rs.POST()
    @javax.ws.rs.Path(value = "/settle-bill")
    public final java.lang.String settleBillApi(@org.jetbrains.annotations.NotNull()
    models.TransactionModel settle) {
        return null;
    }
    
    public BillDBController(@org.jetbrains.annotations.NotNull()
    services.BillService service) {
        super();
    }
}