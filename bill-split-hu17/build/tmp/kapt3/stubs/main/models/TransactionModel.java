package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017\u00a8\u0006\u001e"}, d2 = {"Lmodels/TransactionModel;", "Lio/ebean/Model;", "tId", "", "tBillId", "tUser1", "tUser2", "tAmount", "", "(IIIID)V", "bill", "Lmodels/BillModel;", "getBill", "()Lmodels/BillModel;", "setBill", "(Lmodels/BillModel;)V", "getTAmount", "()D", "setTAmount", "(D)V", "getTBillId", "()I", "setTBillId", "(I)V", "getTId", "setTId", "getTUser1", "setTUser1", "getTUser2", "setTUser2", "bill-split-hu17"})
@javax.persistence.Entity()
public final class TransactionModel extends io.ebean.Model {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToOne()
    public models.BillModel bill;
    @javax.persistence.Id()
    private int tId;
    private int tBillId;
    private int tUser1;
    private int tUser2;
    private double tAmount;
    
    @org.jetbrains.annotations.NotNull()
    public final models.BillModel getBill() {
        return null;
    }
    
    public final void setBill(@org.jetbrains.annotations.NotNull()
    models.BillModel p0) {
    }
    
    public final int getTId() {
        return 0;
    }
    
    public final void setTId(int p0) {
    }
    
    public final int getTBillId() {
        return 0;
    }
    
    public final void setTBillId(int p0) {
    }
    
    public final int getTUser1() {
        return 0;
    }
    
    public final void setTUser1(int p0) {
    }
    
    public final int getTUser2() {
        return 0;
    }
    
    public final void setTUser2(int p0) {
    }
    
    public final double getTAmount() {
        return 0.0;
    }
    
    public final void setTAmount(double p0) {
    }
    
    public TransactionModel(int tId, int tBillId, int tUser1, int tUser2, double tAmount) {
        super();
    }
}