<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO"%>
<%@ page import="java.io.PrintWriter"%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="user.User" scope="page" />
<jsp:setProperty name="user" property="userName" />
<jsp:setProperty name="user" property="userID" />
<jsp:setProperty name="user" property="userPass" />
<jsp:setProperty name="user" property="userPassCheck" />
<jsp:setProperty name="user" property="userEmail" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>잔디공작소</title>
</head>
<body>
 <%
    if (user.getUserName() == null || user.getUserID() == null || user.getUserPass() == null || user.getUserPassCheck() == null || user.getUserEmail() == null){
         PrintWriter script = response.getWriter();
         script.println("<script>");
         script.println("alert('입력이 안 된 사항이 있습니다.')");
         script.println("history.back()");
         script.println("</script>");
   	}else{
	 	UserDAO userDAO = new UserDAO(); //인스턴스생성
 		int result = userDAO.join(user);
 		
	 	out.print(result);
    	if(result == -1){ //중복되면 오류.
        	PrintWriter script = response.getWriter();
        	script.println("<script>");
        	script.println("alert('이미 존재하는 아이디 입니다.')");
        	script.println("history.back()");
        	script.println("</script>");
    	}else if(result==-2){
        	PrintWriter script = response.getWriter();
        	script.println("<script>");
           	script.println("alert('비밀번호일치를 확인해주세요')");
           	script.println("history.back()");
           	script.println("</script>");
    	}else if(result>0){
    		userDAO.join(user);
        	session.setAttribute("userID", user.getUserID());
        	userDAO.joinfollow(user);
        	PrintWriter script = response.getWriter();
           	script.println("<script>");
           	script.println("location.href = 'Index.jsp'");
           	script.println("</script>");
    	}
   	}
        
        
    
 %>
  </body>
 </html>
