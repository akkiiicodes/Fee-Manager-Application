package com.manage.fee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.manage.fee.service.FeesService;

@Controller
public class FeesController {

	private FeesService feesService;

	public FeesController(FeesService feesService) {
		super();
		this.feesService = feesService;
	}
	
	@GetMapping("/fees")
	public String getFees(Model model) {
		model.addAttribute("fees", feesService.getAllFees());
		
		return "payments";
	}
}
