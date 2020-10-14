<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>修改個人資料頁面</h1>
<hr>
<form action="../../updatemember" method="post">
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
</body>
</html>