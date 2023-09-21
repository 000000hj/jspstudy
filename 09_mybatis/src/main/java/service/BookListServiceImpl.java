package service;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import common.ActionForward;
import domain.BookDto;
import repository.BookDao;
import util.PageVo;

public class BookListServiceImpl implements BookListService {

	//모든 서비스가 공동으로 사용하는 객체 가져오기
	private BookDao dao=BookDao.getDao();
	private PageVo pageVo=new PageVo();
	
	
	//전체갯수
	@Override
	public ActionForward bookCount(HttpServletRequest request) {

		
		return null;
	}
	
	@Override
	public ActionForward register(HttpServletRequest request) {
		return null;
	}
	//등록
	@Override
	public ActionForward bookAdd(HttpServletRequest request) {

	//등록할 제목 ,작자 가격
			String title=request.getParameter("title");
			String author=request.getParameter("author");
			String strPrice=request.getParameter("price");
			
		//형변환을 위해 null체크 값이 없으면 0처리
		Optional<String> opt = Optional.ofNullable(strPrice);
	   int price = Integer.parseInt(opt.orElse("0"));  // opt로 감싼 strAge가 null이면 "0"을 꺼낸다.
			
	   //빌더로 객체 만들기
	   BookDto dto=BookDto.builder()
	  		 								.title(title)
	  		 								.author(author)
	  		 								.price(price)
	  		 								.build();
	   
	   
	   //BookDao의 bookAdd 메소드 호출
	   int AddResult=dao.bookAdd(dto);
	   
	    String path = null;
	    if(AddResult == 1) {
	      path = request.getContextPath() + "/view/list.do";
	    } else if(AddResult == 0) {
	      path = request.getContextPath()+"/index.do";
	    }
	    
	    // 어디로 어떻게 이동하는지 반환 (insert 수행 후에는 반드시 redirect 이동한다.)
	    return new ActionForward(path, true);
	}
	
	
	
	//상세조회
	@Override
	public ActionForward bookDetail(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	//목록보기
	@Override
	public ActionForward bookList(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	//수정
	@Override
	public ActionForward bookModify(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	//삭제
	@Override
	public ActionForward bookDelete(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
}
