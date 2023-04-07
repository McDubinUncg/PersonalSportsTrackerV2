package com.csc340sp23.pst.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class userRepository {
    
    @Autowired
    NamedParameterJdbcTemplate template;
    
    public int saveUser(User user) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("user_name", user.getUserName());
        paramMap.put("email", user.getEmail());
        String query = "INSERT INTO user(user_name,email) VALUES(:user_name, :email)";
        return template.update(query, paramMap);
    }
}
