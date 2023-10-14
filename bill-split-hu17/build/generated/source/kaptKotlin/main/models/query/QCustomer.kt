package models.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import models.Customer;

/**
 * Query bean for Customer.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QCustomer : TQRootBean<Customer, QCustomer> {

  companion object {
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    val _alias = QCustomer(true)

    /**
     * Return a query bean used to build a FetchGroup.
     */
    fun forFetchGroup(): QCustomer {
      return QCustomer(FetchGroup.queryFor(Customer::class.java));
    }
  }

  lateinit var id: PLong<QCustomer>
  lateinit var name: PString<QCustomer>


  /**
   * Construct with a given Database.
   */
  constructor(database: Database) : super(Customer::class.java, database)

  /**
   * Construct using the default Database.
   */
  constructor() : super(Customer::class.java)

  /**
   * Construct for Alias.
   */
  private constructor(dummy: Boolean) : super(dummy)

  /**
   * Private constructor for FetchGroup building.
   */
  private constructor(fetchGroupQuery: Query<Customer>) : super(fetchGroupQuery)
}
