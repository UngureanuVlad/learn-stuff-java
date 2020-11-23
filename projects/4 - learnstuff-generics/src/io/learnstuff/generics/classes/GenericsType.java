package io.learnstuff.generics.classes;

public class GenericsType<T> {

  private T t;

  public T get() {
    return this.t;
  }

  public void set(T t1) {
    this.t = t1;
  }

}
