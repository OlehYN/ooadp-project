package com.project.ooadp.service.application;

import com.project.ooadp.bo.InvoiceCreateBo;
import com.project.ooadp.bo.InvoiceShowBo;
import com.project.ooadp.bo.OrderChargeBo;
import com.project.ooadp.dto.InvoiceShowDto;
import com.project.ooadp.entity.InvoiceEntity;

public interface InvoiceMapper {
	
	InvoiceShowBo toBo(InvoiceEntity invoiceEntity);
	
	InvoiceShowDto toDto(InvoiceShowBo invoiceShowBo);

	InvoiceCreateBo toBo(Long paymentId, OrderChargeBo orderChargeBo);

	InvoiceEntity toEntity(InvoiceCreateBo invoiceCreateBo);
}
