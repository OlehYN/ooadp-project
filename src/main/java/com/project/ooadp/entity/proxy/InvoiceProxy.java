package com.project.ooadp.entity.proxy;

import com.project.ooadp.entity.InvoiceEntity;
import com.project.ooadp.entity.real.InvoiceReal;

public class InvoiceProxy implements InvoiceEntity{
	private InvoiceReal invoiceReal;
	
	private Long id;
}
