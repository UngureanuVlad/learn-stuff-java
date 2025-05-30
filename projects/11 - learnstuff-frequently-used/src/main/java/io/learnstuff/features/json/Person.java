package io.learnstuff.features.json;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person {

    private Long id;
    private String name;
    @JsonIgnore
    private String location;
    private Integer age;

    public Person() {
        // do nothing
        // required for unmarshalling
    }

    public Person(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
