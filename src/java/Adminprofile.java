/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.*;
/**
 *
 * @author Abhishek
 */
public class Adminprofile extends HttpServlet {

  

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out=response.getWriter();
       request.getRequestDispatcher("Navigation.jsp").include(request, response);
       
       HttpSession session = request.getSession(false);
       if(session.getAttribute("username")== null || session.getAttribute("username")=="")
       {  
        out.print("<h1 style='color:aqua'><center>Please Login First<center/><h1/>");
         out.print("<a href='Login.jsp'><center><input type='submit' value='LOGIN'/><center/><a/>");
        }
       
       else
           if(session != null)
        {
          
       String username=(String)session.getAttribute("username");
            out.print("<div align='center'>");
            out.print("<h3 style='color:orange'>Welcome to Profile</h3>"); 
            out.print("<h1 style='color:gold'>"+username+"<h1/>"); 
            out.print("<a href='Add.jsp'><input type='submit' value='Add'/><a/>&nbsp");
            out.print("<a href='Delete.jsp'><input type='submit' value='Delete'/><a/>&nbsp");
            out.print("<a href='ViewRecords.jsp'><input type='submit' value='View Records'/><a/><br><br>");
            out.print("<a href='ViewOrders.jsp'><input type='submit' value='View Orders'/><a/><br><br>");
            out.print("<a href='ViewFeedbacks.jsp'><input type='submit' value='View Feedbacks'/><a/><br><br>");
            out.print("<a href='Signout'><input type='submit' value='LOGOUT'/><a/>");
            out.print("<div/>");
        
        }
       
        
        
    }
}

