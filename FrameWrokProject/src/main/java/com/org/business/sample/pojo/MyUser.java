package com.org.business.sample.pojo;

public class MyUser {

	private Integer id;
	private String userName;
	private String password;
	private Integer age;

	@Override
	public String toString() {
		return "MyUser [id=" + id + ", userName=" + userName + ", password=" + password + ", age=" + age + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
