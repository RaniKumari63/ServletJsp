package com.suchiit.dao;

import java.util.List;

import com.suchiit.model.Product;

public interface ProductDao {
	public boolean registerProducts(Product pro);
	public List<Product>viewAllProducts();
	public boolean deleteProduct(int pid) ;
	public Product viewProduct(int pid);
	public boolean updateProduct(Product pro);
}
