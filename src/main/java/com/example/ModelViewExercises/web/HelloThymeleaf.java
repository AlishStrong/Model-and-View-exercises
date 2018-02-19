package com.example.ModelViewExercises.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloThymeleaf {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String nameAge(@RequestParam(name="name") String name, @RequestParam(name="age") int age, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}
   
}
