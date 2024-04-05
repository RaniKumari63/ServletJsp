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
import java.util.Scanner;

import com.suchiit.config.ConnectionManager;
import com.suchiit.query.QueryConstant;
import com.suchiit.dao.ProductDao;
import com.suchiit.model.Product;

public class Productdaoimpl implements ProductDao {

	public boolean registerProducts(Product pro) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		Statement st=null;
		int count = 0;
		boolean flag=false;
		try {
			try {
				con = ConnectionManager.getConnection();
				
				ps = con.prepareStatement(QueryConstant.INSERT_QUERY);
			
				ps.setString(1, pro.getPname());
				ps.setInt(2, pro.getPqty());
			ps.setInt(3, pro.getPprice());
				
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

	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<Product> addProducts = new ArrayList<Product>();
		try {
			try {
				con = ConnectionManager.getConnection();
				ps=con.prepareStatement(QueryConstant.SELECT_QUERY);
				rs = ps.executeQuery();
				while (rs.next()) {
					int pid = rs.getInt(1);
					String pname = rs.getString(2);
					int pqty = rs.getInt(3);
					int pprice = rs.getInt(4);
					Product product = new Product(pid, pname, pqty, pprice);
					addProducts.add(product);
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
		return addProducts;
	}
	public Product viewProduct(int pid) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Product product=null;
		
		try {
			try {
				con = ConnectionManager.getConnection();
				ps=con.prepareStatement(QueryConstant.SELECT_SPECIFIC_QUERY);
				ps.setInt(1, pid);
				rs = ps.executeQuery();
				if (rs.next()) {
					
					product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(3));
					
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
		return product;
	}
	
	public boolean deleteProduct(int pid) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		boolean flag=false;
		try {
			try {
				con = ConnectionManager.getConnection();
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
			ps = con.prepareStatement(QueryConstant.DELETE_QUERY);
			ps.setInt(1, pid);
			int count = ps.executeUpdate();
			if (count != 0) 
				flag=true;

			

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
	
	public boolean updateProduct(Product pro) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		boolean flag=false;
		try {
			try {
				con = ConnectionManager.getConnection();
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
			ps = con.prepareStatement(QueryConstant.UPDATE_QUERY);
			ps.setString(1, pro.getPname());
			ps.setInt(2, pro.getPqty());
			ps.setInt(3, pro.getPprice());
			ps.setInt(4, pro.getPid());
			int count = ps.executeUpdate();
			if (count != 0) 
				flag=true;

			

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

	
	
	}


