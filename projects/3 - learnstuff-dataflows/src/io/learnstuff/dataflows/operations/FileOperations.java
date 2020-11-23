package io.learnstuff.dataflows.operations;

import java.io.File;
import java.io.IOException;
import io.learnstuff.dataflows.exceptions.CustomException;

public class FileOperations {

  public void showFiles(File currentDir) throws CustomException {
    try {
      File[] files = currentDir.listFiles();
      for (File file : files) {
        if (file.isDirectory()) {
          showFiles(file);
        } else {
          System.out.println(file.getCanonicalPath());
        }
      }
    } catch (IOException e) {
      throw new CustomException();
    }
  }

}
