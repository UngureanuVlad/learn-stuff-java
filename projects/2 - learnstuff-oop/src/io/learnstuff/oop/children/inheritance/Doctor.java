package io.learnstuff.oop.children.inheritance;

import io.learnstuff.oop.parent.inheritance.Person;

public class Doctor extends Person {

  private String specilization;
  private int experienceInYears;

  public Doctor(String name, String surname, String socialSecurityNumber, int age, String address,
      String specialization, int experienceInYears) {
    super(name, surname, socialSecurityNumber, age, address);
    this.specilization = specialization;
    this.experienceInYears = experienceInYears;
  }

  public String getSpecilization() {
    return specilization;
  }

  public void setSpecilization(String specilization) {
    this.specilization = specilization;
  }

  public int getExperienceInYears() {
    return experienceInYears;
  }

  public void setExperienceInYears(int experienceInYears) {
    this.experienceInYears = experienceInYears;
  }

  @Override
  public String toString() {
    return super.toString() + "\nWorking as a: " + this.specilization + " Doctor for "
        + experienceInYears + " years.";
  }
  
  public void diagose() {
    System.out.println("Diagnose.");
  }
}
