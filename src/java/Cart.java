

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author Abhishek
 */
public class Cart extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
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
        {
           response.sendRedirect("Cart.jsp"); 
           
        }
           
           
        }
    }

  
