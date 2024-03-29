<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" initial-scale="1">
<%@ include file="navbar.jsp" %>
<link rel="stylesheet" href="css/bootstrap.min.css">

<title>잔디공작소</title>
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
    if(userID==null){
%>
<div class="alert alert-success" role="alert" style="text-align:center">로그인 해주세요.</div>
<%}else{ %>
<div class="container">
<div class="row">
  <div class="col-md-6 col-md-offset-3" style="max-width:100%;">
  <h2>오늘의 잔디</h2><br>
  <form method="post" action="WriteAction.jsp">
				
	<label for="title">제목</label>
	<input type="text" class="form-control" name="bbsTitle" placeholder="제목을 입력하세요" required="required"><br>
				
	<label for="content">소스코드</label>
	<textarea class="form-control" rows="5" name="bbsSource" placeholder="소스코드를 입력하세요" required="required"></textarea><br>
			
				
	<label for="language">LANGUAGE</label>
	<select class="form-control" name="bbsLanguage" required="required">
	  	<option value="">LANGUAGE</option>
	  	<option value="JAVA">JAVA</option>
	  	<option value="C">C</option>
	  	<option value="C++">C++</option>
	  	<option value="C#">C#</option>
	  	<option value="PYTHON">PYTHON</option>
	  	<option value="PHP">PHP</option>
	  	<option value="JSP">JSP</option>
	  	<option value="HTML">HTML</option>
	  	<option value="CSS">CSS</option>
	  	<option value="JavaScript">JavaScript</option>
	</select><br>
				
	<label for="content">내용</label>
	<textarea class="form-control" rows="5" name="bbsContent" placeholder="내용을 입력해 주세요" required="required"></textarea><br>
	<button type="submit" style="margin-right:1%" class="btn btn-sm btn-success" id="btnSave">저장</button>
	<button type="reset" class="btn btn-sm btn-success" id="btnSave">취소</button>
	</form> 
	<% } %>
  </div>
</div>
</div>
</body>
</html>
