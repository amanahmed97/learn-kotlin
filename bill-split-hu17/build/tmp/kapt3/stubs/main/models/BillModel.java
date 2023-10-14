package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!\u00a8\u0006&"}, d2 = {"Lmodels/BillModel;", "Lio/ebean/Model;", "billId", "", "billPaidBy", "billAmount", "", "groupId", "billStatus", "", "(IIDIZ)V", "getBillAmount", "()D", "setBillAmount", "(D)V", "getBillId", "()I", "setBillId", "(I)V", "getBillPaidBy", "setBillPaidBy", "getBillStatus", "()Z", "setBillStatus", "(Z)V", "getGroupId", "setGroupId", "transaction", "", "Lmodels/TransactionModel;", "getTransaction", "()Ljava/util/List;", "setTransaction", "(Ljava/util/List;)V", "users", "Lmodels/UserModel;", "getUsers", "setUsers", "bill-split-hu17"})
@javax.persistence.Entity()
public final class BillModel extends io.ebean.Model {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "bill")
    private java.util.List<models.TransactionModel> transaction;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToMany()
    private java.util.List<models.UserModel> users;
    @javax.persistence.Id()
    private int billId;
    private int billPaidBy;
    private double billAmount;
    private int groupId;
    private boolean billStatus;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.TransactionModel> getTransaction() {
        return null;
    }
    
    public final void setTransaction(@org.jetbrains.annotations.NotNull()
    java.util.List<models.TransactionModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.UserModel> getUsers() {
        return null;
    }
    
    public final void setUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<models.UserModel> p0) {
    }
    
    public final int getBillId() {
        return 0;
    }
    
    public final void setBillId(int p0) {
    }
    
    public final int getBillPaidBy() {
        return 0;
    }
    
    public final void setBillPaidBy(int p0) {
    }
    
    public final double getBillAmount() {
        return 0.0;
    }
    
    public final void setBillAmount(double p0) {
    }
    
    public final int getGroupId() {
        return 0;
    }
    
    public final void setGroupId(int p0) {
    }
    
    public final boolean getBillStatus() {
        return false;
    }
    
    public final void setBillStatus(boolean p0) {
    }
    
    public BillModel(int billId, int billPaidBy, double billAmount, int groupId, boolean billStatus) {
        super();
    }
}