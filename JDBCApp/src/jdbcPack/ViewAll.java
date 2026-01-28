package jdbcPack;
import java.sql.*;

public class ViewAll {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection  conObj = DriverManager.getConnection("url", "username","password")
		Connection  conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");
		
		Statement stmt = conObj.createStatement();
		ResultSet res = stmt.executeQuery("select * from cricket");
		
		while(res.next())
		{
			System.out.println(res.getInt("crno"));
			System.out.println(res.getString("crname"));
			System.out.println(res.getInt("runs"));
			System.out.println("---------");
		}
		
		conObj.close();
	}

}
