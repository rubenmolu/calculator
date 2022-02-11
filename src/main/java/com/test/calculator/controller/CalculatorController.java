package com.test.calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.calculator.dto.ResultOperationDto;
import com.test.calculator.exception.CalculatorException;
import com.test.calculator.service.IOperationService;
import com.test.calculator.utilities.Constant;

import io.corp.calculator.TracerImpl;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

	private final IOperationService iOperationService;
	private final TracerImpl tracer;

	CalculatorController(IOperationService iOperationService, TracerImpl tracer) {
		this.iOperationService = iOperationService;
		this.tracer = tracer;
	}

	@GetMapping(Constant.OPERATIONSUM)
	public ResponseEntity<ResultOperationDto> getSum(@RequestParam Double num1, @RequestParam Double num2) throws CalculatorException {
		tracer.trace("INIT - method Rest getSum()");
		ResultOperationDto responseSum = new ResultOperationDto(iOperationService.getSumService(num1, num2));
		tracer.trace("END - method Rest getSum()");
		return new ResponseEntity<>(responseSum, HttpStatus.OK);
	}

	@GetMapping(Constant.OPERATIONSUBTRACT)
	public ResponseEntity<ResultOperationDto> getSubtract(@RequestParam Double num1, @RequestParam Double num2) throws CalculatorException {
		tracer.trace("INIT: method Rest getSubtract()");
		ResultOperationDto responseSubtract = new ResultOperationDto(iOperationService.getSubtractService(num1, num2));
		tracer.trace("END: method Rest getSubtract()");
		return new ResponseEntity<>(responseSubtract, HttpStatus.OK);
	}

}
