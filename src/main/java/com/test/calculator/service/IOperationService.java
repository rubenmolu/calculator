package com.test.calculator.service;

import com.test.calculator.exception.CalculatorException;

/**
 * 
 * Interface Service IoperationService
 * 
 * @author rubenmolu
 *
 */
public interface IOperationService {

	/**
	 * Method for sum numbers.
	 * 
	 * @param num1 Double
	 * @param num2 Double
	 * @return Double
	 * @throws CalculatorException
	 */
	Double getSumService(Double num1, Double num2) throws CalculatorException;

	/**
	 * Method for subtracting numbers.
	 * 
	 * @param num1 Double
	 * @param num2 Double
	 * @return Double
	 * @throws CalculatorException
	 */
	Double getSubtractService(Double num1, Double num2) throws CalculatorException;

}
