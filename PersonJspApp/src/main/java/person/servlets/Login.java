package person.servlets;
import person.DAL.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import person.DAL.PersonDAL;
import person.model.Person;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("txtUname");
		String pass = request.getParameter("txtPass");
		HttpSession session= request.getSession();
		
		if(uname.equalsIgnoreCase("Administrator") && pass.equalsIgnoreCase("admin@123"))
		{
			session.setAttribute("admin", "admininfo");
			response.sendRedirect("ViewPerson.jsp");
		}
		else
		{
			PersonDAL  pdal = new PersonDAL();
			Person perObj = pdal.CheckLogin(uname, pass);
			if(perObj!=null)
			{
				
				session.setAttribute("pid", perObj.getPid());
				response.sendRedirect("PersonHome.jsp");
			}
			else
				response.sendRedirect("Error.html");
		}
	}

}
