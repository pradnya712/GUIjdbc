package jdbcGUI.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseutility {
	static String dbURL="jdbc:mariadb://localhost:3306/CustomerDetails";
	static String dbUser="root";
	static String dbPassword="123";

   public Connection getconnection() {
	   Connection con=null;

		try {
		DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
		con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
		
		}
		catch (SQLException e) {
			
			e.printStackTrace();			
		}
		return con;
   }
}
