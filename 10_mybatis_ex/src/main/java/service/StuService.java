package service;

import javax.servlet.http.HttpServletRequest;

import common.ActionForward;

public interface StuService {
	public ActionForward stuAdd(HttpServletRequest request);
	public ActionForward stuList(HttpServletRequest request);
}
