<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<%
String FirstNameError = (String) request.getAttribute("FirstNameError");
String EmailError = (String) request.getAttribute("EmailError");
String FirstNameValue = (String) request.getAttribute("FirstNameValue");
String EmailValue = (String) request.getAttribute("EmailValue");
%>
<body>
	<form action="ListuserServlet" method="post">
		<span class="err"> FirstName: <input type="text" name="FirstName"
			value="<%=FirstNameError == null ? "" : FirstNameError%>">
		<%=FirstNameError == null ? "" : FirstNameError%>
		<br> <br> Email: <input type="text" name="email"
			value="<%=EmailValue == null ? "" : EmailValue%>">
		<%=EmailError == null ? "" : EmailError%>
		<br> <br> <input
			type="submit" value="Submit">
		</span>
	</form>
</body>
</html>