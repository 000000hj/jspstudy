<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="ex04_el.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <%--
      Jsp binding 영역 (어떤 값을 속성(Attribute)의 형태로 저장할 때 사용하는 영역)
      
      1. pageContext : this,            현재 페이지에서만 접근할 수 있다.
      2. request     : HttpServlet,     응답 전까지 접근할 수 있다.
      3. session     : HttpSession,     브라우저를 닫기 전까지 접근할 수 있다.
      4. application : ServletContext,  애플리케이션 종료 전까지 접근할 수 있다.
      
      Jsp binding 우선 순위  (동일한 이름의 속성이 서로 다른 영역에 존재하는 경우 먼저 사용되는 속성이 있다.)
      높음                                      낮음
      pageContext > request > session > application
      
      Jsp binding 영역에 저장된 속성(Attribute)은 모두 표현언어(EL)로 표현할 수 있다.
     --%>
     
     <%--
     표현언어(EL)
     1. Expression Language
     2. binding 영역에 저장된 값을 나타낼 때 사용할 수 있는 언어이다.
     3. JSP 표현식 <%=값%>을 대체할 수 있다.
     4. 형식
        ${값}
     5. binding 영역 EL 내장 객체
      1)pageContext를 의미하는 pageScope 객체
      2)request    를 의미하는 requestScope 객체
      3)session    을 의미하는 sessionScope 객체
      4)application을 의미하는 appllicationScope객체
      --%>
      
      <%--각 영역에 속성 msg 저장하기 --%>
      <%
      pageContext.setAttribute("msg", "pag나이 :30eContext");
      request.setAttribute("msg","request");
      session.setAttribute("msg", "session");
      application.setAttribute("msg","application");
      %>
      
      <%-- 우선순위 확인하기 --%>
      <div>${msg}</div>
      
      <%-- 각 영역의 속성 확인하기 --%>
      <div>${pageScope.msg}</div>
      <div>${requestScope.msg}</div>
      <div>${sessionScope.msg}</div>
      <div>${applicationScope.msg}</div>
      
      
      <%--객체 사용하기--%>
      <%
      Person person = new Person();
      person.setName("여석개");
      person.setAge(30);
      pageContext.setAttribute("person", person);
      %>
      
      
      <div>이름 :${person.getName()}</div><%--EL은 person.name을 person.getName()방식으로 호출해서 보여준다. --%>
      <div>나이 :${person.age}</div>      <%--EL은 person.age를 person.getage()방식으로 호출해서 보여준다. --%>
      
      
      <%-- Map 사용하기 --%>
      <% 
      
      //Map을 만든 뒤 EL 사용이 가능한 binding 영역에 넣는다.
      Map<String,Object> book =new HashMap<>();
      book.put("title", "소나기");
      book.put("price",10000);
      pageContext.setAttribute("book", book);
      
      %>
      <div>제목:${book.title}</div>
      <div>가격:${book.price}</div>
      
      <%-- 
        EL 연산자
        1. 산술 
          1)+
          2)-
          3)*
          4)/  또는 div
          5)%  또는 mod 
          
        2. 크기비교
          1) >  또는 gt
          2) <  또는 lt
          3) >= 또는 ge
          4) <= 또는 le
          5) == 또는 eq
          6) != 또는 ne
          
        3. 논리 연산
          1) 논리 AND : && 또는 and
          2) 논리 OR  : || 또는 or
          3) 논리 NOT : !  또는 not
          
        4. 조건 연산
         (조건식) ? true :false 일때
         
       --%>
       <%
       
       pageContext.setAttribute("a", 5);
       pageContext.setAttribute("b", 2);
       %>
            
          <p>${a+b}</p>
          <p>${a-b}</p>
          <p>${a*b}</p>
          <p>${a/b}</p>
          <p>${a div b}</p>
          <p>${a%b}</p>
          <p>${a mod b}</p>
          
          <p>${a gt b}</p>
          <p>${a lt b}</p>
          <p>${a ge b}</p>
          <p>${a le b}</p>
          <p>${a eq b}</p>
          <p>${a ne b}</p>
       

          <p>${a eq b && b eq 2}</p>
          <p>${a eq b and b eq 2}</p>
          <p>${a eq b || b eq 2}</p>
          <p>${a eq b or b eq 2}</p>
          <p>${!(a eq 5)}</p>
          <p>${not(a eq 5)}</p>
          
          
          <!--response에는 데이터 저장이 안됨 따라서 request 사용  -->
        <%--
        request 사용시 주의사항
        
        1. 속성(Attribute)을 저장한 경우
        request.setAttribute("name","홍길동")--->>> ${name}
        
        2. 파라미터(Parameter)를 저장한 경우
        /ContextPath/URLMapping?name=홍길동    --->>>${param.name}
        
         --%>
      
</body>
</html>