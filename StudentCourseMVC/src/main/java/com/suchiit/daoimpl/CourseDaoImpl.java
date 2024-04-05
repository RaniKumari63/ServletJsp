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
import com.suchiit.dao.CourseDao;
import com.suchiit.model.Course;

import com.suchiit.query.QueryConstant;

public class CourseDaoImpl implements CourseDao {

	public boolean registerCourse(Course cr) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		Statement st=null;
		int count = 0;
		boolean flag=false;
		try {
			try {
				con = ConnectionManager.getConnection();
				
				ps = con.prepareStatement(QueryConstant.INSERT_COURSE_QUERY);
			
				ps.setString(1,cr.getCname());
				ps.setString(2, cr.getCduration());
			ps.setLong(3, cr.getCfee());
				
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

	

	public List<Course> viewCourses() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<Course> addCourses = new ArrayList<Course>();
		try {
			try {
				con = ConnectionManager.getConnection();
				ps=con.prepareStatement(QueryConstant.SELECT_COURSE_QUERY);
				rs = ps.executeQuery();
				while (rs.next()) {
					int cid = rs.getInt(1);
					String cname = rs.getString(2);
					String cduration = rs.getString(3);
					long cfee = rs.getLong(4);
					Course course = new Course(cid, cname, cduration, cfee);
					addCourses.add(course);
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
		return addCourses;
	}

	public Course viewCourse(int cid) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Course course=null;
		
		try {
			try {
				con = ConnectionManager.getConnection();
				ps=con.prepareStatement(QueryConstant.SELECT_COURSE_SPECIFIC_QUERY);
				ps.setInt(1, cid);
				rs = ps.executeQuery();
				if (rs.next()) {
					
					course = new Course(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getLong(3));
					
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
		return course;
	}

}
