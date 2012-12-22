package com.liseth.javaSudoku2;

import java.util.*;

class CellGrid
{
	public CellGrid(char[] tokens){
		_availableTokens = tokens;
	}

	private char[] _availableTokens;

	public int GetSize(){
		return _availableTokens.length;
	}

	public List<CellArray> Rows(){
		return null;
	}
}
