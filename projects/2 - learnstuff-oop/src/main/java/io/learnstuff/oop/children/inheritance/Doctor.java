package io.learnstuff.oop.children.inheritance;

import io.learnstuff.oop.parent.inheritance.Person;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Doctor extends Person {

    private String specialization;
    private int experienceInYears;

    public Doctor(String name, String surname, String socialSecurityNumber, int age, String address,
                  String specialization, int experienceInYears) {
        super(name, surname, socialSecurityNumber, age, address);
        this.specialization = specialization;
        this.experienceInYears = experienceInYears;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWorking as a: " + this.specialization + " Doctor for "
                + experienceInYears + " years.";
    }

    public void diagnose() {
        System.out.println("Diagnose.");
    }
}
