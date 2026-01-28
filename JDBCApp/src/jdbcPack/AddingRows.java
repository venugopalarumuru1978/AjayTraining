package jdbcPack;
import java.sql.*;

public class AddingRows {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection  conObj = DriverManager.getConnection("url", "username","password")
		Connection  conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");
		//INSERT INTO CRICKET(CRNO, CRNAME, RUNS) VALUES(111, 'DRAVID', 12000);
		
		Statement stmt = conObj.createStatement();
		stmt.executeUpdate("INSERT INTO CRICKET(CRNO, CRNAME, RUNS) VALUES(112, 'SACHIN', 18000)");
		System.out.println("Row Added....");
		conObj.close();
		
	}

}
