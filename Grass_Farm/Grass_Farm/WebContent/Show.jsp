<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width" initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>내 프로필</title>
<style>
	body{padding-top :50px;}
	.navbar-fixed-top{
		background-color : white;
	}
	.page-header{
		font-family: 'Playfair Display', serif;
		text-align: left;
	} 
	.user_img {
		float : left;
    	width: 200px;
    	height: 200px; 
    	margin-top : 90px;
    	margin-left : 150px;
    	border-radius: 30%;
    	overflow: hidden;
	}
	.profile {
		float : left;
    	width: 100%;
    	height: 100%;
    	cursor : pointer; 
	}
	.user_id{
		position: relative;
		width : auto;
		height : auto;
		margin-left : 150px;
	}
	.get_id{
		float : left;
		width : 100%;
		height : 100%;
		margin-top : 20px;
		margin-left : 50px;
		margin-bottom : 20px;
	}
	.Info{
		float: left;
		width : auto;
		height : auto;
		margin-left : 150px;
	}
	#company{
		float: left;
		width : 100%;
		height : 50px;
	}
	.company{
		float : left;
		width : 50px;
		height : 50px;
	}
	.get_company{
		float : left;
		width : auto;
		height : 50px;
		line-height : 50px;
	}
	#email{
		float : left;
		width : 100%;
		height : 100%;
	}
	.email{
		float : left;
		width : 50px;
		height : 50px;
	}
	.get_email{
		float : left;
		width : auto;
		height : 50px;
		line-height : 50px;
	}
	.gg{
		position: relative;
		width : 800px;
		height : 500px;
		margin-left:450px;
	}
	.month{
		position : relative;
		width : auto;
		height : auto;
		text-align : center;
		font-size : 20pt;
	}
	#hahaha{
		position : relative;
		width : 100%;
		height : 100%;
	}
	.grassmoim{
		position: absolute;
		width : 600px;
		height : 400px;
		margin-left : 100px;
		margin-top : 20px;
	}
	.before{
		position: absolute;
		margin-top : 215px;
		margin-left : 60px;
	}
	.after{
		position: absolute;
		margin-top : 215px;
		margin-left : 710px;
	}
	.grow{
		position: absolute;
		margin-top : 440px;
		margin-left : 342px;
	}
	.modal {
        display: none;
        position: fixed; 
        z-index: 1; 
        left: 0;
        top: 0;
        width: 100%;
        height: 100%; 
        overflow: auto; 
        background-color: rgb(0,0,0); 
        background-color: rgba(0,0,0,0.4); 
    }
    .modal-content {
        background-color: #fefefe;
        margin: 15% auto; 
        padding-top : 40px;
        padding-left : 20px;
        padding-right : 20px;
        border: 1px solid #888;
        width: 25%;  
        height : 30%;     
        font-size: 22px;    
    }
    .close {
        color: #aaa;
        float: right;
        font-size: 28px;
        font-weight: bold;
    }
    .close:hover,
    .close:focus {
        color: black;
        text-decoration: none;
        cursor: pointer;
    }
    ul{
    	list-style-type : none;
	}
	ul li{
    	cursor : pointer;
	}
	ul li:hover{
    	background-color: #DCDCDC;
    	display : inline-block;
	}
	ul li a{
    	color : black;
    	text-decoration : none;
    	text-align : center;
	}
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
            <a href="Main.jsp"><img alt="Brand" width=150px; height=40px;" style="margin-top: 8px;" src="./img/logo.JPG"></a>       
			</div>
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
           	<ul class="nav navbar-nav">
              <li><a href="Write.jsp">WRITE</a></li>
              <li><a href="#">##</a></li>
              <li><a href="#">##</a></li>
              <li><a href="User.jsp">USER</a></li>
            </ul>
            <%
            	if(userID==null){
            %>
            <ul class="nav navbar-nav navbar-right">
              <li><a href="Logout.jsp">LOGOUT</a></li>
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
    <div class = "user_img" style="background: #BDBDBD;">
    	<img class="profile" id="img_click" src="./img/grass.png">
    </div>
    <div class = "user_id">
    	<p class = "get_id">아이디 가져오기</p>
    </div>
    <div class = "Info">
    	<div id = "company">
    		<img class="company" src="./img/company.PNG">
    		<p class = "get_company">회사정보 가져오기</p>
    	</div>
    	<div id = "email">
    		<img class="email" src="./img/email.PNG">
    		<p class = "get_email">이메일 가져오기</p>
    	</div>
    </div>
    <div class = "gg">
    	<div class = "month">
    		<script type="text/javascript">
    		let today = new Date();   
    		let month = today.getMonth() + 1;  // 현재 달 구하기
    		document.write(month+"월의 잔디밭");
    		</script>
    	</div>
    	<div id = "hahaha">
    		<img class="grassmoim" src="./img/grass.PNG">
    		<button class = "before"><</button>
    		<button class = "after">></button>
    		<button class = "grow" type="submit" onclick="location.href='Write.jsp'">잔디 심으러 가기</button>
    	</div>
    </div>
    <!-- The Modal -->
    <div id="myModal" class="modal">
      <!-- Modal content -->
      <div class="modal-content">
        <span class="close">&times;</span>   
        	<ul>
        		<li><a href="">내 정보 수정하기</a></li>  
         		<li><a href="">프로필 사진 수정</a></li>
         		<li><a href="">기본 이미지로 변경</a></li>
        	</ul>
      </div>
    </div>
    <script type="text/javascript">
    var modal = document.getElementById('myModal');
    // Get the button that opens the modal
    var btn = document.getElementById("img_click");
    // Get the <span> element that closes the modal
    var span = document.getElementsByClassName("close")[0];                                          
    // When the user clicks on the button, open the modal 
    btn.onclick = function() {
        modal.style.display = "block";
    }
    // When the user clicks on <span> (x), close the modal
    span.onclick = function() {
        modal.style.display = "none";
    }
    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
    </script>
</body>
</html>