package com.project.ooadp.service.application.impl;

import org.springframework.stereotype.Service;

import com.project.ooadp.bo.OrderChargeBo;
import com.project.ooadp.bo.OrderCreateBo;
import com.project.ooadp.bo.OrderShowBo;
import com.project.ooadp.dto.OrderChargeDto;
import com.project.ooadp.dto.OrderCreateDto;
import com.project.ooadp.dto.OrderShowDto;
import com.project.ooadp.entity.OrderEntity;
import com.project.ooadp.service.application.OrderMapper;

@Service
public class OrderMapperImpl implements OrderMapper{

	@Override
	public OrderCreateBo toBo(OrderCreateDto orderCreateDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderShowBo toBo(OrderShowDto orderShowDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderChargeBo toBo(OrderChargeDto orderChargeDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderEntity toEntity(OrderCreateBo orderCreateBo) {
		// TODO Auto-generated method stub
		return null;
	}

}
