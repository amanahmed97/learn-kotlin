package models.query;

import java.lang.System;

/**
 * Query bean for UserModel.
 *
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@javax.annotation.Generated(value = {"io.ebean.querybean.kotlin-generator"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u0015\b\u0012\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u00a2\u0006\u0002\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000&X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u0006,"}, d2 = {"Lmodels/query/QUserModel;", "Lio/ebean/typequery/TQRootBean;", "Lmodels/UserModel;", "database", "Lio/ebean/Database;", "(Lio/ebean/Database;)V", "()V", "dummy", "", "(Z)V", "fetchGroupQuery", "Lio/ebean/Query;", "(Lio/ebean/Query;)V", "bill", "Lmodels/query/assoc/QAssocBillModel;", "getBill", "()Lmodels/query/assoc/QAssocBillModel;", "setBill", "(Lmodels/query/assoc/QAssocBillModel;)V", "userEmail", "Lio/ebean/typequery/PString;", "getUserEmail", "()Lio/ebean/typequery/PString;", "setUserEmail", "(Lio/ebean/typequery/PString;)V", "userId", "Lio/ebean/typequery/PInteger;", "getUserId", "()Lio/ebean/typequery/PInteger;", "setUserId", "(Lio/ebean/typequery/PInteger;)V", "userName", "getUserName", "setUserName", "userPhone", "getUserPhone", "setUserPhone", "userTotalBalance", "Lio/ebean/typequery/PDouble;", "getUserTotalBalance", "()Lio/ebean/typequery/PDouble;", "setUserTotalBalance", "(Lio/ebean/typequery/PDouble;)V", "Companion", "bill-split-hu17"})
@io.ebean.typequery.TypeQueryBean()
public final class QUserModel extends io.ebean.typequery.TQRootBean<models.UserModel, models.query.QUserModel> {
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<models.query.QUserModel> userId;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PString<models.query.QUserModel> userName;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PString<models.query.QUserModel> userEmail;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PString<models.query.QUserModel> userPhone;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PDouble<models.query.QUserModel> userTotalBalance;
    @org.jetbrains.annotations.NotNull()
    public models.query.assoc.QAssocBillModel<models.query.QUserModel> bill;
    
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    @org.jetbrains.annotations.NotNull()
    private static final models.query.QUserModel _alias = null;
    public static final models.query.QUserModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<models.query.QUserModel> getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<models.query.QUserModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PString<models.query.QUserModel> getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PString<models.query.QUserModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PString<models.query.QUserModel> getUserEmail() {
        return null;
    }
    
    public final void setUserEmail(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PString<models.query.QUserModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PString<models.query.QUserModel> getUserPhone() {
        return null;
    }
    
    public final void setUserPhone(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PString<models.query.QUserModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PDouble<models.query.QUserModel> getUserTotalBalance() {
        return null;
    }
    
    public final void setUserTotalBalance(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PDouble<models.query.QUserModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.query.assoc.QAssocBillModel<models.query.QUserModel> getBill() {
        return null;
    }
    
    public final void setBill(@org.jetbrains.annotations.NotNull()
    models.query.assoc.QAssocBillModel<models.query.QUserModel> p0) {
    }
    
    /**
     * Construct with a given Database.
     */
    public QUserModel(@org.jetbrains.annotations.NotNull()
    io.ebean.Database database) {
        super(null);
    }
    
    /**
     * Construct using the default Database.
     */
    public QUserModel() {
        super(null);
    }
    
    /**
     * Construct for Alias.
     */
    private QUserModel(boolean dummy) {
        super(null);
    }
    
    /**
     * Private constructor for FetchGroup building.
     */
    private QUserModel(io.ebean.Query<models.UserModel> fetchGroupQuery) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lmodels/query/QUserModel$Companion;", "", "()V", "_alias", "Lmodels/query/QUserModel;", "get_alias", "()Lmodels/query/QUserModel;", "forFetchGroup", "bill-split-hu17"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final models.query.QUserModel get_alias() {
            return null;
        }
        
        /**
         * Return a query bean used to build a FetchGroup.
         */
        @org.jetbrains.annotations.NotNull()
        public final models.query.QUserModel forFetchGroup() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}