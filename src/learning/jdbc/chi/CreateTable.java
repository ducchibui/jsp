package learning.jdbc.chi;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateTable {
	static void createTable() {
		Connection conn = JDBCConnection.getConnection();
		String query = "CREATE  TABLE `jdbc`.`test` (\r\n" + 
				"  `id` INT NOT NULL ,\r\n" + 
				"  `name` VARCHAR(45) NULL ,\r\n" + 
				"  PRIMARY KEY (`id`) );";
		
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
		createTable();
	}
}
