package io.learnstuff.oop.children.interfaces;

import io.learnstuff.oop.model.Entity;
import io.learnstuff.oop.parent.interfaces.DatabaseOperations;

public class OracleOperations implements DatabaseOperations{

  @Override
  public void createEntity(Entity entity) {
    System.out.println("Create entity in a Oracle database.");
  }

  @Override
  public void readEntity(Long identifier) {
    System.out.println("Read entity from a Oracle database.");
  }

  @Override
  public void updateEntity(Entity entity) {
    System.out.println("UPdate entity in a Oracle database.");
  }

  @Override
  public void deleteEntity(Long identifier) {
    System.out.println("Delete entity from a Oracle database.");
  }

}
