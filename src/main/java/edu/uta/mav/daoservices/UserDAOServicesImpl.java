package edu.uta.mav.daoservices;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import edu.uta.mav.beans.HoldItemBean;
import edu.uta.mav.beans.ToDoBean;
import edu.uta.mav.beans.UserBean;
import edu.uta.mav.beans.UserSessionBean;
import edu.uta.mav.mappers.HoldItemMapper;
import edu.uta.mav.mappers.ToDoMapper;
import edu.uta.mav.mappers.UserMapper;
import edu.uta.mav.mappers.UserSessionMapper;
import edu.uta.mav.queries.UserQueries;

@Repository
public class UserDAOServicesImpl extends JdbcDaoSupport{
	private static final Logger LOGGER = LoggerFactory.getLogger(UserDAOServicesImpl.class);
	public UserBean getUserByUserId(String mavId){
		try {
			return getJdbcTemplate().queryForObject(UserQueries.GET_USER,new Object[] {mavId},new UserMapper());
		} catch (DataAccessException e) {
			LOGGER.error("getUserByUserId",e);
			return null;
		}
	}
	public List<UserBean> getUsers() {
		try {
			return getJdbcTemplate().query(UserQueries.GET_USERS,new UserMapper());
		} catch (DataAccessException e) {
			LOGGER.error("getUsers",e);
			return null;
		}
	}
	public List<UserBean> getSearchResults(String searchQuery,String searchvalue) {
		try {
			return getJdbcTemplate().query(searchQuery,new Object[]{searchvalue},new UserMapper());
		} catch (DataAccessException e) {
			LOGGER.error("getSearchResults",e);
			return null;
		}
	}
	public UserSessionBean getSessionUserByUserId(String mavId) {
		try {
			return getJdbcTemplate().queryForObject(UserQueries.GET_SESSION_USER,new Object[] {mavId,mavId},new UserSessionMapper());
		} catch (DataAccessException e) {
			LOGGER.error("getUserByUserId",e);
			return null;
		}
	}
	public List<HoldItemBean> getHoldItems(String mavId) {
		try {
			return getJdbcTemplate().query(UserQueries.GET_HOLD_ITEMS,new Object[]{mavId},new HoldItemMapper());
		} catch (DataAccessException e) {
			LOGGER.error("getHoldItems",e);
			return null;
		}
	}
	public List<ToDoBean> getTodoItems(String mavId) {
		try {
			return getJdbcTemplate().query(UserQueries.GET_TODO_ITEMS,new Object[]{mavId},new ToDoMapper());
		} catch (DataAccessException e) {
			LOGGER.error("getHoldItems",e);
			return null;
		}
	}
}
