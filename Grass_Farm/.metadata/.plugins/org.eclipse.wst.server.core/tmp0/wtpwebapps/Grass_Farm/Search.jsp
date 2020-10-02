<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO"%>
<%@ page import="user.User" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.ArrayList" %>
<!-- 자바 클래스 사용 -->
<% request.setCharacterEncoding("UTF-8"); %>
<!-- 한명의 회원정보를 담는 user클래스를 자바 빈즈로 사용 / scope:페이지 현재의 페이지에서만 사용-->
<jsp:useBean id="user" class="user.User" scope="page"/>
<jsp:setProperty property="userName" name="user"/>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>잔디공작소</title>
</head>
<body>
 <%
 	UserDAO userDAO=new UserDAO();
	ArrayList<User> list=userDAO.search(user.getUserName());
%>
	
 	<p class="card-text"><%= list.get(0).getUserID()%></p>
  </body>
 </html>
