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
            <h2>LOGIN as ADMIN</h2>
       
        <form action="Adminlogin" method="post" >
            <input type="text" name="username" placeholder="Please Enter UserName...."><br><br>
            <input type="password" name="pass" placeholder="Please enter Password...."><br><br>
            <input type="submit" value="LOGIN">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
        </form>
        </div>
        
    </body>
</html>
