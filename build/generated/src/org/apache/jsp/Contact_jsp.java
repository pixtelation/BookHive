package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Contact US</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            html{\n");
      out.write("   background-size: cover;\n");
      out.write("   height:100%;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("* {\n");
      out.write("   box-sizing:border-box;\n");
      out.write("   -webkit-box-sizing:border-box;\n");
      out.write("   -moz-box-sizing:border-box;\n");
      out.write("   -webkit-font-smoothing:antialiased;\n");
      out.write("   -moz-font-smoothing:antialiased;\n");
      out.write("   -o-font-smoothing:antialiased;\n");
      out.write("   font-smoothing:antialiased;\n");
      out.write("   text-rendering:optimizeLegibility;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("   color: #C0C0C0;\n");
      out.write("   font-family: Arial, san-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Contact Form Styles */\n");
      out.write("h1 {\n");
      out.write("   margin: 10px 0 0 0;\n");
      out.write("}\n");
      out.write("h4{\n");
      out.write("   margin: 0 0 20px 0;\n");
      out.write("}\n");
      out.write("#contact-form {\n");
      out.write("   background-color:rgba(72,72,72,0.7);\n");
      out.write("   padding: 10px 20px 30px 20px;\n");
      out.write("   max-width:100%;\n");
      out.write("   float: left;\n");
      out.write("   left: 50%;\n");
      out.write("   position: absolute;\n");
      out.write("   margin-top:30px;\n");
      out.write("   margin-left: -260px;\n");
      out.write("   border-radius:7px;\n");
      out.write("   -webkit-border-radius:7px;\n");
      out.write("   -moz-border-radius:7px;\n");
      out.write("}\n");
      out.write("#contact-form input,   \n");
      out.write("#contact-form select,   \n");
      out.write("#contact-form textarea,   \n");
      out.write("#contact-form label { \n");
      out.write("   font-size: 15px;  \n");
      out.write("   margin-bottom: 2px;\n");
      out.write("   font-family: Arial, san-serif;\n");
      out.write("} \n");
      out.write("#contact-form input,   \n");
      out.write("#contact-form select,   \n");
      out.write("#contact-form textarea { \n");
      out.write("   width:100%;\n");
      out.write("   background: #fff;\n");
      out.write("   border: 0; \n");
      out.write("   -moz-border-radius: 4px;  \n");
      out.write("   -webkit-border-radius: 4px;  \n");
      out.write("   border-radius: 4px;\n");
      out.write("   margin-bottom: 25px;  \n");
      out.write("   padding: 5px;  \n");
      out.write("}  \n");
      out.write("#contact-form input:focus,   \n");
      out.write("#contact-form select:focus,   \n");
      out.write("#contact-form textarea:focus {  \n");
      out.write("   background-color: #E5E6E7; \n");
      out.write("}  \n");
      out.write("#contact-form textarea {\n");
      out.write("   width:100%;\n");
      out.write("   height: 150px;\n");
      out.write("}\n");
      out.write("#contact-form button[type=\"submit\"] {\n");
      out.write("   cursor:pointer;\n");
      out.write("   width:100%;\n");
      out.write("   border:none;\n");
      out.write("   background:#991D57;\n");
      out.write("   background-image:linear-gradient(bottom, #8C1C50 0%, #991D57 52%);\n");
      out.write("   background-image:-moz-linear-gradient(bottom, #8C1C50 0%, #991D57 52%);\n");
      out.write("   background-image:-webkit-linear-gradient(bottom, #8C1C50 0%, #991D57 52%);\n");
      out.write("   color:#FFF;\n");
      out.write("   margin:0 0 5px;\n");
      out.write("   padding:10px;\n");
      out.write("   border-radius:5px;\n");
      out.write("}\n");
      out.write("#contact-form button[type=\"submit\"]:hover {\n");
      out.write("   background-image:linear-gradient(bottom, #9C215A 0%, #A82767 52%);\n");
      out.write("   background-image:-moz-linear-gradient(bottom, #9C215A 0%, #A82767 52%);\n");
      out.write("   background-image:-webkit-linear-gradient(bottom, #9C215A 0%, #A82767 52%);\n");
      out.write("   -webkit-transition:background 0.3s ease-in-out;\n");
      out.write("   -moz-transition:background 0.3s ease-in-out;\n");
      out.write("   transition:background-color 0.3s ease-in-out;\n");
      out.write("}\n");
      out.write("#contact-form button[type=\"submit\"]:active {\n");
      out.write("   box-shadow:inset 0 1px 3px rgba(0,0,0,0.5);\n");
      out.write("}\n");
      out.write("input:required, textarea:required {  \n");
      out.write("   box-shadow: none;\n");
      out.write("   -moz-box-shadow: none;  \n");
      out.write("   -webkit-box-shadow: none;  \n");
      out.write("   -o-box-shadow: none;  \n");
      out.write("} \n");
      out.write("#contact-form .required {  \n");
      out.write("   font-weight:bold;  \n");
      out.write("   color: #E5E6E7;      \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Hide success/failure message\n");
      out.write("   (especially since the php is missing) */\n");
      out.write("#failure, #success {\n");
      out.write("   color: #6EA070; \n");
      out.write("   display:none;  \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Make form look nice on smaller screens */\n");
      out.write("@media only screen and (max-width: 580px) {\n");
      out.write("   #contact-form{\n");
      out.write("      left: 3%;\n");
      out.write("      margin-right: 3%;\n");
      out.write("      width: 88%;\n");
      out.write("      margin-left: 0;\n");
      out.write("      padding-left: 3%;\n");
      out.write("      padding-right: 3%;\n");
      out.write("   }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navigation.jsp", out, false);
      out.write("\n");
      out.write("      \n");
      out.write("       <div id=\"contact-form\">\n");
      out.write("\t<div>\n");
      out.write("            <h1 align=\"center\"><font color=\"crimson\">Nice to Meet You!</font></h1> \n");
      out.write("\t\t<h4><font color=\"coral\">Have a question or just want to get in touch? Let's chat.</font></h4> \n");
      out.write("\t</div>\n");
      out.write("\t\t<p id=\"failure\">Oopsie...message not sent.</p>  \n");
      out.write("\t\t<p id=\"success\">Your message was sent successfully. Thank you!</p>\n");
      out.write("\n");
      out.write("\t\t   <form method=\"post\" action=\"Contact\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t      <label for=\"name\">\n");
      out.write("\t\t      \t<span class=\"required\">Name: *</span> \n");
      out.write("                        ");

                        if(session.getAttribute("username")== null || session.getAttribute("username")=="")
                        {
                         String username=(String)session.getAttribute("username");
                         out.print("<input type='text'  name='name' placeholder='Your Name' required='required' tabindex='1' autofocus='autofocus'  />");
                        }
                        else
                        if(session!=null)
                {
                           String username=(String)session.getAttribute("username");
                           out.print("<input type='text' name='name' style='cursor:not-allowed' value='"+username+"' required='required' tabindex='1' autofocus='autofocus' readonly />");
                }
                        
                        
      out.write("\n");
      out.write("\t\t      \t\n");
      out.write("\t\t      </label> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t      <label for=\"email\">\n");
      out.write("\t\t      \t<span class=\"required\">Email: *</span>\n");
      out.write("\t\t      \t<input type=\"email\" id=\"email\" name=\"email\" value=\"\" placeholder=\"Your Email\" tabindex=\"2\" required=\"required\" />\n");
      out.write("\t\t      </label>  \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\t\t          \n");
      out.write("\t\t      <label for=\"subject\">\n");
      out.write("\t\t      <span class=\"required\">Subject: </span>\n");
      out.write("                      <input type=\"text\" name=\"subject\" placeholder=\"Your Subject\" />      \n");
      out.write("\t\t      </label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\t\t          \n");
      out.write("\t\t      <label for=\"message\">\n");
      out.write("\t\t      \t<span class=\"required\">Message: *</span> \n");
      out.write("\t\t      \t<textarea id=\"message\" name=\"message\" placeholder=\"Please write your message here.\" tabindex=\"5\" required=\"required\"></textarea> \n");
      out.write("\t\t      </label>  \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\t\t           \n");
      out.write("\t\t      <button name=\"submit\" type=\"submit\" id=\"submit\" >SEND</button> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t   </form>\n");
      out.write("\n");
      out.write("\t</div> \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
