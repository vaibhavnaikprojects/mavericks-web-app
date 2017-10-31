package edu.uta.mav.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.uta.mav.beans.UserSessionBean;

public class UserSessionMapper implements RowMapper<UserSessionBean>{
	@Override
	public UserSessionBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new UserSessionBean(rs.getString("applicationId"), rs.getString("mavId"), rs.getString("firstName"), rs.getString("middleName"), rs.getString("lastName"), rs.getString("userType"), rs.getString("acadCareerType"), rs.getString("acadCareerNo"), rs.getString("major"), rs.getString("admitTerm"), rs.getString("userStatus"), rs.getString("emailId"),rs.getString("applicationNumber"));
	}

}
