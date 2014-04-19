package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/***
 * 
 * There is a PoC about Vertica database, So I spent some time try to connect to
 * it with jdbc.And here is how: 
 * 
 * 1)registry and download the vm and jdbc jars
 * from https://my.vertica.com/ I got : 
 * vertica-vmsrvr-7.0.1-0.64.zip
 * vertica-jdbc-7.0.1-0.jar 
 * 
 * 2)start that virtual machine in VMWarePlayer
 * 
 * 3) install sample database [dbadmin@vertica examples]$
 * /opt/vertica/sbin/install_example VMart EULA not yet accepted. Please run
 * admintools
 * 
 * 4)acccept the license aggrement /opt/vertica/bin/admintools click OK selct
 * "Accept"
 * 
 * 5)/opt/vertica/sbin/install_example VMart
 * 
 * @author zhaoyong
 * 
 */
public class VerticaTeradataTest {
	static String hostName = "10.0.0.123"; // change it to your vertica vm's ip
											// address

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {
			Class.forName("com.vertica.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:vertica://" + hostName
					+ ":5433/VMart", "dbadmin", "password");
			Statement mySelect = conn.createStatement();
			ResultSet myResult = mySelect
					.executeQuery("SELECT distinct Calendar_Month_Name FROM Date_Dimension");
			while (myResult.next()) {
				System.out.println(myResult.getString(1));
			}
			mySelect.close();
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}
	/***
	 * 
	 7) run and get the out put: October May June November March February
	 * August April December September January July
	 */
}
