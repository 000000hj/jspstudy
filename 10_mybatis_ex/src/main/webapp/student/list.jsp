<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<title>list</title>
</head>

<script type="text/javascript">
$(function() {
  fnWrite();
})

//등록 버튼 클릭시
function fnWrite() {
  
  $('#btn_write').click(function() {
    location.href="${contextPath}/student/write.do";
  })
}

</script>
<body>

<h1>학생 관리</h1>


<button type="button" id="btn_write">신규학생등록</button>


<hr>


<div>
<form id="frm_avr">
<label>평균</label>
<input type="text" placeholder="begin" class="input_avr" name="begin" size="8">
<span> ~ </span>
<input type="text" placeholder="end" class="input_avr" name="end" size="8">
<button type="button" id="btn_inquiry">조희</button>
<button type="button" id="btn_inquiry_all">전체조회</button>
</form>
</div>

<hr>
<hr>

<div>
<table border="1">
<caption>전체학생  명</caption>
<thead>
<tr>
  <td>학번</td>
  <td>성명</td>
  <td>국어</td>
  <td>영어</td>
  <td>수학</td>
  <td>평균</td>
  <td>학점</td>
  <td>버튼</td>
</tr>
</thead>
<tbody>


<!--학생 목록 보여주는  -->
<tr id="list_wrap">

   <tr>
    <td colspan="8" class="comment">등록된 학생이 없습니다.</td>
   </tr>

</tr>

<tr>
<td colspan="5">전체평균</td>
<td>0.00</td>
<td colspan="2"></td>
</tr>


</tbody>

</table>

</div>

</body>
</html>