/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-10-03 06:01:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("    background:#FCFCFC;    \r\n");
      out.write("}\r\n");
      out.write(".pr-12 {\r\n");
      out.write("    padding-right: 12px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mb-20 {\r\n");
      out.write("    margin-bottom: 20px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b-1 {\r\n");
      out.write("    border: 1px solid #ebebeb !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card {\r\n");
      out.write("    border: 0;\r\n");
      out.write("    border-radius: 0;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("    -webkit-transition: .5s;\r\n");
      out.write("    transition: .5s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    display: -ms-flexbox;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    -ms-flex-direction: column;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    min-width: 0;\r\n");
      out.write("    word-wrap: break-word;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    background-clip: border-box;\r\n");
      out.write("    border: 1px solid rgba(0,0,0,.125);\r\n");
      out.write("    border-radius: .25rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".media {\r\n");
      out.write("    padding: 16px 12px;\r\n");
      out.write("    -webkit-transition: background-color .2s linear;\r\n");
      out.write("    transition: background-color .2s linear;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".media {\r\n");
      out.write("    display: -ms-flexbox;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    -ms-flex-align: start;\r\n");
      out.write("    align-items: flex-start;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-body {\r\n");
      out.write("    -ms-flex: 1 1 auto;\r\n");
      out.write("    flex: 1 1 auto;\r\n");
      out.write("    padding: 1.25rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".media .avatar {\r\n");
      out.write("    flex-shrink: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".no-radius {\r\n");
      out.write("    border-radius: 0 !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".avatar-xl {\r\n");
      out.write("    width: 64px;\r\n");
      out.write("    height: 64px;\r\n");
      out.write("    line-height: 64px;\r\n");
      out.write("    font-size: 1.25rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".avatar {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    width: 36px;\r\n");
      out.write("    height: 36px;\r\n");
      out.write("    line-height: 36px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    border-radius: 100%;\r\n");
      out.write("    background-color: #f5f6f7;\r\n");
      out.write("    color: #8b95a5;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("    max-width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("    border-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mb-2 {\r\n");
      out.write("    margin-bottom: .5rem!important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fs-20 {\r\n");
      out.write("    font-size: 20px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pr-16 {\r\n");
      out.write("    padding-right: 16px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ls-1 {\r\n");
      out.write("    letter-spacing: 1px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fw-300 {\r\n");
      out.write("    font-weight: 300 !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fs-16 {\r\n");
      out.write("    font-size: 16px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".media-body>* {\r\n");
      out.write("    margin-bottom: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("small, time, .small {\r\n");
      out.write("    font-family: Roboto,sans-serif;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    font-size: 11px;\r\n");
      out.write("    color: #8b95a5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fs-14 {\r\n");
      out.write("    font-size: 14px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mb-12 {\r\n");
      out.write("    margin-bottom: 12px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text-fade {\r\n");
      out.write("    color: rgba(77,82,89,0.7) !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-footer:last-child {\r\n");
      out.write("    border-radius: 0 0 calc(.25rem - 1px) calc(.25rem - 1px);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-footer {\r\n");
      out.write("    background-color: #fcfdfe;\r\n");
      out.write("    border-top: 1px solid rgba(77,82,89,0.07);\r\n");
      out.write("    color: #8b95a5;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".flexbox {\r\n");
      out.write("    display: -webkit-box;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    -webkit-box-pack: justify;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".align-items-center {\r\n");
      out.write("    -ms-flex-align: center!important;\r\n");
      out.write("    align-items: center!important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-footer {\r\n");
      out.write("    padding: .75rem 1.25rem;\r\n");
      out.write("    background-color: rgba(0,0,0,.03);\r\n");
      out.write("    border-top: 1px solid rgba(0,0,0,.125);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".card-footer {\r\n");
      out.write("    background-color: #fcfdfe;\r\n");
      out.write("    border-top: 1px solid rgba(77, 82, 89, 0.07);\r\n");
      out.write("    color: #8b95a5;\r\n");
      out.write("    padding: 10px 20px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-footer>*:last-child {\r\n");
      out.write("    margin-bottom: 0\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hover-shadow {\r\n");
      out.write("    -webkit-box-shadow: 0 0 35px rgba(0, 0, 0, 0.11);\r\n");
      out.write("    box-shadow: 0 0 35px rgba(0, 0, 0, 0.11)\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fs-10 {\r\n");
      out.write("    font-size: 10px !important;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"col-md-12\">\r\n");
      out.write("    <div class=\"card b-1 hover-shadow mb-20\">\r\n");
      out.write("        <div class=\"media card-body\">\r\n");
      out.write("            <div class=\"media-left pr-12\">\r\n");
      out.write("                <img class=\"avatar avatar-xl no-radius\" src=\"https://bootdey.com/img/Content/avatar/avatar1.png\" alt=\"...\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"media-body\">\r\n");
      out.write("                <div class=\"mb-2\">\r\n");
      out.write("                    <span class=\"fs-20 pr-16\">Hossein Shams</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <small class=\"fs-16 fw-300 ls-1\">Front-end developer</small><br>\r\n");
      out.write("                <p class=\"fs-14 text-fade mb-12\"><i class=\"fa fa-map-marker pr-1\"></i> Menlo Park, CA</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <footer class=\"card-footer flexbox align-items-center\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <strong>Applied on:</strong>\r\n");
      out.write("                <span>21 Jan, 2017</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
