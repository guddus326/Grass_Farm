<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" initial-scale="1">
 <link rel="stylesheet" href="css/bootstrap.min.css">

<title>오늘의 잔디</title>
<style>
 <style>
        body { padding-top: 50px; }
      	.navbar-fixed-top{
      		background-color: white;
      	}
        .page-header{
            font-family: 'Playfair Display', serif;
            text-align: left;
        }  
		</style>
</style>
</head>
<body>
<%
		//로그인 한사람이라면	 userID라는 변수에 해당 아이디가 담기고 그렇지 않으면 null값
		String userID = null;
		if (session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
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
	<article>
		<div class="container" role="main">
			<h2>board Form</h2>
			<form method="post" action="WriteAction.jsp">
				<div class="mb-3">
					<label for="title">제목</label>
					<input type="text" class="form-control" name="bbsTitle" placeholder="제목을 입력해 주세요"><br>
				</div>
				<div class="mb-3">
					<label for="content">소스코드</label>
					<textarea class="form-control" rows="5" name="bbsSource" placeholder="내용을 입력해 주세요" ></textarea><br>
				</div>
				<div class="mb-3">
					<label for="content">내용</label>
					<textarea class="form-control" rows="5" name="bbsContent" placeholder="내용을 입력해 주세요" ></textarea><br>
				</div>
				
				<div >
					<button type="submit" class="btn btn-sm btn-primary" id="btnSave">저장</button>
				</div>
		</form>
			
		</div>
	</article>
</body>
</html>