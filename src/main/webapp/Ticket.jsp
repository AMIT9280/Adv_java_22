<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket App</title>
</head>
<body>
		<form action="TicketServlet" method="post">
			FirstName : <input type="text" name="Fname">
			<br> <br>
			Mobile Number : <input type="text" name="Mnum">
			<br> <br>
			Category :-
			<select name="category">
					<option value="Gold">Gold - Rs.300</option>
					<option value="Silver">Silver - Rs.250</option>
					<option value="Platinum">Platinum - Rs.350</option>
			</select>
			<br> <br>
			Qty : <input type="text" name="qty">
			<br> <br>
			<input type="submit" value="Submit"> 
		</form>
		<br> <br>
		<a href="">View All Bookings</a>
</body>
</html>