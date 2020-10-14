<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="test.test"%>
<%
	System.out.println("test.jsp 페이지 로딩");
%>
<%
	GregorianCalendar today = new GregorianCalendar();
%>
<%=String.format("%ty년 %tm월 %td일", today, today, today) + "\t  와 이게 되네?\t" + new test().getNumber()%>

