<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <c:set var="str" value="Hello World" scope="page"/>
  <h4>${fn:length(str)}</h4>
  <h4>${fn:substring(str,0,5)}</h4>
  <h4>${fn:substringBefore(str,' ')}</h4>
  <h4>${fn:substringAfter(str,' ')}</h4>
  <h4>${fn:indexOf(str,' ')}</h4>
  <h4>${fn:replace(str,' ','_')}</h4>
  
   <%--선택한 요소로 시작하면 출력--%>
  <c:if test="${fn:startsWith(str,'H')}">
  <h4>H로 시작한다.</h4>
  </c:if>
  
   <%--선택한 요소르 끝나면 출력--%>
  <c:if test="${fn:endsWith(str,'H') }">
    <h4>H로 끝난다.</h4>
  </c:if>
   <%--선택한 요소를 포함하면 출력--%>
  <c:if test="${fn:contains(str,'H') }">
    <h4>H를 포함한다.</h4>
  </c:if>
  
   <%--선택한 요소를 대소문자 구분을 무시하고 요소를 포함하면 출력--%>
  <c:if test="${fn:containsIgnoreCase(str,'h') }">
    <h4>H,h를 포함한다.</h4>
  </c:if>
  
  <%--선택한 요소를 분리--%>
  <c:set var="words" value="${fn:split(str,' ')}"/>
  <c:forEach var="word" items="${words}">
  <h4>${word}</h4>
  </c:forEach>
   <%--선택한 요소를 연결--%>
  <h4>${fn:join(words,' ')}</h4>
  
   <%--스크립트 동작 방지--%>
    ${fn:escapeXml(str2)}
     <%--스크립트 --%>
  <c:set var="str2" value="<script>alert('hahaha')</script>"/>
 
  
  
</body>
</html>