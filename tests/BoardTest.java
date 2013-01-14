package com.liseth.javaSudoku2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.*;

/**
* Tests for {@link Board}.
*
* @author asmundliseth@gmail.com (Asmund Liseth)
*/
@RunWith(JUnit4.class)
public class BoardTest {
	private Board easy() {
		return Board.fromString(".63....1.59.26.87....3..9.6.1...6.8.8..974..1.2.1...6.6.2..3....78.95.32.4....75.");
	}

	@Test
	public void loadFromString() {
		Board b = easy();
		String bString = ". 6 3 . . . . 1 ." +
			             "5 9 . 2 6 . 8 7 ." +
						 ". . . 3 . . 9 . 6" + 
						 ". 1 . . . 6 . 8 ." +
						 "8 . . 9 7 4 . . 1" +
						 ". 2 . 1 . . . 6 ." +
						 "6 . 2 . . 3 . . ." +
						 ". 7 8 . 9 5 . 3 2" +
						 ". 4 . . . . 7 5 .";
		assertEquals("BoardString", bString, b.toString());
	}

	@Test
	public void solveEasyBoard() {
		Board b = easy();
		b.solve();
		String solved = "7 6 3 8 4 9 2 1 5" +
			            "5 9 4 2 6 1 8 7 3" +
			            "2 8 1 3 5 7 9 4 6" +
			            "4 1 7 5 2 6 3 8 9" +
			            "8 3 6 9 7 4 5 2 1" +
			            "9 2 5 1 3 8 4 6 7" +
			            "6 5 2 7 8 3 1 9 4" +
			            "1 7 8 4 9 5 6 3 2" +
			            "3 4 9 6 1 2 7 5 8";
		assertEquals("SolvedBoardString", solved, b.toString());
	}
}
