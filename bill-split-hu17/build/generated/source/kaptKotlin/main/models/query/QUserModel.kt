package models.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.typequery.PDouble;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import models.UserModel;
import models.query.assoc.QAssocBillModel;

/**
 * Query bean for UserModel.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QUserModel : TQRootBean<UserModel, QUserModel> {

  companion object {
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    val _alias = QUserModel(true)

    /**
     * Return a query bean used to build a FetchGroup.
     */
    fun forFetchGroup(): QUserModel {
      return QUserModel(FetchGroup.queryFor(UserModel::class.java));
    }
  }

  lateinit var userId: PInteger<QUserModel>
  lateinit var userName: PString<QUserModel>
  lateinit var userEmail: PString<QUserModel>
  lateinit var userPhone: PString<QUserModel>
  lateinit var userTotalBalance: PDouble<QUserModel>
  lateinit var bill: QAssocBillModel<QUserModel>


  /**
   * Construct with a given Database.
   */
  constructor(database: Database) : super(UserModel::class.java, database)

  /**
   * Construct using the default Database.
   */
  constructor() : super(UserModel::class.java)

  /**
   * Construct for Alias.
   */
  private constructor(dummy: Boolean) : super(dummy)

  /**
   * Private constructor for FetchGroup building.
   */
  private constructor(fetchGroupQuery: Query<UserModel>) : super(fetchGroupQuery)
}
