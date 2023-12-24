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

    public void displayBoard(){
        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[x].length; y++) {
                System.out.print(x + y);
            }
        }
    }
}
