<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Result</title>
</head>
<body>
	
<%
float a = Float.parseFloat(request.getParameter("number1"));
float b = Float.parseFloat(request.getParameter("number2"));
%>

<% out.print("so thu nhat: " + a ); %><br />
<%out.print("so thu hai: " + b); %><br />

<%
float c = 0;
String valueGet = request.getParameter("caculate");

if (valueGet.equals("Cong")) {
	c = a + b;
	out.print("Tổng hai số trên là " + c);
	
} else if (valueGet.equals("Tru")) {
	c = a-b;
	out.print("Hiệu hai số trên là " + c);
	
} else if (valueGet.equals("Nhan")) {
	c = a*b;
	out.print("Tích hai số trên là " + c);
} else if (valueGet.equals("Chia")) {
	c = a/b;
	out.print("Thương hai số trên là " + c);
}

%>

</body>
</html>