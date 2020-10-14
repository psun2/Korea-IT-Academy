<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
response.setContentType("text/html; UTF-8");
int age = Integer.parseInt(request.getParameter("age"));

if (age >= 20)
	response.sendRedirect("adult.jsp?age=" + age);
else
	response.sendRedirect("underage.jsp?age=" + age);
%>