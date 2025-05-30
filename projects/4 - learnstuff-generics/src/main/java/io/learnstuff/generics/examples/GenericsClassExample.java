package io.learnstuff.generics.examples;

import io.learnstuff.generics.classes.GenericsClass;

public class GenericsClassExample {

    public void ilustrateGenericClass() {
        GenericsClass<String, Integer> sample = new GenericsClass<String, Integer>("Learn Stuff", 100);
        sample.printTypes();

        GenericsClass<Integer, String> sample2 = new GenericsClass<>(100, "Learn Stuff");
        sample.printTypes();
    }
}
