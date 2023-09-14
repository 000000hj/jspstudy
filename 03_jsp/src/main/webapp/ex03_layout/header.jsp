<%@page import="java.util.Optional"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--request 는 선언 안하고 사용하는 9가지 내장객체 중 하나  -->
  <% request.setCharacterEncoding("UTF-8");
    
    Optional<String>opt =Optional.ofNullable(request.getParameter("title"));
    String title= opt.orElse("환영합니다");
    String contextPath=request.getContextPath();
  %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=title%></title>

<script src="<%=contextPath%>/resource/js/lib/jquery-3.7.1.min.js"></script>

<!--캐싱처리 때문에 경로를 계속 바뀌도록 파라미터를 현재시간으로 잡아준다. 완성시 버전으로 바꾸는게 좋다.-->
<!-- 캐싱처리 회피를 하지 않으면 변경한 css가 반영되지 않는다  -->
<link rel="stylesheet" href="/jsp/resource/css/header.css?dt=<%=System.currentTimeMillis() %>">
<script src="/jsp/resource/js/header.js?dt=<%=System.currentTimeMillis()%>"></script>

</head>
<body>
  
  <nav class="gnb">
    <div class="logo"></div>
    <ul>
      <li><a href="main1.jsp">main1</a></li>
      <li><a href="main2.jsp">main2</a></li>
      <li><a href="main3.jsp">main3</a></li>
    </ul>
  </nav>
  
  
