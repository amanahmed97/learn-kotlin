package models.query;

import java.lang.System;

/**
 * Query bean for BillModel.
 *
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@javax.annotation.Generated(value = {"io.ebean.querybean.kotlin-generator"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u00011B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u0015\b\u0012\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u00a2\u0006\u0002\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000&X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00000,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u00a8\u00062"}, d2 = {"Lmodels/query/QBillModel;", "Lio/ebean/typequery/TQRootBean;", "Lmodels/BillModel;", "database", "Lio/ebean/Database;", "(Lio/ebean/Database;)V", "()V", "dummy", "", "(Z)V", "fetchGroupQuery", "Lio/ebean/Query;", "(Lio/ebean/Query;)V", "billAmount", "Lio/ebean/typequery/PDouble;", "getBillAmount", "()Lio/ebean/typequery/PDouble;", "setBillAmount", "(Lio/ebean/typequery/PDouble;)V", "billId", "Lio/ebean/typequery/PInteger;", "getBillId", "()Lio/ebean/typequery/PInteger;", "setBillId", "(Lio/ebean/typequery/PInteger;)V", "billPaidBy", "getBillPaidBy", "setBillPaidBy", "billStatus", "Lio/ebean/typequery/PBoolean;", "getBillStatus", "()Lio/ebean/typequery/PBoolean;", "setBillStatus", "(Lio/ebean/typequery/PBoolean;)V", "groupId", "getGroupId", "setGroupId", "transaction", "Lmodels/query/assoc/QAssocTransactionModel;", "getTransaction", "()Lmodels/query/assoc/QAssocTransactionModel;", "setTransaction", "(Lmodels/query/assoc/QAssocTransactionModel;)V", "users", "Lmodels/query/assoc/QAssocUserModel;", "getUsers", "()Lmodels/query/assoc/QAssocUserModel;", "setUsers", "(Lmodels/query/assoc/QAssocUserModel;)V", "Companion", "bill-split-hu17"})
@io.ebean.typequery.TypeQueryBean()
public final class QBillModel extends io.ebean.typequery.TQRootBean<models.BillModel, models.query.QBillModel> {
    @org.jetbrains.annotations.NotNull()
    public models.query.assoc.QAssocTransactionModel<models.query.QBillModel> transaction;
    @org.jetbrains.annotations.NotNull()
    public models.query.assoc.QAssocUserModel<models.query.QBillModel> users;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<models.query.QBillModel> billId;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<models.query.QBillModel> billPaidBy;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PDouble<models.query.QBillModel> billAmount;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<models.query.QBillModel> groupId;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PBoolean<models.query.QBillModel> billStatus;
    
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    @org.jetbrains.annotations.NotNull()
    private static final models.query.QBillModel _alias = null;
    public static final models.query.QBillModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final models.query.assoc.QAssocTransactionModel<models.query.QBillModel> getTransaction() {
        return null;
    }
    
    public final void setTransaction(@org.jetbrains.annotations.NotNull()
    models.query.assoc.QAssocTransactionModel<models.query.QBillModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.query.assoc.QAssocUserModel<models.query.QBillModel> getUsers() {
        return null;
    }
    
    public final void setUsers(@org.jetbrains.annotations.NotNull()
    models.query.assoc.QAssocUserModel<models.query.QBillModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<models.query.QBillModel> getBillId() {
        return null;
    }
    
    public final void setBillId(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<models.query.QBillModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<models.query.QBillModel> getBillPaidBy() {
        return null;
    }
    
    public final void setBillPaidBy(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<models.query.QBillModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PDouble<models.query.QBillModel> getBillAmount() {
        return null;
    }
    
    public final void setBillAmount(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PDouble<models.query.QBillModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<models.query.QBillModel> getGroupId() {
        return null;
    }
    
    public final void setGroupId(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<models.query.QBillModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PBoolean<models.query.QBillModel> getBillStatus() {
        return null;
    }
    
    public final void setBillStatus(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PBoolean<models.query.QBillModel> p0) {
    }
    
    /**
     * Construct with a given Database.
     */
    public QBillModel(@org.jetbrains.annotations.NotNull()
    io.ebean.Database database) {
        super(null);
    }
    
    /**
     * Construct using the default Database.
     */
    public QBillModel() {
        super(null);
    }
    
    /**
     * Construct for Alias.
     */
    private QBillModel(boolean dummy) {
        super(null);
    }
    
    /**
     * Private constructor for FetchGroup building.
     */
    private QBillModel(io.ebean.Query<models.BillModel> fetchGroupQuery) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lmodels/query/QBillModel$Companion;", "", "()V", "_alias", "Lmodels/query/QBillModel;", "get_alias", "()Lmodels/query/QBillModel;", "forFetchGroup", "bill-split-hu17"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final models.query.QBillModel get_alias() {
            return null;
        }
        
        /**
         * Return a query bean used to build a FetchGroup.
         */
        @org.jetbrains.annotations.NotNull()
        public final models.query.QBillModel forFetchGroup() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}