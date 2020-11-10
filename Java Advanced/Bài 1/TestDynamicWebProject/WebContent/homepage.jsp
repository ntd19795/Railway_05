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
	</div>


<!-- main -->
	<div class = "main">
	<h3>Chọn chức năng đi cưng</h3> <br>
	<a href="HelloWorld.jsp" onclick="load(HelloWorld.jsp)">Ex2Q(1+2)</a> <br />
	<a href="formnhaplieu.jsp" onclick="load(formnhaplieu.jsp)">Ex2Q3</a> <br />

		
		
		</div>
	</div>
</div>
</body>
</html>