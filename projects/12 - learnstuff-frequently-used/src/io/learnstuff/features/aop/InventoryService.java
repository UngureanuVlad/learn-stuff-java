package io.learnstuff.features.aop;

import java.util.List;

public interface InventoryService {
  
  public Inventory create(Inventory inventory);

  public List<Inventory> listInventory();
}
