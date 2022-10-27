package com.heekwoncompany.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(value = "/member")
	public String member() {
		
		return "member";
	}
	
	@RequestMapping(value = "/list")
	public String list() {
		
		return "list";
	}
	
	@RequestMapping(value = "/content")
	public String content() {
		
		return "board/content";
	}
	
	@RequestMapping(value = "/view")
	public String view(Model model) {
		
		model.addAttribute("name", "홍길동");
		
		return "board/view";
	}
}
