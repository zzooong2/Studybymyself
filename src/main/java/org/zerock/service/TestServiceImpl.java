package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.TestVO;
import org.zerock.mapper.TestMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
/* 계층 구조상 주로 비즈니스 영역을 담당하는 객체임을 표시 */
@AllArgsConstructor
/* 모든 파라미터를 이용하는 생성자 만들어줌 */
public class TestServiceImpl implements TestService {
	
	@Setter(onMethod_ = @Autowired)
	private TestMapper mapper;
	
	@Override
	public List<TestVO> getList() {
		log.info("getlist...................");
		return mapper.getList();
	}
	
	@Override
	public TestVO get(int bno) {
		log.info("get........" + bno);
		return mapper.read(bno);
	}
	
	@Override
	public int modify(int bno) {
		log.info("modify........" + bno);
		return mapper.update(bno);
	}
	
	@Override
	public int remove(int bno) {
		log.info("remove........" + bno);
		return mapper.delete(bno);
	}
	

}
