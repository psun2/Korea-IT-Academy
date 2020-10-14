<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>out</title>
</head>
<body>
	<%--
	<%
		int i = 0;
	while (true) {
		i++;
		out.println("5 ❌ " + i + " = " + 5 * i + "<br />");
	%>
	---<br />
	<%
		if (i >= 9)
		break;
	}
	%>
 --%>

	<%!// 선언부 태그: 변수 선언, 메소드 정의
	int i = 100;
	String str = "test";

	public int sum(int a, int b) {
		return a + b;
	}%>

	<%--
		// 스크립트릿

	// public int sum(int a, int b) {
	// 	return a + b;
	// } // 스크립트릿 안에서 메소드 정의는 Error

	out.println("i = " + i + "<br />");
	out.println("str = " + str + "<br />");
	out.println("sum = " + sum(2, 10) + "<br />");
	--%>

<!-- 위와 같은 구조의 결과물을 표출합니다. -->
	i =
	<%=i%><br /> str =
	<%=str%><br /> sum =
	<%=sum(10, 10)%><br />
</body>
</html>