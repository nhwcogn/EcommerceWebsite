package com.ecommerceWeb.service;

import java.util.List;

import com.ecommerceWeb.entity.Category;

public interface CategoryService {
	public Category saveCategory(Category category);

	public List<Category> getAllCategory();
	
	public Boolean existCategory(String name);
	
	public Boolean deleteCategory(int id);
	
	public Category getCategoryById(int id);
	
	public List<Category> getAllActiveCategory();
	
}
