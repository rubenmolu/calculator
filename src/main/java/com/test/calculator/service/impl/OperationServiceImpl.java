package com.test.calculator.service.impl;

import org.springframework.stereotype.Service;

import com.test.calculator.exception.CalculatorException;
import com.test.calculator.service.IOperationService;

import io.corp.calculator.TracerImpl;

/**
 * Implementation Service IOperationService
 * 
 * @author rubenmolu
 *
 */
@Service
public class OperationServiceImpl implements IOperationService {

	private final TracerImpl tracer;

	public OperationServiceImpl(TracerImpl tracer) {
		this.tracer = tracer;
	}

	@Override
	public Double getSumService(Double num1, Double num2) throws CalculatorException {
		try {
			tracer.trace("INIT - method Service getSumService()");
			Double result = num1 + num2;
			tracer.trace(result);
			tracer.trace("END - method Service getSumService()");
			return result;
		} catch (Exception ex) {
			tracer.trace("Error: " + ex.getMessage());
			throw new CalculatorException("Error in the argument");
		}
	}

	@Override
	public Double getSubtractService(Double num1, Double num2) throws CalculatorException {
		try {
			tracer.trace("INIT - method Service getSubtractService()");
			Double result = num1 - num2;
			tracer.trace(result);
			tracer.trace("END - method Service getSubtractService()");
			return result;
		} catch (Exception ex) {
			tracer.trace("Error: " + ex.getMessage());
			throw new CalculatorException("Error in the argument");
		}
	}

}
