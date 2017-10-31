package edu.uta.mav.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.uta.mav.beans.UserBean;

public class UserMapper implements RowMapper<UserBean>{
	@Override
	public UserBean mapRow(ResultSet rs, int count) throws SQLException {
		return new UserBean(rs.getString("applicationId"), rs.getString("mavId"), rs.getString("firstName"),
				rs.getString("middleName"),rs.getString("lastName"),rs.getString("userType"),
				rs.getString("acadCareerType"), rs.getString("acadCareerNo"),rs.getString("major"),
				rs.getString("admitTerm"),rs.getString("userStatus"),rs.getString("emailId"),rs.getString("applicationNumber"),rs.getString("aboutMe"),rs.getString("gender"),rs.getString("homeTown"),rs.getString("dob"),
				rs.getString("birthCountry"),rs.getString("birthState"),rs.getString("maritalStatus"),
				rs.getString("militaryStatus"),rs.getString("campusLocation"),rs.getString("twitterURL"),
				rs.getString("instagramURL"),rs.getString("facebookURL"),rs.getString("fcmToken"));
	}
}
