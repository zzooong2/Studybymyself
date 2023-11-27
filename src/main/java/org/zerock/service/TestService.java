package org.zerock.service;

import java.util.List;

import org.zerock.domain.TestVO;

public interface TestService {
	
	public List<TestVO> getList();
	
	public int remove(int bno);
	
	public int modify(TestVO test);
	
	public TestVO get(int bno);

}
