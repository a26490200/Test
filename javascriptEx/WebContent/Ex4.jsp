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
<hr>
<p id="demo3"></p>
<button onclick="document.getElementById('demo3').innerHTML=Date()">Ex1.現在時間</button>
<hr>
<button onclick="this.innerHTML=Date()">Ex2.現在時間</button>
<hr>
<p id="demo4"></p>
<button onclick="displayDate()">Ex3.現在時間</button>
<hr>
<p id="demo5">字串長度</p>
<script>
function myFunction(x,y){
	return x*y;
}
document.getElementById("demo").innerHTML=myFunction(4,4);
//-----------------------------------------------------
var person={
		firstName:"Eddie",	
		lastName:"Lin",
		age: 27,
		fullName:function(){
			return this.firstName+" "+this.lastName;
		}
	
};
document.getElementById("demo2").innerHTML=person.fullName();//不是fullName
//----------------------------------------------------
function displayDate(){
	document.getElementById("demo4").innerHTML=Date();
}
//-------------------------------------------------
var txt="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789"
	document.getElementById("demo5").innerHTML="字串長度為:"+txt.length+"個字";
</script>
</body>
</html>