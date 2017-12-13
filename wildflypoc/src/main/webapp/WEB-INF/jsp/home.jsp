<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/include.jsp"%>   
<%@page import="com.vaibhav.hibernate.entity.Employee"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		
		<table border="1">

			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Telephone</th>
			<th>Action</th>
			
			<%
			    List<Employee> employeeList = (List<Employee>)request.getAttribute("listEmployee");
				for(Employee employee: employeeList){
			%>		
					<tr>
						<td><%= employee.getName() %></td>
						<td><%= employee.getEmail() %></td>
						<td><%= employee.getAddress() %></td>
						<td><%= employee.getTelephone() %></td>
						<td><a href="editEmployee?id=<%=employee.getId() %>">Edit</a>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="deleteEmployee?id=<%=employee.getId() %>">Delete</a></td>
					</tr>
			<%
				}
			%>

		<%-- 
			<c:forEach var="employee" items="${listEmployee}">
				<tr>

					<td>${employee.name}</td>
					<td>${employee.email}</td>
					<td>${employee.address}</td>
					<td>${employee.telephone}</td>
					<td><a href="editEmployee?id=${employee.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteEmployee?id=${employee.id}">Delete</a></td>

				</tr>
			</c:forEach>
		--%>
		</table>
		<h4>
			New Employee Register <a href="newEmployee">here</a>
		</h4>
	</div>
</body>
</html>