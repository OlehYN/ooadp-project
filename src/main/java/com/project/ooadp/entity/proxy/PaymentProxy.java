package com.project.ooadp.entity.proxy;

import com.project.ooadp.entity.PaymentEntity;
import com.project.ooadp.entity.real.PaymentReal;

public class PaymentProxy implements PaymentEntity{
	private PaymentReal paymentReal;
	
	private Long id;
}
