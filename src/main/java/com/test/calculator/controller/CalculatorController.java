package com.test.calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {

	public ResponseEntity<Object> getSum(@RequestParam Double num1, @RequestParam Double num2){
		return null;
	}
	
	public ResponseEntity<Object> getSubtract(@RequestParam Double num1, @RequestParam Double num2) {
		return null;
	}
	
}
