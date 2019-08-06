package learning.jdbc.chi;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class DropTable {
	static void dropTable(String tableName) {
		Connection conn = JDBCConnection.getConnection();
		String query = "Drop table "+ tableName;
		
		Statement statement;
		try {
			statement = conn.createStatement();
			int rs = statement.executeUpdate(query);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public static void main(String args[]) {
		dropTable("test");
	}
}
