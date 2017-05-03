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
		<tr>
			<td>Student Mobile Number:</td>
			<td>${student.mobileNumber}</td>
		</tr>
		<tr>
			<td>Student Date of Birth:</td>
			<td>${student.dateOfBirth}</td>
		</tr>
		<tr>
			<td>Student Skills:</td>
			<td>${student.userSkills}</td>
		</tr>
		<tr>
			<td>Student Address:</td>
			<td>Street Name: ${student.studentAddress.steetNum}
			House Number: ${student.studentAddress.aptNumORhouseNum}
			City: ${student.studentAddress.city}
			State: ${student.studentAddress.state}
			Country: ${student.studentAddress.country}</td>
		</tr>
	</table>
</body>
</html>