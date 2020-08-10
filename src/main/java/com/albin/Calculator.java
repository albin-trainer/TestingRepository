package com.albin;

public class Calculator {
	CalculatorService service;
	
public Calculator(CalculatorService service) {
		super();
		this.service = service;
	}

public int compute(int i,int j) {
	System.out.println("Compute method getting called ...");
	//return (i+j)*2;  //Test shud fail since service is not called by verify method
	return service.add(i,j) *2;
}
}
