package io.learnstuff.features.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONProcessor {

  private final ObjectMapper objectMapper = new ObjectMapper();

  public String serializePerson(Person person) {
    try {
      return this.objectMapper.writeValueAsString(person);
    } catch (Exception e) {
      e.printStackTrace();
      return "";
    }
  }

  public Person deserializePerson(String jsonRepresentation) {
    try {
      return (Person) this.objectMapper.readValue(jsonRepresentation, Person.class);
    } catch (Exception e) {
      e.printStackTrace();
      return new Person();
    }
  }
}
