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
			System.out.println("���ݿ����ӳɹ�");
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
//	Student stu=new Student(1,"����",16,"��",179);
//	StudentDao studao=new StudentDao();
//	n=studao.insertPro(stu);
	
	
	//	select
//	Vector<Student> stuall=new Vector<Student>();
//	StudentDao studao=new StudentDao();
//	stuall=studao.selectALLstu();
//	for (int i = 0; i < 3; i++) {
//		System.out.println(stuall.get(i).getStuID()+"��ѧ������"+stuall.get(i).getStuName()+",ѧ�����"+stuall.get(i).getStuHeight());
//	}	
	
	
	//	delete
//	int f=0;
//	StudentDao studao=new StudentDao();
//	studao.deleteStu(2);
	
	
	//	update
	int f=0;
	Student stu=new Student(1,"�ո�",20,"��",168);
	StudentDao studao=new StudentDao();
	f=studao.updateStu(stu);
}
}


