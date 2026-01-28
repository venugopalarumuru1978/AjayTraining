package jdbcPack;
import java.sql.*;
import java.util.Scanner;

public class AddingRows2 {
	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cricketer Number ");
		int crno = sc.nextInt();
		
		System.out.println("Cricketer  Name ");
		String crname = sc.next();
		
		System.out.println("Runs ");
		int runs = sc.nextInt();
		
		//INSERT INTO CRICKET(CRNO, CRNAME, RUNS) VALUES(111, 'DRAVID', 12000);
		
		String inscmd = "INSERT INTO CRICKET(CRNO, CRNAME, RUNS) VALUES(";
		inscmd = inscmd+ crno + ",'" + crname + "'," + runs + ")";
		
		System.out.println(inscmd);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection  conObj = DriverManager.getConnection("url", "username","password")
		Connection  conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");

		Statement stmt = conObj.createStatement();
		stmt.executeUpdate(inscmd);
		System.out.println("Row Added....");
		conObj.close();		
	}
}
