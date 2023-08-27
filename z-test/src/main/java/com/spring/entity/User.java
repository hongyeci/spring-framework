package com.spring.entity;

/**
 * @author zhaisp
 * @description user实体类
 * @date 2023/3/26 13:13
 */
public class User {
	private String userName;
	private Integer age;

	public User() {
	}

	public User(String userName, Integer age) {
		this.userName = userName;
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"userName='" + userName + '\'' +
				", age=" + age +
				'}';
	}
}