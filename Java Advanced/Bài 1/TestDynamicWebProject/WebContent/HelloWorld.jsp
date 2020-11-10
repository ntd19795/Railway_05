<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<style>

<%! int widthSideBar = 100; %>

body {
    margin: 0;
}

.body {
display: flex;
height: 100vh;

}

.sidebar {
background-color: #FBEFFB;
height: 100vh;
width: <%= widthSideBar  %>px ;
border-right: 1px solid black;
}

.main {
background-color: white;
width: 100vw ; 
}

.header {
  display: flex;

background-color: #F7F8E0;
height: 100px;
margin: 0px;
border-bottom: 1px solid black;
  align-items: center;

}

.content {
background-color: #D8D8D8 ;
height: 100vh;

}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
<div class="body">

<!-- side bar -->
	<div class = "sidebar">
		<p>wellcome to the damn testing page </p>
		<a href="homepage.jsp" onclick="load(homepage.jsp)">Back to Homepage</a> <br />
		
	
	</div>


<!-- main -->
	<div class = "main">
	
<!-- header -->
		<div class= "header" >
		<h1 style="margin:0px; ">tính đi em	 </h1>
		</div>
	
<!-- content -->
		<div class = "content">	
		
<!-- tao form -->
			<form action="tinhtoan.jsp">
			So hang 1 <input type="number" name="number1">  <br />
			So hang 2 <input type="number" name="number2"> <br />
			
		<button type="radio" name="caculate" value ="Cong">+</button>
		<button type="radio" name="caculate" value ="Tru">-</button>
		<button type="radio" name="caculate" value ="Nhan">x</button>
		<button type="radio" name="caculate" value ="Chia">/</button>
			
			
<!-- 			<input type="submit" name="cong" value="+"> 
			<input type="submit" name="tru" value="-">
			<input type="submit" name="nhan" value="x"> 
			<input type="submit" name="chia" value=":">  -->
												
			
			</form>	
		
		
		</div>
	</div>
</div>
</body>
</html>