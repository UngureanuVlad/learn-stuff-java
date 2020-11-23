package io.learnstuff.features.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "person")
@XmlType(propOrder = {"id", "name", "age"})
public class Person {

  private Long id;
  private String name;
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

  @XmlAttribute
  public void setId(Long id) {
    this.id = id;
  }

  @XmlElement(name = "name")
  public void setName(String name) {
    this.name = name;
  }

  @XmlTransient
  public void setLocation(String location) {
    this.location = location;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }
}
