<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Election 2022</title>
<style>
	.msg{
	
		color: red;
	}
</style>
</head>
		<% String age = (String) request.getAttribute("age"); %>

<body>
	 <form action="ElectionServlet" method="post">
	 	Citizen Name : <input type="text" name="name" >
	 	<br>
	 	<br>
	 	Gender : 
	 	Male <input type="radio" value="male" name="gender">
	 	Female <input type="radio" value="female" name="gender">
	 	<br>
	 	<br>
	 	Date of Birth : <input type="date" value="date" name="date">
	 	<br>
	 	<br> 	
	 	<input type="submit" value="Submit">
	 </form>
	 <br>
	 <div class="msg"><%=age == null ? "" : age %></div>
	  
</body>
</html>