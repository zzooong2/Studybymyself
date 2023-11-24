package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.TestVO;
import org.zerock.service.TestService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class RestControllerPractice {
	
	@GetMapping("/member/page")
	public String list(Model model) {
		
		log.info("페이지 출력");
		
		model.addAttribute("list",service.getList());
		
		return "/member/test";
	}
	
	@ResponseBody
	@RequestMapping(value = "/member/data")
	public List<TestVO> getData(){
		
		log.info("데이터 출력");
		
		return service.getList();
		
	}
	
	
	
	
	@Autowired
	TestService service;
	
	@GetMapping("/member")
	public TestVO getTest() {
		
		TestVO vo = new TestVO();
		vo.setAge(30);
		vo.setName("김현중");
		
		return vo;
			
	}
	

}
