package io.learnstuff.oop.main;

import io.learnstuff.oop.children.inheritance.Doctor;
import io.learnstuff.oop.children.interfaces.MySQLOperations;
import io.learnstuff.oop.children.interfaces.OracleOperations;
import io.learnstuff.oop.model.Entity;
import io.learnstuff.oop.parent.inheritance.Person;
import io.learnstuff.oop.parent.interfaces.DatabaseOperations;

public class OOPMain {

    public static void main(String[] args) {
        Person person = new Person("Ungureanu", "Vlad", "12345", 33, "Iasi, Romania");
        System.out.println(person.toString());
        person.walk();
        person.talk();
        // does not exist in parent
        // person.diagose();

        Doctor doctor = new Doctor("Smith", "Mark", "54321", 50, "London, UK", "Generalist", 24);
        System.out.println(doctor.toString());
        doctor.walk();
        doctor.talk();
        doctor.diagnose();

        Person doctorPerson = new Doctor("Amanda", "Roberts", "23456", 50, "London, UK", "Dermatologist", 28);
        // it exists in the parent, but is overridden in the child
        System.out.println(doctorPerson.toString());
        doctorPerson.walk();
        doctorPerson.talk();
        // does not exist in parent, parent is used as blueprint
        // doctorPerson.diagose();

        String environment = "mysql";
        DatabaseOperations operations;
        if (environment.equalsIgnoreCase("oracle")) {
            operations = new OracleOperations();
        } else {
            operations = new MySQLOperations();
        }

        operations.createEntity(new Entity());
    }
}
