package com.liseth.javaSudoku2;

import java.util.*;

class Cell
{
	public Cell(List<Character> tokens){
		_possible = new ArrayList<Character>(tokens);
	}

	private List<Character> _possible;
}
