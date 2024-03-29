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
  			background-color:#07ef7a;
  			margin-top:3%;
  			margin-bottom:3%;
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
        	background-image:url(image/index.jpg);
        	background-size:cover;
    	}
    	div.right {
        	width: 40%;
        	float: right;
        	background: #ffffff;
    	}
    	h1.welcome{
    		text-align: center;
    		margin-top: 20%;
    		color:#07ef7a
    	}
    	.fp{
    		text-align:right;
    	}
     	body {
     		overflow:hidden
     	}
     	a:hover{
     		text-decoration:none;
     	}

     	
    </style>
</head>
 
<body>
    <div>
        <div class="left">
        	<h1 class="hello" >안녕하세요, 잔디공작소 입니다</h1>
        </div>
        
        <div class="right">
        	<h1 class="welcome">Welcome</h1>
        	<div class="login-form">
        		<!--<hr style="background-color: #07ef7a">--> 
    			<form action="LoginAction.jsp" method="post">
  					<input type="text" onfocus="" class="form-control" name="userID" placeholder="UserID" required="required">
  					<input type="password" class="form-control" name="userPass" placeholder="Password" required="required">
            		<p style="text-align: right";><a href="#" style="color:#07ef7a">Forgot Password?</a></p>
            		<button type="submit" class="btn login-btn btn-block">Login</button>    
            		 
    			</form>
    			
    			<a style="color:#d3d3d3;display:inline">Don't have an account yet?  </a>
    			<a href="Join.jsp" style="color:#07ef7a;display:inline">  click here</a>
			</div>
			
        </div>
    </div>
</body>



</body>
</html>