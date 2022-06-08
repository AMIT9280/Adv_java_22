<%@page import="com.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListUsers</title>
</head>
<body>
	<%
		ArrayList<UserBean> users = (ArrayList<UserBean>) request.getAttribute("allUser");
	%>
	<table border="1">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
		</tr>
		<%
			for(UserBean user : users) {
		%>
		<tr>
			<td><%=user.getUserId()%></td>
			<td><%=user.getFirstName()%></td>
			<td><%=user.getEmail()%></td>
			<td><%=user.getPassword()%></td>
			<td>
			<a href="DeleteUserServlet?userId=<%=user.getUserId()%>">Delete</a> |
			<a href="ViewUserServlet?userId=<%=user.getUserId()%>">View</a>|
			<a href="EditUserServlet?userId=<%=user.getUserId()%>">Edit</a>
			</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>



