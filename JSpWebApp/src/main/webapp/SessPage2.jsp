
<%
String pname = request.getParameter("txtPname");
String loc = request.getParameter("txtLoc");
session.setAttribute("pname", pname);
session.setAttribute("location", loc);
//session.setMaxInactiveInterval(60000);
response.sendRedirect("SessPage3.jsp");
%>