<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>JAVA SCRIPT Ex1<h2>
<button type="button" onclick="document.getElementById('demo').innerHTML=Date()">
點擊以顯示時間</button>
<p id="demo"></p>
<hr>

<button type="button" onclick='document.getElementById("demo2").innerHTML="HELLO JAVASCRIPT"'>
點擊以變換文字為"HELLO JAVASCRIPT"
</button>
<button type="button" onclick='document.getElementById("demo2").innerHTML="HI I,m Eddie"'>
點擊以變回原文字
</button>
<p id="demo2">HI I,m Eddie</p>
<hr>
<button type="button" onclick="document.getElementById('myimg').src='img/chocolate.jpg'">
巧克力口味
</button>

<img id="myimg" src="img/banana.jpg" style="width:100px">

<button type="button" onclick="document.getElementById('myimg').src='img/banana.jpg'">
香蕉口味
</button>
<hr>
<button type="button" onclick="document.getElementById('demo3').style.fontSize='35px'">
點擊變更文字樣式</button>
<p id="demo3">更改文字樣式</p>
<hr>
<button type="button" onclick="document.getElementById('demo4').style.display='block'">
點擊顯示隱藏內容
</button>
<p>顯示隱藏內容</p>
<p id="demo4" style="display:none">我是隱藏內容</p>
</body>
</html>