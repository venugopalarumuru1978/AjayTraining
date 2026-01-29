package jdbcPack;
import java.sql.*;

public class AddingRows3 {

	public static void main(String[] args)  throws Exception {
		// using PreparedStatement
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection  conObj = DriverManager.getConnection("url", "username","password")
		Connection  conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");
		//INSERT INTO CRICKET(CRNO, CRNAME, RUNS) VALUES(111, 'DRAVID', 12000);
		
		PreparedStatement psObj = conObj.prepareStatement("INSERT INTO CRICKET(CRNO, CRNAME, RUNS) VALUES(?,?,?)");
		psObj.setInt(1, 1006);
		psObj.setString(2, "Pratheek");
		psObj.setInt(3, 1000);
		
		psObj.executeUpdate();
		
		System.out.println("Row Added....");
		conObj.close();
	}

}
