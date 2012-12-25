package com.liseth.javaSudoku2;

import java.util.*;

class SymbolSet extends ArrayList<Character>
{
	public static SymbolSet std9(){
		List<Character> symbols = new ArrayList<Character>(
			 Arrays.asList( '1', '2', '3', '4', '5', '6', '7', '8', '9' ));
		return new SymbolSet(symbols);
	}
	private  SymbolSet(List<Character> symbols){
		for(Character s:symbols){
			add(s);
		}
	}
}
