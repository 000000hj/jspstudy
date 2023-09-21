package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;
import service.BookListService;
import service.BookListServiceImpl;

/**
 * Servlet implementation class BookListController
 */
@WebServlet("*.do")
public class BookListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookListController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//필터 실행후 실행
		
		//요청 인코딩은 필터에서함. 응답 인코딩
		response.setContentType("text/html; charset=UTF-8");
		
		//요청 주소 확인
		String requestURI=request.getRequestURI();
		String ContextPath=request.getContextPath();
		String urlMapping=requestURI.substring(ContextPath.length());
		
		
		//어디로 이동할 것인지 알고있는 ActionForward객체 생성
		ActionForward af=null;
		
		//BookService 객체 생성
		BookListService bookListService=new BookListServiceImpl();
		
		//요청에 따른 처리
		switch (urlMapping) {
	  case "/index.do":
    	af=new ActionForward("/index.jsp",false);
      break;
	  case "/view/wirte.do":
	  	af = new ActionForward("/view/write.jsp", false);
	  	break;
	  //서비스 처리
	  case "/view/registor.do"://등록
	  	af=bookListService.bookAdd(request);
	  	break;
	  case "/view/bookList.do"://목록가져오기
	  	af=bookListService.bookList(request);
	  	break;
	  case"/view/detail.do"://세부
	  	af=bookListService.bookDetail(request);
	  	
    case"/view/modify.do"://수정적용
    	af=bookListService.bookModify(request);
    	break;
    case"/view/delete.do"://삭제
    	af=bookListService.bookDelete(request);
    	break;
		}
		
		//이동
		if(af!=null) {
			if(af.isRedirect()) {
				response.sendRedirect(af.getPath());
			}else {
				request.getRequestDispatcher(af.getPath()).forward(request, response);
			}
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doGet(request, response);
	}

}
