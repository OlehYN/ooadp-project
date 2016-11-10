package com.project.ooadp.service.domain.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ooadp.bo.InvoiceCreateBo;
import com.project.ooadp.bo.InvoiceShowBo;
import com.project.ooadp.bo.OrderChargeBo;
import com.project.ooadp.bo.PaymentBo;
import com.project.ooadp.service.application.InvoiceMapper;
import com.project.ooadp.service.domain.ChargeManager;
import com.project.ooadp.service.infrastructure.ChargeService;
import com.project.ooadp.service.infrastructure.InvoiceService;
import com.project.ooadp.service.infrastructure.PaymentService;

@Service
public class ChargeManagerImpl implements ChargeManager{
	
	@Autowired
	private InvoiceMapper invoiceMapper;
	
	@Autowired
	private ChargeService chargeService;
	
	@Autowired
	private PaymentService paymentService;
	
	@Autowired
	private InvoiceService invoiceService;

	@Override
	public InvoiceShowBo charge(OrderChargeBo orderChargeBo) {
		PaymentBo paymentBo = chargeService.charge(orderChargeBo);
		Long paymentId = paymentService.createPayment(paymentBo);
		InvoiceCreateBo invoiceCreateBo = invoiceMapper.toBo(paymentId, orderChargeBo);
		Long invoiceId = invoiceService.createInvoice(invoiceCreateBo);
		InvoiceShowBo invoiceShowBo = invoiceService.getById(invoiceId);
		
		return invoiceShowBo;
	}

}
