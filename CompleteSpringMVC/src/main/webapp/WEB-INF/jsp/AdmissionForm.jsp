<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admission Form</title>
</head>
<body>
	<h2>${voidMsg}</h2>
	<h1>Student Admission Form</h1>
	<form:errors path="student.*" />
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
		<table>
			<tr>
				<td>Student Address:</td>
			</tr>
			<tr>
				<td>Street Name: <input type="text"
					name="studentAddress.steetNum"></td>
				<td>House Number: <input type="text"
					name="studentAddress.aptNumORhouseNum"></td>
				<td>City: <input type="text" name="studentAddress.city"></td>
				<td>State: <input type="text" name="studentAddress.state"></td>
				<td>Country: <input type="text" name="studentAddress.country"></td>
			</tr>

		</table>
		<input type="submit" value="Click here to submit the form" />
	</form>
</body>
</html>