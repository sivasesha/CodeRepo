package com.nit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class AppTest {
   
	@Test
	public void testWithSamllValues() {
		double x=7000.0;
		double y=8000.0;
		Arthimeatic arthimeatic=new Arthimeatic();
		double result=arthimeatic.sum(x, y);
		double expected=15000.0;
		System.out.println("Expected Result::"+expected);
		System.out.println("Actual Result::"+result);
		assertEquals(expected, result);
		
	}
	
	
	
    
}
