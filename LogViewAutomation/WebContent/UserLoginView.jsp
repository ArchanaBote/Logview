<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>LogView Application</h1>
<form method="POST" action="UserLoginController">
Enter Username:<input type="text" name="uname"><br><br>
Enter Password: <input type="password" name="pass"><br><br>
<input type="submit" name="submit" value="Login"></form>
</body>
</html>