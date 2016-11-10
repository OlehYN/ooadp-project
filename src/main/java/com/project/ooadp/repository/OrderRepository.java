package com.project.ooadp.repository;

import com.project.ooadp.entity.OrderEntity;

public interface OrderRepository {
	Long createOrder(OrderEntity orderEntity);
}
