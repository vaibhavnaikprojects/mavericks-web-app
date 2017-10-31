package edu.uta.mav.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.uta.mav.beans.HoldItemBean;

public class HoldItemMapper implements RowMapper<HoldItemBean>{

	@Override
	public HoldItemBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new HoldItemBean(rs.getInt("itemId"), rs.getString("holdItem"), rs.getString("institution"), rs.getString("startTerm"), rs.getString("endTerm"), rs.getString("startDate"), rs.getString("endDate"), rs.getString("departmentName"), rs.getDouble("amount"));
	}

}
