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
	@Test
	public void initializeGrid() {
		CellGrid g = Std.grid();
		assertEquals("Size", 9, g.size());
	}

	@Test
	public void all() {
		CellGrid g = Std.grid();
		CellArray all = g.all();
		assertEquals("81Cells", all.size(), 81);
		assertTrue(all.contains(g.get(8, 2)));
	}

	@Test
	public void rows() {
		CellGrid g = Std.grid();
		List<CellArray> rows = g.rows();
		assertEquals("NineRows", 9, rows.size());
		assertEquals("NineElementsInRow", 9, rows.get(3).size());
		Cell c = rows.get(3).get(5);
		assertSame(c, g.get(3, 5));
	}

	@Test
	public void row() {
		CellGrid g = Std.grid();
		CellArray row = g.row(7);
		assertEquals("NineElementsInRow", 9, row.size());
		Cell c = row.get(5);
		assertSame(c, g.get(7, 5));
	}

	@Test
	public void columns() {
		CellGrid g = Std.grid();
		List<CellArray> columns = g.columns();
		assertEquals("NineColumns", 9, columns.size());
		assertEquals("NineElementsInColumns", 9, columns.get(3).size());
		Cell c = columns.get(3).get(5);
		assertSame(c, g.get(5, 3));
	}

	@Test
	public void column() {
		CellGrid g = Std.grid();
		CellArray column = g.column(7);
		assertEquals("NineElementsInColumn", 9, column.size());
		Cell c = column.get(5);
		assertSame(c, g.get(5, 7));
	}

	@Test
	public void blocks() {
		CellGrid g = Std.grid();
		List<CellArray> blocks = g.blocks();
		assertTrue(blocks.get(0).contains(g.get(1, 1)));
		assertTrue(blocks.get(7).contains(g.get(7, 4)));
	}

	@Test
	public void block() {
		CellGrid g = Std.grid();
		CellArray block = g.block(7);
		assertEquals("NineElementsInBlock", 9, block.size());
		Cell c = block.get(7);
		assertSame(c, g.get(8, 5));
	}
}
