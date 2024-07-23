package com.ecommerceWeb.service;

import java.util.List;

import com.ecommerceWeb.entity.OrderRequest;
import com.ecommerceWeb.entity.ProductOrder;

public interface OrderService {

	public void saveOrder(Integer userid,OrderRequest orderRequest);
	
	public List<ProductOrder> getOrdersByUser(Integer userId);
	
	public Boolean updateOrderStatus(Integer id,String status);

	public List<ProductOrder> getAllOrders();

}