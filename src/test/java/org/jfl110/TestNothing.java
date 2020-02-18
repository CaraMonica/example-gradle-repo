package org.jfl110;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test to test the tests.
 * 
 * @author jim
 *
 */
public class TestNothing {

	@Test
	public void testNothing() {
		assertTrue(true);
	}
	@Test
	public void testSomething() {
		Assert.assertEquals("a", "a");
	}

}
