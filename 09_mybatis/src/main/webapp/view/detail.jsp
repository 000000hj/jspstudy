<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<style>
  .link a {
    margin-right: 20px;
  }
</style>
<script>

  $(function(){
    fnDelete();
  })

  function fnDelete(){
    $('#delete_link').click(function(event){
      if(!confirm('삭제할까요?')){
        event.preventDefault();
        return;
      }
    })
  }

</script>
</head>
<body>

  <div class="link">
    <a href="${contextPath}/view/write.do">등록하러가기</a>
    <a href="${contextPath}/view/list.do">목록으로이동</a>
    <a href="${contextPath}/view/edit.do?board_no=${board.board_no}">수정하러가기</a>
    <a id="delete_link" href="${contextPath}/view/delete.do?board_no=${board.board_no}">삭제하기</a>
  </div>

  <hr>
  
  <div>
    <div>게시글번호: ${board.board_no}</div>
    <div>제목: ${board.title}</div>
    <div><pre>${board.content}</pre></div>
    <div>작성/수정일: ${board.pubdate}</div>
  </div>

</body>
</html>