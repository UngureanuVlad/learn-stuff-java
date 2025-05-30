package io.learnstuff.dataflows.operations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriters {

  public void writeFile() {
    BufferedWriter writer = null;
    try {
      // create file with timeLog name
      File file = new File("test.txt");

      // display file full path and name
      System.out.println(file.getCanonicalPath());

      // write something
      writer = new BufferedWriter(new FileWriter(file));
      writer.write("Hello world!");
      writer.flush();
    } catch (IOException e) {
      // log error
    } finally {
      try {
        // close file
        // file might not exist or might not be opened
        writer.close();
      } catch (IOException e) {
        // log error
      }
    }
  }

  public void writeFileString() {
    String msg = "Second Hello world!";
    try {
      Files.write(Paths.get("test.txt"), msg.getBytes());
    } catch (IOException e) {
      // log error
    }
  }

}
