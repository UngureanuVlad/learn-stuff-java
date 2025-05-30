package io.learnstuff.collections.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamples {

    public void illustrateSetExample() {
        Set<String> stringSet = new HashSet<>();
        // We add a few elements
        stringSet.add("A");
        stringSet.add("C");
        stringSet.add("A");
        stringSet.add("B");

        System.out.println(stringSet);

        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("C");
        stringList.add("A");
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        Set<String> stringSet2 = new HashSet<String>(stringList);
        System.out.println(stringList);
        System.out.println(stringSet2);
    }
}
