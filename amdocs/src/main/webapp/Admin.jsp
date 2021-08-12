<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN</title>
</head>
<body>
 <div align="center">
  <h1 style="background-color:DodgerBlue;">ADMIN INFORMATION</h1>
  <form action="AdminServlet" method="post">
   <table bgcolor="	#228B22"> <style="with: 80%">
    <tr>
     <td>ADMIN ID</td>
     <td><input type="text" name="Admin_id" /></td>
    </tr>
    <tr>
     <td>PASSWORD</td>
     <td><input type="text" name="Password" /></td>
    </tr>
     <tr>
     <td>NAME</td>
     <td><input type="text" name="Name" /></td>
    </tr>
    <tr>
     <td>EMAIL</td>
     <td><input type="text" name="Email" /></td>
    </tr>
    
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>