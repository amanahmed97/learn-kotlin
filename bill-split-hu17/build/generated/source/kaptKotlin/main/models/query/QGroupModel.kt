package models.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import models.GroupModel;

/**
 * Query bean for GroupModel.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QGroupModel : TQRootBean<GroupModel, QGroupModel> {

  companion object {
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    val _alias = QGroupModel(true)

    /**
     * Return a query bean used to build a FetchGroup.
     */
    fun forFetchGroup(): QGroupModel {
      return QGroupModel(FetchGroup.queryFor(GroupModel::class.java));
    }
  }

  lateinit var groupId: PInteger<QGroupModel>


  /**
   * Construct with a given Database.
   */
  constructor(database: Database) : super(GroupModel::class.java, database)

  /**
   * Construct using the default Database.
   */
  constructor() : super(GroupModel::class.java)

  /**
   * Construct for Alias.
   */
  private constructor(dummy: Boolean) : super(dummy)

  /**
   * Private constructor for FetchGroup building.
   */
  private constructor(fetchGroupQuery: Query<GroupModel>) : super(fetchGroupQuery)
}
