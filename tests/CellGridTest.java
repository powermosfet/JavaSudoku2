package com.liseth.javaSudoku2;

import static org.junit.Assert.*;

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
		SymbolSet sym = SymbolSet.std(StandardSizes.NINE);
		return new CellGrid(sym);
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
		Cell c = rows.get(3).get(5);
		assertSame(c, g.get(3, 5));
	}
}
