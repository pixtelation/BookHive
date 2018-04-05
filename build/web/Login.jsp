<%-- 
    Document   : Login
    Created on : Aug 30, 2017, 11:27:16 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
          <link rel="stylesheet" href="style.css"> 
       
    </head>
    <body>
        <jsp:include page="Navigation.jsp" />
         <div class="aa" align="center">
            <h2 >LOGIN</h2>
       
        <form action="Signin" method="post" >
            <input type="text" name="username" placeholder="Please Enter UserName...."><br><br>
            <input type="password" name="pass" placeholder="Please Enter Password...."><br><br>
            <a href="Register.jsp">Register as <b style="color: #FFCC00"> Member</b></a><br><br>
            <a href="Adminlogin.jsp">Login as <b style="color: darkcyan">Admin</b></a><br><br>
            <input type="submit" value="LOGIN">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
        </form>
        </div>
        
    </body>
</html>
