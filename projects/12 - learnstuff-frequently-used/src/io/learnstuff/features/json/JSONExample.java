package io.learnstuff.features.json;


public class JSONExample {

  public static void main(String[] args) {
    Person person = new Person(Long.valueOf(1), "Vlad", 35);
    JSONProcessor jsonProcessor = new JSONProcessor();

    String jsonRepresentation = jsonProcessor.serializePerson(person);
    System.out.println("Wrote as JSON: ");
    System.out.println(jsonRepresentation);

    Person jsonPerson = jsonProcessor.deserializePerson(jsonRepresentation);
    System.out.println("Read from JSON, person with name: " + jsonPerson.getName() + ", age: "
        + jsonPerson.getAge() + ".");


  }

}
