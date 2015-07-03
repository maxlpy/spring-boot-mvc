package com.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
    public String index(Model model) {
		model.addAttribute("name", "Max");
        return "welcome";
    }
}
