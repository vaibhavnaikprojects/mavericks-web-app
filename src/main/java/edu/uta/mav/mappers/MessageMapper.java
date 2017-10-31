package edu.uta.mav.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.uta.mav.beans.MessageBean;

public class MessageMapper implements RowMapper<MessageBean> {

	@Override
	public MessageBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new MessageBean();
	}

}
