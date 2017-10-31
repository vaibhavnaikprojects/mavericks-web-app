package edu.uta.mav.restcontrollers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uta.mav.beans.HoldItemBean;
import edu.uta.mav.beans.ToDoBean;
import edu.uta.mav.beans.UserBean;
import edu.uta.mav.services.UserServicesImpl;

@RestController
@RequestMapping(value="/api/users",produces=MediaType.APPLICATION_JSON_VALUE)
public class UserRestController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserRestController.class);
	
	@Autowired
	UserServicesImpl userServices;
	
	@RequestMapping(value="/")
	public ResponseEntity<List<UserBean>> getUsers(){
		LOGGER.warn("in getUsers");
		List<UserBean> beans= userServices.getUsers();
		return new ResponseEntity<List<UserBean>>(beans,HttpStatus.OK);
	}
	
	@RequestMapping(value="/{userId}")
	public ResponseEntity<UserBean> getUserByUserId(@PathVariable("userId") String userId){
		LOGGER.warn("in getUserByCredentials"+userId);
		UserBean bean= userServices.getUserByUserId(userId);
		return new ResponseEntity<UserBean>(bean,HttpStatus.OK);
	}
	
	@RequestMapping(value="/search/{searchType}/{searchValue}")
	public ResponseEntity<List<UserBean>> getSearchResults(@PathVariable("searchType") String searchType,@PathVariable("searchValue") String searchvalue){
		LOGGER.warn("in getSearchResults");
		List<UserBean> beans= userServices.getSearchResults(searchType,searchvalue);
		return new ResponseEntity<List<UserBean>>(beans,HttpStatus.OK);
	}
	
	@RequestMapping(value="/{mavId}/holditems")
	public ResponseEntity<List<HoldItemBean>> getHoldItems(@PathVariable("mavId") String mavId){
		LOGGER.warn("in getHoldItems");
		List<HoldItemBean> holdItemBeans= userServices.getHoldItems(mavId);
		return new ResponseEntity<List<HoldItemBean>>(holdItemBeans,HttpStatus.OK);
	}
	
	@RequestMapping(value="/{mavId}/todoItems")
	public ResponseEntity<List<ToDoBean>> getTodoItems(@PathVariable("mavId") String mavId){
		LOGGER.warn("in getTodoItems");
		List<ToDoBean> toDoBeans= userServices.getTodoItems(mavId);
		return new ResponseEntity<List<ToDoBean>>(toDoBeans,HttpStatus.OK);
	}
	
	
}
