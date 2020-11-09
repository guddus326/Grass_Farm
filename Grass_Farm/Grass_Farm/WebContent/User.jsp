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
       
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
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
              		<li><a href="User.jsp">USER</a></li>
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
    
		<%
			UserDAO userDAO=new UserDAO();
        	ArrayList<User> user=userDAO.getList(userID);
        	for(int i=0; i<1; i++){
		%>
		
  			 <div class="container">
  			 	<div class="card" style="width:300px;margin-top:40px;">
  			 		<image class="card-img-top" src="./img/grass.png" style="width:100%">
   			 			<div class="card-body">
  			 				<h4 class="card-title"></h4>
  			 				<p class="card-text">adafadfadfa</p>
  			 				<a href="#" class="btn btn-primary">dfadfa</a>
  			 			</div>
  			 		
  			 </div>
  			 
  			 				<!-- Modal -->
  							<div class="modal" id="myModal" tabindex="-1">
  								<div class="modal-dialog">
    								<div class="modal-content">
    					    			<div class="modal-header">
        									<button type="button" class="close" data-dismiss="modal" aria-label="Close">
          										<span aria-hidden="true">&times;</span>
        									</button>
      									</div>      					      				
      									<div class="modal-body">
  											<p>
  												<a href="#" class="tooltip-test" title="Tooltip">프로필 사진 수정</a><br>
  												<a href="#" class="tooltip-test" title="Tooltip">기본 이미지로 변경</a>
  											</p>
										</div>													
    								</div>
    							</div>
    						</div>
    						
								<!-- The Modal -->
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