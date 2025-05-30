package io.learnstuff.syntax.main;

public class ArraysMain {

    public static void main(String[] args) {
        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        char charArray[] = {'a', 'b', 'c'};

        System.out.println("the element at position 1 of the integer array is: " + integerArray[1] + ".");
        System.out.println(charArray);
        System.out.println("the char array has " + charArray.length + " elements.");
    }
}
