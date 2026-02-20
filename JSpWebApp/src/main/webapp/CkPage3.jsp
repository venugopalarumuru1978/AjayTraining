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
Cookie  ck[] = request.getCookies();
for(Cookie c : ck)
{
%>
<h1>Cookie Name : <%= c.getName() %></h1>
<h1>Cookie Value : <%= c.getValue() %></h1>
<%
}
%>
</body>
</html>