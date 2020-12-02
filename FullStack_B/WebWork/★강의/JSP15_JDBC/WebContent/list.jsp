<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.text.SimpleDateFormat" %>    
<%@ page import = "java.sql.*" %>  <%-- JDBC 관련 클래스 import --%>    

<%!
	// JDBC 관련 기본 객체 변수들 선언
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;   //  executeQuery(),  SELECT 결과
	int cnt = 0;   			//  executeUpdate(), DML 결과
	
	// Connection 에 필요한 값 세팅
	final String DRIVER = "oracle.jdbc.driver.OracleDriver";  // JDBC 오라클 드라이버 클래스
	final String URL = "jdbc:oracle:thin:@localhost:1521:XE";  // DB 접속 URL
	final String USERID = "scott_b";  // DB 접속 계정 정보
	final String USERPW = "tiger_b";
%>
<%!
	// 쿼리문 준비
	final String SQL_WRITE_SELECT = 
		"SELECT * FROM test_write ORDER BY wr_uid DESC";
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>글 목록</title>
<style>
table {width: 100%;}
table, th, td {
	border : 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>

<%
	try{
		Class.forName(DRIVER);
		out.println("드라이버 로딩 성공<br>");  // 테스트 출력
		conn = DriverManager.getConnection(URL, USERID, USERPW);
		out.println("conn 성공<br>");  // 테스트 출력
		
		// 트랜잭션 실행
		pstmt = conn.prepareStatement(SQL_WRITE_SELECT);
		
		rs = pstmt.executeQuery();  // SELECT
		out.println("쿼리성공<br>"); // 테스트 출력
		%>
		
		<hr>
		<h2>리스트</h2>
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>등록일</th>
			</tr>
<%
	while(rs.next()){
		int uid = rs.getInt("wr_uid");
		String subject = rs.getString("wr_subject");
		String name = rs.getString("wr_name");
		int viewcnt = rs.getInt("wr_viewcnt");
		Date d = rs.getDate("wr_regdate");
		Time t = rs.getTime("wr_regdate");
		String regdate = "";
		if(d != null){
			regdate = new SimpleDateFormat("yyyy-MM-dd").format(d) + " "
					+ new SimpleDateFormat("hh:mm:ss").format(t);
		}
		
		out.println("<tr>");
		out.println("<td>" + uid + "</td>");
		out.println("<td><a href='view.jsp?uid=" + uid + "'>" + subject + "</a></td>");
		out.println("<td>" + name + "</td>");
		out.println("<td>" + viewcnt + "</td>");
		out.println("<td>" + regdate + "</td>");		
		out.println("</tr>");
	} // end while
%>		
		</table>
		<br>
		<button onclick="location.href = 'write.jsp'">신규등록</button>
<%		
	} catch(Exception e){
		e.printStackTrace();
		// ※ 예외 처리를 하든지, 예외 페이지를 설정해주어야 한다.
	} finally {
		// DB 리소스 해제
		try{			
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	} // end try
%>
</body>
</html>