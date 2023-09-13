package ex05_redirect;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Redirect1
 */
@WebServlet("/redirect1")
public class Redirect1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Redirect1() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*
		 * redirect
		 * 1. 다른 경로로 이동하는 방식 중 하나이다.
		 * 2. 서버가 다른 경로를 응답하면 클라이언트가 해당 경로로 직접 이동하는 방식이다.
		 * 3. 경로를 작성할 때  ContextPath와 URLMapping을 모두 작성한다.
		 */
		
		
		//요청 파라미터
		String name= request.getParameter("name");
		
		//redirect할 경로를 응답
		//보낼 때 인코딩을 해야하며 리다이렉트시 url 에 있는 파라미터를 인코딩 할때는 URLEncoder.encode(name,"UTF-8") 사용
		response.sendRedirect("/servlet/redirect2?name="+URLEncoder.encode(name,"UTF-8"));
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
