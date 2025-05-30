package io.learnstuff.syntax.main;

import io.learnstuff.oop.utils.ConsoleUtils;

public class ControlStructuresMain {

    public static void main(String[] args) {
        // if using boolean values
        ConsoleUtils.addSeparatorAndTitle("If - using boolean values");
        boolean condition = false;
        if (condition) {
            System.out.println("condition is true");
        } else {
            System.out.println("condition is false");
        }

        // if using logical expressions
        ConsoleUtils.addSeparatorAndTitle("If - using logical expressions");
        int flagValue = 3;
        // example of multiple boolean conditions
        if ((flagValue >= 2) && (flagValue <= 4)) {
            System.out.println("condition is true");
        } else {
            System.out.println("condition is false");
        }

        // switch
        ConsoleUtils.addSeparatorAndTitle("Switch");
        String switchValue = "b";
        // example of multiple cases
        switch (switchValue) {
            case "a":
                System.out.println("the character is 'a'.");
                break;
            case "b":
                System.out.println("the character is 'b'.");
                break;
            default:
                System.out.println("the character is not 'a' or 'b'.");
                break;
        }

        // for
        ConsoleUtils.addSeparatorAndTitle("For");
        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        for (int counter = 0; counter < integerArray.length; counter++) {
            System.out.println(integerArray[counter]);
        }

        // while
        ConsoleUtils.addSeparatorAndTitle("While");
        int counter = 0;
        while (counter < integerArray.length) {
            System.out.println(integerArray[counter]);
            counter++;
        }

        // do - while
        ConsoleUtils.addSeparatorAndTitle("Do while");
        counter = 0;
        do {
            System.out.println(integerArray[counter]);
            counter++;
        } while (counter < integerArray.length);

        // break
        ConsoleUtils.addSeparatorAndTitle("Break");
        for (counter = 0; counter < integerArray.length; counter++) {
            if (counter <= 1) {
                System.out.println(integerArray[counter]);
            } else {
                break;
            }
        }
    }

}
