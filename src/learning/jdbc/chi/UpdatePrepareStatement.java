package learning.jdbc.chi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;;


public class UpdatePrepareStatement {
	static void insertRecord(int id, String name) {
		Connection conn = JDBCConnection.getConnection();
		String query = "INSERT INTO test(id, name) values(?,?)";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
			} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}		
	}
	public static void addStudent(int id, String firstName, String lastName) {
		Connection conn = JDBCConnection.getConnection();
		String query = "INSERT INTO students(id, firstname,lastname) values(?,?,?)";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, firstName);
			preparedStatement.setString(3, lastName);
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
			} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}		
	}
	static void updateRecord(int id, String name) {
		Connection conn = JDBCConnection.getConnection();
		String query = "UPDATE test set name = ? WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, id);
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
			} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}		
	}
	static void deleteRecord(int id) {
		Connection conn = JDBCConnection.getConnection();
		String query = "DELETE FROM test WHERE id = ?";
		
		try {
			conn.setAutoCommit(false);
			PreparedStatement preparedStatement = conn.prepareStatement(query);			
			preparedStatement.setInt(1, id);
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
			conn.commit();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}	
		
	}
	public static void main(String args[]) {
//		insertRecord(2, "B");
//		updateRecord(2, "BA");
		deleteRecord(2);
	}
}
