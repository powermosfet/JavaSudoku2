package com.liseth.javaSudoku2;

import java.util.*;

/**
* Represents a cell in a CellGrid.
* 
* Contains pencilmarks for the cell
* and references to the cell's  rowRef, columnRef and blockRef
*
* @author asmundliseth@gmail.com (Asmund Liseth)
*/
class Cell
{
	public Cell(SymbolSet sym, CellArray  row, CellArray column){
		pencilMarks = new ArrayList<Character>(sym);
		row.add(this);
		column.add(this);
		this. rowRef = row;
		this.columnRef = column;
	}

	private List<Character> pencilMarks;
	private CellArray rowRef;
	private CellArray columnRef;
	private CellArray blockRef;

	public CellArray row() {
		return rowRef;
	}

	public CellArray column() {
		return columnRef;
	}

	public CellArray block() {
		return blockRef;
	}

	public void setBlock(CellArray block) {
		blockRef = block;
		block.add(this);
	}

	public CellArray friends() {
		return null;
	}
}
