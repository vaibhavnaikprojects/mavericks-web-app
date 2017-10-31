package edu.uta.mav.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uta.mav.beans.ChatBean;
import edu.uta.mav.beans.MessageBean;
import edu.uta.mav.daoservices.ChatDAOServicesImpl;
@Service
public class ChatServicesImpl {
	private static final Logger LOGGER = LoggerFactory.getLogger(ChatServicesImpl.class);
	@Autowired
	ChatDAOServicesImpl chatDAOServices;
	public List<ChatBean> getChatsByUserId(String userId) {
		return chatDAOServices.getChatsByUserId(userId);
	}
	public boolean deleteChat(long chatId) {
		return chatDAOServices.deleteChat(chatId);
	}
	public MessageBean addMessage(long chatId,MessageBean messageBean) {
		return chatDAOServices.addMessage(chatId,messageBean);
	}
	public boolean deleteMessage(long messageId) {
		return chatDAOServices.deleteMessage(messageId);
	}
	public List<MessageBean> getMessagesByChatId(long chatId) {
		return chatDAOServices.getMessagesByChatId(chatId);
	}

}
