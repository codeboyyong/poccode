package db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/***
 * Use this class to print all the metadata of teradata meta information
 * 
 * @author zhaoyong
 * 
 */
public class TeradataMetadataTest {

	public static void main(String[] args) {

		try {
			String url = "jdbc:teradata://192.168.68.131";
			Class.forName("com.teradata.jdbc.TeraDriver");
			Connection con = DriverManager.getConnection(url, "dbc", "dbc");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from dbcinfo");
			System.out.println("Sample data from dbcinfo");
			printRSAndCloseIt(rs);
			DatabaseMetaData dbMetaData = con.getMetaData();
			System.out.println("\n------------------------------------------");

			ResultSet catalogs = dbMetaData.getCatalogs();
			System.out.println("catalogs");
			printRSAndCloseIt(catalogs);
			System.out.println("------------------------------------------");

			ResultSet schemas = dbMetaData.getSchemas();
			System.out.println("Scehma");
			printWholeSchemaAndCloseIt(schemas, dbMetaData);
			System.out.println("------------------------------------------");

			// dbMetaData.getTables(catalog, schemaPattern, tableNamePattern,
			// types);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void printWholeSchemaAndCloseIt(ResultSet rt,
			DatabaseMetaData dbMetaData) throws SQLException {
		while (rt.next()) {
			String schemaname = rt.getString(1);
			System.out.println("schemaname = " + schemaname);

			ResultSet tables = dbMetaData.getTables(null, schemaname, null,
					null); // new String[]{"TABLE","VIEW"}
			printWholeTableAndCloseIt(tables, dbMetaData, schemaname);
			System.out.println("------------------------------------------");

		}
		rt.close();
	}

	private static void printWholeTableAndCloseIt(ResultSet tables,
			DatabaseMetaData dbMetaData, String schemaname) throws SQLException {
		while (tables.next()) {
			String tableName = tables.getString(3);
			System.out.println("Table:" + tableName);
			System.out.println("Columnes:"
					+ getColumns(dbMetaData, schemaname, tableName));

		}
		tables.close();

	}

	//

	private static String getColumns(DatabaseMetaData dbMetaData,
			String schemaname, String tableName) throws SQLException {
		ResultSet columns = dbMetaData.getColumns(null, schemaname, tableName,
				null);
		StringBuilder sb = new StringBuilder();
		while (columns.next()) {
			sb.append(columns.getString(4)).append("(")
					.append(columns.getString(5)).append("),");
		}
		columns.close();
		return sb.toString();
	}

	private static void printRSAndCloseIt(ResultSet rt) throws SQLException {
		int n = rt.getMetaData().getColumnCount();
		while (rt.next()) {
			System.out.println("------------------------------------------");

			for (int i = 0; i < n; i++) {
				System.out.print("\t");
				System.out.print(rt.getString(i + 1));

			}
		}
		rt.close();
	}

}
