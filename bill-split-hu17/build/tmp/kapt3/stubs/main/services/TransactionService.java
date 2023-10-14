package services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lservices/TransactionService;", "", "transactionDao", "Ldao/TransactionDao;", "(Ldao/TransactionDao;)V", "getTransactionDao", "()Ldao/TransactionDao;", "addTransaction", "", "transaction", "Lmodels/TransactionModel;", "getTransaction", "id", "", "individualBalance", "", "userid1", "userid2", "totalBalance", "userid", "updateTransaction", "bill-split-hu17"})
public final class TransactionService {
    @org.jetbrains.annotations.NotNull()
    private final dao.TransactionDao transactionDao = null;
    
    public final void addTransaction(@org.jetbrains.annotations.NotNull()
    models.TransactionModel transaction) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.TransactionModel getTransaction(int id) {
        return null;
    }
    
    public final void updateTransaction(@org.jetbrains.annotations.NotNull()
    models.TransactionModel transaction) {
    }
    
    public final double totalBalance(int userid) {
        return 0.0;
    }
    
    public final double individualBalance(int userid1, int userid2) {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dao.TransactionDao getTransactionDao() {
        return null;
    }
    
    public TransactionService(@org.jetbrains.annotations.NotNull()
    dao.TransactionDao transactionDao) {
        super();
    }
}