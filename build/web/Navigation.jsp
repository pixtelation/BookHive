<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <%@ page import="javax.servlet.http.HttpSession"%>
        <link rel="stylesheet" href="styles.css">
        <link rel="icon" href="Images/icon/B.png" type="image/gif" sizes="16x16">
           
    <style>
            
           
            
      .dropbtn {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
      }
      
      .dropdown:hover .dropbtn {
    background-color: red;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}




.dropdown:hover .dropdown-content {
    display: block;
}ul {
    text-align: center;
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: indigo;
}

li {
    float: left;
}

li a, .dropbtn {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
    background-color: red;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}
           
            
        </style>
    </head>
    
    <body style="background-image: url(Images/wall.jpg)" >
        <img src="Images/BookHive1.png" width="1350" height="200" alt="BookstoreHeader"/>
        
        <div style="background-color: gold;text-align:center;"> 
         <font color="black">Welcome</font>
           
           
            <%
                 
                if(session.getAttribute("username")== null || session.getAttribute("username")=="")
           {   
                String username=(String)session.getAttribute("username");
                out.print("<b style='color:mediumblue'>User<b/>");
           }
                else
                    if(session!=null)
                {
                 String username=(String)session.getAttribute("username");
                 out.print("<b style='color:darkred'>"+username+"<b/>");
                }
            %>
      
            
              <ul>
                    <li><a href="index.jsp">Home</a></li>
                    
                    
                    
                    <li class="dropdown">
                    <a href="#" class="dropbtn">Membership</a>
                    <div class="dropdown-content">
                    <a href="Login.jsp">Login</a>
                    <a href="Register.jsp">Register</a>
                    <%
                     if(session.getAttribute("username")== null )
                     {
                        out.print("<a href=Profile>User Profile</a>");
                     }
                     else if(session.getAttribute("username")!=null && session.getAttribute("username").equals("admin") )
                     {
                        out.print("<a href=Adminprofile>Admin Profile</a>");
                     }  
                     else  
                         
                     {
                        out.print("<a href=Profile>User Profile</a>");
                     }                    

                    %>
                    </div>
                    </li>
                   
                   
                    
                     <li><a href="Contact.jsp">ContactUs</a></li>
                     <li><a href="AboutUs.jsp">AboutUs</a></li>
                      
                     <li><a href="Cart"><img src="Images/icon/cart.png" alt=""/></a></li>
                     
                               
                </ul>
            
       </div>
    
        
    </body>
</html>
