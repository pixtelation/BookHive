/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek
 */
public class Customercart extends HttpServlet {

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
            
        String bookid =request.getParameter("bookid");
        String bookcode =request.getParameter("bookcode");
        String bookname =request.getParameter("bookname");
        String bookauthor =request.getParameter("bookauthor");
        String bookprice =request.getParameter("bookprice");
        
        try
        {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://ABHISHEKMEHTA;databaseName=AdventureWorks2012;user=sa;password=1234;");
        String query="insert into Customercart (bookid,bookcode,bookname,bookauthor,bookprice) values(?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,bookid);
        ps.setString(2,bookcode);
        ps.setString(3,bookname);
        ps.setString(4,bookauthor);
        ps.setString(5,bookprice);
        
        ps.executeUpdate();
        con.close();
        ps.close();
        
        response.sendRedirect("index.jsp");
        
        
        
        }
        catch(Exception e)
        {
        out.print("Error in processing");
        }
        
        }
    }

   