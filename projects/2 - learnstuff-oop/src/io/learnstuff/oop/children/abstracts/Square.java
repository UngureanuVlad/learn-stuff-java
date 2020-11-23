package io.learnstuff.oop.children.abstracts;

import io.learnstuff.oop.parent.abstracts.Shape;

public class Square extends Shape{
  
  private double side = 0;
  public double getSide() {
      return side;
  }
  
  public void setSide(double side) {
      this.side = side;
  }
  
  @Override
  public double calculatePerimeter() {
      System.out.println("Calculate square perimeter!");
      return 4 * this.side;
  }

}
