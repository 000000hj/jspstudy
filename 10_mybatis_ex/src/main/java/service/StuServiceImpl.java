package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import common.ActionForward;
import domain.StudentDto;
import repository.StudentDao;

public class StuServiceImpl implements StuService {
	
	//공통 객체 선언
	private StudentDao dao=StudentDao.getDao();
	
	
	
	@Override
	public ActionForward stuAdd(HttpServletRequest request) {
	
		 String strStuNo= request.getParameter("stuNo");
		 String name = request.getParameter("name");
		 String strKor = request.getParameter("kor");
		 String strEng = request.getParameter("eng");
		 String strMath = request.getParameter("math");

		 int stuNo=Integer.parseInt(strStuNo);
		 int kor=Integer.parseInt(strKor);
		 int eng=Integer.parseInt(strEng);
		 int math=Integer.parseInt(strMath);
	
		 StudentDto dto = StudentDto.builder()
				 												.stuNo(stuNo)
				 												.name(name)
				 												.kor(kor)
				 												.eng(eng)
				 												.math(math)
				 												.build();
				 												
	    int addResult = dao.bookAdd(dto);
	    String path = null;
	   
	    switch(addResult) {
	    case 0: path = request.getContextPath() + "/index.do"; break;
	    case 1: path = request.getContextPath() + "/book/list.do"; break;    
	    }
	    return new ActionForward(path, true);
	}
	
	
	
  @Override
  public ActionForward stuList(HttpServletRequest request) {
 

   
    return new ActionForward("/board/list.jsp", false);
    
  }
}
