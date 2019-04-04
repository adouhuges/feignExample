package com.adou.pojo;

public class User {
	private String name;
	private String age;
	private String sex;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void show(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		System.out.println(country);
	}
	
}
