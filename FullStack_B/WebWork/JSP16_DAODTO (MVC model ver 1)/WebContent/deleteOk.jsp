<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.lec.beans.*"%>
<jsp:useBean id="dao" class="com.lec.beans.WriteDAO" />
	
	<% //parameter 받아오기
		int uid = Integer.parseInt(request.getParameter("uid"));
		
		// 이단계에서 parameter 검증 필요
	%>
	
	<% // dao 사용한 트랜잭션
		int cnt = dao.deletByUid(uid);
	%>
	
	<%
		if(cnt == 0) {
	%>
		<script>
			alert('삭제 실패');
			history.back();
		</script>
	<%	
		} else {
	%>
		<script>
			alert('삭제 성공');
			location.href='list.jsp';
		</script>
	<%		
		}
	%>