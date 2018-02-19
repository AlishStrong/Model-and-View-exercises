package com.example.ModelViewExercises.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendList {
	
	ArrayList<String> fList = new ArrayList<String>();
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String friendList(@RequestParam(name="name", required=false) String name, Model model) {
		
		if (!name.equals(null)) {
			fList.add(name);
		}
		
		model.addAttribute("list", fList);
		return "index";
	}
}
