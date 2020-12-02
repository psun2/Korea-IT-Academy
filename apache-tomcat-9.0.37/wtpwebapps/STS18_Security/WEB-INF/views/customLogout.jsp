<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
  <h1>Custom Logout Page</h1>
  
  <form method='post' action="${pageContext.request.contextPath}/customLogout">
    <input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }" />  
    <input type='submit' value='로그아웃'><br>
  </form>
</body>
</html>
