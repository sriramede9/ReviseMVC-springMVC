package com.sri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sri.dao.ImagedaoImpl;
import com.sri.data.Image;

@Controller
public class ImageController {

	@Autowired
	ImagedaoImpl imagedaoImpl;

	@GetMapping("/i")
	public String himama(Model model) {

		// Image imgobj = new Image();

		model.addAttribute("iob", new Image());

		return "ifor";
	}

	@PostMapping("/re")
	public String responseis(@ModelAttribute("iob") Image imgobj) {

		System.out.println(imgobj);

		imagedaoImpl.save(imgobj);

		return "redirect:/i";
	}
}
