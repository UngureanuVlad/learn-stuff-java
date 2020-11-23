package io.learnstuff.oop.utils;

public class ConsoleUtils {

  // this satisfies separation of concerns since this method is used only for console 
  // and has nothing to do with the functionality of the class it is used in
  public static void addSeparatorAndTitle(String title) {
    System.out.println(); // adds an empty row in the console
    System.out.println("---------------------------------------------------");
    System.out.println(title);
    System.out.println("---------------------------------------------------");
  }
}
