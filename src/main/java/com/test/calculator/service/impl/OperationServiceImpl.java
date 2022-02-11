package com.test.calculator.service.impl;

import org.springframework.stereotype.Service;

import com.test.calculator.service.IOperationService;

/**
 * Implementation Service IOperationService
 * 
 * @author Ruben Moral Lunar
 *
 */
@Service
public class OperationServiceImpl implements IOperationService {

	@Override
	public Double getSumService(Double num1, Double num2) {
		Double result = num1 + num2;
		return result;

	}

	@Override
	public Double getSubtractService(Double num1, Double num2) {
		Double result = num1 - num2;
		return result;

	}

}
