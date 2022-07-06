package com.younsw.SpringQuiz.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.younsw.SpringQuiz.test.model.Borad;

@RestController 
public class Test02 {
	
//	@RequestMapping("/test02/1")
//	
//	public Map<String, Object> movieList() {
//		
//		List<String, Object> movieList = new HashMap<>();
//		
//		Map<String, Object> movie = new HashMap<>();
//		movie.put("rate", 15);
//		movie.put("director", "봉준호");
//		movie.put("time", "131");
//		movie.put("title", "기생충");
//		movieList.add(movie);
//		
//		movie = new HashMap<>();
//		movie.put("rate", 15);
//		movie.put("director", "봉준호");
//		movie.put("time", "131");
//		movie.put("title", "기생충");
//		movieList.add(movie);
//		
//		movie = new HashMap<>();
//		movie.put("rate", 15);
//		movie.put("director", "봉준호");
//		movie.put("time", "131");
//		movie.put("title", "기생충");
//		movieList.add(movie);
//		
//		return movieList;
//		
//	}
	
	@RequestMapping("/2")
	public List<Borad> boradList() {
		
		List<Borad> boradList = new ArrayList<>();
		
		Borad content = new Borad();
		content.setTitle("안녕하세요 가입인사 드립니다.");
		content.setUser("hagulu");
		content.setContent("안녕하세요. 가입했어욧 앞으로 잘 부탁드립니다.");
		boradList.add(content);
		
		content = new Borad();
		content.setTitle("오늘 데티아 한 이야기 해드릴께요");
		content.setUser("dulumary");
		content.setContent(".....");
		boradList.add(content);
		
		return boradList;
		
	}
	
//	public ResponseEntity<Borad> entity() {
//		
//		Borad content = new Borad();
//		content.setTitle("안녕하세요 가입인사 드립니다.");
//		content.setUser("hagulu");
//		content.setContent("안녕하세요. 가입했어욧 앞으로 잘 부탁드립니다.");
//		
//		ResponseEntity<Borad> entity = new ResponseEntity<>(content, HttpStatus, )
//	}

}
