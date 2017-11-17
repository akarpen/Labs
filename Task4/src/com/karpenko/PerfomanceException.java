package com.karpenko;

public class PerfomanceException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private double number;

	public PerfomanceException(String message, double number) {
		super(message);
		this.number=number;
	}
	public double getNumber() {
		return this.number;
	}
	

}
