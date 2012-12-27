package com.liseth.javaSudoku2;

import java.util.*;

/**
* Represents a CellGrid.
* 
* Contains {@link Cell} objects, and useful methods for accessing these Cells
*
* @author asmundliseth@gmail.com (Asmund Liseth)
*/
class CellGrid
{
	public CellGrid(SymbolSet sym) {
		cells = new ArrayList<Cell>();
		int size = sym.size();
		rowList = getCellArrayList(size);
		columnList = getCellArrayList(size);
		for(CellArray row:rowList) {
			for(CellArray col:columnList) {
				cells.add(new Cell(sym, row, col));
			}
		}
	}

	private List<Cell> cells;
	private List<CellArray> rowList;
	private List<CellArray> columnList;

	public Cell get(int row, int column) {
		return rowList.get(row).get(column);
	}

	private List<CellArray> getCellArrayList(int size) {
		List<CellArray> r = new ArrayList<CellArray>();
		for(int i=0; i<size; i++) {
			r.add(new CellArray());
		}
		return r;
	}

	public int size() {
		return rowList.size();
	}

	public List<CellArray> rows() {
		return rowList;
	}

	public List<CellArray> columns() {
		return columnList;
	}
}
