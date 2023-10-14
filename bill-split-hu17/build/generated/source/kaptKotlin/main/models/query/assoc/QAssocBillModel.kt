package models.query.assoc;

import io.ebean.typequery.PBoolean;
import io.ebean.typequery.PDouble;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import models.BillModel;
import models.query.QBillModel;

/**
 * Association query bean for AssocBillModel.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QAssocBillModel<R> : TQAssocBean<BillModel,R> {

  lateinit var transaction: QAssocTransactionModel<R>
  lateinit var users: QAssocUserModel<R>
  lateinit var billId: PInteger<R>
  lateinit var billPaidBy: PInteger<R>
  lateinit var billAmount: PDouble<R>
  lateinit var groupId: PInteger<R>
  lateinit var billStatus: PBoolean<R>

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  fun fetch(vararg properties: TQProperty<QBillModel>) : R {
    return fetchProperties(*properties)
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  fun fetchQuery(vararg properties: TQProperty<QBillModel>) : R {
    return fetchQueryProperties(*properties)
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  fun fetchCache(vararg properties: TQProperty<QBillModel>) : R {
    return fetchCacheProperties(*properties)
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  fun fetchLazy(vararg properties: TQProperty<QBillModel>) : R {
    return fetchLazyProperties(*properties)
  }

  constructor(name: String, root: R) : super(name, root)

  constructor(name: String, root: R, prefix: String) : super(name, root, prefix)
}
