<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="bbs.BbsDAO" %>
<%@ page import="bbs.Bbs" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta
        http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- 뷰포트 -->
        <meta
        name="viewport" content="width=device-width" initial-scale="1">
        <!-- 스타일시트 참조  -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
       
        <title>Main</title>
        <style>
        body { padding-top: 30px; }
      	.navbar-fixed-top{
      		background-color: white;
      	}
        .page-header{
            font-family: 'Playfair Display', serif;
            text-align: left;
        }  
        h1{
        	font-family: 'ImcreSoojin';
        }
        @font-face {
            font-family: 'ImcreSoojin';
            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-04@2.3/ImcreSoojin.woff') format('woff');
            font-weight: normal;
            font-style: normal;
        }
		</style>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.15.10/styles/hybrid.min.css">
		<script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.15.10/highlight.min.js"></script>
		<script>hljs.initHighlightingOnLoad();</script>
    </head>
    <body>
    <%
	String userID=null;
	if(session.getAttribute("userID")!=null){
		userID=(String)session.getAttribute("userID");
	}
    %>
    <nav class="navbar-fixed-top navbar-default">
    	<div class="container-fluid">
    		<div class="navbar-header">
            	<a class="navbar-brand" href="#">
                	<span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
                </a>
             </div>
			<div class="navbar-header">
            	<a href="Index.jsp"><img alt="Brand" width=120px; height=40px;" style="margin-top: 8px;" src="./img/logo.JPG"></a>       
			</div>
          	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      			<ul class="nav navbar-nav">
              		<li><a href="Write.jsp">WRITE</a></li>
              		<li><a href="#">##</a></li>
              		<li><a href="#">##</a></li>
              		<li><a href="#">USER</a></li>
            	</ul>
          <form class="navbar-form navbar-right" role="search" action="Search.jsp">
          	<div class="form-group">
          		<input type="text" class="form-control" placeholder="Search" name="userName">
        	</div>
        	<button type="submit" class="btn btn-default">Submit</button>
      	  </form>
            
            <%
            	if(userID==null){
            %>
            <ul class="nav navbar-nav navbar-right">
              <li><a href="Login.jsp">LOGIN</a></li>
              <li><a href="Join.jsp">JOIN</a></li>
            </ul>
            <%
            	}else{
            %>
            <ul class="nav navbar-nav navbar-right">
              <li><a href="LogoutAction.jsp">LOGOUT</a></li>
            </ul>
            <%
            	}
            %>
          </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
    
          <!-- Page Content -->
  <div class="container">
    <div class="row">
      <!-- Blog Entries Column -->
      <div class="col-md-8">
        <h1>오늘의 잔디</h1>
		<%
			BbsDAO bbsDAO=new BbsDAO();
        	ArrayList<Bbs> list=bbsDAO.getList();
        	
        	for(int i=0; i<list.size(); i++){
		%>
	
        <!-- Blog Post -->
       	<div class="card"> 
        	<pre><code class="css">
         	<%= list.get(i).getBbsSource()%>
         	</code></pre>
          <div class="card-body">
            <h2 class="card-title"><%= list.get(i).getBbsTitle()%></h2>
            <p class="card-text"><%= list.get(i).getBbsContent()%></p>
            <a href="#" class="btn btn-primary">Read More &rarr;</a>
          </div>
          <div class="card-footer text-muted"> 
          Posted on <%= list.get(i).getBbsDate()%> 
          </div>
        </div>
		<br><br>
		<%
        	}
		%>
      </div>
    </div>
    <!-- /.row -->
  </div>
  <!-- /.container -->
    
        <!-- 애니매이션 담당 JQUERY -->
        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <!-- 부트스트랩 JS  -->
        <script src="js/bootstrap.js"></script>
  
    </body>
</html>