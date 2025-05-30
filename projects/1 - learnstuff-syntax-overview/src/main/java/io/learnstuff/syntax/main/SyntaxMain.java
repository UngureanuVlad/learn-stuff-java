package io.learnstuff.syntax.main;

public class SyntaxMain {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        sayHello();
        introduceYourself("Vlad");
        // this indicates an inline comment
        // without the use of other classes(!) all operations go here
        // with classes(!) class instantiation and method calls go here

        int a = 0;
        // variable are type safe and assigned value needs to match the property type
        a = 5;
        // not permitted due to type safety
        // a = "text";
        System.out.println(a);
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void introduceYourself(String name) {
        System.out.println("Hi, my name is " + name);
    }

}
