package io.learnstuff.features.xml;

import java.io.File;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class XMLProcessor {

  public void marshalPerson(Person person) {
    try {
      JAXBContext context = JAXBContext.newInstance(Person.class);
      Marshaller mar = context.createMarshaller();
      mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      mar.marshal(person, new File("person.xml"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public Person unmarshalPerson() {
    try {
      JAXBContext context = JAXBContext.newInstance(Person.class);
      return (Person) context.createUnmarshaller().unmarshal(new FileReader("person.xml"));
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
