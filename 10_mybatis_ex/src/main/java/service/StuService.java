package service;

import javax.servlet.http.HttpServletRequest;

import common.ActionForward;

public interface StuService {

  
  //목록 반환
  public ActionForward stuList(HttpServletRequest request);
  //학생추가
  public ActionForward stuAdd(HttpServletRequest request);
}
