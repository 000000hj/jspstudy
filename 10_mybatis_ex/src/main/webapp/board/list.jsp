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
<style>
.average{width:90px;}
</style>
<script>

//함수 호출
$(function() {
	fnStuRegister();
})


//신규학생 등록 클릭시 등록 페이지로 이동
function fnStuRegister(){
	
	$('#btn_stu_register').click(function() {
  location.href='${contextPath}/board/write.do';
})

}


//조회버튼 클릭시  리스트 조회. ajax로
//전체조회 검색조회






</script>

<body>
<div id="mainWrap">
<h1>학생관리</h1>

<button type="button"  id="btn_stu_register">신규학생 등록</button>

<hr>


<!-- average[0]=begin average[1]=end -->
<form id="frm_inquiry">
<label for="">평균</label>
<input type="text" placeholder="begin" name="average" class="average">
<span>~</span>
<input type="text" placeholder="end" name="average" class="average">
<button type="button" id="btn_inquiry">조회</button>
<button type="button" id="btn_inquiry_all">전체보기</button>
</form>

<hr>
<hr>

<table border="1" id="stu_table">
<caption>전체학생 0명</caption>
<thead>
<tr >
<td id="stu_no">학번</td>
<td id="stu_name">성명</td>
<td id="stu_kor">국어</td>
<td id="stu_eng">영어</td>
<td id="stu_math">수학</td>
<td id="stu_avg">평균</td>
<td id="stu_grade">학점</td>
<td id="stu_btn">버튼</td>
</tr>
</thead>

<tbody>
<tr>
<td colspan="8"><span id="comment">등록된 학생이 없습니다.</span></td>

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