package com.hasan.thymeleafdemo.Controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class thymeleafController {

	
	@GetMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("theDate",java.time.LocalDateTime.now());
		return "hellothymeleaf";
	}
}
