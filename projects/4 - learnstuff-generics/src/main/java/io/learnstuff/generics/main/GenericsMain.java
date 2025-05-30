package io.learnstuff.generics.main;

import io.learnstuff.generics.examples.GenericsClassExample;
import io.learnstuff.generics.examples.GenericsMethodExample;
import io.learnstuff.generics.examples.GenericsTypeExample;
import io.learnstuff.generics.examples.GenericsUpperBoundExample;
import io.learnstuff.generics.examples.NonGenericsExample;

public class GenericsMain {

    public static void main(String[] args) {

        NonGenericsExample nonGenericsExample = new NonGenericsExample();
        nonGenericsExample.ilustrateNonGenericsBehaviour();
        showLine();

        GenericsTypeExample genericsTypeExample = new GenericsTypeExample();
        genericsTypeExample.illustrateGenericType();
        showLine();

        GenericsMethodExample genericsMethodExample = new GenericsMethodExample();
        genericsMethodExample.illustrateGenericMethod();
        showLine();

        GenericsClassExample genericsClassExample = new GenericsClassExample();
        genericsClassExample.ilustrateGenericClass();
        showLine();

        GenericsUpperBoundExample genericsUpperBoundExample = new GenericsUpperBoundExample();
        genericsUpperBoundExample.illustrateUpperBounds();
        showLine();
    }

    // helper method
    private static void showLine() {
        System.out.println("=========================================================");
    }
}
