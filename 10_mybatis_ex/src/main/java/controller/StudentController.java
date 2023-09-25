package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;
import service.StuService;
import service.StuServiceImpl;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("*.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private StuService stuService =new StuServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		//인코딩 
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		
		//요청 주소 확인
		String reqURI=req.getRequestURI();
		String contextPath=req.getContextPath();
		String urlMapp=reqURI.substring(contextPath.length());
		
		//어디로 이동?
		ActionForward af= null;
		
//요청 처리
		
		
		// 목록으로 이동
		switch (urlMapp) {
		
		
		case "/index.do":
			af=new ActionForward("/index.jsp",false);
			break;
			
		case "/board/list.do":
			af=stuService.stuList(req);
			break;
		}
		
	   
    // 이동
    if(af != null) {
      if(af.isRedirect()) {
        res.sendRedirect(af.getPath());
      } else {
        req.getRequestDispatcher(af.getPath()).forward(req, res);
      }
    }
    
  }
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
