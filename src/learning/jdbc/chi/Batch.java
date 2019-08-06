package learning.jdbc.chi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class Batch {
	static void createBatch() {
		Connection conn = JDBCConnection.getConnection();
//		String query1 = "Insert into test values(2,'A')";
//		String query2 = "Insert into test values(3,'A')";
//		String query3 = "Insert into test values(4,'A')";
		
		String query1 = "Insert into test values(?,?)";

		
		
		try {
//			Statement statement = conn.createStatement();
//			statement.addBatch(query1);
//			statement.addBatch(query2);
//			statement.addBatch(query3);
//			statement.executeBatch();
			PreparedStatement preparedStatement = conn.prepareStatement(query1);
			preparedStatement.setInt(1, 9);
			preparedStatement.setString(2, "B");
			preparedStatement.addBatch();
			preparedStatement.setInt(1, 10);
			preparedStatement.setString(2, "C");
			preparedStatement.addBatch();
			
			preparedStatement.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		createBatch();
	}
}
