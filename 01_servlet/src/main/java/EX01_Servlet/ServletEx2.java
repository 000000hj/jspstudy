package EX01_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx2
 */
@WebServlet("/servletex2")
public class ServletEx2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEx2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청을 UTF-8 로 인코딩
		request.setCharacterEncoding("UTF-8");
		
		//요청 파라미터를 받는다.
		String strAnswer=request.getParameter("answer");
		String strCorrect=request.getParameter("correct");
		
		// 타입 바꿔서 비교하기
		 int answer=Integer.parseInt(strAnswer);
		 int correct=Integer.parseInt(strCorrect);
		 String str="";
		 if(answer==correct)
		 {
			 str="정답입니다";
		 }
		 else {
			str="오답입니다";
		}
		
		
		//응답 데이터 타입 인코딩 설정
		response.setContentType("text/html;charset=UTF-8");
		
		//응답 스트림 생성
		PrintWriter out= response.getWriter();
		
		//응답
		out.println("<script>");
		out.println("alert("+str+");");
		out.println("</script>");
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
