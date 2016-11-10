package com.project.ooadp.entity.proxy;

import com.project.ooadp.entity.OrderEntity;
import com.project.ooadp.entity.real.OrderReal;

public class OrderProxy implements OrderEntity{
	private OrderReal orderReal;
	
	private Long id;
}
