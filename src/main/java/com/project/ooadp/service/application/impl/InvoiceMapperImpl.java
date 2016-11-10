package com.project.ooadp.service.application.impl;

import org.springframework.stereotype.Service;

import com.project.ooadp.bo.InvoiceCreateBo;
import com.project.ooadp.bo.InvoiceShowBo;
import com.project.ooadp.bo.OrderChargeBo;
import com.project.ooadp.dto.InvoiceShowDto;
import com.project.ooadp.entity.InvoiceEntity;
import com.project.ooadp.service.application.InvoiceMapper;

@Service
public class InvoiceMapperImpl implements InvoiceMapper{

	@Override
	public InvoiceShowBo toBo(InvoiceEntity invoiceEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InvoiceShowDto toDto(InvoiceShowBo invoiceShowBo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InvoiceCreateBo toBo(Long paymentId, OrderChargeBo orderChargeBo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InvoiceEntity toEntity(InvoiceCreateBo invoiceCreateBo) {
		// TODO Auto-generated method stub
		return null;
	}

}
