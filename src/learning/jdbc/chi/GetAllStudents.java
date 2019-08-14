package learning.jdbc.chi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;





public class GetAllStudents {
	public static List<Student> getAllStudent() {
		Connection conn = JDBCConnection.getConnection();
		List<Student> userList = new ArrayList<Student>();
		String query = "SELECT * FROM STUDENTS";
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Student s = new Student();
				s.setId(resultSet.getString(1));
				s.setFirstName(resultSet.getString(2));
				s.setLastName(resultSet.getString(3));
				userList.add(s);
			}
			return userList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
