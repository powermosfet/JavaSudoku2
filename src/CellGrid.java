package com.liseth.javaSudoku2;

import java.util.*;

class CellGrid
{
	public CellGrid(SymbolSet sym){
		int n = sym.size();
		cells = new Cell[n][n];
		for(Cell[] row:cells){
			for(Cell c:row){
				c = new Cell(sym);
			}
		}
	}

	private Cell[][] cells;

	public int size(){
		return cells.length;
	}

	public List<CellArray> rows(){
		List<CellArray> r = new ArrayList<CellArray>();
		for(Cell[] row:cells){
			r.add(new CellArray(row));
		}
		return r;
	}
}
