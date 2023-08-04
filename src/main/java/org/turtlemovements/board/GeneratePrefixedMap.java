package org.turtlemovements.board;

public class GeneratePrefixedMap {

     final int[][] map;

     private static final short ROWS = 20;
     private static final short COLUMNS = 20;

    public GeneratePrefixedMap() {
        this.map = new int[ROWS][COLUMNS];
    }

    public int getColumns() {
        return map[0].length;
    }

    public int getRows() {
        return map.length;
    }
}
