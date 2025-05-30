package io.learnstuff.oop.children.abstracts;

import io.learnstuff.oop.parent.abstracts.Shape;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Square extends Shape {

    private double side = 0;

    @Override
    public double calculatePerimeter() {
        System.out.println("Calculate square perimeter!");
        return 4 * this.side;
    }

}
