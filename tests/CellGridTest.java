package com.liseth.javaSudoku2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
* Tests for {@link CellGrid}.
*
* @author asmundliseth@gmail.com (Asmund Liseth)
*/
@RunWith(JUnit4.class)
public class CellGridTest {

	@Test
	public void InitializeGrid() {
		char[] tokens = {'1','2','3','4','5','6','7','8','9'};
		CellGrid g = new CellGrid(tokens);
		assertEquals("Size", 9, g.GetSize());
	}
}
