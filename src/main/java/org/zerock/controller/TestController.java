package org.zerock.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.TestVO;
import org.zerock.service.TestService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
/* 스프링의 빈으로 인식할 수 있게 어노테이션 처리 */
@Log4j
@RequestMapping("/member/*")
@AllArgsConstructor
public class TestController {
	

	private TestService service;

	
	@GetMapping("/list")
	public void list(Model model) {
		
		List<TestVO> testVO = service.getList();

		
		log.info("list!!!!");
		
		model.addAttribute("list",service.getList());
	
		
	}

}
