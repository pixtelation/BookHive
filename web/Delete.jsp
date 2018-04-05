<%-- 
    Document   : Delete
    Created on : Sep 9, 2017, 4:38:58 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
    </head>
    <body>
        <jsp:include page="Navigation.jsp" />
        
        <table align="center">
           <tr>
               <td>
                   <h2 style="color: #EDEDED">Delete</h2>
               </td>
           </tr> 
           
           
           <tr>
               <td style="color: #00cccc">
           <form method="post" action="Delete">
              Enter the Book id&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bookid" /><br>
               <input type="submit" value="Delete" />
           </form> 
               </td>
           </tr>
           
       </table>

    </body>
</html>
