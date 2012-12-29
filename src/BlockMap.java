package com.liseth.javaSudoku2;

import java.util.*;

/**
* Manages block maps
* 
* Contains predefined maps for all standard sizes
* Can load map from file
*
* @author asmundliseth@gmail.com (Asmund Liseth)
*/
class BlockMap
{
	public static BlockMap std(StandardSize size) {
		BlockMap r = new BlockMap();
		switch(size) {
			case NINE:
				int[][] indexes = new int[][] {
					{ 0, 0, 0, 1, 1, 1, 2, 2, 2 },
					{ 0, 0, 0, 1, 1, 1, 2, 2, 2 },
					{ 0, 0, 0, 1, 1, 1, 2, 2, 2 },
					{ 3, 3, 3, 4, 4, 4, 5, 5, 5 },
					{ 3, 3, 3, 4, 4, 4, 5, 5, 5 },
					{ 3, 3, 3, 4, 4, 4, 5, 5, 5 },
					{ 6, 6, 6, 7, 7, 7, 8, 8, 8 },
					{ 6, 6, 6, 7, 7, 7, 8, 8, 8 },
					{ 6, 6, 6, 7, 7, 7, 8, 8, 8 } };
				r = new BlockMap(indexes);
				break;
		}
		return r;
	}
	private BlockMap() { }
	private BlockMap(int[][] indexes) {
		indexGrid = indexes;
	}

	private int[][] indexGrid;

	public List<CellArray> getBlockList(CellGrid grid) {
		List<CellArray> blockList = new ArrayList<CellArray>();
		for(int i = 0; i < size(); i++) blockList.add(new CellArray());
		for(int r = 0; r < size(); r++) {
			for(int c = 0; c < size(); c++) {
				Cell cell = grid.get(r, c);
				CellArray block = blockList.get(indexGrid[r][c]);
				cell.setBlock(block);
			}
		}
		return blockList;
	}

	public int size() {
		return indexGrid.length;
	}
}
