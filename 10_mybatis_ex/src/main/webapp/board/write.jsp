<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:set var="contextPath" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</head>
<body>
<style>
.average{width:90px;}
</style>
<script>

//함수 호출
$(function() {
  fnStuRegister();
})










</script>

<div id="mainWrap">


<form action="" method="get">

<div>
<label for="name">이름</label>
<input type="text" id="name" name="name" autocomplete="off">
</div>

<div>
<label for="kor">국어</label>
<input type="text" id="kor" name="kor" autocomplete="off">
</div>

<div>
<label for="eng">영어</label>
<input type="text" id="eng" name="eng" autocomplete="off">
</div>

<div>
<label for="math">수학</label>
<input type="text" id="math" name="math" autocomplete="off">
</div>


<hr>
<div>
<input hidden="stu_no">
<button id="btn_add">작성완료</button>
<button type="reset" id="btn_reset">다시작성</button>
<button id="btn_list">목록보기</button>
</div>

</form>





</div>


</body>
</html>