package net.slipp;

import junit.framework.TestCase;
public class CalTest extends TestCase {
	public void testAdd() throws Exception{
		Calculator cal = new Calculator();
		assertEquals(3, cal.add(1,2));
	}

}
