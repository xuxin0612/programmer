/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yourcompany.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.yourcompany.struts.form.UserLoginForm;

/** 
 * MyEclipse Struts
 * Creation date: 06-16-2014
 * 
 * XDoclet definition:
 * @struts.action path="/userLogin" name="userLoginForm" input="/userLogin.jsp" scope="request"
 * @struts.action-forward name="success" path="/userLoginSuccess.jsp"
 */
public class UserLoginAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		UserLoginForm userLoginForm = (UserLoginForm) form;// TODO Auto-generated method stub
		return null;
	}
}