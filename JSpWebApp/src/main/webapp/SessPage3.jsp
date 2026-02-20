<%
String pname="", loc="";
if(session.getAttribute("pname")!=null || session.getAttribute("location")!=null)
{
pname = (String)session.getAttribute("pname");
loc = (String)session.getAttribute("location");
}
else
{
	response.sendRedirect("SessPage1.jsp");
}
%>

<h1>Person Name : <%=pname %></h1>
<h1>Person Location : <%=loc %></h1>
<h1>Session ID : <%=session.getId() %></h1>