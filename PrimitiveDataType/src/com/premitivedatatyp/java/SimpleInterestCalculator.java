package com.premitivedatatyp.java;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principal;
	BigDecimal intrest;
		
	public SimpleInterestCalculator(String principal, String intrest) {

		this.principal = new BigDecimal(principal);
		BigDecimal divide = new BigDecimal("100");
		this.intrest = new BigDecimal(intrest).divide(divide);
				
	}

	public BigDecimal calculateTotalValue(int time) {
		// TODO Auto-generated method stub
		BigDecimal yrs = new BigDecimal(time);
		
		BigDecimal totalValue = principal.add(
									principal.multiply(yrs));
		return totalValue;
	}

	
}
