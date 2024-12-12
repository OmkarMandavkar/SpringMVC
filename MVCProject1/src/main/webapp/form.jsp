<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter Data</h1>

	<form action="read" method="post">
		Name: <input type="text" name="userName"> <br>
		Email: <input type="email" name="userEmail"> <br>
		Address: <input type="text" name="address"> <br>
		
		<input type="submit" value="Submit">
	</form>
</body>
</html>