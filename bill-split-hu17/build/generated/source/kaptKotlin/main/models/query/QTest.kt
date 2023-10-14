package models.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import models.Test;

/**
 * Query bean for Test.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QTest : TQRootBean<Test, QTest> {

  companion object {
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    val _alias = QTest(true)

    /**
     * Return a query bean used to build a FetchGroup.
     */
    fun forFetchGroup(): QTest {
      return QTest(FetchGroup.queryFor(Test::class.java));
    }
  }

  lateinit var id: PLong<QTest>
  lateinit var name: PString<QTest>


  /**
   * Construct with a given Database.
   */
  constructor(database: Database) : super(Test::class.java, database)

  /**
   * Construct using the default Database.
   */
  constructor() : super(Test::class.java)

  /**
   * Construct for Alias.
   */
  private constructor(dummy: Boolean) : super(dummy)

  /**
   * Private constructor for FetchGroup building.
   */
  private constructor(fetchGroupQuery: Query<Test>) : super(fetchGroupQuery)
}
