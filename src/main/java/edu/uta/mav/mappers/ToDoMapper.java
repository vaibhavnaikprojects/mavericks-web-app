package edu.uta.mav.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.uta.mav.beans.ToDoBean;

public class ToDoMapper implements RowMapper<ToDoBean>{

	@Override
	public ToDoBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new ToDoBean(rs.getInt("todoId"), rs.getString("todoItem"), rs.getString("dueDate"), rs.getString("status"), rs.getString("universityName"), rs.getString("adminFunction"));
	}

}
