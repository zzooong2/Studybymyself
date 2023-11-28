package org.zerock.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.TestVO;
import org.zerock.service.TestService;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/practice/*")
public class PracticeController {
	
	@Autowired
	TestService service;
	
	@GetMapping("hellow")
	public String hellow() {
		String hw = "hewllow world!";
		
		return hw;
	}
	
	@RequestMapping(value = "/list")
	public List<TestVO> getData() {
		log.info("list.............");
		return service.getList();
	}
	
	@RequestMapping(value = "/get")
	public TestVO read(int bno) {
		log.info("get.....!!!" + bno);
		return service.get(bno);
	}
	
	@RequestMapping(value = "/remove")
	public Integer delete(int bno) {
		return service.remove(bno);
	}
	
	
	
	
}
