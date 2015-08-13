package csd.chennai;

import junit.framework.TestCase;

public class TestRpn extends TestCase{
	public void testCase1()
	{
		RPNcalc calc = new RPNcalc();
		assertEquals(5, calc.Calculate("3 2 +"));
	}

}
