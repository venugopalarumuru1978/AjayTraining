package ServletsInfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ConnectionInfo.DbConnection;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rno =  request.getParameter("txtRno");
		String sname =  request.getParameter("txtSname");
		String course =  request.getParameter("txtCourse");
		String fees =  request.getParameter("txtFees");
		String email =  request.getParameter("txtEmail");
		String pwd =  request.getParameter("txtPwd");
		
		response.setContentType("text/html");
		PrintWriter  out = response.getWriter();
		
		try {
			Connection conObj = DbConnection.getConnection();
			PreparedStatement psObj = conObj.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?,?,?)");
			psObj.setInt(1, Integer.parseInt(rno));
			psObj.setString(2, sname);
			psObj.setString(3, course);
			psObj.setFloat(4, Float.parseFloat(fees));
			psObj.setString(5, email);
			psObj.setString(6, pwd);			
			psObj.executeUpdate();
			
			//out.print("Student Details are added.....");
			response.sendRedirect("ViewStudents");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
