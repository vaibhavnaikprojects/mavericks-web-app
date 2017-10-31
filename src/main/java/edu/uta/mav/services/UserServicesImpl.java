package edu.uta.mav.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uta.mav.beans.HoldItemBean;
import edu.uta.mav.beans.ToDoBean;
import edu.uta.mav.beans.UserBean;
import edu.uta.mav.beans.UserSessionBean;
import edu.uta.mav.daoservices.UserDAOServicesImpl;
import edu.uta.mav.queries.UserQueries;

@Service
public class UserServicesImpl {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServicesImpl.class);
	@Autowired
	UserDAOServicesImpl userDAOServices;

	public UserBean getUserByUserId(String userId) {
		return userDAOServices.getUserByUserId(userId);
	}

	public List<UserBean> getUsers() {
		return userDAOServices.getUsers();
	}

	public List<UserBean> getSearchResults(String searchType, String searchvalue) {
		switch (searchType) {
		case "dirName":
			return userDAOServices.getSearchResults(UserQueries.USER_SEARCH_BY_NAME,searchvalue);
		case "dirMajor":
			return userDAOServices.getSearchResults(UserQueries.USER_SEARCH_BY_MAJOR,searchvalue);
		case "dirHometown":
			return userDAOServices.getSearchResults(UserQueries.USER_SEARCH_BY_LOCATION,searchvalue);
		case "dirResidence":
			return userDAOServices.getSearchResults(UserQueries.USER_SEARCH_BY_CAMPUS_LOCATION,searchvalue);
		case "dirGender":
			return userDAOServices.getSearchResults(UserQueries.USER_SEARCH_BY_GENDER,searchvalue);
		case "dirType":
			return userDAOServices.getSearchResults(UserQueries.USER_SEARCH_BY_TYPE,searchvalue);
		default:
			return null;
		}
	}

	public UserSessionBean getSessionUserByUserId(String userId) {
		return userDAOServices.getSessionUserByUserId(userId);
	}

	public List<HoldItemBean> getHoldItems(String mavId) {
		return userDAOServices.getHoldItems(mavId);
	}

	public List<ToDoBean> getTodoItems(String mavId) {
		return userDAOServices.getTodoItems(mavId);
	}
}
