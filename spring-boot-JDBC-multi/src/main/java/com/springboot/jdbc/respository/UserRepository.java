package com.springboot.jdbc.respository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springboot.jdbc.model.User;

public interface UserRepository {

	int save(User user, JdbcTemplate jdbcTemplate);
	int update(User user, JdbcTemplate jdbcTemplate);
	int delete(long id, JdbcTemplate jdbcTemplate);

	List<User> findAll(JdbcTemplate jdbcTemplate);
	User findById(long id, JdbcTemplate jdbcTemplate);

}
