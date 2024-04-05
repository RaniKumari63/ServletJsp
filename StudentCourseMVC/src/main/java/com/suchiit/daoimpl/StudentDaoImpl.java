package com.suchiit.daoimpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.suchiit.config.ConnectionManager;
import com.suchiit.dao.StudentDao;
import com.suchiit.model.Course;
import com.suchiit.model.Student;
import com.suchiit.model.StudentCourse;
import com.suchiit.query.QueryConstant;

public class StudentDaoImpl implements StudentDao{

	public boolean registerStudent(Student st1) {
		Connection con = null;
		PreparedStatement ps = null;
		Statement st=null;
		int count = 0;
		boolean flag=false;
		try {
			try {
				con = ConnectionManager.getConnection();
				
				ps = con.prepareStatement(QueryConstant.INSERT_STUDENT_QUERY);
			
				ps.setString(1, st1.getSadd());
				ps.setString(2, st1.getEmail());
				ps.setString(3, st1.getSname());
				ps.setInt(4, st1.getCid());
				
				count = ps.executeUpdate();
			
			
				if(count!=0)
					flag=true;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ConnectionManager.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return flag;
	}

	public List<Student> viewStudents() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<Student> addStudents = new ArrayList<Student>();
		try {
			try {
				con = ConnectionManager.getConnection();
				ps=con.prepareStatement(QueryConstant.SELECT_STUDENT_QUERY);
				rs = ps.executeQuery();
				while (rs.next()) {
					int sid = rs.getInt(1);
					String sadd = rs.getString(2);
					String semail = rs.getString(3);
					int  cid = rs.getInt(4);
					String sname = rs.getString(5);
					Student student = new Student(sid, sname, sadd, semail,cid);
					addStudents.add(student);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ConnectionManager.closeConnection(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return addStudents;
	}

	public Student viewStudent(int sid) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Student student=null;
		
		try {
			try {
				con = ConnectionManager.getConnection();
				ps=con.prepareStatement(QueryConstant.SELECT_STUDENT_SPECIFIC_QUERY);
				ps.setInt(1, sid);
				rs = ps.executeQuery();
				if (rs.next()) {
					
					
					String sadd = rs.getString(2);
					String semail = rs.getString(3);
					int  cid = rs.getInt(4);
					String sname = rs.getString(5);
					 student = new Student(sid, sname, sadd, semail,cid);
					
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ConnectionManager.closeConnection(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;
	}

	public List<StudentCourse> viewStudentCourse() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<StudentCourse> addStudentCourse = new ArrayList<StudentCourse>();
		try {
			try {
				con = ConnectionManager.getConnection();
				ps=con.prepareStatement(QueryConstant.SELECT_STUDENT_COURSE_QUERY);
				rs = ps.executeQuery();
				while (rs.next()) {
					String sname = rs.getString(1);
					String sadd = rs.getString(2);
					String semail = rs.getString(3);
					String  cname = rs.getString(4);
					String cduration = rs.getString(5);
					long cfee=rs.getLong(6);
					StudentCourse studentcourse = new StudentCourse( sname, sadd, semail,cname,cduration,cfee);
					addStudentCourse.add(studentcourse);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ConnectionManager.closeConnection(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return addStudentCourse;
	}

}
