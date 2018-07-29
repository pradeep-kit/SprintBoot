package com.deep.arya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.deep.arya.model.User;
import com.deep.arya.service.UserSerivce;

@Controller
public class UserController {
	
	@Autowired
	UserSerivce userservie;
	
	@RequestMapping("/home")
	public String getUserDetais() {
		return "Home";
		
	}
	
	@RequestMapping("/showuser")
	ModelAndView showuser(@RequestParam("firstName")String fname,@RequestParam("lastName")String lname){
		ModelAndView mv=new ModelAndView("userdetails");
		mv.addObject("users",userservie.getAllUser());
		/*User u=new User();
		u.setFirstName(fname);
		u.setLastName(lname);		
		mv.addObject("user", u);*/
		
		//mv.addObject("lname", lname);
		System.out.println(mv.getModel().get("users"));
		return mv;
	}
}
