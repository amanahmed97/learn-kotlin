package dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Ldao/TransactionDao;", "", "db", "Lio/ebean/Database;", "(Lio/ebean/Database;)V", "getDb", "()Lio/ebean/Database;", "add", "", "transaction", "Lmodels/TransactionModel;", "delete", "", "id", "", "get", "totalBalance", "", "update", "bill-split-hu17"})
public final class TransactionDao {
    @org.jetbrains.annotations.NotNull()
    private final io.ebean.Database db = null;
    
    public final void add(@org.jetbrains.annotations.NotNull()
    models.TransactionModel transaction) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.TransactionModel get(int id) {
        return null;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    models.TransactionModel transaction) {
    }
    
    public final boolean delete(int id) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.TransactionModel> totalBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.Database getDb() {
        return null;
    }
    
    public TransactionDao(@org.jetbrains.annotations.NotNull()
    io.ebean.Database db) {
        super();
    }
}