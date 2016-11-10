package com.project.ooadp.repository;

import com.project.ooadp.entity.InvoiceEntity;

public interface InvoiceRepository {

	Long createInvoice(InvoiceEntity invoiceEntity);

	InvoiceEntity getById(Long invoiceId);

}
