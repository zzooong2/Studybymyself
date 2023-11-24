package org.zerock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.service.TestService;

import lombok.extern.log4j.Log4j;

@Controller
/* 스프링의 빈으로 인식할 수 있게 어노테이션 처리 */
@Log4j
@RequestMapping("/member/*")
public class TestController {
	
    @Autowired
	private TestService service;

	
	@GetMapping("/listt")
	public String list(Model model) {
		
		log.info(service.getList());
		
		model.addAttribute("list",service.getList());
		
		return "/member/test";
	
	
		
	}

}
