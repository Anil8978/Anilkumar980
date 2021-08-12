<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>CONTACT INFORMATION</h1>
  <form action="ContactServlet" method="post">
   <table bgcolor="	#708090"> <style="with: 80%">
    <tr>
     <td>USER ID</td>
     <td><input type="text" name="user_id" /></td>
    </tr>
    <tr>
     <td>NAME</td>
     <td><input type="text" name="Name" /></td>
    </tr>
    <tr>
     <td>EMAIL</td>
     <td><input type="text" name="Email" /></td>
    </tr>
    <tr>
     <td>PHONE NUMBER</td>
     <td><input type="text" name="Phone" /></td>
    </tr>
    <tr>
     <td>MESSAGE</td>
     <td><input type="text" name="Message" /></td>
    </tr>
   
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>