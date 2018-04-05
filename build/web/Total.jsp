<%-- 
    Document   : Viewforuser
    Created on : Sep 9, 2017, 5:10:29 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Total</title>
        <%@ page import="javax.servlet.http.HttpSession"%>
        
        <style>
            .field_name
{
    background:rgb(118,114,104);
    color:white;
}
.view_field
{
    background:rgb(150,234,238);
    font-size:20px;
    font-weight:600;
    font-style:italic;
    color:red;
}
        </style>
    </head>
    <body>
       
       
          
        <% 
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://ABHISHEKMEHTA;databaseName=AdventureWorks2012;user=sa;password=1234;"); 
        Statement st=con.createStatement();
        String strQuery = "select sum(bookprice)from Customercart;";
        ResultSet rs = st.executeQuery(strQuery);
        String total="";
        %>
        
        
        <table border="0" align="center" cellpadding="5" cellspacing="5">
           
             <%

               while(rs.next())
               {
               total = rs.getString(1);
               
              %>
            <tr class="view_field">
             
             <td><div align="center"><%out.print(total);%></div></td>   
            </tr>
              <% 
               }
              %>
            
        </table>
         
         
        
        
        
         
         
        
    </body>
</html>
