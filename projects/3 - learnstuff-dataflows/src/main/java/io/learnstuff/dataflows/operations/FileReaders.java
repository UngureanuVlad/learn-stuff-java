package io.learnstuff.dataflows.operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaders {

  public void readFile(String fis) {
    try {
      FileReader fileReader = new FileReader(new File("test.txt"));
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
      fileReader.close();
    } catch (FileNotFoundException e) {
      System.err.println("File test.txt nof found!");
    } catch (IOException e) {
      System.out.println("Reading error!");
    }
  }

  public void readFileJ8String() {
    try {
      String content = new String(Files.readAllBytes(Paths.get("test.txt")));
      System.out.println(content);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
