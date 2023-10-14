package services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ<\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fJ<\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lservices/BillService;", "", "billDao", "Ldao/BillDao;", "userService", "Lservices/UserService;", "transactionService", "Lservices/TransactionService;", "(Ldao/BillDao;Lservices/UserService;Lservices/TransactionService;)V", "getBillDao", "()Ldao/BillDao;", "getTransactionService", "()Lservices/TransactionService;", "getUserService", "()Lservices/UserService;", "addBill", "Lmodels/BillModel;", "id", "", "users", "", "paidBy", "amount", "", "gid", "status", "", "deleteBill", "getBill", "settleBill", "settle", "Lmodels/TransactionModel;", "updateBill", "bill-split-hu17"})
public final class BillService {
    @org.jetbrains.annotations.NotNull()
    private final dao.BillDao billDao = null;
    @org.jetbrains.annotations.NotNull()
    private final services.UserService userService = null;
    @org.jetbrains.annotations.NotNull()
    private final services.TransactionService transactionService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final models.BillModel addBill(int id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> users, int paidBy, double amount, int gid, boolean status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.BillModel getBill(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.BillModel updateBill(int id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> users, int paidBy, double amount, int gid, boolean status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.BillModel deleteBill(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.BillModel settleBill(@org.jetbrains.annotations.NotNull()
    models.TransactionModel settle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dao.BillDao getBillDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final services.UserService getUserService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final services.TransactionService getTransactionService() {
        return null;
    }
    
    public BillService(@org.jetbrains.annotations.NotNull()
    dao.BillDao billDao, @org.jetbrains.annotations.NotNull()
    services.UserService userService, @org.jetbrains.annotations.NotNull()
    services.TransactionService transactionService) {
        super();
    }
}