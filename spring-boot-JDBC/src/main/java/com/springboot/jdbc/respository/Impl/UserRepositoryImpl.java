package com.springboot.jdbc.respository.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.jdbc.model.User;
import com.springboot.jdbc.respository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Override
	public int save(User user) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int update(User user) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int delete(long id) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public List<User> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public User findById(long id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;
}
