package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AuditorRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <style>\n");
      out.write("            /*  Author : iMomen\n");
      out.write("    Website: www.iMomen.com\n");
      out.write("    E-mail : Coder@iMomen.com\n");
      out.write("*/\n");
      out.write("\n");
      out.write("html, body, div, span, applet, object, iframe,\n");
      out.write("h1, h2, h3, h4, h5, h6, p, blockquote, pre,\n");
      out.write("a, abbr, acronym, address, big, cite, code,\n");
      out.write("del, dfn, em, img, ins, kbd, q, s, samp,\n");
      out.write("small, strike, strong, sub, sup, tt, var,\n");
      out.write("b, u, i, center,\n");
      out.write("dl, dt, dd, ol, ul, li,\n");
      out.write("fieldset, form, label, legend,\n");
      out.write("table, caption, tbody, tfoot, thead, tr, th, td,\n");
      out.write("article, aside, canvas, details, embed,\n");
      out.write("figure, figcaption, footer, header, hgroup,\n");
      out.write("menu, nav, output, ruby, section, summary,\n");
      out.write("time, mark, audio, video {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  border: 0;\n");
      out.write("  font-size: 100%;\n");
      out.write("  font: inherit;\n");
      out.write("  vertical-align: baseline;\n");
      out.write("}\n");
      out.write("\n");
      out.write("article, aside, details, figcaption, figure,\n");
      out.write("footer, header, hgroup, menu, nav, section {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  line-height: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ol, ul {\n");
      out.write("  list-style: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("blockquote, q {\n");
      out.write("  quotes: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("blockquote:before, blockquote:after,\n");
      out.write("q:before, q:after {\n");
      out.write("  content: '';\n");
      out.write("  content: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  border-spacing: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Page */\n");
      out.write("body {\n");
      out.write("  background: #2F0916;\n");
      out.write("  font-family:\"Trebuchet MS\",tahoma;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("  color:#FF3679;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("a:hover {\n");
      out.write("  text-decoration: underline;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  width: 475px;\n");
      out.write("  margin-left: auto;\n");
      out.write("  margin-right: auto;\n");
      out.write("}\n");
      out.write(".reg_section {\n");
      out.write("  padding:0;\n");
      out.write("  margin: 10px 0;\n");
      out.write("  border-bottom: 1px dotted #eee;\n");
      out.write("}\n");
      out.write(".reg_section h3 {\n");
      out.write("  font-size: 13px;\n");
      out.write("  margin: 5px 0;\n");
      out.write("  color: #C4A2A2;\n");
      out.write("}\n");
      out.write("/* Form */\n");
      out.write(".register {\n");
      out.write("  position: relative;\n");
      out.write("  margin-top:100px;\n");
      out.write("  padding: 20px 20px 20px;\n");
      out.write("  background: #fff;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  -webkit-box-shadow: 0 0 200px rgba(255, 255, 255, 0.5), 0 1px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("  -moz-box-shadow: 0 0 200px rgba(255, 255, 255, 0.5), 0 1px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("  box-shadow: 0 0 200px rgba(255, 255, 255, 0.5), 0 1px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("}\n");
      out.write(".register:before {\n");
      out.write("  content: '';\n");
      out.write("  position: absolute;\n");
      out.write("  top: -8px;\n");
      out.write("  right: -8px;\n");
      out.write("  bottom: -8px;\n");
      out.write("  left: -8px;\n");
      out.write("  z-index: -1;\n");
      out.write("  background:rgba(255, 173, 200, 0.08);\n");
      out.write("  border-radius:7px;\n");
      out.write("  -webkit-border-radius: 7px;\n");
      out.write("}\n");
      out.write(".register h1 {\n");
      out.write("  margin: -20px -20px 0;\n");
      out.write("  line-height: 40px;\n");
      out.write("  font-size: 15px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  color:#694551;\n");
      out.write("  text-align: center;\n");
      out.write("  border-bottom:1px solid #EDEDED;\n");
      out.write("  border-radius: 3px 3px 0 0;\n");
      out.write("  -webkit-box-shadow: 0 1px #f5f5f5;\n");
      out.write("  -moz-box-shadow: 0 1px #f5f5f5;\n");
      out.write("  box-shadow: 0 1px #f5f5f5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".register input[type=text], .register input[type=password] ,.register select,.register textarea {\n");
      out.write("  width: 278px;\n");
      out.write("}\n");
      out.write(".register p.terms {\n");
      out.write("  float: left;\n");
      out.write("  line-height: 31px;\n");
      out.write("}\n");
      out.write(".register p.terms label {\n");
      out.write("  font-size: 12px;\n");
      out.write("  color: #777;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write(".register p.terms input {\n");
      out.write("  position: relative;\n");
      out.write("  bottom: 1px;\n");
      out.write("  margin-right: 4px;\n");
      out.write("  vertical-align: middle;\n");
      out.write("}\n");
      out.write(".register p.submit {\n");
      out.write("  text-align: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".register-help {\n");
      out.write("  margin: 20px 0;\n");
      out.write("  font-size: 11px;\n");
      out.write("  text-align: center;\n");
      out.write(" \n");
      out.write("  color:#FFFFFF;\n");
      out.write("}\n");
      out.write(".register-help a {\n");
      out.write("  color:#FF3679;\n");
      out.write("  text-shadow:0 1px #1E0E13;\n");
      out.write("}\n");
      out.write("\n");
      out.write(":-moz-placeholder {\n");
      out.write("  color: #c9c9c9 !important;\n");
      out.write("  font-size: 13px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("::-webkit-input-placeholder {\n");
      out.write("  color: #ccc;\n");
      out.write("  font-size: 13px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input {\n");
      out.write("  font-family:\"Trebuchet MS\",tahoma;\n");
      out.write("  font-size: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] ,.register select,.register textarea {\n");
      out.write("  margin: 5px;\n");
      out.write("  padding: 0 10px;\n");
      out.write("  height: 34px;\n");
      out.write("  color: #404040;\n");
      out.write("  background: #fff;\n");
      out.write("  border-width: 1px;\n");
      out.write("  border-style: solid;\n");
      out.write("  border-color: #c4c4c4 #d1d1d1 #d4d4d4;\n");
      out.write("  border-radius:3px;\n");
      out.write("  -webkit-border-radius: 5px;\n");
      out.write("  outline:3px solid rgba(200, 105, 137, 0.09);\n");
      out.write("  -moz-outline-radius:7px;\n");
      out.write("  -webkit-box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);\n");
      out.write("  -moz-box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);\n");
      out.write("  box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);\n");
      out.write("  margin:10px 0;\n");
      out.write("}\n");
      out.write("input[type=text]:focus, input[type=password]:focus{\n");
      out.write("  border-color:#FFF7F9;\n");
      out.write("  outline-color:rgba(254, 225, 235, 0.7);\n");
      out.write("  outline-offset: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  padding:0 10px;\n");
      out.write("  height: 29px;\n");
      out.write("  font-size: 12px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  color:#FFFFFF;\n");
      out.write("  text-shadow:0 1px #4D1124;\n");
      out.write("  border-width: 1px;\n");
      out.write("  border-style: solid;\n");
      out.write("  border-color:#693647;\n");
      out.write("  border-radius: 7px 7px 7px 7px;\n");
      out.write("  outline: none;\n");
      out.write("  -webkit-box-sizing: content-box;\n");
      out.write("  -moz-box-sizing: content-box;\n");
      out.write("  box-sizing: content-box;\n");
      out.write("  background-color: #7D0F33;\n");
      out.write("  background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #AA1E4D), color-stop(100%, #7D0F33));\n");
      out.write("  background-image: -webkit-linear-gradient(top, #AA1E4D, #7D0F33);\n");
      out.write("  background-image:-moz-linear-gradient(center top , #AA1E4D, #7D0F33)\n");
      out.write("  background-image:-ms-linear-gradient(top, #AA1E4D, #7D0F33);\n");
      out.write("  background-image: -o-linear-gradient(top, #AA1E4D, #7D0F33);\n");
      out.write("  background-image: linear-gradient(top, #AA1E4D, #7D0F33);\n");
      out.write("  -webkit-box-shadow:0 1px #CD4170 inset, 0 1px 2px #93284C;\n");
      out.write("  -moz-box-shadow:0 1px #CD4170 inset, 0 1px 2px #93284C;\n");
      out.write("  box-shadow:0 1px #CD4170 inset, 0 1px 2px #93284C;\n");
      out.write("}\n");
      out.write("input[type=submit]:active {\n");
      out.write("  background: #7D0F33;\n");
      out.write("  -webkit-box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);\n");
      out.write("  -moz-box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);\n");
      out.write("  box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".lt-ie9 input[type=text], .lt-ie9 input[type=password] {\n");
      out.write("  line-height: 34px;\n");
      out.write("}\n");
      out.write(".register select {\n");
      out.write("  padding:6px 10px;\n");
      out.write("  width: 300px;\n");
      out.write("  color: #777777;\n");
      out.write("}\n");
      out.write(".register textarea {\n");
      out.write("  height: 50px;\n");
      out.write("  padding: 10px;\n");
      out.write("  color: #C9C9C9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* About */\n");
      out.write(".about {\n");
      out.write("  margin:10px auto;\n");
      out.write("  width: 300px;\n");
      out.write("  text-align: center;\n");
      out.write("  color:#EEA5BD;\n");
      out.write("  font-size: 12px;\n");
      out.write("}\n");
      out.write(".about a {\n");
      out.write("  padding: 1px 3px;\n");
      out.write("  margin: 0 -1px;\n");
      out.write("  color: #fff;\n");
      out.write("  text-decoration: none;\n");
      out.write("  text-shadow: 0 -1px rgba(0, 0, 0, 0.2);\n");
      out.write("  border-radius: 2px;\n");
      out.write("}\n");
      out.write(".about a:hover {\n");
      out.write("  color:#2F0916;\n");
      out.write("  text-shadow: none;\n");
      out.write("  background: #E83671;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".links {\n");
      out.write("  zoom: 1;\n");
      out.write("}\n");
      out.write(".links:before, .links:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("}\n");
      out.write(".links:after {\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write(".links a {\n");
      out.write("  padding: 6px 0;\n");
      out.write("  float: left;\n");
      out.write("  width: 50%;\n");
      out.write("  font-size: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            /* normalize.css - http://github.com/necolas/normalize.css */\n");
      out.write("/*\n");
      out.write(" * 1. Corrects font size not being inherited in all browsers\n");
      out.write(" * 2. Addresses margins set differently in IE6/7, FF3+, S5, Chrome\n");
      out.write(" * 3. Improves appearance and consistency in all browsers\n");
      out.write(" */\n");
      out.write("\n");
      out.write("button,\n");
      out.write("input,\n");
      out.write("select,\n");
      out.write("textarea {\n");
      out.write("    font-size: 100%; /* 1 */\n");
      out.write("    margin: 0; /* 2 */\n");
      out.write("    vertical-align: baseline; /* 3 */\n");
      out.write("    vertical-align: middle; /* 3 */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*\n");
      out.write(" * Addresses FF3/4 setting line-height on 'input' using !important in the UA stylesheet\n");
      out.write(" */\n");
      out.write("\n");
      out.write("button,\n");
      out.write("input {\n");
      out.write("    line-height: normal; /* 1 */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*\n");
      out.write(" * 1. Improves usability and consistency of cursor style between image-type 'input' and others\n");
      out.write(" * 2. Corrects inability to style clickable 'input' types in iOS\n");
      out.write(" * 3. Removes inner spacing in IE7 without affecting normal text inputs\n");
      out.write(" *    Known issue: inner spacing remains in IE6\n");
      out.write(" */\n");
      out.write("\n");
      out.write("button,\n");
      out.write("input[type=\"button\"],\n");
      out.write("input[type=\"reset\"],\n");
      out.write("input[type=\"submit\"] {\n");
      out.write("    cursor: pointer; /* 1 */\n");
      out.write("    -webkit-appearance: button; /* 2 */\n");
      out.write("    overflow: visible;  /* 3 */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*\n");
      out.write(" * 1. Addresses box sizing set to content-box in IE8/9\n");
      out.write(" * 2. Removes excess padding in IE8/9\n");
      out.write(" * 3. Removes excess padding in IE7\n");
      out.write("      Known issue: excess padding remains in IE6\n");
      out.write(" */\n");
      out.write("\n");
      out.write("input[type=\"checkbox\"],\n");
      out.write("input[type=\"radio\"] {\n");
      out.write("    box-sizing: border-box; /* 1 */\n");
      out.write("    padding: 0; /* 2 */\n");
      out.write("    height: 13px; /* 3 */\n");
      out.write("    width: 13px; /* 3 */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*\n");
      out.write(" * Removes inner padding and border in FF3+\n");
      out.write(" * www.sitepen.com/blog/2008/05/14/the-devils-in-the-details-fixing-dojos-toolbar-buttons/\n");
      out.write(" */\n");
      out.write("\n");
      out.write("button::-moz-focus-inner,\n");
      out.write("input::-moz-focus-inner {\n");
      out.write("    border: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("    <section class=\"register\">\n");
      out.write("        <center>\n");
      out.write("        <form name=\"form1\" method=\"post\" action=\"AuditorRegServlet\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div align=\"center\"><font size=\"10\" face=\"Colonna MT\">Registration Form</font></div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div align=\"center\"><h3>User ID:</h3></div>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"userid\"></label>\n");
      out.write("                        <input type=\"text\" name=\"userid\" id=\"userid\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div align=\"center\"><h3>UserName:</h3></div>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"username\"></label>\n");
      out.write("                        <input type=\"text\" name=\"username\" id=\"username\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div align=\"center\"><h3>Password:</h3></div>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"password\"></label>\n");
      out.write("                        <input type=\"password\" name=\"password\" id=\"password\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <td>\n");
      out.write("                    <div align=\"center\"><h3>Confirm Password:</h3></div>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"conpassword\"></label>\n");
      out.write("                    <input type=\"password\" name=\"conpassword\" id=\"conpassword\">\n");
      out.write("                </td>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div align=\"center\"><h3>Email:</h3></div>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"email\"></label>\n");
      out.write("                        <input type=\"text\" name=\"email\" id=\"email\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div align=\"center\"><h3>Mobile No:</h3></div>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"mobileno\"></label>\n");
      out.write("                        <input type=\"text\" name=\"mobile\" id=\"mobile\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div align=\"center\">\n");
      out.write("                            <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"submit\">\n");
      out.write("                        </div>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>            \n");
      out.write("        </center>\n");
      out.write("    </section>\n");
      out.write("        </div>\n");
      out.write("        <div align=\"center\">\n");
      out.write("                        <a href=\"Index.jsp\"><font size=\"5\" face=\"Comic Sans Ms\">Exit</font></a>\n");
      out.write("                    </div>\n");
      out.write("    </body>    \n");
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