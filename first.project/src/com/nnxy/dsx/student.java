package com.nnxy.dsx;

public class student {
	private int id;//唯一标识
	private String age;//年龄
	private int sex;//性别
	
	
	
	@Override
	public String toString() {
		return "student [id=" + id + ", age=" + age + ", sex=" + sex + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public int getSex() {
		return sex;
	}



	public void setSex(int sex) {
		this.sex = sex;
	}
	

}
