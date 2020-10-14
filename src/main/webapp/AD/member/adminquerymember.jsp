<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.member"
    import="Dao.memberDao"
    import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mars</title>
<% 
List<member> l=new memberDao().memberQuery();
%>
</head>
<body>
<h1>查詢會員資料頁面</h1>
<hr>
<table width=50% border=1>
<% 
out.print("<tr><td>id<td>帳號<td>密碼<td>姓名<td>生日<td>電話<td>信箱<td>地址<td>權限");
for(member m:l){
	out.print("<tr><td>"+m.getId()+
				"<td>"+m.getUser()+
				"<td>"+m.getPassword()+
				"<td>"+m.getName()+
				"<td>"+m.getBirthday()+
				"<td>"+m.getPhone()+
				"<td>"+m.getEmail()+
				"<td>"+m.getAddress()+
				"<td>"+m.getType());
}
%>
</table>
<hr>
<a href="adminmember.jsp">回會員管理頁</a>
</body>
</html>