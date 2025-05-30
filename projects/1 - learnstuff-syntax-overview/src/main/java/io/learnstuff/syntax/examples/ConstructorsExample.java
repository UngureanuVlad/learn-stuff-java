package io.learnstuff.syntax.examples;

public class ConstructorsExample {

    public int property; // create a class property

    // create a class constructor for the VariableVisibilityMain class
    public ConstructorsExample() {
        property = 5; // Set the initial(or default) value for the class property x
    }

    // Create a another constructor with a different method signature
    public ConstructorsExample(int newValue) {
        property = newValue; // Set a specific value for the class property
    }

}
