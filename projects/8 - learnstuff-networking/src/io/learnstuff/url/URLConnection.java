package io.learnstuff.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLConnection {

  public static void urlConnect() {
    BufferedReader br = null;
    try {
      URL url = new URL("http://www.google.ro");
      InputStream in = url.openStream();
      br = new BufferedReader(new InputStreamReader(in));
      String linie;
      while ((linie = br.readLine()) != null) {
        System.out.println(linie);
      }
    } catch (Exception e) {
      System.err.println("You should log this error!");
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
}
