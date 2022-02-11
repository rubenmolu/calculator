package com.test.calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.calculator.dto.ResultOperationDto;
import com.test.calculator.service.IOperationService;
import com.test.calculator.utilities.Constant;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

	private final IOperationService iOperationService;

	CalculatorController(IOperationService iOperationService) {
		this.iOperationService = iOperationService;
	}

	@GetMapping(Constant.OPERATIONSUM)
	public ResponseEntity<ResultOperationDto> getSum(@RequestParam Double num1, @RequestParam Double num2) {
		ResultOperationDto responseSum = new ResultOperationDto(iOperationService.getSumService(num1, num2));
		return new ResponseEntity<>(responseSum, HttpStatus.OK);
	}

	@GetMapping(Constant.OPERATIONSUBTRACT)
	public ResponseEntity<ResultOperationDto> getSubtract(@RequestParam Double num1, @RequestParam Double num2) {
		ResultOperationDto responseSubtract = new ResultOperationDto(iOperationService.getSubtractService(num1, num2));
		return new ResponseEntity<>(responseSubtract, HttpStatus.OK);
	}

}
