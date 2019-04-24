package com.student.dao;

import java.sql.*;
import java.util.Vector;

import com.student.bean.Student;
import com.student.dao.DBConn;
public class StudentDao {
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	PreparedStatement pstmt=null;
	public StudentDao() {
		// TODO Auto-generated constructor stub
		conn=DBConn.getConn("root", "root");
	}
//	insert
	public int insertPro(Student stu) {
		int flag=0;
		String sql="INSERT INTO student(stuID,stuName,stuAge,stuSex,stuHeight)VALUES(?,?,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,stu.getStuID());
			pstmt.setString(2,stu.getStuName());
			pstmt.setInt(3,stu.getStuAge());
			pstmt.setString(4,stu.getStuSex());
			pstmt.setInt(5,stu.getStuHeight());
			flag=pstmt.executeUpdate();
			System.out.println("商品添加成功");
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		return flag;
	}
//	delete
	public int deleteStu(int stuid) {
		int flag=0;
		String sql="DELETE FROM student WHERE stuID="+stuid;
		try {
			stmt=conn.createStatement();
			flag=stmt.executeUpdate(sql);
			System.out.println(stuid+"商品删除成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
//	select
	public Vector<Student> selectALLstu(){
		Vector<Student> stuall=new Vector<Student>();
		Student stu ;
		String sql="SELECT * from student ORDER BY stuID DESC";
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
//				清空数据
				stu=new Student(0, null, 0, null, 0);
				stu.setStuID(rs.getInt(1));
				stu.setStuName(rs.getString(2));
				stu.setStuAge(rs.getInt(3));
				stu.setStuSex(rs.getString(4));
				stu.setStuHeight(rs.getInt(5));
//				添加到集合中
				stuall.addElement(stu);			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return stuall;
	}

//	update
	public int updateStu(Student stu) {
		int flag=0;
		String sql="UPDATE student SET stuName=?,stuAge=?,stuSex=?,stuHeight=? WHERE stuID=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,stu.getStuID());
			pstmt.setString(2,stu.getStuName());
			pstmt.setInt(3,stu.getStuAge());
			pstmt.setString(4,stu.getStuSex());
			pstmt.setInt(5,stu.getStuHeight());
			flag=pstmt.executeUpdate();
			System.out.println("商品更改成功");
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		return flag;
	}
	
	
	}
	


