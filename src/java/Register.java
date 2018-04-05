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
import java.sql.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Abhishek
 */
public class Register extends HttpServlet {

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
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        RequestDispatcher rd=request.getRequestDispatcher("Navigation.jsp");
        rd.include(request, response);
        
        String username=request.getParameter("username");
        
        String email=request.getParameter("email");
        
        String firstname=request.getParameter("firstname");
        
        String lastname=request.getParameter("lastname");
        
        String pass=request.getParameter("pass");
        
        String confirmpass=request.getParameter("confirmpass");
        
        String country=request.getParameter("country");
        
        String addr=request.getParameter("addr");
        
        
        try
        {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://ABHISHEKMEHTA;databaseName=AdventureWorks2012;user=sa;password=1234;");
        String query="insert into signup(username,email,firstname,lastname,pass,confirmpass,country,addr) values(?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,username);
        ps.setString(2,email);
        ps.setString(3,firstname);
        ps.setString(4,lastname);
        ps.setString(5,pass);
        ps.setString(6,confirmpass);
        ps.setString(7,country);
        ps.setString(8,addr);
        
           ps.executeUpdate();
               con.close();
               ps.close();
             
               
        out.println("<h1 align='center'>Thank You......Registration Is Successful<h1/>");
        out.println("<h3 align='center'>Click button below to enter Login Area<h3/>");
        out.println("<a href='Login.jsp'><center><input type='submit' value='LOGIN'/><center/><a/>");  
        
            
            
            
        }
        catch(Exception e)
        {
        out.print(("<h1 style='color:aqua'>Error in Processing<h1/>"));
        }
        
        
        
        }
    }

  