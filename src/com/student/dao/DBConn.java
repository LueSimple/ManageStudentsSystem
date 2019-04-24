package com.student.dao;
import java.sql.*;
import java.util.*;

import com.student.bean.Student;
public class DBConn {
public static Connection getConn(String userName,String pwd) {
	Connection conn=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student",userName, pwd);
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
}
public static void main(String[] args) {

	//	insert
	int n=0;
//	Student stu=new Student(1,"明明",16,"男",179);
//	StudentDao studao=new StudentDao();
//	n=studao.insertPro(stu);
	
	
	//	select
//	Vector<Student> stuall=new Vector<Student>();
//	StudentDao studao=new StudentDao();
//	stuall=studao.selectALLstu();
//	for (int i = 0; i < 3; i++) {
//		System.out.println(stuall.get(i).getStuID()+"：学生姓名"+stuall.get(i).getStuName()+",学生身高"+stuall.get(i).getStuHeight());
//	}	
	
	
	//	delete
//	int f=0;
//	StudentDao studao=new StudentDao();
//	studao.deleteStu(2);
	
	
	//	update
	int f=0;
	Student stu=new Student(1,"刚刚",20,"男",168);
	StudentDao studao=new StudentDao();
	f=studao.updateStu(stu);
}
}


