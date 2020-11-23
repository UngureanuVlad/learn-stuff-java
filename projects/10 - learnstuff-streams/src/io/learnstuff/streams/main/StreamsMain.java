package io.learnstuff.streams.main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import io.learnstuff.streams.lambda.ComparisonProvider;
import io.learnstuff.streams.lambda.ShortToByteFunction;
import io.learnstuff.streams.lambda.Square;
import io.learnstuff.streams.model.ModelUtils;
import io.learnstuff.streams.model.Person;

public class StreamsMain {


  public static void main(String[] args) {
    // this two statements are equivalent
    ModelUtils.getPopulatedMap()
        .forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
    System.out.println("-----------------------------------------------------------");
    for (Map.Entry<String, Integer> entry : ModelUtils.getPopulatedMap().entrySet()) {
      System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
    }

    // get count of empty string in an list
    System.out.println("-----------------------------------------------------------");
    long count =
        ModelUtils.getPopulatedStringArray().stream().filter(string -> string.isEmpty()).count();
    System.out.println("there are: " + count + " empty string in the list");

    // limit stream to a certain number of elements
    System.out.println("-----------------------------------------------------------");
    Random random = new Random();
    random.ints().limit(10).sorted().forEach(System.out::println);

    // get list of unique squares for a given number list collected into a list
    System.out.println("-----------------------------------------------------------");
    List<Integer> squaresList = ModelUtils.getPopulatedIntegerArray().stream().map(i -> i * i)
        .distinct().collect(Collectors.toList());
    System.out.println(squaresList);

    // get a string by joining the elements of a list of strings, separated by a ', ' character
    // sequence
    System.out.println("-----------------------------------------------------------");
    String resultedString = ModelUtils.getPopulatedStringArray().stream()
        .filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
    System.out.println(resultedString);

    // functional interfaces
    System.out.println("-----------------------------------------------------------");
    Square squareFunctionalInterface = (double x) -> Math.pow(x, 2);
    double answer = squareFunctionalInterface.calculate(2);
    System.out.println(answer);


    // functional interfaces as a parameter
    System.out.println("-----------------------------------------------------------");
    short[] array = {(short) 1, (short) 2, (short) 3};
    // we give the implementation for the interfaces function, in the form of a lambda expression,
    // as a parameter
    byte[] transformedArray = transformArray(array, s -> (byte) (s * 2));
    byte[] expectedArray = {(byte) 2, (byte) 4, (byte) 6};
    System.out.println(Arrays.equals(transformedArray, expectedArray));

    // function as parameter, should order the given Person list alphabetically
    System.out.println("-----------------------------------------------------------");
    ComparisonProvider comparisonProvider = new ComparisonProvider();
    Person[] persons = ModelUtils.getArrayOfPersons();
    System.out.println("-----------------------------------------------------------");
    Arrays.sort(persons, comparisonProvider::compareByName);
    for (Person person : persons) {
      System.out.println(person.getName());
    }

  }

  /**
   * 
   * @param array
   * @param function a functional interface
   * @return
   */
  public static byte[] transformArray(short[] array, ShortToByteFunction function) {
    byte[] transformedArray = new byte[array.length];
    for (int i = 0; i < array.length; i++) {
      transformedArray[i] = function.applyAsByte(array[i]);
    }
    return transformedArray;
  }

}
