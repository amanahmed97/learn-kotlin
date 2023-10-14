package models.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.typequery.PDouble;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import models.TransactionModel;
import models.query.assoc.QAssocBillModel;

/**
 * Query bean for TransactionModel.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QTransactionModel : TQRootBean<TransactionModel, QTransactionModel> {

  companion object {
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    val _alias = QTransactionModel(true)

    /**
     * Return a query bean used to build a FetchGroup.
     */
    fun forFetchGroup(): QTransactionModel {
      return QTransactionModel(FetchGroup.queryFor(TransactionModel::class.java));
    }
  }

  lateinit var bill: QAssocBillModel<QTransactionModel>
  lateinit var tId: PInteger<QTransactionModel>
  lateinit var tBillId: PInteger<QTransactionModel>
  lateinit var tUser1: PInteger<QTransactionModel>
  lateinit var tUser2: PInteger<QTransactionModel>
  lateinit var tAmount: PDouble<QTransactionModel>


  /**
   * Construct with a given Database.
   */
  constructor(database: Database) : super(TransactionModel::class.java, database)

  /**
   * Construct using the default Database.
   */
  constructor() : super(TransactionModel::class.java)

  /**
   * Construct for Alias.
   */
  private constructor(dummy: Boolean) : super(dummy)

  /**
   * Private constructor for FetchGroup building.
   */
  private constructor(fetchGroupQuery: Query<TransactionModel>) : super(fetchGroupQuery)
}
