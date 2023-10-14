package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014\u00a8\u0006!"}, d2 = {"Lmodels/Bills;", "", "billId", "", "billUsers", "", "billPaidBy", "billAmount", "", "groupId", "billStatus", "", "(ILjava/util/List;IDIZ)V", "getBillAmount", "()D", "setBillAmount", "(D)V", "getBillId", "()I", "setBillId", "(I)V", "getBillPaidBy", "setBillPaidBy", "getBillStatus", "()Z", "setBillStatus", "(Z)V", "getBillUsers", "()Ljava/util/List;", "setBillUsers", "(Ljava/util/List;)V", "getGroupId", "setGroupId", "bill-split-hu17"})
public final class Bills {
    private int billId;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> billUsers;
    private int billPaidBy;
    private double billAmount;
    private int groupId;
    private boolean billStatus;
    
    public final int getBillId() {
        return 0;
    }
    
    public final void setBillId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getBillUsers() {
        return null;
    }
    
    public final void setBillUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
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
    
    public Bills(int billId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> billUsers, int billPaidBy, double billAmount, int groupId, boolean billStatus) {
        super();
    }
}