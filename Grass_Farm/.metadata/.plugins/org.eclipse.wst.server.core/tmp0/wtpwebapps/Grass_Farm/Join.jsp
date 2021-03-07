<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <meta name="viewport" content="width=device-width" initial-scale="1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <title>잔디공작소</title>
        <style>
        body { padding-top: 50px; }
        .navbar-fixed-top { background-color: #ffffff; }
        .page-header{
            font-family: 'Playfair Display', serif;
            text-align: left;
        }
        
.login-form {
    width: 350px;
    margin: 5% auto;
}
.login-form form {        
    margin-bottom: 15px;
    background: #f7f7f7;
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    padding: 30px;
}
.login-form h2 {
    margin: 0 0 15px;
}
.form-control, .login-btn {
    border-radius: 2px;
}
.input-group-prepend .fa {
    font-size: 18px;
}
.login-btn {
    font-size: 15px;
    font-weight: bold;
  	min-height: 40px;
}
.form-control{
	float: right;
	width:90%;
	margin-bottom:3%;
}
          
		</style>
    </head>
    <body>   
      
       <!-- 회원가입폼 -->
<div class="login-form">
    <form action="JoinAction.jsp" method="post">
        <h2 class="text-center" style="padding-bottom:2%"><b>Join</b></h2>  
        
        <div class="form-group">
        	<div class="input-group">
  				<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
  				<input type="text" class="form-control" name="userID" placeholder="UserID" required="required">
			</div>
        </div>
        
        <div class="form-group">
        	<div class="input-group">
  				<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
  				<input type="password" class="form-control" name="userPass" placeholder="Password" required="required">
			</div>
        </div>
        
        <div class="form-group">
        	<div class="input-group">
  				<span class="input-group-addon"><i class="glyphicon glyphicon-ok"></i></span>
  				<input type="password" class="form-control" name="userPassCheck" placeholder="PasswordCheck" required="required">
			</div>
        </div>
        
        <div class="form-group">
        	<div class="input-group">
  				<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
  				<input type="text" class="form-control" name="userName" placeholder="UserName" required="required">
			</div>
        </div>
        
        <div class="form-group">
        	<div class="input-group">
  				<span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  				<input type="text" class="form-control" name="userEmail" placeholder="UserEmail" required="required">
			</div>
        </div>
              
        <div class="form-group">
            <button type="submit" class="btn btn-success login-btn btn-block">Sign up</button>
        </div>
    </form>
</div>      
        <!-- 애니매이션 담당 JQUERY -->
        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <!-- 부트스트랩 JS  -->
        <script src="js/bootstrap.js"></script>
    </body>
</html>