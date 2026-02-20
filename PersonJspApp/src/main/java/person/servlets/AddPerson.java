package person.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person.DAL.PersonDAL;
import person.model.Person;

/**
 * Servlet implementation class AddPerson
 */
@WebServlet("/AddPerson")
public class AddPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname = request.getParameter("txtPname");
		String email = request.getParameter("txtEmail");
		String phone = request.getParameter("txtPhone");
		String pwd = request.getParameter("txtPwd");
		
		Person person = new Person();
		person.setPname(pname);
		person.setEmail(email);
		person.setPhone(phone);
		person.setPswd(pwd);
		
		PersonDAL  pdal = new PersonDAL();
		pdal.AddPerson(person);
		
		response.sendRedirect("ViewPerson.jsp");
		
		
	}

}
