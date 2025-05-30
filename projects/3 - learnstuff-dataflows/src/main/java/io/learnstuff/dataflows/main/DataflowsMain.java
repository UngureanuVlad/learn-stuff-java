package io.learnstuff.dataflows.main;

import java.io.File;
import io.learnstuff.dataflows.exceptions.CustomException;
import io.learnstuff.dataflows.operations.FileOperations;
import io.learnstuff.dataflows.operations.FileReaders;
import io.learnstuff.dataflows.operations.FileWriters;
import io.learnstuff.dataflows.operations.SerializationExample;

public class DataflowsMain {

  public static void main(String[] args) {
    SerializationExample serializationExample = new SerializationExample();
    serializationExample.serializeData();
    serializationExample.deserializeData();

    FileWriters fileWriters = new FileWriters();
    fileWriters.writeFileString();

    FileReaders fileReaders = new FileReaders();
    fileReaders.readFile("test.txt");

    FileOperations fileOperations = new FileOperations();
    try {
      fileOperations.showFiles(new File("./"));
    } catch (CustomException e) {
      e.printStackTrace();
    }
   
  }
}
