
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Profile extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
      
            request.getRequestDispatcher("Navigation.jsp").include(request, response);
      
        HttpSession session=request.getSession(false);  
        if(session.getAttribute("username")== null || session.getAttribute("username")=="")
        {
         out.print("<h1 style='color:aqua' align='center'>Please Login First<h1/>");
         out.print("<a href='Login.jsp'><center><input type='submit' value='LOGIN'/><center/><a/>");
 
        }  
        
        else
        if(session != null)
        
        {
            String username=(String)session.getAttribute("username");
            out.print("<div align='center'>");
            out.print("<h3 style='color:orange'>Welcome to Profile</h3>");  
            out.print("<p style='color:aqua'>Welcome<p/>" + "<h1 style='color:gold'>"+username+"<h1/>");  
            out.print("<a href='Signout'><center><input type='submit' value='LOGOUT'/><center/><a/>");
            out.print("<div/>");
         
        }
        
       out.close();
      
        
        
        
    }
    }

