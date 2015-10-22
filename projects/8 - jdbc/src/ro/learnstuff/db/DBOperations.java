package ro.learnstuff.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ro.learnstuff.connection.DBConnection;

public class DBOperations {

	public static void readFromDB() {
		try {
			PreparedStatement ps = DBConnection.getConnection().prepareStatement("SELECT * FROM sbs_artists");
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
