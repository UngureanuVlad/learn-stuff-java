package io.learnstuff.generics.examples;

import io.learnstuff.generics.classes.GenericsMethod;
import io.learnstuff.generics.classes.GenericsType;

public class GenericsMethodExample {

    public void illustrateGenericMethod() {
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("test");

        GenericsType<String> g2 = new GenericsType<>();
        g2.set("test");

        boolean isEqual = GenericsMethod.<String>isEqual(g1, g2);
        System.out.println(isEqual);

        isEqual = GenericsMethod.isEqual(g1, g2);
        System.out.println(isEqual);

        // not working - type safe to String
        // isEqual = GenericsMethod.<Integer> isEqual(g1, g2);
    }


}
