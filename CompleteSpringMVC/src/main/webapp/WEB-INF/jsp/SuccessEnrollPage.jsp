<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success Page</title>
</head>
<body>
	<h2>${voidMsg}</h2>
	<h1>Student Successfully enrolled</h1>
	<h2>${msg}</h2>
	<h4>Using @ModelAttribute annotation</h4>
	<table>
		<tr>
			<td>Student First Name:</td>
			<td>${student.studentFirstName}</td>
		</tr>
		<tr>
			<td>Student Last Name:</td>
			<td>${student.studentLastName}</td>
		</tr>
	</table>
</body>
</html>