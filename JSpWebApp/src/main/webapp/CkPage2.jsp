<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="javax.servlet.http.Cookie;" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String pname = request.getParameter("txtPname");
//String loc = request.getParameter("txtLoc");

Cookie cookie = new Cookie("pername",pname);
response.addCookie(cookie);

response.sendRedirect("CkPage3.jsp");
%>
</body>
</html>