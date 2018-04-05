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
                   <h1 style="color: #EDEDED">Here is your preferred choice</h1>
               </td>
           </tr> 
           </table>
         
          <% 
         int count=0;
          
         String bookcode=request.getParameter("bookcode");
          
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://ABHISHEKMEHTA;databaseName=AdventureWorks2012;user=sa;password=1234;");
         PreparedStatement ps=con.prepareStatement("select * from Additems where bookcode=?");
         ps.setString(1, bookcode);
         ResultSet rs=ps.executeQuery();
         
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
                        <form method="post" action="Customercart">
                            <td><div align="center"><input style="cursor:not-allowed" type="text" name="bookid" value="<%= rs.getString("bookid") %>" readonly/> </div></td>
                            <td><div align="center"><input style="cursor:not-allowed" type="text" name="bookcode" value="<%= rs.getString("bookcode") %>" readonly/></div></td>
                            <td><div align="center"><input style="cursor:not-allowed" type="text" name="bookname" value="<%= rs.getString("bookname") %>" readonly/></div></td>
                            <td><div align="center"><input style="cursor:not-allowed" type="text" name="bookauthor" value="<%= rs.getString("bookauthor") %>"  readonly/></div></td>
                            <td><div align="center"><input style="cursor:not-allowed" type="text" name="bookprice" value="<%= rs.getString("bookprice") %>"  readonly/></div></td>
                            <td><div align="center"><input type="submit" value="AddToCart" /></div></td>
                            </form>
                        </tr>
                        
                        <% } %>
                    </table>
        
        
         
         
        
    </body>
</html>
