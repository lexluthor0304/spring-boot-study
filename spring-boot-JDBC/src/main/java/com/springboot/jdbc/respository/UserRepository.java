package com.springboot.jdbc.respository;

import java.util.List;

import com.springboot.jdbc.model.User;

public interface UserRepository {

	int save(User user);
	int update(User user);
	int delete(long id);

	List<User> findAll();
	User findById(long id);

}
