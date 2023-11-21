package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller

@RequestMapping("/sample/*")
/* 현재 클래스의 모든 메서드들의 기본적인 URL경로가 됨 */
@Log4j
public class SampleController {
	
	@RequestMapping("")
	public void basic() {
		log.info("basic...............");
	}

}
