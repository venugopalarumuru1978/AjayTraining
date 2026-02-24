<%@page import="person.model.Person"%>
<%@page import="java.util.List"%>
<%@page import="person.DAL.PersonDAL"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Persons</title>
</head>
<body>
<%
if(session.getAttribute("admin")!=null)
{
PersonDAL  pdal = new PersonDAL();
List<Person>  plist = pdal.ViewAll();
%>
<h1 style="text-align:center">All Persons Info</h1>
<hr />
<jsp:include page="AdminLinks.html"/>

<table width="100%" border="1">
<tr>
<th>Person ID</th>
<th>Person Name</th>
<th>Person Phone</th>
<th>Person Email</th>
<th>Email Password</th>
<th>Operations</th>
</tr>
<%
for(Person p : plist)
{
%>

<tr>
<td><%=p.getPid() %></td>
<td><%=p.getPname() %></td>
<td><%=p.getPhone() %></td>
<td><%=p.getEmail() %></td>
<td><%=p.getPswd() %></td>
<td>
<a href='DeletePerson?pid=<%=p.getPid() %>'>Delete</a>
</td>
</tr>

<%
}
}
else
	response.sendRedirect("Login.jsp");
%>
</table>
</body>
</html>