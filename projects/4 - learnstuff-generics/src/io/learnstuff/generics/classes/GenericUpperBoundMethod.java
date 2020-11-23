package io.learnstuff.generics.classes;

import java.util.List;

public class GenericUpperBoundMethod {

  public static double sumOfListElements(List<? extends Number> list) {
    double value = 0.0;
    for (Number number : list) {
      value += number.doubleValue();
    }
    System.out.println(value);
    return value;
  }
}
