package io.learnstuff.collections.model;

import lombok.Data;

@Data
public class Student implements Comparable<Student> {

    private String name = "";
    private String surname = "";
    private int identificationNumber = 0;

    public Student(String name, String surname, int identificationNumber) {
        this.name = name;
        this.surname = surname;
        this.identificationNumber = identificationNumber;
    }

    @Override
    public int compareTo(Student o) {
        if (o.getIdentificationNumber() == this.identificationNumber) {
            return 0;
        }
        if (o.getIdentificationNumber() > this.identificationNumber) {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return this.identificationNumber + " - " + this.name + " " + this.surname;
    }
}
