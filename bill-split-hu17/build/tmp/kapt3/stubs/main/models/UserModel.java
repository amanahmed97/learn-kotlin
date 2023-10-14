package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rR$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006\""}, d2 = {"Lmodels/UserModel;", "Lio/ebean/Model;", "userId", "", "userName", "", "userEmail", "userPhone", "userTotalBalance", "", "bill", "", "Lmodels/BillModel;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/util/List;)V", "getBill", "()Ljava/util/List;", "setBill", "(Ljava/util/List;)V", "getUserEmail", "()Ljava/lang/String;", "setUserEmail", "(Ljava/lang/String;)V", "getUserId", "()I", "setUserId", "(I)V", "getUserName", "setUserName", "getUserPhone", "setUserPhone", "getUserTotalBalance", "()D", "setUserTotalBalance", "(D)V", "bill-split-hu17"})
@javax.persistence.Entity()
public final class UserModel extends io.ebean.Model {
    @javax.persistence.Id()
    private int userId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userEmail;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userPhone;
    private double userTotalBalance;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToMany()
    private java.util.List<models.BillModel> bill;
    
    public final int getUserId() {
        return 0;
    }
    
    public final void setUserId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserEmail() {
        return null;
    }
    
    public final void setUserEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserPhone() {
        return null;
    }
    
    public final void setUserPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getUserTotalBalance() {
        return 0.0;
    }
    
    public final void setUserTotalBalance(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.BillModel> getBill() {
        return null;
    }
    
    public final void setBill(@org.jetbrains.annotations.NotNull()
    java.util.List<models.BillModel> p0) {
    }
    
    public UserModel(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String userEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String userPhone, double userTotalBalance, @org.jetbrains.annotations.NotNull()
    java.util.List<models.BillModel> bill) {
        super();
    }
}