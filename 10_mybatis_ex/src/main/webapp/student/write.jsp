<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<title>write</title>

</head>
<script type="text/javascript">
$(function() {
  

})

function fnAdd() {
  $('')
}


</script>


<body>
<h1>신규학생등록 화면</h1>

<form id="wrap" method="post" action="${contextPath}/student/add.do">
<div><label for="name">이름</label><input type="text" name="name" id="name"></div>
<div><label for="kor">국어</label><input type="text" name="kor" id="kor"></div>
<div><label for="eng">영어</label><input type="text" name="eng" id="eng"></div>
<div><label for="math">수학</label><input type="text" name="math" id="math"></div>

<hr>

<button type="submit" id="btn_submit">작성완료</button>
<button type="reset">다시작성</button>
<button type="button" id="btn_list">목록보기</button>
</form>
</body>
</html>