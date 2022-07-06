<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculate</title>
</head>
<body>

	<form action="CalculateServlet">
		BirthYear : <input type="text" name="bYear">
		${error }
		<br> <br>
		<input type="submit" value="CalculateAge">
	</form>
	
</body>
</html>