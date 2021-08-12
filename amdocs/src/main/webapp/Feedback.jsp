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
  <h1>FEEDBACK FORM</h1>
  <form action="FeedbackServlet" method="post">
   <table bgcolor=#E6E6FA> <style="with: 80%">
    <tr> 
     <td>NAME</td>
     <td><input type="text" name="Name" /></td>
    </tr>
    <tr>
     <td>USER ID</td>
     <td><input type="text" name="user_id" /></td>
    </tr>
    <tr>
     <td>EMAIL</td>
     <td><input type="text" name="Email" /></td>
    </tr>
    <tr>
     <td>FEEDBACK</td>
     <td><input type="text" name="Feedback" /></td>
    </tr>
  
   </table>
   <input type="submit" value="SubmitandEXIT" />

  </form>
 </div>
</body>
</html>