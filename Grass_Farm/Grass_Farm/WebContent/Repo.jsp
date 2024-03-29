<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bbs.BbsDAO" %>
<%@ page import="bbs.Bbs" %>
<%@ page import="user.UserDAO" %>
<%@ page import="user.User" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.ArrayList" %>
<%@ include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" initial-scale="1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
   <style>
        body { padding-top: 4%; 
        text-align : center;}
      	.navbar-fixed-top{
      		background-color: white;
      	}
        .page-header{
            font-family: 'Playfair Display', serif;
            text-align: left;
        }  
        h2{
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
        if(userID==null){
    %>
       <div class="alert alert-success" role="alert">로그인 해주세요.</div>
    <%}else{ %>
    <div class="container">
    <div class="row">
    <div style="float:left;" class=".col-md-4"><h2>Repository</h2></div>  
     
     <!-- 테이블 -->
    <div class="col-sm-12">
        <table class='table'>
        		<tr>
            		<td>번호</td>
            		<td>제목</td>
            		<td>등록일</td>
            		<td>수정</td>
            		<td>삭제</td>
        		</tr>
    		<%
				BbsDAO bbsDAO=new BbsDAO();
    			ArrayList<Bbs> getrepo= bbsDAO.getrepo(userID);
        		for(int i=0; i<getrepo.size(); i++){
			%>

        		<tr>
        			<td><%=getrepo.get(i).getBbsID()%></td>
        			<td><a href="Show.jsp?bbsID=<%=getrepo.get(i).getBbsID()%>"><%=getrepo.get(i).getBbsTitle()%></a></td>
        			<td><%=getrepo.get(i).getBbsDate()%></td>
                	<td><a href="Modify.jsp?bbsID=<%=getrepo.get(i).getBbsID()%>"  class="btn btn-default">수정</a></td>
                	<td><a onclick="return confirm('정말로 삭제하시겠습니까?')" href="Delete.jsp?bbsID=<%= getrepo.get(i).getBbsID() %>" class="btn btn-default">삭제</a></td>
        		</tr>
			<%
        		}
    }
			%>
    		</tbody>
		</table>
		
		 <!-- 검색폼 -->
  	 <form role="search" action="Search1.jsp">
     <div style="margin-bottom:1%" class="col-md-4 col-md-offset-4">
     <div class="input-group">
      <div class="input-group-btn">
         <select style="width:80px" class="form-control" name="catgo" required="required">
                    <option value=""  selected>선택</option>
                    <option value="bbsTitle">제목</option>
                    <option value="bbsContent">내용</option>
         </select>
      </div><!-- /btn-group -->
      <input type="text" name="search" class="form-control">
       <span class="input-group-btn">
        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
      </span>
    </div><!-- /input-group -->
     </div>
     </form> 
	</div>
	<!--col-sm 끝~~ -->
	</div>
    <!--row 끝~~ -->
	</div>
	<!--container 끝~~ -->	
</body>
</html>