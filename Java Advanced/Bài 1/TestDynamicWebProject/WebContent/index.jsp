<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>JSPDemo</title>
</head>
<body>
<%-- 	<%@ page errorPage="error.jsp"%>>

	<%
		String num1 = "5";
	String num2 = "n2";

	int a = Integer.parseInt(num1);
	try {
		int b = Integer.parseInt(num2);
	} catch (Exception e) {
		throw new Exception("bạn thật ngốk nghếk");
	}
	%>> --%>
	
	<form action="header.jsp">
	<input type="text" name="uname"> <input type="submit" value="go"> <br />

	</form>

	<h2> ~~~~~~~~~end~~~~~~~~~~~~~~~~~~</h2>

</body>
</html>