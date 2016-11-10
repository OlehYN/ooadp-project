package com.project.ooadp.service.application;

import com.project.ooadp.bo.OrderChargeBo;
import com.project.ooadp.bo.OrderCreateBo;
import com.project.ooadp.bo.OrderShowBo;
import com.project.ooadp.dto.OrderChargeDto;
import com.project.ooadp.dto.OrderCreateDto;
import com.project.ooadp.dto.OrderShowDto;
import com.project.ooadp.entity.OrderEntity;

public interface OrderMapper {
	OrderCreateBo toBo(OrderCreateDto orderCreateDto);
	OrderShowBo toBo(OrderShowDto orderShowDto);
	OrderChargeBo toBo(OrderChargeDto orderChargeDto);
	
	OrderEntity toEntity(OrderCreateBo orderCreateBo);
	
}
