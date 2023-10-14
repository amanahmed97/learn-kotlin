package models.query;

import java.lang.System;

/**
 * Query bean for Customer.
 *
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@javax.annotation.Generated(value = {"io.ebean.querybean.kotlin-generator"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u0015\b\u0012\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u00a2\u0006\u0002\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lmodels/query/QCustomer;", "Lio/ebean/typequery/TQRootBean;", "Lmodels/Customer;", "database", "Lio/ebean/Database;", "(Lio/ebean/Database;)V", "()V", "dummy", "", "(Z)V", "fetchGroupQuery", "Lio/ebean/Query;", "(Lio/ebean/Query;)V", "id", "Lio/ebean/typequery/PLong;", "getId", "()Lio/ebean/typequery/PLong;", "setId", "(Lio/ebean/typequery/PLong;)V", "name", "Lio/ebean/typequery/PString;", "getName", "()Lio/ebean/typequery/PString;", "setName", "(Lio/ebean/typequery/PString;)V", "Companion", "bill-split-hu17"})
@io.ebean.typequery.TypeQueryBean()
public final class QCustomer extends io.ebean.typequery.TQRootBean<models.Customer, models.query.QCustomer> {
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PLong<models.query.QCustomer> id;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PString<models.query.QCustomer> name;
    
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    @org.jetbrains.annotations.NotNull()
    private static final models.query.QCustomer _alias = null;
    public static final models.query.QCustomer.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PLong<models.query.QCustomer> getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PLong<models.query.QCustomer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PString<models.query.QCustomer> getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PString<models.query.QCustomer> p0) {
    }
    
    /**
     * Construct with a given Database.
     */
    public QCustomer(@org.jetbrains.annotations.NotNull()
    io.ebean.Database database) {
        super(null);
    }
    
    /**
     * Construct using the default Database.
     */
    public QCustomer() {
        super(null);
    }
    
    /**
     * Construct for Alias.
     */
    private QCustomer(boolean dummy) {
        super(null);
    }
    
    /**
     * Private constructor for FetchGroup building.
     */
    private QCustomer(io.ebean.Query<models.Customer> fetchGroupQuery) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lmodels/query/QCustomer$Companion;", "", "()V", "_alias", "Lmodels/query/QCustomer;", "get_alias", "()Lmodels/query/QCustomer;", "forFetchGroup", "bill-split-hu17"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final models.query.QCustomer get_alias() {
            return null;
        }
        
        /**
         * Return a query bean used to build a FetchGroup.
         */
        @org.jetbrains.annotations.NotNull()
        public final models.query.QCustomer forFetchGroup() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}