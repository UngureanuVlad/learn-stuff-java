package io.learnstuff.dataflows.operations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializationExample {

  public void serializeData() {
    try {
      // Write
      FileOutputStream fos = new FileOutputStream("test.txt");
      ObjectOutputStream out = new ObjectOutputStream(fos);
      out.writeObject(new Date());
      out.writeObject("Current Date");
      out.writeInt(12345);
      out.flush();
      fos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void deserializeData() {
    try {
      // Read
      FileInputStream fis = new FileInputStream("test.txt");
      ObjectInputStream in = new ObjectInputStream(fis);
      Date date = (Date) in.readObject();
      String text = (String) in.readObject();
      int value = in.readInt();
      System.out.println("read values: " + date + ", " + text + ", " + value);
      fis.close();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
