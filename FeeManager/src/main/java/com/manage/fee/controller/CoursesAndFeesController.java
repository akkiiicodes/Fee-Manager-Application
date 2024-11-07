package com.manage.fee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.manage.fee.service.FeesService;

@Controller
public class CoursesAndFeesController {

	private FeesService feesService;

	public CoursesAndFeesController(FeesService feesService) {
		super();
		this.feesService = feesService;
	}
	
	@GetMapping("/courses-and-fees")
	public String getFees(Model model) {
		model.addAttribute("fees", feesService.getAllFees());
		
		return "courses-and-fees";
	}
}
