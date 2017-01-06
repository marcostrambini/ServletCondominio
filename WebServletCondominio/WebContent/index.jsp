<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/myJS.js"></script>
</head>
<body>

<form action="MyServlet?act=insUtente" method="post">
  First name:<br>
  <input type="text" name="nome" value="">
  <br>
  Last name:<br>
  <input type="text" name="cognome" value="">
  <br>
  Mail:<br>
  <input type="text" name="email" value="">
  <br>
  pwd:<br>
  <input type="text" name="pwd" value="">
  <br><br>
  <input type="submit" value="Submit">
</form> 

<button id="btn-reload" class="btn btn-danger">reload</button>
<br>
<br>
<h5>Utenti registrati</h5>
<div id="div-table"></div>


</body>
</html>