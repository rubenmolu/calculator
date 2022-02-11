package com.test.calculator.service;

/**
 * 
 * Interface Service IoperationService
 * 
 * @author Ruben Moral Lunar
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
	Double getSumService(Double num1, Double num2);

	/**
	 * Method for subtracting numbers.
	 * 
	 * @param num1 Double
	 * @param num2 Double
	 * @return Double
	 * @throws CalculatorException
	 */
	Double getSubtractService(Double num1, Double num2);

}
