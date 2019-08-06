package learning.jdbc.chi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	static Connection getConnection() {
		//1. create a driver
		final String url ="jdbc:mysql://localhost:3306/jdbc";
		final String user="root";
		final String password = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		//2. return a connection
		return null;
	}
	public static void main(String args[]) {
		Connection conn = JDBCConnection.getConnection();
		if (conn!=null) {
			System.out.println("Connection successfully");
		} else {
			System.out.println("Connection failed");
		}
	}
}
