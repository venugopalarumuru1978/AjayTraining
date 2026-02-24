<%@page import="person.model.Person"%>
<%@page import="person.DAL.PersonDAL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

	if(session.getAttribute("pid")!=null)
	{
		int pid = (Integer)session.getAttribute("pid");
		PersonDAL pdal = new PersonDAL();
		Person perObj =  pdal.SearchPerson(pid); 
%>
<h2>Welcome to : <%=perObj.getPname() %>
</h2><hr />
<jsp:include page="PersonLinks.html"/>
<table width="100%" border="1">
<tr>
<th>Person ID</th>
<th>Person Name</th>
<th>Person Phone</th>
<th>Person Email</th>
<th>Email Password</th>
</tr>
<tr>
<td><%=perObj.getPid() %></td>
<td><%=perObj.getPname() %></td>
<td><%=perObj.getPhone() %></td>
<td><%=perObj.getEmail() %></td>
<td><%=perObj.getPswd() %></td>
</tr>
</table>

<%
	}
	else
		response.sendRedirect("Login.jsp");
%>
</body>
</html>