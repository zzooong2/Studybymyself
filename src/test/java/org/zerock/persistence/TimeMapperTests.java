package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
/* 이 테스트 코드가 스프링을 대신할것이라는 어노테이션 */

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
/* root-context.xml파일 경로를 지정하여 스프링내에 빈 객체를 등록 */

@Log4j
/* lombok을 이용하여 로그를 기록하는 Logger를 변수로 생성 */
/* spring legacy project로 생성하는 경우 기본으로 설정 완료됨 */
public class TimeMapperTests {

	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	
	/* 스프링이 인터페이스를 이용하여 객체를 생성 */
	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());
	}
	
	@Test
	public void testGetTime2() {
		log.info("getTime2");
		log.info(timeMapper.getTime2());
	}
	
}
