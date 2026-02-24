<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1 style="text-align:center">Login Page</h1>
<hr />
<form name="frmLogin" method="POST" action="Login">
<p style="text-align:center">
	<input type="text"  name="txtUname"  placeholder="User Name" required/>
	<br /><br />
	<input type="password"  name="txtPass"  placeholder="Password"  required />
	<br /><br />
	<input type="submit"  value="Login Here" />
</p>
</form>
</body>
</html>