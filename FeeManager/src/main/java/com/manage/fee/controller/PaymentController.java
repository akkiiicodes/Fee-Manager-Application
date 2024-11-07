package com.manage.fee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manage.fee.service.FeesPaidService;

@Controller
public class PaymentController {

	private FeesPaidService feesPaidService;

	public PaymentController(FeesPaidService feesPaidService) {
		super();
		this.feesPaidService = feesPaidService;
	}
	
	@GetMapping("/payments")
	public String getPayments(Model model, @RequestParam(name = "page", defaultValue = "1") int page,
			@RequestParam(name = "size", defaultValue = "3") int size) {
		model.addAttribute("payments", feesPaidService.getAllFeesPaidPageable(page, size));
		
		return "payments";
	}
}
