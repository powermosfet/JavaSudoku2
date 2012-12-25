package com.liseth.javaSudoku2;

import java.util.*;

class CellGrid
{
	public CellGrid(char[] tokens){
		_availableTokens = tokens;
	}

	private char[] _availableTokens;

	public int size(){
		return _availableTokens.length;
	}

	public List<CellArray> rows(){
		return null;
	}
}
