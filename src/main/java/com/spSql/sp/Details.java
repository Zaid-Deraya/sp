package com.spSql.sp;

public class Details {
	private int id;
	private String name;
	private int age;
	private String email;
	private int moblie;
	private int status;
	public Details(int id,String name, int age, String email, int moblie, int status) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.moblie = moblie;
		this.status = status;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return age;
	}
	public void setAId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMoblie() {
		return moblie;
	}
	public void setMoblie(int moblie) {
		this.moblie = moblie;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", moblie=" + moblie
				+ ", status=" + status + "]";
	}
	
	
	
	
	
	
}
