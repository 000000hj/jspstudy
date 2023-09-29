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
 * Servlet implementation class StuController
 */
@WebServlet("*.do")
public class StuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private StuService stuService=new StuServiceImpl();    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	  //요청 인코딩
	  request.setCharacterEncoding("UTF-8");
	  response.setContentType("text/html; charset=UTF-8");
	  
	  //필요한 변수들 미리 설정
	  String requestURI=request.getRequestURI();
	  String contextPath=request.getContextPath();
	  String urlMapping=requestURI.substring(contextPath.length());
	  
	  
	  //이동
	  ActionForward af=null;
	  
	  //컨트롤
	  switch (urlMapping) {
	  
	  //초기화면
	  case "/index.do":
	    af=new ActionForward("/index.jsp",false);
	    break;
	    

	  //학생정보 작성 페이지
	  case"/student/write.do":
	    af=new ActionForward("/student/write.jsp",false);
	      
	  break;
	  
	  //목록조회페이지
    case "/student/list.do":
      af=stuService.stuList(request);
      break;
    
      //학생등록성공 알림페이지
     case "/student/add.do":
       af=stuService.stuAdd(request);
      break;

   
    }
	  
	  
	  //이동방식 판별
	  if(af!=null)
	  {
	  
	    if(af.isRedirect())
	    {  //리다이렉트
	      response.sendRedirect(af.getPath());
	    }
	    else {
	      //forward
	      request.getRequestDispatcher(af.getPath()).forward(request, response);
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
