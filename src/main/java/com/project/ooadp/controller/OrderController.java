package com.project.ooadp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.ooadp.bo.InvoiceShowBo;
import com.project.ooadp.bo.OrderChargeBo;
import com.project.ooadp.bo.OrderCreateBo;
import com.project.ooadp.dto.OrderChargeDto;
import com.project.ooadp.dto.OrderCreateDto;
import com.project.ooadp.service.application.InvoiceMapper;
import com.project.ooadp.service.application.OrderMapper;
import com.project.ooadp.service.domain.ChargeManager;
import com.project.ooadp.service.infrastructure.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;

	@Autowired
	private OrderMapper orderMapper;
	
	@Autowired
	private InvoiceMapper invoiceMapper;

	@Autowired
	private ChargeManager chargeManager;

	@RequestMapping(value = "/createOrder", method = RequestMethod.GET)
	public ModelAndView createOrder(@ModelAttribute("orderCreateDto") OrderCreateDto orderCreateDto) {
		OrderCreateBo orderCreateBo = orderMapper.toBo(orderCreateDto);
		orderService.createOrder(orderCreateBo);

		// TODO catch exceptions, redirect
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/pay", method = RequestMethod.GET)
	public ModelAndView pay(@ModelAttribute("orderChargeDto") OrderChargeDto orderChargeDto) {
		OrderChargeBo orderChargeBo = orderMapper.toBo(orderChargeDto);
		InvoiceShowBo invoiceShowBo = chargeManager.charge(orderChargeBo);
		invoiceMapper.toDto(invoiceShowBo);
		
		// TODO catch exceptions, show invoicedto
		return new ModelAndView("home");
	}
}
