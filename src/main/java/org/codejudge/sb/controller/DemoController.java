package org.codejudge.sb.controller;

import org.codejudge.sb.entity.Input;
import org.codejudge.sb.entity.Sum;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

	@PostMapping("/add")
	public Sum add(@RequestBody Input input) {
		int sum = input.getNumber1() + input.getNumber2();
		Sum sumObj = new Sum();
		sumObj.setSum(sum);
		return sumObj;
	}
	
}
