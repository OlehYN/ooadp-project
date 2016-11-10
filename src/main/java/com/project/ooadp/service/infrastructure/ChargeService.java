package com.project.ooadp.service.infrastructure;

import com.project.ooadp.bo.OrderChargeBo;
import com.project.ooadp.bo.PaymentBo;

public interface ChargeService {
	PaymentBo charge(OrderChargeBo orderBo);
}
