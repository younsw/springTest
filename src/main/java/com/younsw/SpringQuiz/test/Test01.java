package com.younsw.SpringQuiz.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01 {
	
	@RequestMapping("/lesson01/test01/1")
	@ResponseBody
	public String printTest() {
		return "테스트 프로젝트 완성 해당 프로젝트를 통해서 문제 풀이를 진행 합니다.";
	}

}
