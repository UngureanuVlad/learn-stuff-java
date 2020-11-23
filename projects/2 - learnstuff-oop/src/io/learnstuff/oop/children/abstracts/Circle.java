package io.learnstuff.oop.children.abstracts;

import io.learnstuff.oop.parent.abstracts.Shape;

public class Circle extends Shape {
  private double radius = 0;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculatePerimeter() {
    System.out.println("Calculate circle perimeter!");
    return 2 * PI * this.radius;
  }

}
