package models.query.assoc;

import io.ebean.typequery.PDouble;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import models.TransactionModel;
import models.query.QTransactionModel;

/**
 * Association query bean for AssocTransactionModel.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QAssocTransactionModel<R> : TQAssocBean<TransactionModel,R> {

  lateinit var bill: QAssocBillModel<R>
  lateinit var tId: PInteger<R>
  lateinit var tBillId: PInteger<R>
  lateinit var tUser1: PInteger<R>
  lateinit var tUser2: PInteger<R>
  lateinit var tAmount: PDouble<R>

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  fun fetch(vararg properties: TQProperty<QTransactionModel>) : R {
    return fetchProperties(*properties)
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  fun fetchQuery(vararg properties: TQProperty<QTransactionModel>) : R {
    return fetchQueryProperties(*properties)
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  fun fetchCache(vararg properties: TQProperty<QTransactionModel>) : R {
    return fetchCacheProperties(*properties)
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  fun fetchLazy(vararg properties: TQProperty<QTransactionModel>) : R {
    return fetchLazyProperties(*properties)
  }

  constructor(name: String, root: R) : super(name, root)

  constructor(name: String, root: R, prefix: String) : super(name, root, prefix)
}
