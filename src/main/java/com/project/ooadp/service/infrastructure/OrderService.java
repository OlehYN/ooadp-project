package com.project.ooadp.service.infrastructure;

import com.project.ooadp.bo.OrderCreateBo;

public interface OrderService {
	Long createOrder(OrderCreateBo orderCreateBo);
}
