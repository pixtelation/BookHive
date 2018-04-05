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
        <title>JSP Page</title>
        
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
         <jsp:include page="Navigation.jsp" />
         
         <table align="center">
           <tr>
               <td>
                   <h2 style="color: #EDEDED">FeedBacks</h2>
                   
                  
               </td>
           </tr> 
           </table>
        
        <% 
         int count=0;
          
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://ABHISHEKMEHTA;databaseName=AdventureWorks2012;user=sa;password=1234;");
        Statement st= con.createStatement();
        ResultSet rs = st.executeQuery("select * from contact");
        
        %>
        
        <table border="0" align="center" cellpadding="5" cellspacing="5">
                        <tr class="field_name">
                       
                            <td><div align="center"><strong>Name</strong></div></td>&nbsp;
                            <td><div align="center"><strong>Email</strong></div></td>&nbsp;
                            <td><div align="center"><strong>Subject</strong></div></td>&nbsp;
                            <td><div align="center"><strong>Message</strong></div></td>&nbsp;
                          
                         
                        
                        </tr>
                        <%

                         while(rs.next())
                         {
                           

                        %>
                        <tr class="view_field">
                          
                            <td><div align="center"><%= rs.getString("name") %></div></td>
                            <td><div align="center"><%= rs.getString("email") %></div></td>
                            <td><div align="center"><%= rs.getString("subject") %></div></td>
                            <td><div align="center"><%= rs.getString("message") %></div></td>
                        
                        </tr>
                        
                        <% } %>
                    </table>
                    
                              
        
        
         
         
        
    </body>
</html>
