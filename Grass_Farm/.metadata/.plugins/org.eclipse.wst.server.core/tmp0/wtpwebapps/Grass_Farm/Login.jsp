<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html";charset-UTF-8">
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
    margin: 10% auto;
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
 	  <div class="login-form">
    <form action="LoginAction.jsp" method="post">
        <h2 class="text-center" style="padding-bottom:2%"><b>Login</b></h2>  
         
        <div class="form-group">
        	<div class="input-group">
  				<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-user"></span></span>
  				<input type="text" class="form-control" name="userID" placeholder="UserID" aria-describedby="basic-addon1" required="required">
			</div>
        </div>
        
        <div class="form-group">
        	<div class="input-group">
  				<span class="input-group-addon" id="basic-addon2"><i class="glyphicon glyphicon-lock"></i></span>
  				<input type="password" class="form-control" name="userPass" placeholder="Password" aria-describedby="basic-addon2" required="required">
			</div>
        </div>
              
        <div class="form-group">
            <button type="submit" class="btn btn-success login-btn btn-block">Sign in</button>
        </div>
        <!-- <div class="clearfix">
            <a href="#" style="float:right">Forgot Password?</a>
        </div> -->
    </form>
</div>

</body>
</html>