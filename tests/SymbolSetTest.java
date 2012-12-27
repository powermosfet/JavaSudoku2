package com.liseth.javaSudoku2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.*;

/**
* Tests for {@link SymbolSet}.
*
* @author asmundliseth@gmail.com (Asmund Liseth)
*/
@RunWith(JUnit4.class)
public class SymbolSetTest {

	@Test
	public void defaultSet() {
		SymbolSet s = SymbolSet.std(StandardSizes.NINE);
		assertEquals("Size", 9, s.size());
	}
}
