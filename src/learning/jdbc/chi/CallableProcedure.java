package learning.jdbc.chi;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;



public class CallableProcedure {
	static void callable() throws SQLException {
		Connection conn = JDBCConnection.getConnection();
		
		CallableStatement callableStatement = conn.prepareCall("{call findTest(?)}");
		
		callableStatement.setInt(1, 1);
		
		ResultSet rs = callableStatement.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " : " + rs.getString(2));
		}
	}
	
	public static void main(String args[]) throws SQLException {
		callable();
	}
}
