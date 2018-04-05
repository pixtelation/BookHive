/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek
 */
public class Delete extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        RequestDispatcher rd=request.getRequestDispatcher("Navigation.jsp");
        rd.include(request, response);
        
        String bookid = request.getParameter("bookid");
        try
        {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://ABHISHEKMEHTA;databaseName=AdventureWorks2012;user=sa;password=1234;");
        String query= "delete from Additems where bookid='"+bookid+"'"; 
        PreparedStatement ps = con.prepareStatement(query);
       
        ps.executeUpdate();
        con.close();
        ps.close();
        
        out.println("<h1 align='center'>Deleted Successfully<h1/>");
        
        }
        catch(Exception e)
        {
        out.print("Error");
        }
        
        
        
        }
    }

   