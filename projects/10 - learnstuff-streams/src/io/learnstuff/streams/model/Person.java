package io.learnstuff.streams.model;

import java.util.Date;

public class Person {

  private String name;
  private Date birthday;

  public Person(String name, Date birthday) {
    this.name = name;
    this.birthday = birthday;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
}
