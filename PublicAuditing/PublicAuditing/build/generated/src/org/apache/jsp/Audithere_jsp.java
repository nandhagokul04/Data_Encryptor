package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Audithere_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"images/images24.jpg\">\n");
      out.write("        \n");
      out.write("        <center>            \n");
      out.write("            <form  method=\"post\" action=\"audserv\" enctype=\"multipart/form-data\">\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div align=\"center\"><font size=\"5\" face=\"Imprint MT Shadow\">File Upload Page</font></div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <br>               \n");
      out.write("                \n");
      out.write("                <div align=\"left\">\n");
      out.write("                <font size=\"4\" face=\"Andalus\">\n");
      out.write("               </div>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div align=\"center\"><font size=\"5\" face=\"Comic Sans Ms\">Select a File:</font></div>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"browse\"></label>\n");
      out.write("                            <input type=\"file\" name=\"filename\" id=\"filename\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div align=\"center\">\n");
      out.write("                                <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"submit\">\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>                   \n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("             \n");
      out.write("           <div>\n");
      out.write("\n");
      out.write("        </center> \n");
      out.write("    ");


String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "publicauditing";
String userId = "root";
String password = "password";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("<h2 align=\"center\"><font><strong>Data Owner Upload Details</strong></font></h2>\n");
      out.write("<table align=\"center\" cellpadding=\"5\" border=\"1\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"50D5CD\">\n");
      out.write("\n");
      out.write("  \n");
      out.write(" \n");
      out.write("<td>username</b></td>\n");
      out.write("\n");
      out.write("<td>filename</b></td>\n");
      out.write("<td>Date<b></td>\n");
      out.write("<td>Time<b></td>\n");
      out.write("</tr>\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT username,filename,date,time FROM ownerprofile";

resultSet = statement.executeQuery(sql);

while(resultSet.next()){
    
                
                
                    

      out.write("\n");
      out.write("\n");
      out.write("<tr >\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString("username") );
      out.write("</td>\n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString("filename") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("date"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("time"));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write(" ");




try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}



      out.write("\n");
      out.write("<h2 align=\"center\"><font><strong>User Download Details</strong></font></h2>\n");
      out.write("<table align=\"center\" cellpadding=\"5\" border=\"1\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"50D5CD\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("<td>username</b></td>\n");
      out.write("<td>groupname</b></td>\n");
      out.write("<td>filename</b></td>\n");
      out.write("<td>Date<b></td>\n");
      out.write("<td>Time<b></td>\n");
      out.write("</tr>\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT username,groupname,filename,date,time FROM detail";

resultSet = statement.executeQuery(sql);

while(resultSet.next()){
    
                
                
                    

      out.write("\n");
      out.write("\n");
      out.write("<tr >\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString("username") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("groupname") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("filename") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("date"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("time"));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("</div>\n");
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
