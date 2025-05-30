package io.learnstuff.features.reflection;

public class RefelctionExample {

    public static void main(String[] args) {
        ReflectionOperations reflectionOperations = new ReflectionOperations();
        reflectionOperations.readFields();

        System.out.println("------------------------");
        reflectionOperations.readClassModifiers();

        System.out.println("------------------------");
        reflectionOperations.readClassConstructors();

        System.out.println("------------------------");
        reflectionOperations.readClassMethods();
    }
}
