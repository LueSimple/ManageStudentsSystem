package com.student.bean;

public class Student {
	private int stuID;
	private String stuName;
	private int stuAge;
	private String stuSex;
	private int stuHeight;
	

	public Student(int stuID,String stuName,int stuAge,String stuSex,int stuHeight) {
		// TODO Auto-generated constructor stub
		this.stuID=stuID;
		this.stuName=stuName;
		this.stuAge=stuAge;
		this.stuSex=stuSex;
		this.stuHeight=stuHeight;
	}


	public int getStuID() {
		return stuID;
	}


	public void setStuID(int stuID) {
		this.stuID = stuID;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public int getStuAge() {
		return stuAge;
	}


	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}


	public String getStuSex() {
		return stuSex;
	}


	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}


	public int getStuHeight() {
		return stuHeight;
	}


	public void setStuHeight(int stuHeight) {
		this.stuHeight = stuHeight;
	}

}
