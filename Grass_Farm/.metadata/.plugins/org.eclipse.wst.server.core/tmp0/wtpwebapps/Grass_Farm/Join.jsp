<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
        <title>Join</title>
        <style>
        body { padding-top: 50px; }
        .navbar-fixed-top { background-color: #ffffff; }
        .page-header{
            font-family: 'Playfair Display', serif;
            text-align: left;
        }  
		</style>
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
             
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
           <ul class="nav navbar-nav">
              <li><a href="Write.jsp">WRITE</a></li>
              <li><a href="#">##</a></li>
              <li><a href="#">##</a></li>
              <li><a href="#">##</a></li>
            </ul>
            
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
        <!-- 로긴폼 -->
        <div class="container">
            <div class="col-lg-4"></div>
            <div class="col-lg-4" style="padding-top: 50px;">
                <!-- 점보트론 -->
                <div class="jumbotron" style="padding-top: 10px;">
                    <!-- 로그인 정보를 숨기면서 전송post -->
                    <form method="post" action="JoinAction.jsp">
                        <h3 style="text-align: center;">회원가입</h3>
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="이름" name="userName" maxlength="20">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="아이디" name="userID" maxlength="20">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="비밀번호" name="userPass" maxlength="20">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="비밀번호확인" name="userPassCheck" maxlength="20">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="이메일" name="userEmail" maxlength="50">
                        </div>
                        <input type="submit" class="btn btn-primary form-control" value="회원가입">
                    </form>
                </div>
            </div>
        </div>
        <!-- 애니매이션 담당 JQUERY -->
        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <!-- 부트스트랩 JS  -->
        <script src="js/bootstrap.js"></script>
    </body>
</html>