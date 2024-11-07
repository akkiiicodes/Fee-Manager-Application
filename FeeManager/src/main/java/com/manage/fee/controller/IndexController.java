package com.manage.fee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manage.fee.service.FeesPaidService;

@Controller
public class IndexController {

	private FeesPaidService feesPaidService;

	public IndexController(FeesPaidService feesPaidService) {
		super();
		this.feesPaidService = feesPaidService;
	}

	@GetMapping(path = { "/index", "/" })
	public String index(Model model, @RequestParam(name = "page", defaultValue = "1") int page,
			@RequestParam(name = "size", defaultValue = "3") int size) {
		model.addAttribute("payments", feesPaidService.getAllFeesPaidPageable(page, size));

		return "index";
	}

	@GetMapping("/login")
	public String login() {

		return "login";
	}

	@GetMapping("/contact")
	public String contactPage(Model model) {
		model.addAttribute("contact", "help@feemanager.com");
		return "contact";
	}

	@GetMapping("/about")
	public String aboutPage(Model model) {

		return "about";
	}
}
