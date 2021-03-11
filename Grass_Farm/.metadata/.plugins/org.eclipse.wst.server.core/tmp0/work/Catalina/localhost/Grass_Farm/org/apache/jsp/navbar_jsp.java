/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2021-03-10 15:20:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>잔디공작소</title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"image/grass_removebg_preview_wIP_icon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"icon\" href=\"image/grass_removebg_preview_wIP_icon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("        h1{ font-family: 'ImcreSoojin'}\r\n");
      out.write("        #jandi{ font-family: 'ImcreSoojin'; font-size:18pt; margin-top:4%;}\r\n");
      out.write("        body { padding-top: 3%; }\r\n");
      out.write("      \t.navbar-fixed-top{\r\n");
      out.write("      \t\tbackground-color: white;\r\n");
      out.write("      \t}\r\n");
      out.write("        .page-header{\r\n");
      out.write("            font-family: 'Playfair Display', serif;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("        }  \r\n");
      out.write("        @font-face {\r\n");
      out.write("            font-family: 'ImcreSoojin';\r\n");
      out.write("            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-04@2.3/ImcreSoojin.woff') format('woff');\r\n");
      out.write("            font-weight: normal;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("        }\r\n");
      out.write("\t\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" ");

	String userID=null;
	if(session.getAttribute("userID")!=null){
		userID=(String)session.getAttribute("userID");
	}

      out.write("\r\n");
      out.write("<nav class=\"navbar-fixed-top navbar-default\">\r\n");
      out.write("    \t<div class=\"container-fluid\">\r\n");
      out.write("    \t\t\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("            \t<p id=\"jandi\"><a href=\"Index.jsp\" style=\"text-decoration:none; color:black;\">🌱잔디공작소🌱</a><p>           \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("          \t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("      \t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("              \t\t<li><a href=\"Write.jsp\">WRITE</a></li>\r\n");
      out.write("              \t\t<li><a href=\"Repo.jsp\">REPO</a></li>\r\n");
      out.write("              \t\t<li><a href=\"User.jsp\">USER</a></li>\r\n");
      out.write("            \t</ul>\r\n");
      out.write("          <form class=\"navbar-form navbar-right\" role=\"search\" action=\"Search.jsp\">\r\n");
      out.write("          \t<div class=\"form-group\">\r\n");
      out.write("          \t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"userName\">\r\n");
      out.write("        \t</div>\r\n");
      out.write("        \t<button type=\"submit\" class=\"btn btn-success\">SEARCH</button>\r\n");
      out.write("      \t  </form>\r\n");
      out.write("      \t  \r\n");
      out.write("  \r\n");
      out.write("            ");

            	if(userID==null){
            
      out.write("\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("              <li><a href=\"Login.jsp\">LOGIN</a></li>\r\n");
      out.write("              <li><a href=\"Join.jsp\">JOIN</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            ");

            	}else{
            
      out.write("\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("              <li><a href=\"LogoutAction.jsp\">LOGOUT</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            ");

            	}
            
      out.write("\r\n");
      out.write("          </div><!-- /.navbar-collapse -->\r\n");
      out.write("        </div><!-- /.container-fluid -->\r\n");
      out.write("    </nav>\r\n");
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
