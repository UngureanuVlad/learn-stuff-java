package io.learnstuff.syntax.main;

public class PropertyVisibilityMain {
  static int a; // "a" is a class variable

  public static void main(String[] args) {
    // class name is not required because we are already in the class that declared
    // the static method
    aSimpleMethod(5);
    System.out.println("a = " + a); // a is visible everywhere
    // only visible in method
    // System.out.println("b = " + b);
    // System.out.println("c = " + c);
    // System.out.println("d = " + d);
  }

  public static void aSimpleMethod(int b) { // "b" is a method parameter
    a = b;
    int c = 10;// "c" is a variable only visible in the method
    System.out.println("b = " + b); // only visible in method
    System.out.println("c = " + c); // only visible in method
    for (int d = 0; d < 10; d++) {
      // "d" is a variable visible only in the flow control structure
      System.out.println("a = " + a); // a is visible everywhere
      System.out.println("b = " + b);
      System.out.println("c = " + c);
      System.out.println("d = " + d);
    } // control structure end here

    // "d" is not visible outside the control structure
    // System.out.println("d = " + d);

  } // method ends here
} // class ends here
