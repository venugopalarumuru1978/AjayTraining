package ServletsInfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ConnectionInfo.DbConnection;

/**
 * Servlet implementation class ViewStudents
 */
@WebServlet("/ViewStudents")
public class ViewStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter  out = response.getWriter();
		
		out.print("<table width='100%' border='1'>");
		out.print("<tr><th>Roll Number</th><th>Student name</th><th>Course</th><th>Fees</th><th>Email</th><th>Password</th></tr>");
		try {
			Connection conObj = DbConnection.getConnection();
			PreparedStatement psObj = conObj.prepareStatement("SELECT * FROM STUDENT");
			ResultSet rs = psObj.executeQuery();
			while(rs.next())
			{
				out.print("<tr>");
				out.print("<td>" + rs.getInt("rollno") + "</td>");
				out.print("<td>" + rs.getString("sname") + "</td>");
				out.print("<td>" + rs.getString("course") + "</td>");
				out.print("<td>" + rs.getFloat("fees") + "</td>");
				out.print("<td>" + rs.getString("email") + "</td>");
				out.print("<td>" + rs.getString("pswd") + "</td>");
				out.print("</tr>");
			}
			conObj.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		out.print("</table>");
	}

}
