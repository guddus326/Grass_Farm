/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-10-07 06:25:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Show_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\" content=\"width=device-width\" initial-scale=\"1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<title>내 프로필</title>\r\n");
      out.write("<style>\r\n");
      out.write("\tbody{padding-top :50px;}\r\n");
      out.write("\t.navbar-fixed-top{\r\n");
      out.write("\t\tbackground-color : white;\r\n");
      out.write("\t}\r\n");
      out.write("\t.page-header{\r\n");
      out.write("\t\tfont-family: 'Playfair Display', serif;\r\n");
      out.write("\t\ttext-align: left;\r\n");
      out.write("\t} \r\n");
      out.write("\t.user_img {\r\n");
      out.write("\t\tfloat : left;\r\n");
      out.write("    \twidth: 200px;\r\n");
      out.write("    \theight: 200px; \r\n");
      out.write("    \tmargin-top : 90px;\r\n");
      out.write("    \tmargin-left : 150px;\r\n");
      out.write("    \tborder-radius: 30%;\r\n");
      out.write("    \toverflow: hidden;\r\n");
      out.write("\t}\r\n");
      out.write("\t.profile {\r\n");
      out.write("\t\tfloat : left;\r\n");
      out.write("    \twidth: 100%;\r\n");
      out.write("    \theight: 100%;\r\n");
      out.write("    \tcursor : pointer; \r\n");
      out.write("\t}\r\n");
      out.write("\t.user_id{\r\n");
      out.write("\t\tposition: relative;\r\n");
      out.write("\t\twidth : auto;\r\n");
      out.write("\t\theight : auto;\r\n");
      out.write("\t\tmargin-left : 150px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.get_id{\r\n");
      out.write("\t\tfloat : left;\r\n");
      out.write("\t\twidth : 100%;\r\n");
      out.write("\t\theight : 100%;\r\n");
      out.write("\t\tmargin-top : 20px;\r\n");
      out.write("\t\tmargin-left : 50px;\r\n");
      out.write("\t\tmargin-bottom : 20px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.Info{\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\twidth : auto;\r\n");
      out.write("\t\theight : auto;\r\n");
      out.write("\t\tmargin-left : 150px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#company{\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\twidth : 100%;\r\n");
      out.write("\t\theight : 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.company{\r\n");
      out.write("\t\tfloat : left;\r\n");
      out.write("\t\twidth : 50px;\r\n");
      out.write("\t\theight : 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.get_company{\r\n");
      out.write("\t\tfloat : left;\r\n");
      out.write("\t\twidth : auto;\r\n");
      out.write("\t\theight : 50px;\r\n");
      out.write("\t\tline-height : 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#email{\r\n");
      out.write("\t\tfloat : left;\r\n");
      out.write("\t\twidth : 100%;\r\n");
      out.write("\t\theight : 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.email{\r\n");
      out.write("\t\tfloat : left;\r\n");
      out.write("\t\twidth : 50px;\r\n");
      out.write("\t\theight : 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.get_email{\r\n");
      out.write("\t\tfloat : left;\r\n");
      out.write("\t\twidth : auto;\r\n");
      out.write("\t\theight : 50px;\r\n");
      out.write("\t\tline-height : 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.gg{\r\n");
      out.write("\t\tposition: relative;\r\n");
      out.write("\t\twidth : 800px;\r\n");
      out.write("\t\theight : 500px;\r\n");
      out.write("\t\tmargin-left:450px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.month{\r\n");
      out.write("\t\tposition : relative;\r\n");
      out.write("\t\twidth : auto;\r\n");
      out.write("\t\theight : auto;\r\n");
      out.write("\t\ttext-align : center;\r\n");
      out.write("\t\tfont-size : 20pt;\r\n");
      out.write("\t}\r\n");
      out.write("\t#hahaha{\r\n");
      out.write("\t\tposition : relative;\r\n");
      out.write("\t\twidth : 100%;\r\n");
      out.write("\t\theight : 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.grassmoim{\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\twidth : 600px;\r\n");
      out.write("\t\theight : 400px;\r\n");
      out.write("\t\tmargin-left : 100px;\r\n");
      out.write("\t\tmargin-top : 20px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.before{\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tmargin-top : 215px;\r\n");
      out.write("\t\tmargin-left : 60px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.after{\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tmargin-top : 215px;\r\n");
      out.write("\t\tmargin-left : 710px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.grow{\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tmargin-top : 440px;\r\n");
      out.write("\t\tmargin-left : 342px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.modal {\r\n");
      out.write("        display: none;\r\n");
      out.write("        position: fixed; \r\n");
      out.write("        z-index: 1; \r\n");
      out.write("        left: 0;\r\n");
      out.write("        top: 0;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 100%; \r\n");
      out.write("        overflow: auto; \r\n");
      out.write("        background-color: rgb(0,0,0); \r\n");
      out.write("        background-color: rgba(0,0,0,0.4); \r\n");
      out.write("    }\r\n");
      out.write("    .modal-content {\r\n");
      out.write("        background-color: #fefefe;\r\n");
      out.write("        margin: 15% auto; \r\n");
      out.write("        padding-top : 40px;\r\n");
      out.write("        padding-left : 20px;\r\n");
      out.write("        padding-right : 20px;\r\n");
      out.write("        border: 1px solid #888;\r\n");
      out.write("        width: 25%;  \r\n");
      out.write("        height : 30%;     \r\n");
      out.write("        font-size: 22px;    \r\n");
      out.write("    }\r\n");
      out.write("    .close {\r\n");
      out.write("        color: #aaa;\r\n");
      out.write("        float: right;\r\n");
      out.write("        font-size: 28px;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("    .close:hover,\r\n");
      out.write("    .close:focus {\r\n");
      out.write("        color: black;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("    ul{\r\n");
      out.write("    \tlist-style-type : none;\r\n");
      out.write("\t}\r\n");
      out.write("\tul li{\r\n");
      out.write("    \tcursor : pointer;\r\n");
      out.write("\t}\r\n");
      out.write("\tul li:hover{\r\n");
      out.write("    \tbackground-color: #DCDCDC;\r\n");
      out.write("    \tdisplay : inline-block;\r\n");
      out.write("\t}\r\n");
      out.write("\tul li a{\r\n");
      out.write("    \tcolor : black;\r\n");
      out.write("    \ttext-decoration : none;\r\n");
      out.write("    \ttext-align : center;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" \t");

		//로그인 한사람이라면	 userID라는 변수에 해당 아이디가 담기고 그렇지 않으면 null값
		String userID = null;
		if (session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
		}

      out.write("\r\n");
      out.write(" <nav class=\"navbar-fixed-top navbar-default\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("            <a href=\"Main.jsp\"><img alt=\"Brand\" width=150px; height=40px;\" style=\"margin-top: 8px;\" src=\"./img/logo.JPG\"></a>       \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("          <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("           \t<ul class=\"nav navbar-nav\">\r\n");
      out.write("              <li><a href=\"Write.jsp\">WRITE</a></li>\r\n");
      out.write("              <li><a href=\"#\">##</a></li>\r\n");
      out.write("              <li><a href=\"#\">##</a></li>\r\n");
      out.write("              <li><a href=\"User.jsp\">USER</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            ");

            	if(userID==null){
            
      out.write("\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("              <li><a href=\"Logout.jsp\">LOGOUT</a></li>\r\n");
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
      out.write("    <div class = \"user_img\" style=\"background: #BDBDBD;\">\r\n");
      out.write("    \t<img class=\"profile\" id=\"img_click\" src=\"./img/grass.png\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class = \"user_id\">\r\n");
      out.write("    \t<p class = \"get_id\">아이디 가져오기</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class = \"Info\">\r\n");
      out.write("    \t<div id = \"company\">\r\n");
      out.write("    \t\t<img class=\"company\" src=\"./img/company.PNG\">\r\n");
      out.write("    \t\t<p class = \"get_company\">회사정보 가져오기</p>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t<div id = \"email\">\r\n");
      out.write("    \t\t<img class=\"email\" src=\"./img/email.PNG\">\r\n");
      out.write("    \t\t<p class = \"get_email\">이메일 가져오기</p>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class = \"gg\">\r\n");
      out.write("    \t<div class = \"month\">\r\n");
      out.write("    \t\t<script type=\"text/javascript\">\r\n");
      out.write("    \t\tlet today = new Date();   \r\n");
      out.write("    \t\tlet month = today.getMonth() + 1;  // 현재 달 구하기\r\n");
      out.write("    \t\tdocument.write(month+\"월의 잔디밭\");\r\n");
      out.write("    \t\t</script>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t<div id = \"hahaha\">\r\n");
      out.write("    \t\t<img class=\"grassmoim\" src=\"./img/grass.PNG\">\r\n");
      out.write("    \t\t<button class = \"before\"><</button>\r\n");
      out.write("    \t\t<button class = \"after\">></button>\r\n");
      out.write("    \t\t<button class = \"grow\" type=\"submit\" onclick=\"location.href='Write.jsp'\">잔디 심으러 가기</button>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- The Modal -->\r\n");
      out.write("    <div id=\"myModal\" class=\"modal\">\r\n");
      out.write("      <!-- Modal content -->\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <span class=\"close\">&times;</span>   \r\n");
      out.write("        \t<ul>\r\n");
      out.write("        \t\t<li><a href=\"\">내 정보 수정하기</a></li>  \r\n");
      out.write("         \t\t<li><a href=\"\">프로필 사진 수정</a></li>\r\n");
      out.write("         \t\t<li><a href=\"\">기본 이미지로 변경</a></li>\r\n");
      out.write("        \t</ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    var modal = document.getElementById('myModal');\r\n");
      out.write("    // Get the button that opens the modal\r\n");
      out.write("    var btn = document.getElementById(\"img_click\");\r\n");
      out.write("    // Get the <span> element that closes the modal\r\n");
      out.write("    var span = document.getElementsByClassName(\"close\")[0];                                          \r\n");
      out.write("    // When the user clicks on the button, open the modal \r\n");
      out.write("    btn.onclick = function() {\r\n");
      out.write("        modal.style.display = \"block\";\r\n");
      out.write("    }\r\n");
      out.write("    // When the user clicks on <span> (x), close the modal\r\n");
      out.write("    span.onclick = function() {\r\n");
      out.write("        modal.style.display = \"none\";\r\n");
      out.write("    }\r\n");
      out.write("    // When the user clicks anywhere outside of the modal, close it\r\n");
      out.write("    window.onclick = function(event) {\r\n");
      out.write("        if (event.target == modal) {\r\n");
      out.write("            modal.style.display = \"none\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
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