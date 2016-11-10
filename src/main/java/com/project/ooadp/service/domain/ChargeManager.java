package com.project.ooadp.service.domain;

import com.project.ooadp.bo.InvoiceShowBo;
import com.project.ooadp.bo.OrderChargeBo;

public interface ChargeManager {
	InvoiceShowBo charge(OrderChargeBo orderChargeBo);
}
