package models.query.assoc;

import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import models.Test;
import models.query.QTest;

/**
 * Association query bean for AssocTest.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QAssocTest<R> : TQAssocBean<Test,R> {

  lateinit var id: PLong<R>
  lateinit var name: PString<R>

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  fun fetch(vararg properties: TQProperty<QTest>) : R {
    return fetchProperties(*properties)
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  fun fetchQuery(vararg properties: TQProperty<QTest>) : R {
    return fetchQueryProperties(*properties)
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  fun fetchCache(vararg properties: TQProperty<QTest>) : R {
    return fetchCacheProperties(*properties)
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  fun fetchLazy(vararg properties: TQProperty<QTest>) : R {
    return fetchLazyProperties(*properties)
  }

  constructor(name: String, root: R) : super(name, root)

  constructor(name: String, root: R, prefix: String) : super(name, root, prefix)
}
