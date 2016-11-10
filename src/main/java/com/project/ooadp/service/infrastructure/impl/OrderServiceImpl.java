package com.project.ooadp.service.infrastructure.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ooadp.bo.OrderCreateBo;
import com.project.ooadp.entity.OrderEntity;
import com.project.ooadp.repository.OrderRepository;
import com.project.ooadp.service.application.OrderMapper;
import com.project.ooadp.service.infrastructure.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public Long createOrder(OrderCreateBo orderCreateBo) {
		OrderEntity orderEntity = orderMapper.toEntity(orderCreateBo);
		return orderRepository.createOrder(orderEntity);
	}

}
