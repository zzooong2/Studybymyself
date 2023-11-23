package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.TestVO;

public interface TestMapper {
	
	// @Select ("select * from system.TEST")
	public List<TestVO> getList();

}
