package com.liseth.javaSudoku2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.*;

/**
* Tests for {@link CellArray}.
*
* @author asmundliseth@gmail.com (Asmund Liseth)
*/
@RunWith(JUnit4.class)
public class CellArrayTest {
	@Test
	public void contains(){
		CellGrid g = Std.grid();
		CellArray column = g.column(3);
		assertTrue(column.contains(g.get(5, 3)));
		assertFalse(column.contains(g.get(3, 2)));
	}

	@Test
	public void returnUnfinished() {
		CellGrid g = Std.grid();
		Cell finishedCell = g.get(3, 7);
		finishedCell.define('1');
		CellArray unfinished = g.all().unfinished();
		assertEquals("SizeIs80", unfinished.size(), 80);
		assertFalse(unfinished.contains(finishedCell));
	}
}
