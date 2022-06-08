<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
	.err{color: red; 
	}
</style>
</head>
<body>

	<%
	String FirstNameError = (String) request.getAttribute("FirstNameError");
	String EmailError = (String) request.getAttribute("EmailError");
	String PasswordError = (String) request.getAttribute("PasswordError");

	String FirstNameValue = (String) request.getAttribute("FirstNameValue");
	String EmailValue = (String) request.getAttribute("EmailValue");
	%>


	<form action="RegistrationServlet" method="post">
		<span class="err"> FirstName: <input type="text" name="FirstName"
			value="<%=FirstNameValue == null ? "" : FirstNameValue%>"> <%=FirstNameError == null ? "" : FirstNameError%>
			<br> <br> Email: <input type="text" name="email"
			value="<%=EmailValue == null ? "" : EmailValue%>"> <%=EmailError == null ? "" : EmailError%>
			<br> <br> Password: <input type="password" name="password" />
			<%=PasswordError == null ? "" : PasswordError%> <br> <br> <input
			type="submit" value="Submit"> <br> <br>
		</span>
	</form>
</body>
</html>