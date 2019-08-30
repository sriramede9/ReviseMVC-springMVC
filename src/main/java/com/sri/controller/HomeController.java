package com.sri.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sri.dao.EmploeedaoImpl;
import com.sri.dao.EmployeeDao;
import com.sri.data.Employeetwo;
import com.sri.service.EmployeeServiceImpl;

@Controller
public class HomeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@GetMapping("/hi")
	public String hello(Model model) {

		model.addAttribute("name", "Sri Ram Ede");

		Employeetwo emobj = new Employeetwo(1, "Sri Ram Ede", 2000);

		// add list

		List<Employeetwo> emlist = new ArrayList();
		emlist.add(emobj);
		emlist.add(new Employeetwo(2, "Sri", 3233));

		model.addAttribute("obj", emobj);

		model.addAttribute("elist", emlist);

		return "welcome";
	}

	@GetMapping("/f")
	public String getForm(Model model) {

		model.addAttribute("em", new Employeetwo());

		System.out.println(employeeServiceImpl.getAll());

		return "form";
	}

	@PostMapping("/r")
	public String formresponse(@ModelAttribute("em") Employeetwo emp) {

		System.out.println(emp);

		return "redirect:/hi";
	}
}
