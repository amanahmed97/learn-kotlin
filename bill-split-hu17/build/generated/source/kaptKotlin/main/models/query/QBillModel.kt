package models.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.typequery.PBoolean;
import io.ebean.typequery.PDouble;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import models.BillModel;
import models.query.assoc.QAssocTransactionModel;
import models.query.assoc.QAssocUserModel;

/**
 * Query bean for BillModel.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QBillModel : TQRootBean<BillModel, QBillModel> {

  companion object {
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    val _alias = QBillModel(true)

    /**
     * Return a query bean used to build a FetchGroup.
     */
    fun forFetchGroup(): QBillModel {
      return QBillModel(FetchGroup.queryFor(BillModel::class.java));
    }
  }

  lateinit var transaction: QAssocTransactionModel<QBillModel>
  lateinit var users: QAssocUserModel<QBillModel>
  lateinit var billId: PInteger<QBillModel>
  lateinit var billPaidBy: PInteger<QBillModel>
  lateinit var billAmount: PDouble<QBillModel>
  lateinit var groupId: PInteger<QBillModel>
  lateinit var billStatus: PBoolean<QBillModel>


  /**
   * Construct with a given Database.
   */
  constructor(database: Database) : super(BillModel::class.java, database)

  /**
   * Construct using the default Database.
   */
  constructor() : super(BillModel::class.java)

  /**
   * Construct for Alias.
   */
  private constructor(dummy: Boolean) : super(dummy)

  /**
   * Private constructor for FetchGroup building.
   */
  private constructor(fetchGroupQuery: Query<BillModel>) : super(fetchGroupQuery)
}
