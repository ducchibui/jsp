package learning.jdbc.chi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveFileToDB {
	static void saveFile() throws SQLException, FileNotFoundException {
		Connection conn = JDBCConnection.getConnection();
		
		String query = "Insert into File Values(?,?)";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		
		File file = new File("test.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		
		preparedStatement.setString(1, file.getName());
		preparedStatement.setBinaryStream(2, fileInputStream);			
		preparedStatement.executeUpdate();
	}
	public static void main(String args[]) throws FileNotFoundException, SQLException {
		saveFile();
	}
}
