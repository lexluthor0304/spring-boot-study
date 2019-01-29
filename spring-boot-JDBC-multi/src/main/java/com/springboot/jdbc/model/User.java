package com.springboot.jdbc.model;

public class User {

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
	}

	private Long id;
	private String name;
	private String password;
	private int age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	public User() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
}
