package edu.uta.mav.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.uta.mav.beans.UserBean;
import edu.uta.mav.beans.UserSessionBean;
import edu.uta.mav.services.UserServicesImpl;

@Controller
public class ApplicationController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);

	@Autowired
	UserServicesImpl userServices;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request) {
		LOGGER.info("index hit");
		if(request.getSession().getAttribute("user")==null)
			return new ModelAndView("index");
		else
			return new ModelAndView("redirect:home");	
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("userId") String mavId,HttpServletRequest request) {
		LOGGER.info("login hit userID "+mavId);
		UserSessionBean userBean = userServices.getSessionUserByUserId(mavId);
		if(userBean!=null && request.getSession(false).getAttribute("user")==null){
			LOGGER.info("no session found");
			request.getSession().setAttribute("user", userBean);
			return new ModelAndView("redirect:home");
		}
		else if(userBean!=null)
			return new ModelAndView("redirect:home");
		return new ModelAndView("index","message","Check Username/Password");
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request) {
		LOGGER.info("home page");
		return new ModelAndView("home");
	}
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public ModelAndView info() {
		LOGGER.info("info page");
		return new ModelAndView("info");
	}
	@RequestMapping(value = "/help", method = RequestMethod.GET)
	public ModelAndView help() {
		LOGGER.info("help page");
		return new ModelAndView("help");
	}
	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public ModelAndView message() {
		LOGGER.info("message page");
		return new ModelAndView("message");
	}
	@RequestMapping(value = "/directory", method = RequestMethod.GET)
	public ModelAndView directory() {
		LOGGER.info("directory page");
		return new ModelAndView("directory");
	}
	
}
