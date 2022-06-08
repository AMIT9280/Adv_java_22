
<%@page import="com.dao.UserStorage"%>
<%@page import="com.bean.TicketUserBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Booking</title>
  
</head>
<body>
<h1>This Is List Booking</h1>

	<table border="1">
		<tr>
			<th>Name</th>
			<th>Number</th>
			<th>Category</th>
			<th>Qty</th>
			<th>Action</th>
		</tr>
		<%
			for(int i=0; i<UserStorage.list.size(); i++) {
		%>
		<tr>
			<td><%=UserStorage.list.get(i).getFirstName() %> </td>
			<td><%=UserStorage.list.get(i).getMnum()%></td>
			<td><%=UserStorage.list.get(i).getCategory()%></td>
			<td><%=UserStorage.list.get(i).getQty() %></td>
			<td>
 			<a href="DeleteUserServlet?userId=">Delete</a> |
<%-- 			<a href="ViewUserServlet?userId=<%=user.getUserId()%>">View</a>| --%>
<%-- 			<a href="EditUserServlet?userId=<%=user.getUserId()%>">Edit</a> --%>
			</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>