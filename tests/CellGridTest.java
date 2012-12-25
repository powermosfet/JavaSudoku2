package com.liseth.javaSudoku2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.*;

/**
* Tests for {@link CellGrid}.
*
* @author asmundliseth@gmail.com (Asmund Liseth)
*/
@RunWith(JUnit4.class)
public class CellGridTest {
	private CellGrid stdGrid(){
		char[] tokens = {'1','2','3','4','5','6','7','8','9'};
		return new CellGrid(tokens);
	}

	@Test
	public void initializeGrid() {
		CellGrid g = stdGrid();
		assertEquals("Size", 9, g.size());
	}

	@Test
		public void rows(){
		CellGrid g = stdGrid();
		List<CellArray> rows = g.rows();
		assertEquals("NineRows", 9, rows.size());
		for(CellArray row : rows){
			assertEquals("NineElementsInRow", 9, row.size());
		}
	}
}
