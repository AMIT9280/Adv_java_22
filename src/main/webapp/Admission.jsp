<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admission Form</title>
</head>
<body>
	<form action="AdmissionServlet">

		Marks in Mathematics : <input type="text" name="Math" placeholder="Enter Marks">${err }
		<br> <br>
		Marks in Physics : <input type="text" name="Phy" placeholder="Enter Marks">${err } 
		<br> <br>
		Marks in Chemistry : <input type="text" name="Che" placeholder="Enter Marks"> ${err }
		<br> <br>
		<input type="submit" value="Submit">
	</form>
	 <br>
	 Total Marks = ${total }
	 <br>
	 <br>
	 ${msg }
</body>
</html>