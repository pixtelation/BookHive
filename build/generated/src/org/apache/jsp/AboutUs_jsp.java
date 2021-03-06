package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Meet our team responsive template free download</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    \n");
      out.write("    .contain{\n");
      out.write("         display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("  height: 100%;\n");
      out.write("  padding: 5rem;\n");
      out.write("    }\n");
      out.write("   \n");
      out.write(".heading {\n");
      out.write("  color: orange;\n");
      out.write("  font-family: \"Monotype Corsiva\";\n");
      out.write("  text-shadow: 4px 4px 4px blue ;\n");
      out.write("  font-size: 50px;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("body a {\n");
      out.write("  transition: 0.5s all;\n");
      out.write("  -webkit-transition: 0.5s all;\n");
      out.write("  -o-transition: 0.5s all;\n");
      out.write("  -moz-transition: 0.5s all;\n");
      out.write("  -ms-transition: 0.5s all;\n");
      out.write("}\n");
      out.write("html, body{\n");
      out.write("    font-size: 100%;\n");
      out.write("\tfont-family: 'Roboto', sans-serif;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("\tbackground:#FFFFFF;\n");
      out.write("}\n");
      out.write("body a:hover {\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("/*-- header --*/\n");
      out.write(".jarallax {\n");
      out.write("    position: relative;\n");
      out.write("    background-size: cover;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-position: 50% 50%;\n");
      out.write("}\n");
      out.write("/*-- team --*/\n");
      out.write(".team{\n");
      out.write("\t\n");
      out.write("\tbackground-size:cover;\n");
      out.write("}\n");
      out.write(".team-dot {\n");
      out.write("    background:repeat 0px 0px;\n");
      out.write("    background-size: 2px;\n");
      out.write("    -webkit-background-size: 2px;\n");
      out.write("    -moz-background-size: 2px;\n");
      out.write("    -o-background-size: 2px;\n");
      out.write("    -ms-background-size: 2px;\n");
      out.write("}\n");
      out.write(".jarallax {\n");
      out.write("    position: relative;\n");
      out.write("    background-size: cover;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-position: 50% 50%;\n");
      out.write("}\n");
      out.write(".team-heading h3{\n");
      out.write("\tcolor:#FFFFFF;\n");
      out.write("\tfont-size:40px;\n");
      out.write("\ttext-align:center;\n");
      out.write("\tmargin:70px 0px;\n");
      out.write("}\n");
      out.write(".team-heading h4{\n");
      out.write("    color: rgba(255, 255, 255, 0.47);\n");
      out.write("}\n");
      out.write(".team-info{\n");
      out.write("    position: relative;\n");
      out.write("    overflow: hidden;\t\n");
      out.write("}\n");
      out.write(".team-info img{\n");
      out.write("\twidth:100%;\n");
      out.write("}\n");
      out.write(".team-caption h4{\n");
      out.write("    \n");
      out.write("    margin:0;\n");
      out.write("    color: #212121;\n");
      out.write("    font-size: 1em;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    line-height: 1.1em;\n");
      out.write("    font-weight: 800;\n");
      out.write("    letter-spacing: 1px;\n");
      out.write("}\n");
      out.write(".team-caption p{\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("    font-size: .8em;\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write(".team-caption ul{\n");
      out.write("    padding: 0;\n");
      out.write("    margin: 0.0em 0 0 0;\n");
      out.write("}\n");
      out.write(".team-caption ul li{\n");
      out.write("    display:  ruby;\n");
      out.write("}\n");
      out.write(".team-caption ul li a {\n");
      out.write("\tcolor: #333;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write(".team-caption ul li a i.fa.fa-facebook{\n");
      out.write("    height: 30px;\n");
      out.write("    width: 30px;\n");
      out.write("    line-height: 30px;\n");
      out.write("    border: solid 2px #FFF;\n");
      out.write("    background: none;\n");
      out.write("    color: #FFF;\n");
      out.write("    transition: 0.5s all;\n");
      out.write("    -webkit-transition: 0.5s all;\n");
      out.write("    -moz-transition: 0.5s all;\n");
      out.write("    -o-transition: 0.5s all;\n");
      out.write("    -ms-transition: 0.5s all;\n");
      out.write("}\n");
      out.write(".team-caption ul li a i.fa.fa-facebook:hover {\n");
      out.write("    background: #3b5998;\n");
      out.write("}\n");
      out.write(".team-caption ul li a i.fa.fa-twitter{\n");
      out.write("    height: 30px;\n");
      out.write("    width: 30px;\n");
      out.write("    line-height: 30px;\n");
      out.write("    border: solid 2px #FFF;\n");
      out.write("    background: none;\n");
      out.write("    color: #FFF;\n");
      out.write("    transition: 0.5s all;\n");
      out.write("    -webkit-transition: 0.5s all;\n");
      out.write("    -moz-transition: 0.5s all;\n");
      out.write("    -o-transition: 0.5s all;\n");
      out.write("    -ms-transition: 0.5s all;\n");
      out.write("}\n");
      out.write(".team-caption ul li a i.fa.fa-twitter:hover{\n");
      out.write("\tbackground: #55acee;\n");
      out.write("}\n");
      out.write(".team-caption ul li a i.fa fa-google-plus-official{\n");
      out.write("    height: 30px;\n");
      out.write("    width: 30px;\n");
      out.write("    line-height: 30px;\n");
      out.write("    border: solid 2px #FFF;\n");
      out.write("    background: none;\n");
      out.write("    color: #FFF;\n");
      out.write("    transition: 0.5s all;\n");
      out.write("    -webkit-transition: 0.5s all;\n");
      out.write("    -moz-transition: 0.5s all;\n");
      out.write("    -o-transition: 0.5s all;\n");
      out.write("    -ms-transition: 0.5s all;\n");
      out.write("}\n");
      out.write(".team-caption ul li a i.fa fa-google-plus-official:hover{\n");
      out.write("\tbackground: #f26522;\n");
      out.write("}\n");
      out.write(".team-caption {\n");
      out.write("    background: #FFC107;\n");
      out.write("  \n");
      out.write("    position: absolute;\n");
      out.write("    left: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("    text-align: center;\n");
      out.write("    width: 100%;\n");
      out.write("    -webkit-transition: .5s all;\n");
      out.write("    transition: .5s all;\n");
      out.write("    -moz-transition: .5s all;\n");
      out.write("}\n");
      out.write(".team-info:hover .team-caption{\n");
      out.write("    background-color: transparent;\n");
      out.write("    top: 50%;\n");
      out.write("    transform: translate(0%, -50%);\n");
      out.write("    -webkit-transform: translate(0%, -50%);\n");
      out.write("    -moz-transform: translate(0%, -50%);\n");
      out.write("    -ms-transform: translate(0%, -50%);\n");
      out.write("    bottom: auto;\n");
      out.write("}\n");
      out.write(".team-info:hover .team-caption h4{\n");
      out.write("\tcolor:#FFFFFF;\n");
      out.write("}\n");
      out.write(".team-info:before {\n");
      out.write("    background-color: rgba(0,0,0,0.85);\n");
      out.write("    border: 3px solid #FFC107;\n");
      out.write("    bottom: 0;\n");
      out.write("    content: \"\";\n");
      out.write("    display: inline-block;\n");
      out.write("    left: 0;\n");
      out.write("    position: absolute;\n");
      out.write("    right: 0;\n");
      out.write("    top: 0;\n");
      out.write("    opacity: 0;\n");
      out.write("    -webkit-transition: all 0.5s ease 0s;\n");
      out.write("    -moz-transition: all 0.5s ease 0s;\n");
      out.write("    -o-transition: all 0.5s ease 0s;\n");
      out.write("    transition: all 0.5s ease 0s;\n");
      out.write("}\n");
      out.write(".team-info:hover:before {\n");
      out.write("    opacity: 1;\n");
      out.write("}\n");
      out.write("/*-- //team --*/\n");
      out.write("\n");
      out.write("@media(max-width:350px){\n");
      out.write("\t.team-dot{\n");
      out.write("\t\tpadding: 2em 0;\n");
      out.write("\t}\n");
      out.write("\t.agileits-team-grid {\n");
      out.write("\t\tfloat: none;\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t}\n");
      out.write("\t.agileits-team-grid:nth-child(2){\n");
      out.write("\t\tmargin:0em 0 0 0;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navigation.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("<body>\t\n");
      out.write("\t<!-- team -->\n");
      out.write("<div class=\"contain\">\n");
      out.write("  <h1 class=\"heading\" data-target-resolver></h1>\n");
      out.write("</div>\n");
      out.write("\t\t\t\t\n");
      out.write("        <div style=\"margin-left: 250px\">\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 agileits-team-grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"team-info\">\n");
      out.write("                                                    <img src=\"Images/Abhishek.jpg\" height=\"350\" alt=\"Abhishek\"/>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"team-caption\"> \n");
      out.write("\t\t\t\t\t\t\t\t<h4>Abhishek Mehta</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lead Developer</p>\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t    <li style=\"float:right\"><a href=\" https://www.facebook.com/abhishekmehta50\" target=\"_blank\"><img src=\"Images/icon/facebook.png\" alt=\"\"/></a></li>\n");
      out.write("                    <li style=\"float:right\"><a href=\" https://plus.google.com/u/0/109802177128991452385\" target=\"_blank\"><img src=\"Images/icon/google.png\" alt=\"\"/></a></li>\n");
      out.write("                    <li style=\"float:right\"><a href=\" https://twitter.com/dheubShe\" target=\"_blank\"><img src=\"Images/icon/twitter.png\" alt=\"\"/></a></li>\n");
      out.write("                                                \n");
      out.write("                                                                \n");
      out.write("                                                                </ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 agileits-team-grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"team-info\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"Images/amit.jpg\" height=\"350\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"team-caption\"> \n");
      out.write("\t\t\t\t\t\t\t\t<h4>Amit Kumar Singh</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>UI Designer</p>\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t    <li style=\"float:right\"><a href=\" https://www.facebook.com\" target=\"_blank\"><img src=\"Images/icon/facebook.png\" alt=\"\"/></a></li>\n");
      out.write("                    <li style=\"float:right\"><a href=\" https://www.google.com\" target=\"_blank\"><img src=\"Images/icon/google.png\" alt=\"\"/></a></li>\n");
      out.write("                    <li style=\"float:right\"><a href=\" https://www.twitter.com\" target=\"_blank\"><img src=\"Images/icon/twitter.png\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"col-md-3 agileits-team-grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"team-info\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"Images/Debarati.jpg\" height=\"350\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"team-caption\"> \n");
      out.write("\t\t\t\t\t\t\t\t<h4>Debarati Middar Bera</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Database Developer</p>\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t    <li style=\"float:right\"><a href=\" https://www.facebook.com\" target=\"_blank\"><img src=\"Images/icon/facebook.png\" alt=\"\"/></a></li>\n");
      out.write("                    <li style=\"float:right\"><a href=\" https://www.google.com\" target=\"_blank\"><img src=\"Images/icon/google.png\" alt=\"\"/></a></li>\n");
      out.write("                    <li style=\"float:right\"><a href=\" https://www.twitter.com\" target=\"_blank\"><img src=\"Images/icon/twitter.png\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t<script  src=\"1.js\"></script>\n");
      out.write("</body>\t\n");
      out.write("</html>");
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
