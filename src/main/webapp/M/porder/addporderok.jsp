<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% 
session.removeAttribute("M");
session.removeAttribute("P");
%>
</head>
<body>
<h1>新增訂單完成</h1>
<hr>
<a href="M/porder/porder.jsp">繼續購物</a><br>
<a href="memberOrporder.jsp">回會員選單</a><br>
<a href="login.jsp">登出</a>
</body>
</html>