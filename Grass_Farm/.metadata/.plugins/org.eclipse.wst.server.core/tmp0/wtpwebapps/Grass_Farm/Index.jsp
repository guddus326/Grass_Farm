<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html";charset-UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>잔디공작소</title>
<style>
     
 
        .login-form {
    		width: 60%;
    		margin: 10% auto;
    		text-align:center;
		}
		.login-btn {
    		font-size: 15px;
    		font-weight: bold;
  			min-height: 40px;
  			border-radius: 2px;
		}
		
		.form-control{
			
			width:100%;
			height:40px;
			margin-bottom:3%;
			border-radius: 2px;
		}
      
 		div {
        	width: 100%;
        	height: 100vh;
        }
    	div.left {
        	width: 60%;
        	float: left;
        	background: #07ef7a;
    	}
    	div.right {
        	width: 40%;
        	float: right;
        	background: #ffffff;
    	}
    	h2.welcome{
    		text-align: center;
    		margin-top: 30%;
    		color:#07ef7a
    	}
     	body {
     		overflow:hidden
     	}
    </style>
</head>
 
<body>
    <div>
        <div class="left">
        	<h1 class="welcome">안녕하세요,</h1>
        	<h2 class=>잔디공작소에 오신것을 환영합니다</h2>
        </div>
        
        <div class="right">
        	<h2 class="welcome">Welcome</h2>
        	<div class="login-form">
    			<form action="LoginAction.jsp" method="post">
  					<input type="text" class="form-control" name="userID" placeholder="UserID" aria-describedby="basic-addon1" required="required">
  					<input type="password" class="form-control" name="userPass" placeholder="Password" aria-describedby="basic-addon2" required="required">
            		<button type="submit" class="btn btn-success login-btn btn-block">Sign in</button>
            		<a href="#" style="color:#07ef7a">Forgot Password?</a>
    			</form>
			</div>
        </div>
    </div>
</body>



</body>
</html>