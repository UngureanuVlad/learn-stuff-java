package io.learnstuff.generics.examples;

import io.learnstuff.generics.classes.GenericUpperBoundMethod;

import java.util.ArrayList;
import java.util.List;

public class GenericsUpperBoundExample {

    public void illustrateUpperBounds() {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();

        stringList.add("a String");
        integerList.add((int) 10);
        doubleList.add((double) 10.10);

        GenericUpperBoundMethod.sumOfListElements(integerList);

        GenericUpperBoundMethod.sumOfListElements(doubleList);

        // type safe to subclass of Number
        // GenericUpperBoundMethod.sumOfList(stringList);

    }
}
