package edu.uta.mav.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.uta.mav.beans.ChatBean;

public class ChatMapper implements RowMapper<ChatBean>{

	@Override
	public ChatBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		return null;
	}

}
