<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.member"
    import="model.porder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% 
member m=(member)session.getAttribute("M");
porder p=(porder)session.getAttribute("P");
%>
</head>
<body>
<h1>個人資料</h1>
<hr>
<table width=50% border=1>
<tr>
<td>ID:<%=m.getId() %>
<tr>
<td>帳號:<%=m.getUser() %>
<tr>
<td>密碼:<%=m.getPassword() %>
<tr>
<td>姓名:<%=m.getName() %>
<tr>
<td>生日:<%=m.getBirthday() %>
<tr>
<td>電話:<%=m.getPhone() %>
<tr>
<td>信箱:<%=m.getEmail() %>
<tr>
<td>地址:<%=m.getAddress() %>
<tr>
<tr>
<td>權限:<%=m.getType() %>
</table>
<hr>
<a href="updatemember.jsp">修改資料</a><br>
<a href="../member.jsp">會員選單</a>
</body>
</html>