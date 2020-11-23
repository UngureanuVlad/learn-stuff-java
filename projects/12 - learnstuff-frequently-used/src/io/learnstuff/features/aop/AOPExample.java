package io.learnstuff.features.aop;

public class AOPExample {

  public static void main(String[] args) {
    InventoryService inventoryService =
        (InventoryService) AuditProxy.newInstance(new InventoryServiceImpl());
    
    inventoryService.create(new Inventory());
  }
}
