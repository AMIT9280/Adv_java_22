<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Data</title>
</head>
<body>

	First Name ==> ${cookie.FirstName.value }
	<br>
	CC ==> ${sessionScope.Cc }
	
	<br>
	<br>
	<a href="LogoutServlet">Logout</a>
</body>
</html>