<%@page import="java.util.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World - JSP Page</h1>
<hr />
<h2><%= "Venugopal" %></h2>
<%
int x = 100;
float y =12.45f;
String str = "JSP Session";
//out.print("X value is : " + x);
List<String> lstStr = new ArrayList<String>();
%>

<h1> X value is : <%=x %></h1>
<h1> Y value is : <%=y %></h1>
<h1> String value is : <%=str %></h1>
 <%!
        Date theDate = new Date();
        Date getDate() {
            System.out.println("In getDate() method");
            return theDate;
        }
    %>
    <h1>Hello! The time is now <%= getDate() %></h1>
    <jsp:include page="DemoPage.html"/>
</body>
</html>