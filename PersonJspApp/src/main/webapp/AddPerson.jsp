<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">Add New Person</h1>
<hr />
<form name="frmPerson" method="POST" action="AddPerson">
<p style="text-align:center">
	<input type="text"  name="txtPname"  placeholder="Person Name" required/>
	<br /><br />
	<input type="email"  name="txtEmail"  placeholder="Person Email"  required />
	<br /><br />
	<input type="text"  name="txtPwd"  placeholder="Email Password"  required />
	<br /><br />
	<input type="text"  name="txtPhone"  placeholder="Person Phone"  required />
	<br /><br />
	<input type="submit"  value="Register Person" />
</p>
</form>
</body>
</html>