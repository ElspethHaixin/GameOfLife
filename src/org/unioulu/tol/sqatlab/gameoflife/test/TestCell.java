package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCell {

	@Test
	public void testCellState() {
		Cell c = new Cell("*");
		assertEquals("*", c.state);
	}

}
