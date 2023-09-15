<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--
  <c:if>
  1. if문이다.
  2. else문이 없다.
  3. 형식
    <c:if test="조건식">
    실행문
    </c:if>
    
   
 --%>
 <c:set var="age" value="30"/>
 <c:if test="${age>=20}">
  <div>성인</div>
 </c:if>
 <c:if test="${age<20}">
 <div>미자</div>
 </c:if>
 
 
 
 
 <c:set var="score" value="100"/>
   <c:if test="${score>100||score<0}">
 <div>0이상 100이하의 정수만 유효합니다.</div>
 </c:if>
 <c:if test="${score>=90&&score<=100}">
 <div>학점:A</div>
 </c:if>
  <c:if test="${score<90&&score>=80}">
 <div>학점:B</div>
 </c:if>
   <c:if test="${score<80&&score>=70}">
 <div>학점:C</div>
 </c:if>
   <c:if test="${score<70&&score>=60}">
 <div>학점:D</div>
 </c:if>
   <c:if test="${score>=0&&score<60}">
 <div>학점:F</div>
 </c:if>
</body>
</html>