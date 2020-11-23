package io.learnstuff.streams.model;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelUtils {

  public static Map<String, Integer> getPopulatedMap() {
    Map<String, Integer> items = new HashMap<>();
    items.put("A", 10);
    items.put("B", 20);
    items.put("C", 30);
    items.put("D", 40);
    items.put("E", 50);
    items.put("F", 60);
    return items;
  }

  public static List<Integer> getPopulatedIntegerArray() {
    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
    System.out.println(numbers);
    return numbers;
  }

  public static List<String> getPopulatedStringArray() {
    List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
    System.out.println(strings);
    return strings;
  }

  public static Person[] getArrayOfPersons() {
    Person[] persons = new Person[2];
    persons[0] = new Person("Vlad", new Date());
    persons[1] = new Person("Mark", new Date());
    for (Person person : persons) {
      System.out.println(person.getName());
    }
    return persons;
  }

}
