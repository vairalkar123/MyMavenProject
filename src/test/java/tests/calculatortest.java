package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import app.calculator;

public class calculatortest {

	@Test
	public void testadd() {
		int a=20;
		int b=30;
		int expres=50;
		int actres=calculator.add(a,b);
		assertEquals(expres, actres);
		
	}
	
	@Test
	public void testsub() {
		int a=50;
		int b=30;
		int expres=20;
		int actres=calculator.sub(a,b);
		assertEquals(expres, actres);
		
	}

	@Test
	public void testmul() {
		int a=5;
		int b=3;
		int expres=15;
		int actres=calculator.mul(a,b);
		assertEquals(expres, actres);
		
	}

	@Test
	public void testdiv() {
		int a=6;
		int b=2;
		int expres=3;
		int actres=calculator.div(a,b);
		assertEquals(expres, actres);
		
	}
	@Test
	public void testmod() {
		int a=6;
		int b=2;
		int expres=0;
		int actres=calculator.mod(a,b);
		assertEquals(expres, actres);
		
	}
}
