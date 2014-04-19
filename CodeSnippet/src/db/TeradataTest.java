package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/***
 * 1) download the vmware image of td 13 from :
 * http://downloads.teradata.com/download/database/teradata-express/vmware 
 * 
 * 2) download the jdbc driver :tdgssconfig.jar terajdbc4.jar and put them into the classpath 
 * 
 * 3) start the virtual machine and get the ip address 
 * 4) run the test, you will get something
 * 
 * @author zhaoyong
 * 
 */
public class TeradataTest {

	public static void main(String[] args) {

		try {
			String url = "jdbc:teradata://192.168.160.131";// repalce the ip
															// with your ip of
															// the virtaul
															// machine
			Class.forName("com.teradata.jdbc.TeraDriver");
			Connection con = DriverManager.getConnection(url, "dbc", "dbc");
			Statement st = con.createStatement();
			ResultSet rt = st.executeQuery("select * from dbcinfo");
			while (rt.next()) {
				System.out.println(rt.getString(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
