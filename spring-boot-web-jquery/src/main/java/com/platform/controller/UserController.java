package com.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.platform.entity.User;
import com.platform.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping(value = "userList", method = RequestMethod.GET)
	public String messages(Model model) {
	    model.addAttribute("messages", userRepository.findAll());
	    return "index";
	}
	
	@RequestMapping(value="getUsers", method=RequestMethod.GET) 
	@ResponseBody
	public List<User> getUser() {
		return (List<User>) userRepository.findAll();
	}
}
