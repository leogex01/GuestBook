<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GuestBook</title>
</head>
<body>
  <div>
  	<h1>Welcome to my <b>Super-duper limited functionality guest book!</b></h1>
  </div>
  <!-- content -->
  <div>
   	<form action= "addServlet" method="post">
   	Please, enter your name for our guest book<br>
   	<input type="text" name="name" size= "20">
    Name
   	<input type= "submit" value="GuestName" />
   	</form>
   	
  	<button onclick ="location.href='/add'">List guests</button>
  </div>

</body>
</html>