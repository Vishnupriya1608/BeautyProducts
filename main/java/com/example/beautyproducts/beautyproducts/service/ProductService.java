package com.example.beautyproducts.beautyproducts.service;

import java.util.List;

import com.example.beautyproducts.beautyproducts.entity.Product;

public interface ProductService {
	
	public void addProduct(Product product);
	public void deleteProduct(Product product);
	public List<Product> getAllProducts();
	public Product updateProduct(Product product);
	public Product getProductById(Integer id);
}
                                                