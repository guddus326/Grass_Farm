<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>내 프로필</title>
</head>
<body>
<div class="flex-grow-1 d-flex flex-column">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="Main.jsp">
			<img alt="Brand" width=150px; height=40px; style="margin-top: 8px;" src="./img/logo.JPG">
		</a>
		<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
			<li class="nav-item"><a class="nav-link" href="Write.jsp" class="nav-link">WRITE</a></li>
			<li class="nav-item"><a class="nav-link" href="#" class="nav-link">##</a></li>
			<li class="nav-item"><a class="nav-link" href="#" class="nav-link">##</a></li>
			<li class="nav-item active"><a class="nav-link" href="Users.jsp" class="nav-link">USER <span class="sr-only">(current)</span></a></li>
		</ul>
		<form class="form-inline my-2 my-lg-0">
        	<input class="form-control mr-sm-2" type="search" placeholder="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
	</nav>
	<!-- 메뉴바 끝 -->
	<div class="container-fluid">
		<div class="row">
			<div class="col-xl-11 col-lg-10 mx-auto" id="content">
				<div class="col-md pt-5">
        			<div class="col-md-5" style= "float:left;">
        				<div class="card" style="width: 18rem;">
  							<img src="./img/grass.png" class="card-img-top" alt="Profile">
  							<div class="card-body">
    							<h5 class="card-title">getID</h5>
								<ul class="list-unstyled">
									<li class="media my-4">
    									<img src="./img/mail.png" class="mr-3" alt="이메일" style="width:30px;height:30px;">
    									<div class="media-body">
      										<p class="mt-0 mb-1">getEmail</p>
    									</div>
  									</li>
  									<li class="media">
    									<span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
    									<div class="media-body">
      										<p class="mt-0 mb-1">getCompany</p>
    									</div>
  									</li>
								</ul>   							
								<a href="Change.jsp" class="btn btn-success">수정하기</a>
  							</div>
						</div>
	        			<!-- 프사 코드 끝 -->
        			</div>
        			<!-- 왼쪽 끝  -->
        			<div class="col-md-7" style="float:left;">
        				
        			</div>
          			<!-- 오른쪽 끝  -->
    			</div>
    			<!-- 여기서 왼쪽 오른쪽 나뉨 -->
    		</div>
    		<!-- 양옆 margin 준 div -->
    	</div>
	</div>
	<!-- 컨테이너 고정 -->
</div>
</body>
</html>