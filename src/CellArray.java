package com.liseth.javaSudoku2;

import java.util.*;

class CellArray extends ArrayList<Cell>
{
	public CellArray(Cell[] cells) {
		for(Cell c:cells){
			add(c);
		}
	}
}
