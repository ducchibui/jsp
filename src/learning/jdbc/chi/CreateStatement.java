package learning.jdbc.chi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class CreateStatement {
	static void createStatement() {
		Connection conn = JDBCConnection.getConnection();
		String query = "SELECT * FROM STUDENTS";
		
		try {
			Statement statement = conn.createStatement();			
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt(1);
				String firsName = rs.getString(2);
				String lastName = rs.getString(3);
				System.out.println(id +" : "+firsName+","+lastName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		createStatement();
	}
}
