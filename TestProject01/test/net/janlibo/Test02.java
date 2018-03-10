package net.janlibo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test02 {

	@Test
	public void test02Text() {
		try {
			Thread.sleep(20000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		assertTrue(true);
	}
	
}
