package ConnectionPack;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	
	public static Connection getConnection()
	{
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return con;
	}
}
