package com.project.ooadp.service.infrastructure.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ooadp.bo.InvoiceCreateBo;
import com.project.ooadp.bo.InvoiceShowBo;
import com.project.ooadp.entity.InvoiceEntity;
import com.project.ooadp.repository.InvoiceRepository;
import com.project.ooadp.service.application.InvoiceMapper;
import com.project.ooadp.service.infrastructure.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService{

	@Autowired
	private InvoiceMapper invoiceMapper;
	
	@Autowired
	private InvoiceRepository invoiceRepository;

	@Override
	public Long createInvoice(InvoiceCreateBo invoiceCreateBo) {
		InvoiceEntity invoiceEntity = invoiceMapper.toEntity(invoiceCreateBo);
		return invoiceRepository.createInvoice(invoiceEntity);
	}

	@Override
	public InvoiceShowBo getById(Long invoiceId) {
		InvoiceEntity invoiceEntity = invoiceRepository.getById(invoiceId);
		return invoiceMapper.toBo(invoiceEntity);
	}

}
