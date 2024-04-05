package com.suchiit.daoimpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.suchiit.config.ConnectionManager;
import com.suchiit.dao.UserDao;
import com.suchiit.model.User;
import com.suchiit.query.QueryConstant;

public class UserDaoImpl implements UserDao {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public boolean register(User user) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int count=0;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstant.INSERT_USER);
			ps.setInt(1, user.getUid());
			ps.setString(2,user.getFname());
			ps.setString(3, user.getLname());
			ps.setString(4, user.getEmail());
			ps.setLong(5, user.getMobilenumber());
			ps.setString(6,user.getPwd());
			count=ps.executeUpdate();
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ConnectionManager.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return flag;
	}

	public String getPassword(String email) {
		// TODO Auto-generated method stub
		String password=null;
		try {
			System.out.println("hai");
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstant.SELECT_PWD);
			
			ps.setString(1, email);
			
			rs=ps.executeQuery();
			System.out.println("hai");
			if(rs.next())
			{
				
				password=rs.getString(1);
				
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return password;
		
	}

	public boolean validEmailAndPassWord(String email, String password) {
		boolean flag=false;
		// TODO Auto-generated method stub
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstant.SELECT_U_PWD);
			ps.setString(1, email);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next())
				flag=true;
			System.out.println("hhhhhhh");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ConnectionManager.closeConnection(con, ps,rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
		
	}

}
