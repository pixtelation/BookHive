<%-- 
    Document   : Buy
    Created on : Sep 11, 2017, 4:00:18 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUY</title>
        
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
                   <h2 style="color: #EDEDED"> Please provide the Book Code to Check</h2>
               </td>
           </tr> 
          </table>
         
         <div align="center">
             <form method="post" action="Buydetail.jsp">
                 <label>Book Code</label><input type="text" name="bookcode" /><br><br>
                 <input type="submit" value="check" />
             </form>    
         </div>
         
    </body>
</html>
