package learning.jdbc.chi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ReadFileFromDB {
	static void readFile() throws SQLException, IOException {
		Connection conn = JDBCConnection.getConnection();
		String query = "SELECT * FROM FILE";
		PreparedStatement preparedStatement = conn.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			String filename = resultSet.getString(1);
			Blob file = resultSet.getBlob(2);			
			byte[] b = file.getBytes(1, (int) file.length());
			FileOutputStream fileOutputStream = new FileOutputStream(filename);
			fileOutputStream.write(b);
			fileOutputStream.close();
			System.out.println("read file successfully "+ filename);
		}

	}
	public static void main(String args[]) throws SQLException, IOException {
		readFile();
	}
}
