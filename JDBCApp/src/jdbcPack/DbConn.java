package jdbcPack;
import java.sql.*;

public class DbConn {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection  conObj = DriverManager.getConnection("url", "username","password")
		Connection  conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");
		
		if(conObj!=null)
			System.out.println("Db Conncected Sucessfully...");
	}

}
