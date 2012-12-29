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
	private CellGrid stdGrid(){
		SymbolSet sym = SymbolSet.std(StandardSizes.NINE);
		BlockMap map = BlockMap.std(StandardSizes.NINE);
		CellGrid cg = new CellGrid(sym, map);
		return cg;
	}

	@Test
	public void rowReferenceMatches(){
		CellGrid g = stdGrid();
		List<CellArray> rows = g.rows();
		assertSame(rows.get(4), g.get(4, 2).row());
	}

	@Test
	public void columnReferenceMatches(){
		CellGrid g = stdGrid();
		List<CellArray> columns = g.columns();
		assertSame(columns.get(2), g.get(4, 2).column());
	}
}
