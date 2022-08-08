package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@RequestMapping("/mvc")
@Controller
public class WelcomeController {
	private ProductRepository repo;
	private ModelAndView mdlView;
	
	
    @Autowired
	public WelcomeController(ProductRepository repo, ModelAndView mdlView) {
		super();
		this.repo = repo;
		this.mdlView = mdlView;
	}

	@RequestMapping(value="/first",method = RequestMethod.GET)
	public String getFirstPage() {
		return "welcome";
	}
	
	@RequestMapping(value="/home",method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		
		List<Product>prdList = repo.findAll();
		//mdlView.addObject("msg","Mark List");
		//mdlView.addObject("branch","CS first year");
		//mdlView.setViewName("home");
		mdlView.addObject("list",prdList);
		mdlView.setViewName("home");
		
		return mdlView;
	}

}
