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
	public CellGrid(SymbolSet sym, BlockMap blockMap) {
		cells = new ArrayList<Cell>();
		int size = sym.size();
		rowList = getCellArrayList(size);
		columnList = getCellArrayList(size);
		//Populate cell list
		for(CellArray row:rowList) {
			for(CellArray col:columnList) {
				cells.add(new Cell(sym, row, col));
			}
		}
		//Define blocks
		blockList = blockMap.getBlockList(this);
	}

	private List<Cell> cells;
	private List<CellArray> rowList;
	private List<CellArray> columnList;
	private List<CellArray> blockList;

	private List<CellArray> getCellArrayList(int size) {
		List<CellArray> r = new ArrayList<CellArray>();
		for(int i=0; i<size; i++) {
			r.add(new CellArray());
		}
		return r;
	}

	public Cell get(int row, int column) {
		return rowList.get(row).get(column);
	}

	public int size() {
		return rowList.size();
	}

	public CellArray all() {
		return null;
	}

	public List<CellArray> rows() {
		return rowList;
	}

	public CellArray row(int index) {
		return null;
	}

	public List<CellArray> columns() {
		return columnList;
	}

	public CellArray column(int index) {
		return null;
	}

	public List<CellArray> blocks() {
		return blockList;
	}

	public CellArray block(int index) {
		return null;
	}
}
