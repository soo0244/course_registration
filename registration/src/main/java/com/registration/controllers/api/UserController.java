package com.registration.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.registration.controller.AbstractController;
import com.registration.messages.APIResponse;
import com.registration.model.User;
import com.registration.services.UserService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController extends AbstractController{
	
	@Autowired
	private UserService userService;

//	@RequestMapping("/login")
//	public String login(@RequestParam(value = "id") String userId, @RequestParam(value = "pw") String pw)  {
//		
//		APIResponse rsp = null;
//		String url = "";
//		
//		log.debug("@@@ id - {}", userId);
//		log.debug("@@@ pw - {}", pw);
//		
//		User user = userService.getUser(userId);
//		if(user == null) {
//			log.error("Invalid ID");
//			return "redirect:login.html";
//		}
//		
//		log.debug("@@@ user - {}", user);
//		if(pw.equals(user.getPw())) {
//			rsp = new APIResponse(true, null, null);
//			url = "view";
//		} else {
//			rsp = new APIResponse(false, null, null);
//			url = "redirect:login.html";
//		}
//		
//		return url;
//	}
}
