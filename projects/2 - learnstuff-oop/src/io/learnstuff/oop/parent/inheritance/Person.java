package io.learnstuff.oop.parent.inheritance;

public class Person {

  private String name;
  private String surname;
  private String socialSecurityNumber;
  private int age;
  private String address;

  public Person() {
    // do nothing
  }

  public Person(String name, String surname, String socialSecurityNumber, int age, String address) {
    this.name = name;
    this.surname = surname;
    this.socialSecurityNumber = socialSecurityNumber;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return this.surname + " " + this.name + " is a " + this.age
        + " old person with the following SSN: " + this.socialSecurityNumber
        + ". \nLast knowd address: " + this.address + ".";
  }

  public void walk() {
    System.out.println("Walk.");
  }

  public void run() {
    System.out.println("Run.");
  }

  public void talk() {
    System.out.println("talk.");
  }
}
