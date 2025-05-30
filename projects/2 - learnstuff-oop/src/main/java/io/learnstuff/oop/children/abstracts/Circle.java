package io.learnstuff.oop.children.abstracts;

import io.learnstuff.oop.parent.abstracts.Shape;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Circle extends Shape {
    private double radius = 0;

    @Override
    public double calculatePerimeter() {
        System.out.println("Calculate circle perimeter!");
        return 2 * PI * this.radius;
    }

}
