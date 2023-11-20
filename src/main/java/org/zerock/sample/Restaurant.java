package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
/* Component -> 스프링에게 해당 클래스가 스프링에서 관리해야하는 대상임을표시하는 어노테이션 */
@Data
public class Restaurant {
	
	@Setter(onMethod_ = @Autowired)
	/* Setter -> setChef()를 컴파일하면 자동으로 생성함. */
	private Chef chef;

}
