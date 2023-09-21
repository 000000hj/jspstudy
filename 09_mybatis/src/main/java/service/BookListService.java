package service;

import javax.servlet.http.HttpServletRequest;

import common.ActionForward;

public interface BookListService {

	public ActionForward register(HttpServletRequest request);//등록
	public ActionForward bookCount(HttpServletRequest request); //전체갯수
	public ActionForward bookAdd(HttpServletRequest request);//글작성하러가기
	public ActionForward bookList(HttpServletRequest request);//목록
	public ActionForward bookDetail(HttpServletRequest request);//세부
	public ActionForward bookModify(HttpServletRequest request);//수정적용
	public ActionForward bookDelete(HttpServletRequest request);//삭제
	
}
