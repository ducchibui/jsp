package learning.jdbc.chi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;





public class MetaData {
	static void getMetaData() {
		Connection conn = JDBCConnection.getConnection();
		String query = "Select * FROM test";
		Statement statement;
		try {
			statement = conn.createStatement();
			ResultSet resultSet= statement.executeQuery(query);
								
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();				
			System.out.println(resultSetMetaData.getColumnCount());
			System.out.println(resultSetMetaData.getColumnName(1));
			System.out.println(resultSetMetaData.getTableName(1));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public static void main(String args[]) {
		getMetaData();
	}
}
