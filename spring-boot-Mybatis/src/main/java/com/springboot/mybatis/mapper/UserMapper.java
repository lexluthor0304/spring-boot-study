package com.springboot.mybatis.mapper;

import java.util.List;

import com.springboot.mybatis.model.User;

public interface UserMapper {

	List<User> getAll();

	User getOne(Long id);

	void insert(User user);

	void update(User user);

	int delete(Long id);
}
