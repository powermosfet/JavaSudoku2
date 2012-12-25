package com.liseth.javaSudoku2;

import java.util.*;

/**
* Represents a cell in a CellGrid.
* 
* Contains pencilmarks for the cell
*
* @author asmundliseth@gmail.com (Asmund Liseth)
*/
class Cell
{
	public Cell(SymbolSet sym){
		pencilMarks = new ArrayList<Character>(sym);
	}
	public Cell(char[] tokens){
		pencilMarks = new ArrayList<Character>();
		for(char t:tokens){
			pencilMarks.add(new Character(t));
		}
	}

	private List<Character> pencilMarks;
}
