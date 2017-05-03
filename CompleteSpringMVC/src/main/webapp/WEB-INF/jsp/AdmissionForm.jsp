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
		<p>
			Students FirstName: <input type="text" name="studentFirstName" />
		</p>
		<p>
			Students LastName: <input type="text" name="studentLastName" />
		</p>
		<input type="submit" value="Click here to submit the form" />
	</form>
</body>
</html>