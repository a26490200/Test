<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>my Javascript Ex3</h2>
<p id="demo"></p>
<hr>
<p id="demo2"></p>
<p id="demo3"></p>
<button type="button" onclick="myFunction()">點擊以顯示</button>
<hr>
<p id="demo4"></p>
<hr>
<p id="demo5"></p>
<hr>
<p id="demo6"></p>
<hr>
<p id="demo7"></p>
<hr>
<p id="demo8"></p>
<hr>
<script>
var x,y,z;
x=10;
y=10
z=x+y;

document.getElementById("demo").innerHTML="x+y="+z+".";
//------------------------------------------------------------
function myFunction(){
	document.getElementById("demo2").innerHTML="HI EDDIE!";
	document.getElementById("demo3").innerHTML="HI JESSIE!";
}
//------------------------------------------------------------
var pi=3.14;
var person="Eddie!";
var answer="Yes I AM!";

	document.getElementById("demo4").innerHTML=pi+"<br>"+person+"<br>"+answer;
//---------------------------------------------------------
var x1=5;
var y1=6;
var z1=5;
document.getElementById("demo5").innerHTML=(x1==z1)+" "+(y1==z1);
//---------------------------------------------------------
var x2=["Volvo","BMW","BENZ"];
document.getElementById("demo6").innerHTML="我喜歡"+x2[1];
//---------------------------------------------------------
var person2={
		firstname:"Eddie",
		lastname:"Lin",
		age:27
};
document.getElementById("demo7").innerHTML=person2.firstname+" "+person2.lastname+" "+person2.age+".";
//------------------------------------------------------
document.getElementById("demo8").innerHTML=
	typeof ""+"<br>"+
	typeof "Eddie"+"<br>"+
	typeof 10.5+"<br>"+
	typeof 'Eddie'
</script>
</body>
</html>