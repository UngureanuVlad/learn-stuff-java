package io.learnstuff.syntax.main;

import io.learnstuff.syntax.examples.EncapsulationExample;
import io.learnstuff.syntax.examples.StaticExample;

public class EncapsulationMain {

    public static void main(String[] args) {
        EncapsulationExample encapsulationExample = new EncapsulationExample();
        encapsulationExample.setX(1);
        encapsulationExample.setY(2);
        System.out.println("the encapsulated values are: " + encapsulationExample.getX() + " and "
                + encapsulationExample.getY());

        // not permitted
        // encapsulationExample.x = 5;

        // static variables and methods
        // not allowed due to final property
        // StaticExample.PI = 2;
        System.out.println(StaticExample.PI);
        StaticExample.staticValue = 3;
        System.out.println(StaticExample.staticValue);
        System.out.println(StaticExample.addNumbers(1, 2));
    }
}
