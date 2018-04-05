/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author Abhishek
 */
public class Adminlogin extends HttpServlet {

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        request.getRequestDispatcher("Navigation.jsp").include(request, response);
        
        
        
        String username=request.getParameter("username");
        String pass=request.getParameter("pass");
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://ABHISHEKMEHTA;databaseName=AdventureWorks2012;user=sa;password=1234;");
             PreparedStatement ps=con.prepareStatement("select username,pass from Adminlogin where username=? and pass=?");
             ps.setString(1, username);
             ps.setString(2, pass);
             ResultSet rs=ps.executeQuery();
              
             if(rs.next())
             {
             out.print("<div align='center'><p style='color:white'>Welcome<p/>"+ "<h1 style='color:aqua'>"+username+"<h1/><div/>");
             out.print("&nbsp");
             
             HttpSession session =request.getSession();
             session.setAttribute("username",username);
             session.setAttribute("pass", pass);
             response.sendRedirect("Adminprofile");
             
           
             }
                else
              {
              out.print("<h1 align='center' style='color:aqua'>Sorry Wrong Information....Please Login Again<h1/>");
              out.print("<a href='Login.jsp'><center><input type='submit' value='LOGIN'/><center/><a/>");
              }
              out.close();
        
        }
        catch(Exception e)
        {
        out.print("<h1 style='color:aqua'>Error in connecting<h1/>");
        }
        
        
        }
    }

   
