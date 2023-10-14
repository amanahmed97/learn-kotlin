package models.query;

import java.lang.System;

/**
 * Query bean for GroupModel.
 *
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@javax.annotation.Generated(value = {"io.ebean.querybean.kotlin-generator"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u0015\b\u0012\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u00a2\u0006\u0002\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0014"}, d2 = {"Lmodels/query/QGroupModel;", "Lio/ebean/typequery/TQRootBean;", "Lmodels/GroupModel;", "database", "Lio/ebean/Database;", "(Lio/ebean/Database;)V", "()V", "dummy", "", "(Z)V", "fetchGroupQuery", "Lio/ebean/Query;", "(Lio/ebean/Query;)V", "groupId", "Lio/ebean/typequery/PInteger;", "getGroupId", "()Lio/ebean/typequery/PInteger;", "setGroupId", "(Lio/ebean/typequery/PInteger;)V", "Companion", "bill-split-hu17"})
@io.ebean.typequery.TypeQueryBean()
public final class QGroupModel extends io.ebean.typequery.TQRootBean<models.GroupModel, models.query.QGroupModel> {
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<models.query.QGroupModel> groupId;
    
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    @org.jetbrains.annotations.NotNull()
    private static final models.query.QGroupModel _alias = null;
    public static final models.query.QGroupModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<models.query.QGroupModel> getGroupId() {
        return null;
    }
    
    public final void setGroupId(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<models.query.QGroupModel> p0) {
    }
    
    /**
     * Construct with a given Database.
     */
    public QGroupModel(@org.jetbrains.annotations.NotNull()
    io.ebean.Database database) {
        super(null);
    }
    
    /**
     * Construct using the default Database.
     */
    public QGroupModel() {
        super(null);
    }
    
    /**
     * Construct for Alias.
     */
    private QGroupModel(boolean dummy) {
        super(null);
    }
    
    /**
     * Private constructor for FetchGroup building.
     */
    private QGroupModel(io.ebean.Query<models.GroupModel> fetchGroupQuery) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lmodels/query/QGroupModel$Companion;", "", "()V", "_alias", "Lmodels/query/QGroupModel;", "get_alias", "()Lmodels/query/QGroupModel;", "forFetchGroup", "bill-split-hu17"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final models.query.QGroupModel get_alias() {
            return null;
        }
        
        /**
         * Return a query bean used to build a FetchGroup.
         */
        @org.jetbrains.annotations.NotNull()
        public final models.query.QGroupModel forFetchGroup() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}