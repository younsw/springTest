package com.younsw.SpringQuiz.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/test01")
public class Test01 {
	
	@RequestMapping("/1")
	@ResponseBody
	public String printTest() {
		return "<h1>테스트 프로젝트 완성</h1> <h4>해당 프로젝트를 통해서 문제 풀이를 진행 합니다.</h4>";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Integer> scoreMap() {
		Map<String, Integer> score = new HashMap<>();
		
		score.put("국어", 80);
		score.put("영어", 85);
		score.put("수학", 90);
		
		return score;
	}

}
