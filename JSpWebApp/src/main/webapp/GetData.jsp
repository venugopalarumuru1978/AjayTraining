<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
	Class.forName("com.mysql.cj.jdbc.Driver");			
	Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root"); 
	PreparedStatement psObj = conObj.prepareStatement("SELECT * FROM STUDENT");
	ResultSet rs = psObj.executeQuery();
%>
<table width='100%' border='1'>
<tr>
<th>Roll Number</th>
<th>Student name</th>
<th>Course</th>
<th>Fees</th>
<th>Email</th>
<th>Password</th>
</tr>
<%
while(rs.next())
{
%>
<tr>
<td><%= rs.getInt("rollno") %></td>
<td><%= rs.getString("sname") %></td>
<td><%= rs.getString("course") %></td>
<td><%= rs.getFloat("fees") %></td>
<td><%= rs.getString("email") %></td>
<td><%= rs.getString("pswd") %></td>
</tr>

<%
} 
%>
</table>

</body>
</html>