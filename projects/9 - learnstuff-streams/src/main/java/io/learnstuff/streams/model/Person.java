package io.learnstuff.streams.model;

import lombok.Data;

import java.util.Date;

@Data
public class Person {

    private String name;
    private Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

}
