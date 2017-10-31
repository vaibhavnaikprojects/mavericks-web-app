package edu.uta.mav.restcontrollers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.uta.mav.beans.ChatBean;
import edu.uta.mav.beans.MessageBean;
import edu.uta.mav.services.ChatServicesImpl;

@RestController
@RequestMapping(value="/api/chats",produces=MediaType.APPLICATION_JSON_VALUE)
public class ChatRestController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ChatRestController.class);
	
	@Autowired
	ChatServicesImpl chatServices;
	
	@RequestMapping(value="/{userId}",method=RequestMethod.GET)
	public ResponseEntity<List<ChatBean>> getChatsByUserId(@PathVariable("userId") String userId){
		LOGGER.warn("in getChatsByUserId"+userId);
		List<ChatBean> chatBeans= chatServices.getChatsByUserId(userId);
		return new ResponseEntity<List<ChatBean>>(chatBeans,HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete/{chatId}",method=RequestMethod.GET)
	public ResponseEntity<Boolean> deleteChat(@PathVariable("chatId") long chatId){
		LOGGER.warn("in deleteChat"+chatId);
		boolean status= chatServices.deleteChat(chatId);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
	
	@RequestMapping(value="/{chatId}/messages",method=RequestMethod.GET)
	public ResponseEntity<List<MessageBean>> getMessagesByChatId(@PathVariable("chatId") long chatId){
		LOGGER.warn("in getMessagesByChatId "+chatId);
		List<MessageBean> messageBeans= chatServices.getMessagesByChatId(chatId);
		return new ResponseEntity<List<MessageBean>>(messageBeans,HttpStatus.OK);
	}
	
	@RequestMapping(value="/{chatId}/messages",method=RequestMethod.POST)
	public ResponseEntity<MessageBean> addMessage(@PathVariable("chatId") long chatId,@RequestBody MessageBean messageBean){
		LOGGER.warn("in addMessage chat ID"+chatId+" messageBean"+messageBean);
		MessageBean bean= chatServices.addMessage(chatId,messageBean);
		return new ResponseEntity<MessageBean>(bean,HttpStatus.OK);
	}
	
	@RequestMapping(value="/{chatId}/messages/{messageId}")
	public ResponseEntity<Boolean> deleteMessage(@PathVariable("chatId") long chatId,@PathVariable("messageId") long messageId){
		LOGGER.warn("in deleteMessage"+messageId);
		boolean status= chatServices.deleteMessage(messageId);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
	
}
