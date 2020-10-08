<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>My Javascript Ex2</h2>
<p id="demo"></p>
<hr>
<p id="demo2">變更文字範例</p>
<button type="button" onclick="myFunction()">點擊以變更文字</button>
<hr>
<p id="demo3">外部Function變更文字範例</p>
<button type="button" onclick="myFunction2()">點擊以使用外部Function變更文字</button>
<script src="myFunction2.js"></script>
<hr>
<p id="demo4">數字</p>
<script>document.write(10+10);</script>
<br>
<button type="button" onclick="document.write(10+10)">10+10</button>
<!-- 這樣寫會直接跳新的頁面,前面打的HTML內容都會消失 -->
<script>window.alert(10+10);/*或是alert(10+10)*/</script>
<script>console.log(10+10);</script>
<button type="button" onclick="window.print()">列印此頁</button>
<script>
document.getElementById("demo").innerHTML="輸出文字方法";
function myFunction(){
	document.getElementById("demo2").innerHTML="文字已變更";
}
document.getElementById("demo4").innerHTML=10+10;
</script>

</body>
</html>