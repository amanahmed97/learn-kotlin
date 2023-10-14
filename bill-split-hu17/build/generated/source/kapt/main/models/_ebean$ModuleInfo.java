package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Generated;

import io.ebean.config.ModuleInfo;
import io.ebean.config.ModuleInfoLoader;

@Generated("io.ebean.querybean.kotlin-generator")
@ModuleInfo(entities={"models.BillModel","models.Customer","models.GroupModel","models.Test","models.TransactionModel","models.UserModel"})
public class _ebean$ModuleInfo implements ModuleInfoLoader {

  @Override
  public List<Class<?>> entityClasses() {
    List<Class<?>> entities = new ArrayList<>();
    entities.add(models.BillModel.class);
    entities.add(models.Customer.class);
    entities.add(models.GroupModel.class);
    entities.add(models.Test.class);
    entities.add(models.TransactionModel.class);
    entities.add(models.UserModel.class);
    return entities;
  }

  @Override
  public List<Class<?>> entityClassesFor(String dbName) {

    return Collections.emptyList();
  }

}
