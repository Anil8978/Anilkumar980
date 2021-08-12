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
  <h1 style="background-color:Tomato;">COURSE INFORMATION</h1>
  <form action="CourseServlet" method="post">
   <table bgcolor="	#708090"><style="with: 80%">
    <tr>
     <td>COURSE ID</td>
     <td><input type="text" name="course_id" /></td>
    </tr>
    <tr>
     <td> COURSE NAME</td>
     <td><input type="text" name="Name" /></td>
    </tr>
    <tr>
     <td>COURSE DESCRIPTION</td>
     <td><input type="text" name="Description" /></td>
    </tr><br><br>
    
    <tr>
     <td>RESOURSE FILE</td>
     <td><input type="file" name="Resourse" /></td>
    </tr><br><br>
    
    <tr>
     <td>COURSE FEES</td>
     <td><input type="text" name="Fees" /></td>
    </tr>
    
   </table>
   <input type="submit" value="ENROLL" style="background-color:blue">
  </form>
 </div>
</body>
</html>