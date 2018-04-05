<%-- 
    Document   : Register
    Created on : Aug 30, 2017, 11:30:27 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <link rel="stylesheet" href="style.css"> 
           </head>
    <body>
        <jsp:include page="Navigation.jsp" />
        
        <!--------------------------------------------html------------------------------------>
        <div class="container">
        <section class="register">
            <h1>Register on BookHive</h1>
        <form method="post" action="Register">
            
            <div class="reg_section personal_info">
            <input type="text" name="username" placeholder="Username"/> 
            <input type="text" name="email" placeholder="Email" /> 
            <input type="text" name="firstname" placeholder="Firstname"/> 
            <input type="text" name="lastname" placeholder="Lastname" /> 
            </div>
            
            <div class="reg_section password">
            <h3>Your Password</h3>
            <input type="password" name="pass" placeholder="Password" /> 
            <input type="password" name="confirmpass" placeholder="Retype Your Password" /> 
            </div>
            
            <div class="reg_section password">
            <h3>Your Address</h3>
            <input type="text" name="country" placeholder="Country"/> 
            <textarea name="addr" placeholder="Enter Your Full Address"></textarea> 
            </div>
            <input type="submit" value="Submit" /> 
        </form>
        </section>
        </div> 
        
    </body>
</html>
