package io.learnstuff.oop.children.inheritance;

import io.learnstuff.oop.parent.inheritance.Person;

public class Policeman extends Person {

  private String rank;
  private String badgeNumber;

  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public String getBadgeNumber() {
    return badgeNumber;
  }

  public void setBadgeNumber(String badgeNumber) {
    this.badgeNumber = badgeNumber;
  }

  public void interogate() {
    System.out.println("Interogate.");
  }
  
  public void arrest() {
    System.out.println("Arrest.");
  }
}
