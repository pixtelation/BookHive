<%-- 
    Document   : Add
    Created on : Sep 9, 2017, 3:36:34 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <jsp:include page="Navigation.jsp" />
       <table align="center">
           <tr>
               <td>
                   <h2 style="color: #EDEDED">Add</h2>
               </td>
           </tr> 
           
           
           <tr>
               <td style="color: #00cccc">
           <form method="post" action="Add">
               Book Code&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bookcode" /><br>
               Book Name&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bookname" /><br>
               Book Author&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bookauthor" /><br>
               Book Price&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bookprice" /><br><br>
               <input type="submit" value="Add" />
               
           </form> 
                   </td>
           </tr>
           
       </table>
       
    </body>
</html>
