package io.learnstuff.jdbc.operations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import io.learnstuff.jdbc.connection.DBConnection;

public class DBOperations {

	public static void readFromDB() {
		try {
			PreparedStatement ps = DBConnection.getConnection().prepareStatement("SELECT * FROM persons");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
