package net.janlibo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ToJeTest {
	
	@Test
	public void testNumber() {
		Trida01 t = new Trida01();
		assertTrue(t.returnNumber() == 1);
	}
	
	@Test
	public void testText() {
		assertTrue(false);
	}

}
