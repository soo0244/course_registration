package com.registration.controllers.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
//    @ResponseBody
    public String index() {
		return "login";
    }

    @RequestMapping("/viewTest")
    public String viewTest(Model model){
        model.addAttribute("message","Hello Spring Boot thymeleaf");
        return "view";
    }

}
