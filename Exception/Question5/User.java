package com.yash.exceptions.Question5;

public class User {
	private int userId;
	private String userName;
	private int userAge;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + "]";
	}

	public User(int userId, String userName, int userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
