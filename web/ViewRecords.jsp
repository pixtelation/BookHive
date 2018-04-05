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
                   <h2 style="color: #EDEDED">View For Admin</h2>
                   
                  
               </td>
           </tr> 
           </table>
        
        <% 
         int count=0;
          
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://ABHISHEKMEHTA;databaseName=AdventureWorks2012;user=sa;password=1234;");
        Statement st= con.createStatement();
        ResultSet rs = st.executeQuery("select * from Additems");
        
        %>
        
        <table border="0" align="center" cellpadding="5" cellspacing="5">
                        <tr class="field_name">
                            <td><div align="center"><strong>Book ID</strong></div></td>&nbsp;&nbsp;&nbsp;&nbsp;
                            <td><div align="center"><strong>Book Code</strong></div></td>&nbsp;
                            <td><div align="center"><strong>Book Name</strong></div></td>&nbsp;
                            <td><div align="center"><strong>Book Author</strong></div></td>&nbsp;
                            <td><div align="center"><strong>Book Price</strong></div></td>
                            <td colspan="2"><div align="center"><strong>Action</strong></div></td>
                        </tr>
                        <%

                         while(rs.next())
                         {
                            rs.getString("bookid");

                        %>
                        <tr class="view_field">
                            <td><div align="center"><%=++count %></div></td>
                            <td><div align="center"><%= rs.getString("bookcode") %></div></td>
                            <td><div align="center"><%= rs.getString("bookname") %></div></td>
                            <td><div align="center"><%= rs.getString("bookauthor") %></div></td>
                            <td><div align="center"><%= rs.getString("bookprice") %></div></td>
                            <td><div align="center"><a href="Update.jsp">Update</a></div></td>
                        </tr>
                        
                        <% } %>
                    </table>
        
        
         
         
        
    </body>
</html>
