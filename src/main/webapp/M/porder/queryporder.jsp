<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List"
    import="model.porder"
    import="Dao.porderDao"
    import="model.member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
List<porder> l=new porderDao().porderQuery(request.getParameter("name"));
member m=(member)session.getAttribute("M");

%>
</head>
<body>
<form action="queryporder.jsp" method="post">
請輸入姓名查詢購買紀錄:<input type="text" name="name">
<input type="submit" value="ok">
<hr>
<table width=100% border=1>
<% 


	for(porder p:l){
		if(p.getName().equals(m.getName())){
			out.print("<tr><td>ID<td>姓名<td>香蕉口味<td>巧克力口味<td>奶茶口味<td>香草口味<td>總價");
		out.print("<tr><td>"+p.getId()+
					"<td>"+p.getName()+
					"<td>"+p.getP1()+
					"<td>"+p.getP2()+
					"<td>"+p.getP3()+
					"<td>"+p.getP4()+
					"<td>"+p.getSum());
		}
		else{
			out.print("<tr><td><h1>請輸入正確姓名</h1>");
		}
	}


%>
</table>
<hr>
<a href="../member.jsp">會員選單</a>
</form>
</body>
</html>