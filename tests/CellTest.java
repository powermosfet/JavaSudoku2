package com.liseth.javaSudoku2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.*;

/**
* Tests for {@link Cell}.
*
* @author asmundliseth@gmail.com (Asmund Liseth)
*/
@RunWith(JUnit4.class)
public class CellTest {
	@Test
	public void rowReferenceMatches(){
		CellGrid g = Std.grid();
		List<CellArray> rows = g.rows();
		assertSame(rows.get(4), g.get(4, 2).row());
	}

	@Test
	public void columnReferenceMatches(){
		CellGrid g = Std.grid();
		List<CellArray> columns = g.columns();
		assertSame(columns.get(2), g.get(4, 2).column());
	}

	@Test
	public void friends(){
		CellGrid g = Std.grid();
		List<CellArray> rows = g.rows();
		List<CellArray> columns = g.columns();
		List<CellArray> blocks = g.blocks();
		Cell c = g.get(3, 7);
		CellArray friends = c.friends();
		//The cell itself is not included
		assertFalse(friends.contains(c));
		//The should contain 20 elements
		assertEquals(friends.size(), 20);
		for(Cell x:rows.get(3)) {
			if(x != c) {
				assertTrue(friends.contains(x));
			}
		}
		for(Cell x:columns.get(7)) {
			if(x != c) {
				assertTrue(friends.contains(x));
			}
		}
		for(Cell x:blocks.get(5)) {
			if(x != c) {
				assertTrue(friends.contains(x));
			}
		}
	}
}
