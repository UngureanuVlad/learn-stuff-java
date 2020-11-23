package io.learnstuff.syntax.main;

import io.learnstuff.syntax.examples.ConstructorsExample;

public class ConstructorsMain {

  public static void main(String[] args) {
    ConstructorsExample example1 = new ConstructorsExample();
    System.out.println("class property due to default constructor is: " + example1.property);
    
    ConstructorsExample example2 = new ConstructorsExample(6);
    System.out.println("class property due to parameter constructor is: " + example2.property);
  }


}
