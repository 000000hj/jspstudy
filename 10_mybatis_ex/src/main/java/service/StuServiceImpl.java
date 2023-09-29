package service;

import javax.servlet.http.HttpServletRequest;

import common.ActionForward;

public class StuServiceImpl implements StuService {

  
  
  @Override
  public ActionForward stuList(HttpServletRequest request) {

  
    return new ActionForward("/student/list.jsp",false);
  }
  
  @Override
  public ActionForward stuAdd(HttpServletRequest request) {
    
    
    return new ActionForward("/student/add.jsp",false);
  }

}
