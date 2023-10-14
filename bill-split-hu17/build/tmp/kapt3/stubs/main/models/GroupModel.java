package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lmodels/GroupModel;", "Lio/ebean/Model;", "groupId", "", "groupUsers", "", "Lmodels/Users;", "bills", "Lmodels/Bills;", "(ILjava/util/List;Ljava/util/List;)V", "getBills", "()Ljava/util/List;", "setBills", "(Ljava/util/List;)V", "getGroupId", "()I", "setGroupId", "(I)V", "getGroupUsers", "setGroupUsers", "bill-split-hu17"})
@javax.persistence.Entity()
public final class GroupModel extends io.ebean.Model {
    @javax.persistence.Id()
    private int groupId;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<models.Users> groupUsers;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<models.Bills> bills;
    
    public final int getGroupId() {
        return 0;
    }
    
    public final void setGroupId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.Users> getGroupUsers() {
        return null;
    }
    
    public final void setGroupUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<models.Users> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.Bills> getBills() {
        return null;
    }
    
    public final void setBills(@org.jetbrains.annotations.NotNull()
    java.util.List<models.Bills> p0) {
    }
    
    public GroupModel(int groupId, @org.jetbrains.annotations.NotNull()
    java.util.List<models.Users> groupUsers, @org.jetbrains.annotations.NotNull()
    java.util.List<models.Bills> bills) {
        super();
    }
}