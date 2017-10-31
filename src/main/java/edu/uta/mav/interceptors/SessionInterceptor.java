package edu.uta.mav.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import edu.uta.mav.beans.UserSessionBean;
import edu.uta.mav.controllers.ApplicationController;
import edu.uta.mav.util.ApplicationValues;

public class SessionInterceptor extends HandlerInterceptorAdapter{
	private static final Logger LOGGER = LoggerFactory.getLogger(SessionInterceptor.class);
	
	@Autowired
	ApplicationController applicationController ;
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
		UserSessionBean bean=(UserSessionBean) request.getSession().getAttribute("user");
		if(bean==null)	 {
			LOGGER.info("no session found,redirecting to login");
			if(ApplicationValues.getServerName()==null){
				ApplicationValues.setServerName(request.getServerName());
				setCurrentEnvironment();
			}
			
			if (!ApplicationValues.LOCAL.equals(ApplicationValues.getCurrentEnvironment()))
				LOGGER.info(ApplicationValues.getCurrentEnvironment() +"Environment ");
			else
				LOGGER.info("Local Environment:");
			response.sendRedirect("");
		}
		return true;
	}
	
	private void setCurrentEnvironment(){
		if(ApplicationValues.getCurrentEnvironment()==null){
			if (ApplicationValues.getServerName().contains(ApplicationValues.DEV_ENVIRONMENT))
				ApplicationValues.setCurrentEnvironment(ApplicationValues.DEV);
			else if(ApplicationValues.getServerName().contains(ApplicationValues.STAGE_ENVIRONMENT))
				ApplicationValues.setCurrentEnvironment(ApplicationValues.STAGE);
			else if(ApplicationValues.getServerName().contains(ApplicationValues.PROD_ENVIRONMENT))
				ApplicationValues.setCurrentEnvironment(ApplicationValues.PROD);
			else
				ApplicationValues.setCurrentEnvironment(ApplicationValues.LOCAL);
		}
	}
}
