package com.liseth.javaSudoku2;

class Cell
{
	public Cell(char[] tokens){
		_possible = tokens;
	}

	private ArrayList<char> _possible;
}
