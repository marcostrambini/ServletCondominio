<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="MyServlet?act=insLogin" method="post">
  First name:<br>
  <input type="text" name="nome" value="">
  <br>
  Last name:<br>
  <input type="text" name="cognome" value="">
  <br>
  Mail:<br>
  <input type="text" name="mail" value="">
  <br>
  pwd:<br>
  <input type="text" name="pwd" value="">
  <br><br>
  <input type="submit" value="Submit">
</form> 



</body>
</html>