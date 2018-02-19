package com.example.ModelViewExercises.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.ModelViewExercises.domain.Student;

@Controller
public class HandlingLists {
	@RequestMapping(value="/hello2", method=RequestMethod.GET)
	public String studentList(Model model) {
		
		Student alisher = new Student("Alisher", "Aliev", "alisher@student.fi");
		Student madina = new Student("Madina", "Alieva", "madina@student.sw");
		Student akmal = new Student("Akmal", "Aliev", "akmal@student.uz");
		
		ArrayList<Student> sList = new ArrayList<Student>();
		sList.add(alisher);
		sList.add(akmal);
		sList.add(madina);
		
		//System.out.println(sList.get(0).getFirstName());
		
		model.addAttribute("students", sList);
		
		return "hello2";
	}
}
