package io.learnstuff.oop.parent.interfaces;

import io.learnstuff.oop.model.Entity;

public interface DatabaseOperations {

    // CRUD operations
    void createEntity(Entity entity);

    void readEntity(Long identifier);

    void updateEntity(Entity entity);

    void deleteEntity(Long identifier);

}
