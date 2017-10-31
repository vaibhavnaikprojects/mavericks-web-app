package edu.uta.mav.daoservices;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import edu.uta.mav.beans.ChatBean;
import edu.uta.mav.beans.MessageBean;
import edu.uta.mav.mappers.ChatMapper;
import edu.uta.mav.mappers.MessageMapper;
import edu.uta.mav.queries.ChatQueries;
@Repository
public class ChatDAOServicesImpl extends JdbcDaoSupport{
	private static final Logger LOGGER = LoggerFactory.getLogger(ChatDAOServicesImpl.class);
	public List<ChatBean> getChatsByUserId(String mavId) {
		try {
			return getJdbcTemplate().query(ChatQueries.GET_CHATS_BY_USERID,new Object[]{mavId},new ChatMapper());
		} catch (DataAccessException e) {
			LOGGER.error("getChatsByUserId",e);
			return null;
		}
	}
	public boolean deleteChat(long chatId) {
		try {
			int a= getJdbcTemplate().update(ChatQueries.DELETE_CHAT,new Object[]{chatId});
			if(a>0)	return true;
			return false;
		} catch (DataAccessException e) {
			LOGGER.error("getChatsByUserId",e);
			return false;
		}
	}
	public List<MessageBean> getMessagesByChatId(long chatId) {
		try {
			return getJdbcTemplate().query(ChatQueries.GET_MESSAGE_BY_CHATID,new Object[]{chatId},new MessageMapper());
		} catch (DataAccessException e) {
			LOGGER.error("getMessagesByChatId",e);
			return null;
		}
	}
	public boolean deleteMessage(long messageId) {
		try {
			int a= getJdbcTemplate().update(ChatQueries.DELETE_MESSAGE,new Object[]{messageId});
			if(a>0)	return true;
			return false;
		} catch (DataAccessException e) {
			LOGGER.error("deleteMessage",e);
			return false;
		}
	}
	public MessageBean addMessage(long chatId,MessageBean messageBean) {
		if(chatId==0){
			getJdbcTemplate().update(ChatQueries.ADD_CHAT,new Object[]{});
			getJdbcTemplate().update(ChatQueries.ADD_MESSAGE,new Object[]{});
		}else
			getJdbcTemplate().update(ChatQueries.ADD_MESSAGE,new Object[]{});
		return messageBean;
	}

}
