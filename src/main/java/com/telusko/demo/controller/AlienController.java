package com.telusko.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.dao.EntityDO;
import com.telusko.demo.model.Alien;

@Controller
public class AlienController {
//	@Autowired
//	AlienRepo repo;// git check asd 
	
	@Autowired
	EntityDO entDO;
	
	@GetMapping("/")
	// @ResponseBody
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

	@GetMapping("/addEntity")
	public ModelAndView addEntity() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addEntity");
		return mv;
	}
	
	@RequestMapping("/saveEntity")
	public ModelAndView saveEntity(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("entityDetails");
		Alien entityStatus = entDO.save(alien);
		mv.addObject("ent" , entityStatus);
		return mv;
	}
	
	@GetMapping("/findEntity")
	public ModelAndView findEntity() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("findEntity");
		return mv;
	}
	
	@GetMapping("/entityDetails")
	public ModelAndView entityDetails(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("entityDetails");
		Alien ent = entDO.getNameById(alien.getAid());
		mv.addObject("ent" , ent);
		return mv;
	}
}
