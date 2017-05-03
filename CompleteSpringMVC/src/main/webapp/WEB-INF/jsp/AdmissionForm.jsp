<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admission Form</title>
</head>
<body>
	<h2>${voidMsg}</h2>
	<h1>Student Admission Form</h1>
	<form action="/CompleteSpringMVC/submitAdmissionForm.htm" method="post">
		<table>
			<tr>
				<td>Students FirstName:</td>
				<td><input type="text" name="studentFirstName" /></td>
			</tr>
			<tr>
				<td>Students LastName:</td>
				<td><input type="text" name="studentLastName" /></td>
			</tr>
			<tr>
				<td>Students Mobile Number:</td>
				<td><input type="text" name="mobileNumber" /></td>
			</tr>
			<tr>
				<td>Students Date of Birth:</td>
				<td><input type="text" name="dateOfBirth" /></td>
			</tr>
			<tr>
				<td>Students Skills:</td>
				<td><select name="userSkills" multiple="multiple">
						<option value="Core Java">Core Java</option>
						<option value="Struts">Struts</option>
						<option value="Spring">Spring</option>
						<option value="RestWebServices">Rest</option>
				</select></td>
			</tr>
		</table>
		<input type="submit" value="Click here to submit the form" />
	</form>
</body>
</html>