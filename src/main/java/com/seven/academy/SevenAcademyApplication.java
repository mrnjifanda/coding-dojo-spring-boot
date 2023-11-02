package com.seven.academy;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SevenAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SevenAcademyApplication.class, args);
	}

	@RequestMapping("/")
	public String index(Model model) {
	
		model.addAttribute("title", "Home | Seven Academy");
		return "index.jsp";
	}
	
	@RequestMapping("/about-us")
	public String aboutUs(Model model) {
	
		model.addAttribute("title", "About us | Seven Academy");
		return "about-us.jsp";
	}

	@RequestMapping("/students")
	public String students(Model model) {

		ArrayList<String> students = new ArrayList<String>();
		students.add("Seven Academy");
		students.add("Coding Dojo");
		students.add("Google");
		students.add("Deido boy");
		
		HashMap<String, String> appareils = new HashMap<String, String>();
		appareils.put("name", "Tv");
		appareils.put("name", "Radio");

		model.addAttribute("title", "Students | Seven Academy");
		model.addAttribute("students", students);
		return "students.jsp";
	}
}
