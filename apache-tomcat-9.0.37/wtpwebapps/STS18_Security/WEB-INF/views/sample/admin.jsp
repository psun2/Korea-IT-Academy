<%@page import="java.util.Enumeration"%> <%@ page language="java"
contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>admin</title>
  </head>
  <body>
    <% System.out.println(); Enumeration reqs = request.getAttributeNames();
    while(reqs.hasMoreElements()) {
    System.out.println(reqs.nextElement().toString()); } System.out.println();
    System.out.println();
    System.out.println(request.getSession().getAttribute("_csrf"));
    System.out.println(request.getAttribute("_csrf")); %>
    <h1>/sample/admin page</h1>
    <a href="${pageContext.request.contextPath }/customLogout">로그아웃</a>
    <script type="text/javascript">
      console.log(new Request('admin').mode);
      console.log(new Request('admin').keepalive);
      // console.log(new Request('admin').json());
      // console.log(new Request('admin').bodyUsed);
      // console.log(ServiceUIFrameContext);
      console.log(ServiceWorker.arguments);
      // console.log(ServiceWorkerMessageEvent);
      console.log(ServiceWorkerRegistration);
      // console.log(new Request('_csrf'));
      // console.log('<%=request.getAttribute("_csrf").getClass()%>');
    </script>
  </body>
</html>
