package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DerbyTest {
	static String hostName = "localhost";
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/testdb", "derbyuser", "derbyuser");
			Statement mySelect = conn.createStatement();
			ResultSet myResult = mySelect
					.executeQuery("SELECT * from SYS.SYSSCHEMAS");
			while (myResult.next()) {
				System.out.println(myResult.getString(1)+","+myResult.getString(2));
			}
			mySelect.close();
		}catch(Exception e){
		//nothing to do here	
		}
		 finally {
		 
			if (conn != null) {
				conn.close();
			}
		}
 
	 
	
	//embeded one...
	try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		conn = DriverManager.getConnection("jdbc:derby:testdb;create=true", "derbyuser", "derbyuser");
		Statement mySelect = conn.createStatement();
		ResultSet myResult = mySelect
				.executeQuery("SELECT * from SYS.SYSSCHEMAS");
		while (myResult.next()) {
			System.out.println(myResult.getString(1)+","+myResult.getString(2));
		}
		mySelect.close();
	} finally {
		if (conn != null) {
			conn.close();
		}
	}
	}
}
