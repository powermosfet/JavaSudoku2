package com.liseth.javaSudoku2;

class PencilMarkGrid
{
	public PencilMarkGrid(char[] tokens){
		_availableTokens = tokens;
	}

	private char[] _availableTokens;

	public int GetSize(){
		return _availableTokens.length;
	}
}
