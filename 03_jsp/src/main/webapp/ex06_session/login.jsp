<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--로그인 안된 상태 --%>
<c:if test="${sessionScope.id==null}">
<div>
  <form method="post" action="${contextPath}/login">
    <div>
      <label for="id">아이디</label>
      <input type="text" name="id" id="id">
    </div>
    
     <div>
      <label for="pw">비밀번호</label>
      <input type="pw" name="pw" id="pw">
    </div>
    
    <div>
      <button type="submit">로그인</button>
    </div>
    
  </form>
</div> 
</c:if>
<%--로그인 된 상태 --%>
<c:if test="${sessionScope.id!=null}">
<div>${sessionScope.id}님 환영합니다.</div>
<div><button type="button" id="btn_logout">로그아웃</button></div>
</c:if>
</body>
</html>