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
<h1>修改會員資料頁面</h1>
<hr>
<form action="../../adminupdatemember" method="post">
請輸入要修改的會員資料ID:<input type="text" name="id">
<hr>
帳號:<input type="text" name="user"><br>
密碼:<input type="password" name="password"><br>
姓名:<input type="text" name="name"><br>
生日:<input type="text" name="birthday">(例:xxxx/xx/xx)<br>
電話:<input type="text" name="phone"><br>
信箱:<input type="text" name="email"><br>
地址:<input type="text" name="address"><br>
權限:
<input type="radio" name="type" value="member">會員
<input type="radio" name="type" value="admin">管理員<br>
<input type="submit" value="確認送出">
</form>
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
<a href="AD/member/adminmember.jsp">回會員管理頁</a>
</body>
</html>