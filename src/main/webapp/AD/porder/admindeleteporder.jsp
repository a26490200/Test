<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
     import="java.util.List"
    import="model.porder"
    import="Dao.porderDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mars</title>
<% 
List<porder> l=new porderDao().porderQuery();
%>
</head>
<body>
<h1>刪除訂單頁面</h1>
<hr>
<form action="../../admindeleteporder" method="post">
請輸入要修改的訂單ID:<input type="text" name="id"><br>
<input type="submit" value="ok">
</form>
<hr>
<table width=100% border=1>
<% 
out.print("<tr><td>ID<td>姓名<td>香蕉口味<td>巧克力口味<td>奶茶口味<td>香草口味<td>總價");
for(porder p:l){
	out.print("<tr><td>"+p.getId()+
				"<td>"+p.getName()+
				"<td>"+p.getP1()+
				"<td>"+p.getP2()+
				"<td>"+p.getP3()+
				"<td>"+p.getP4()+
				"<td>"+p.getSum());
}
%>
</table>
<hr>
<a href="AD/porder/adminporder.jsp">回訂單管理頁</a>
</body>
</html>