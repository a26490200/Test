<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.member"
    import="model.porder"
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mars</title>
<% 
member m=(member)session.getAttribute("M");
porder p=(porder)session.getAttribute("P");
%>
</head>
<body>
<form action="addporder" method="post">
<!--目前位置是從confirmporder按過來,跟addporder是同一層-->
<h2><%=m.getName()%>的訂單如下</h2>
<table width=50% border=1>
<tr>
<td>姓名<td><%=p.getName() %>
<tr>
<td>香蕉口味<td><%=p.getP1() %>份
<tr>
<td>巧克力口味<td><%=p.getP2() %>份
<tr>
<td>奶茶口味<td><%=p.getP3() %>份
<tr>
<td>香草口味<td><%=p.getP4() %>份
<tr>
<td>總價<td><%=p.getSum() %>元
</table> 
<hr>
<input type="submit" value="送出">
</form>
</body>
</html>