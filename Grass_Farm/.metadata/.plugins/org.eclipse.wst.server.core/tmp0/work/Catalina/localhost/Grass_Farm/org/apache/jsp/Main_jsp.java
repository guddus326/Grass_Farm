/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-09-27 05:34:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bbs.BbsDAO;
import bbs.Bbs;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class Main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bbs.Bbs");
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("bbs.BbsDAO");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    \r\n");
      out.write("        <meta\r\n");
      out.write("        http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <!-- 뷰포트 -->\r\n");
      out.write("        <meta\r\n");
      out.write("        name=\"viewport\" content=\"width=device-width\" initial-scale=\"1\">\r\n");
      out.write("        <!-- 스타일시트 참조  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("       \r\n");
      out.write("        <title>Main</title>\r\n");
      out.write("        <style>\r\n");
      out.write("        body { padding-top: 50px; }\r\n");
      out.write("      \t.navbar-fixed-top{\r\n");
      out.write("      \t\tbackground-color: white;\r\n");
      out.write("      \t}\r\n");
      out.write("        .page-header{\r\n");
      out.write("            font-family: 'Playfair Display', serif;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("        }  \r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.15.10/styles/hybrid.min.css\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.15.10/highlight.min.js\"></script>\r\n");
      out.write("<script>hljs.initHighlightingOnLoad();</script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    ");

	String userID=null;
	if(session.getAttribute("userID")!=null){
		userID=(String)session.getAttribute("userID");
	}
    
      out.write("\r\n");
      out.write("    <nav class=\"navbar-fixed-top navbar-default\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-align-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("             </div>\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("            <a href=\"Index.jsp\"><img alt=\"Brand\" width=120px; height=40px;\" style=\"margin-top: 8px;\" src=\"./img/logo.JPG\"></a>       \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("             \r\n");
      out.write("          <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("              <li class=\"active\"> <span class=\"sr-only\">(current)</span></li>\r\n");
      out.write("              <li><a href=\"Write.jsp\">글쓰기</a></li>\r\n");
      out.write("              <li><a href=\"#\">shirt&blouse</a></li>\r\n");
      out.write("              <li><a href=\"#\">knit&cardigan</a></li>\r\n");
      out.write("              <li><a href=\"#\">top</a></li>\r\n");
      out.write("              <li><a href=\"#\">pants</a></li>\r\n");
      out.write("              <li><a href=\"#\">skirt</a></li>\r\n");
      out.write("              <li><a href=\"#\">bag</a></li>\r\n");
      out.write("              <li><a href=\"#\">shoes</a></li>\r\n");
      out.write("              <li><a href=\"#\">acc</a></li>\r\n");
      out.write("              <li><a href=\"#\">jewelry</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            \r\n");
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
      out.write("    \r\n");
      out.write("          <!-- Page Content -->\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <!-- Blog Entries Column -->\r\n");
      out.write("      <div class=\"col-md-8\">\r\n");
      out.write("        <h1 class=\"my-4\">오늘의 잔디\r\n");
      out.write("          \r\n");
      out.write("        </h1>\r\n");
      out.write("\t\t");

			BbsDAO bbsDAO=new BbsDAO();
        	ArrayList<Bbs> list=bbsDAO.getList();
        	for(int i=0; i<list.size(); i++){
		
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("        <!-- Blog Post -->\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("          <div class=\"card-body\">\r\n");
      out.write("          <pre>\r\n");
      out.write("            <pre><code class=\"css\">\r\n");
      out.write("         body { padding-top: 50px; }\r\n");
      out.write("      \t.navbar-fixed-top{\r\n");
      out.write("      \t\tbackground-color: white;\r\n");
      out.write("      \t}\r\n");
      out.write("        .page-header{\r\n");
      out.write("            font-family: 'Playfair Display', serif;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("        }  \r\n");
      out.write("            </code>\r\n");
      out.write("       \r\n");
      out.write("          </pre></div>\r\n");
      out.write("          <div class=\"card-body\">\r\n");
      out.write("            <h2 class=\"card-title\">");
      out.print( list.get(i).getBbsTitle());
      out.write("</h2>\r\n");
      out.write("            <p class=\"card-text\">");
      out.print( list.get(i).getBbsContent());
      out.write("</p>\r\n");
      out.write("            <a href=\"#\" class=\"btn btn-primary\">Read More &rarr;</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"card-footer text-muted\"> Posted on ");
      out.print( list.get(i).getBbsDate());
      out.write(" </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\r\n");
      out.write("\t\t");

        	}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.container -->\r\n");
      out.write("    \r\n");
      out.write("        <!-- 애니매이션 담당 JQUERY -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("        <!-- 부트스트랩 JS  -->\r\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("    </body>\r\n");
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
