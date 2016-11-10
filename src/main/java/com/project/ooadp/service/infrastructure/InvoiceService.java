package com.project.ooadp.service.infrastructure;

import com.project.ooadp.bo.InvoiceCreateBo;
import com.project.ooadp.bo.InvoiceShowBo;

public interface InvoiceService {

	Long createInvoice(InvoiceCreateBo invoiceCreateBo);

	InvoiceShowBo getById(Long invoiceId);

}
