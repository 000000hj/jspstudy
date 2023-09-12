package EX01_Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx
 */
@WebServlet("/servletex")
public class ServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEx() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. 요청을 UTF-8로 인코딩
		request.setCharacterEncoding("UTF-8");
		
		//2. 요청 파라미터를 받는다
		String id= request.getParameter("id");//아이디
		String pw= request.getParameter("pw");//비번
		String name=request.getParameter("name");//이름
		String birth[]=request.getParameterValues("birth");//생년월일
		String gender=request.getParameter("gender");//성별
		String email=request.getParameter("email");//이메일
		String phone[]=request.getParameterValues("phone");//휴대전화
		
		//응답
		
		//응답 데이터의 타입과 인코딩 설정
		response.setContentType("text/html; charset=UTF-8");
		
		//응답 스트림 생성
		PrintWriter out=response.getWriter();
		
		//응답
		out.println("<div id=response_wrap>");
		out.println("<ul>");
		out.println("<li> 아이디:"+id+"</li>");
		out.println("<li> 비밀번호:"+pw+"</li>");
		out.println("<li> 이름:"+name+"</li>");
		out.println("<li> 생년월일:"+birth[0]+"년"+birth[1]+"월"+birth[2]+"일"+"</li>");
		out.println("<li> 성별:"+gender+"</li>");
		out.println("<li> 이메일:"+email+"</li>");
		out.println("<li> 휴대전화:"+phone[1]+"</li>");
		out.println("</ul>");
		out.println("</div>");
		out.flush();
		out.close();

		
		
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
