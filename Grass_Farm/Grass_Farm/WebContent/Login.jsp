<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<meta http-equiv="Content-Type" content="text/html";charset-UTF-8">
<link rel="stylesheet" href="css/bootstrap.css">
<title>Login</title>
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
            
            <ul class="nav navbar-nav navbar-right">
              <li><a href="Login.jsp">LOGIN</a></li>
              <li><a href="Join.jsp">JOIN</a></li>
            </ul>
          </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>


 	<div class="container">
 	 <div class="col-lg-4"></div>
  	<div class="col-lg-4" style="padding-top: 50px;">
  	<div class="jumbotron" style="padding-top: 20px;">
   	<form method="post" action="LoginAction.jsp">
    	<h3 style="text-align: center;"> 로그인화면 </h3>
    	<div class="form-group">
    		<input type="text" class="form-control" placeholder="아이디" name="userID" maxlength="20">
    	</div>
    	
    	<div class="form-group">
    		<input type="password" class="form-control" placeholder="비밀번호" name="userPass" maxlength="20">
    	</div>
    	
  	  <input type="submit" class="btn btn-primary form-control" value="로그인">
   	</form>
  </div>
 </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>