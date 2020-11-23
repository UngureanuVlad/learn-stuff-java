package io.learnstuff.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {

  private static ThreadLocal<Connection> connection = new ThreadLocal<>();

  public static Connection getConnection() {
    if (connection.get() == null) {
      Properties props = getPorperties();
      try {
        Class.forName(props.getProperty("Driver"));
        connection.set(DriverManager.getConnection(props.getProperty("Url"),
            props.getProperty("User"), props.getProperty("Password")));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return connection.get();
  }

  private static Properties getPorperties() {
    Properties props = new Properties();
    props.put("Driver", "org.postgresql.Driver");
    props.put("Url", "jdbc:postgresql://localhost:5432/test");
    props.put("User", "test");
    props.put("Password", "test");
    return props;
  }
}
