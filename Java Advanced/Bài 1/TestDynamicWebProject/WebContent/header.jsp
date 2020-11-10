<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String name = request.getParameter("uname");
out.print("Welcome " + name.toUpperCase());

%>