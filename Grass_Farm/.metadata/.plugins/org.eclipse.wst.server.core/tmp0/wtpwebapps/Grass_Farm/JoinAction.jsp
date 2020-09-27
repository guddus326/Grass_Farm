<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO"%>
<!-- userdao의 클래스 가져옴 -->
<%@ page import="java.io.PrintWriter"%>
<!-- 자바 클래스 사용 -->
<% request.setCharacterEncoding("UTF-8"); %>
<!-- 한명의 회원정보를 담는 user클래스를 자바 빈즈로 사용 / scope:페이지 현재의 페이지에서만 사용-->
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
        if(result == -1){ // 아이디가 기본키기. 중복되면 오류.
        	PrintWriter script = response.getWriter();
        	script.println("<script>");
        	script.println("alert('이미 존재하는 아이디 입니다.')");
        	script.println("history.back()");
        	script.println("</script>");
        }
        else{
        	if(!user.getUserPass().equals(user.getUserPassCheck())){
        		PrintWriter script = response.getWriter();
        		script.println("<script>");
            	script.println("alert('비밀번호일치를 확인해주세요')");
            	script.println("history.back()");
            	script.println("</script>");
        	}else{
        		session.setAttribute("userID", user.getUserID());
        		PrintWriter script = response.getWriter();
            	script.println("<script>");
             	script.println("location.href = 'Main.jsp'");
            	script.println("</script>");
        	}
        }
    }
 %>
  </body>
 </html>
