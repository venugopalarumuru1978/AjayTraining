<%
	session.removeAttribute("pid");
	response.sendRedirect("Login.jsp");
%>