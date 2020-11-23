package io.learnstuff.oop.children.interfaces;

import io.learnstuff.oop.model.Entity;
import io.learnstuff.oop.parent.interfaces.DatabaseOperations;

public class MySQLOperations implements DatabaseOperations{

  @Override
  public void createEntity(Entity entity) {
    System.out.println("Create entity in a MySQL database.");
  }

  @Override
  public void readEntity(Long identifier) {
    System.out.println("Read entity from a MySQL database.");
  }

  @Override
  public void updateEntity(Entity entity) {
    System.out.println("UPdate entity in a MySQL database.");
  }

  @Override
  public void deleteEntity(Long identifier) {
    System.out.println("Delete entity from a MySQL database.");
  }

}
