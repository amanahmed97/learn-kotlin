package models.query;

import java.lang.System;

/**
 * Query bean for TransactionModel.
 *
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@javax.annotation.Generated(value = {"io.ebean.querybean.kotlin-generator"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001(B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u0015\b\u0012\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u00a2\u0006\u0002\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b\'\u0010\u001e\u00a8\u0006)"}, d2 = {"Lmodels/query/QTransactionModel;", "Lio/ebean/typequery/TQRootBean;", "Lmodels/TransactionModel;", "database", "Lio/ebean/Database;", "(Lio/ebean/Database;)V", "()V", "dummy", "", "(Z)V", "fetchGroupQuery", "Lio/ebean/Query;", "(Lio/ebean/Query;)V", "bill", "Lmodels/query/assoc/QAssocBillModel;", "getBill", "()Lmodels/query/assoc/QAssocBillModel;", "setBill", "(Lmodels/query/assoc/QAssocBillModel;)V", "tAmount", "Lio/ebean/typequery/PDouble;", "getTAmount", "()Lio/ebean/typequery/PDouble;", "setTAmount", "(Lio/ebean/typequery/PDouble;)V", "tBillId", "Lio/ebean/typequery/PInteger;", "getTBillId", "()Lio/ebean/typequery/PInteger;", "setTBillId", "(Lio/ebean/typequery/PInteger;)V", "tId", "getTId", "setTId", "tUser1", "getTUser1", "setTUser1", "tUser2", "getTUser2", "setTUser2", "Companion", "bill-split-hu17"})
@io.ebean.typequery.TypeQueryBean()
public final class QTransactionModel extends io.ebean.typequery.TQRootBean<models.TransactionModel, models.query.QTransactionModel> {
    @org.jetbrains.annotations.NotNull()
    public models.query.assoc.QAssocBillModel<models.query.QTransactionModel> bill;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<models.query.QTransactionModel> tId;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<models.query.QTransactionModel> tBillId;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<models.query.QTransactionModel> tUser1;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<models.query.QTransactionModel> tUser2;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PDouble<models.query.QTransactionModel> tAmount;
    
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    @org.jetbrains.annotations.NotNull()
    private static final models.query.QTransactionModel _alias = null;
    public static final models.query.QTransactionModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final models.query.assoc.QAssocBillModel<models.query.QTransactionModel> getBill() {
        return null;
    }
    
    public final void setBill(@org.jetbrains.annotations.NotNull()
    models.query.assoc.QAssocBillModel<models.query.QTransactionModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<models.query.QTransactionModel> getTId() {
        return null;
    }
    
    public final void setTId(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<models.query.QTransactionModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<models.query.QTransactionModel> getTBillId() {
        return null;
    }
    
    public final void setTBillId(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<models.query.QTransactionModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<models.query.QTransactionModel> getTUser1() {
        return null;
    }
    
    public final void setTUser1(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<models.query.QTransactionModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<models.query.QTransactionModel> getTUser2() {
        return null;
    }
    
    public final void setTUser2(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<models.query.QTransactionModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PDouble<models.query.QTransactionModel> getTAmount() {
        return null;
    }
    
    public final void setTAmount(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PDouble<models.query.QTransactionModel> p0) {
    }
    
    /**
     * Construct with a given Database.
     */
    public QTransactionModel(@org.jetbrains.annotations.NotNull()
    io.ebean.Database database) {
        super(null);
    }
    
    /**
     * Construct using the default Database.
     */
    public QTransactionModel() {
        super(null);
    }
    
    /**
     * Construct for Alias.
     */
    private QTransactionModel(boolean dummy) {
        super(null);
    }
    
    /**
     * Private constructor for FetchGroup building.
     */
    private QTransactionModel(io.ebean.Query<models.TransactionModel> fetchGroupQuery) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lmodels/query/QTransactionModel$Companion;", "", "()V", "_alias", "Lmodels/query/QTransactionModel;", "get_alias", "()Lmodels/query/QTransactionModel;", "forFetchGroup", "bill-split-hu17"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final models.query.QTransactionModel get_alias() {
            return null;
        }
        
        /**
         * Return a query bean used to build a FetchGroup.
         */
        @org.jetbrains.annotations.NotNull()
        public final models.query.QTransactionModel forFetchGroup() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}