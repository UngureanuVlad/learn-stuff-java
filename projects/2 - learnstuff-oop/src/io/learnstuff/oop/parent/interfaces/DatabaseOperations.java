package io.learnstuff.oop.parent.interfaces;

import io.learnstuff.oop.model.Entity;

public interface DatabaseOperations {

  // CRUD operations
  public void createEntity(Entity entity);

  public void readEntity(Long identifier);

  public void updateEntity(Entity entity);

  public void deleteEntity(Long identifier);

}
