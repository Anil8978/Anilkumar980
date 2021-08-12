<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRAION</title>
</head>
<body>
 <div align="center">
  <h1 style="background-color:Tomato;">User Register Form</h1>
  <form action="register" method="post">
   <table 	bgcolor=#A9A9A9 > <style="with: 80%">
    <tr>
     <td> Name</td>
     <td><input type="text" name="name" /></td>
    </tr>
    <tr>
     <td>ID</td>
     <td><input type="text" name="id" /></td>
    </tr>
    <tr>
     <td>EMAIL</td>
     <td><input type="text" name="email" /></td>
    </tr>
    <tr>
     <td>PASSWORD</td>
     <td><input type="text" name="password" /></td>
    </tr>
    <tr>
     <td>MOBILE NUMBER</td>
     <td><input type="text" name="phone_no" /></td>
    </tr>
    <tr>
     <td>ADDRESS</td>
     <td><input type="text" name="address" /></td>
    </tr>
    <tr>
    <td>REGISTER DATE</td>
   <td><input type="text" name = "reg_date"/> </td>
   </tr>
   
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>