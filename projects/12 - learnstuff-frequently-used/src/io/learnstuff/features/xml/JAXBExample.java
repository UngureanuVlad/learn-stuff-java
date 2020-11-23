package io.learnstuff.features.xml;

public class JAXBExample {

  public static void main(String[] args) {
    Person person = new Person(Long.valueOf(1), "Vlad", 35);
    XMLProcessor xmlProcessor = new XMLProcessor();

    xmlProcessor.marshalPerson(person);
    System.out.println("Wrote to XML!");

    Person xmlPerson = xmlProcessor.unmarshalPerson();
    System.out.println("Read from XML, person with name: " + xmlPerson.getName() + ", age: " + xmlPerson.getAge() + ".");
  }

}
