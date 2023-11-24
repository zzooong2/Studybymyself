package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.TestVO;
import org.zerock.service.TestService;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
public class RestControllerPractice {
	
	@Autowired
	TestService service;
	
	@GetMapping("/member")
	public TestVO getTest() {
		
		TestVO vo = new TestVO();
		vo.setAge(30);
		vo.setName("김현중");
		
		return vo;
			
	}
	
	@GetMapping("/test/hw")
	public String helloWorld() {
		String hw = new String("Hello World!!");
		
		hw.toString();
		
		return hw;
	}
	
	@RequestMapping(value = "/member/list")
	public List<TestVO> testList(){
		
		return service.getList();
		
	}

}
