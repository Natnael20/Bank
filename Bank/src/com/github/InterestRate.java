package com.github;

/*
 *  this is the formula to calcualte the interest rate;
 *  r = ((A - p / p) x 1 / T)
 * 
 */

public class InterestRate {
	
	//the loan amount
	private double initialPrincipal;
	//This is the total amount after interest 
	//has been added. It includes 
	//the principal and any interest earned or paid
	private double finalAmount;
	
	//time period or duration
	private int timePeriod;
	
	public InterestRate(double principle, double amount, int years) {
		this.initialPrincipal = principle;
		this.finalAmount = amount;
		this.timePeriod = years;
	}

	protected double getInitialPrincipal() {
		return initialPrincipal;
	}

	protected void setInitialPrincipal(double initialPrincipal) {
		this.initialPrincipal = initialPrincipal;
	}

	protected double getFinalAmount() {
		return finalAmount;
	}

	protected void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	protected int getTimePeriod() {
		return timePeriod;
	}

	protected void setTimePeriod(int timePeriod) {
		this.timePeriod = timePeriod;
	}
	
	public void calculate(double amount, double finalamount, int years) {
		
		double loan = (finalAmount - amount) / amount;
		double time = 1 / years;
		
		double rate = loan * time;
		
		System.out.println("The interest rate for the desired loan is " + rate);
		
	}
}