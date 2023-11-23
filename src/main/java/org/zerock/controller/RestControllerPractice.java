package org.zerock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.TestVO;

@RestController
public class RestControllerPractice {
	
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
	

}
