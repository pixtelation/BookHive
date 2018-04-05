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
        <title>Cart</title>
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
         <jsp:include page="Navigation.jsp" />
         <%
         String username=(String)session.getAttribute("username");
            out.print("<h3 style='color:aqua' align='center'>Hello...."+"<a style='color:gold'>"+username+"<a/>"+".These are your cart details<h3/>");
            
         %>
         
         
         
         
          <% 
         
          
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://ABHISHEKMEHTA;databaseName=AdventureWorks2012;user=sa;password=1234;");
        Statement st= con.createStatement();
        ResultSet rs = st.executeQuery("select * from Customercart");
        
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
                        %>
                        
                        <tr class="view_field">
                            <td><div align="center"><%= rs.getString("bookid") %></div></td>
                            <td><div align="center"><%= rs.getString("bookcode") %></div></td>
                            <td><div align="center"><%= rs.getString("bookname") %></div></td>
                            <td><div align="center"><%= rs.getString("bookauthor") %></div></td>
                            <td><div align="center"><%= rs.getString("bookprice") %></div></td>
                            <td><div align="center"><a href="Deletecart.jsp">Delete</a></div></td>
                        </tr>
                                   
               <% } %>
                      
                     
                    </table>
                      
                     
                      <table align='center'>
                          &nbsp;&nbsp;&nbsp;&nbsp;<tr>
                              <td style='background: #EDEDED'>
                                  <a href="Orders">Proceed to Place Order</a>  
                              </td>
                              
                              <td>
                                  <img src="Images/text.gif" alt=""/>
                              </td>
                               
                             
                              <td>
                                <div align="center"><jsp:include page="Total.jsp" /></div> 
                              </td>
                          </tr>
                      </table>
                    
                  
                 
                   
        
        
         
         
        
    </body>
</html>
