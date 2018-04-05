<%-- 
    Document   : index
    Created on : Aug 30, 2017, 3:32:08 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Hive</title>
         
    </head>
    <body>
        <jsp:include page="Navigation.jsp" />
        
        <%
        if(session.getAttribute("username")==null)
        {
        response.sendRedirect("Login.jsp");
        }
         else if(session.getAttribute("username")!=null && session.getAttribute("username").equals("admin") )
        {
          out.print("<h1 style='color: lightgoldenrodyellow' align='center'>Hahaha...Being an Admin you want to buy books<h1/>");  
       
        
        %>
       
         <center> <img src="Images/giphy-downsized.gif" width="250" height="188" alt="giphy-downsized"/></center>

        <%
        }
       else
        {
        %>
        
       <jsp:include page="ViewforCust.jsp" />
       <%}%>
        
        
       
         
        

    </body>
</html>
