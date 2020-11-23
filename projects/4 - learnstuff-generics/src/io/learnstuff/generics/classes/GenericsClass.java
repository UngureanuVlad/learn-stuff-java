package io.learnstuff.generics.classes;

public class GenericsClass<U, V> {

  // type U object reference
  private U objUreff;
  // type V object reference
  private V objVreff;

  public GenericsClass(U objU, V objV) {
    this.objUreff = objU;
    this.objVreff = objV;
  }

  public void printTypes() {
    System.out.println("U Type: " + this.objUreff.getClass().getName());
    System.out.println("V Type: " + this.objVreff.getClass().getName());
  }
}
