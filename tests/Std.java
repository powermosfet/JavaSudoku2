package com.liseth.javaSudoku2;

import java.util.*;

/**
* Standard utilitu methods for tests
*
* @author asmundliseth@gmail.com (Asmund Liseth)
*/
public class Std {
	public static CellGrid grid(){
		SymbolSet sym = SymbolSet.std(StandardSize.NINE);
		BlockMap map = BlockMap.std(StandardSize.NINE);
		CellGrid cg = new CellGrid(sym, map);
		return cg;
	}
}
