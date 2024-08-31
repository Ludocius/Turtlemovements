package org.turtlemovements.board;

import java.util.Arrays;

public class GeneratePrefixedMap {

     public final String[][] map;

     private Turtle turtle;

     private static final short ROWS = 20;
     private static final short COLUMNS = 20;

     private static final String SPACE_WITHOUT_TRACE = "_";
     private   static final String SPACE_WITH_TRACE = "*";

     private static final int INITIAL_POSITION_IN_X = 0;
     private static final int INITIAL_POSITION_IN_Y = 0;

    public GeneratePrefixedMap() {
        this.map = new String[ROWS][COLUMNS];
        turtle = new Turtle(INITIAL_POSITION_IN_X, INITIAL_POSITION_IN_Y);
        fillMap();
    }

    private void fillMap(){
        for (String[] strings : map) {
            Arrays.fill(strings, SPACE_WITHOUT_TRACE);
        }
    }

    public int getColumns() {
        return map[0].length;
    }

    public int getRows() {
        return map.length;
    }

    public void displayBoard(){
        for (String[] strings : map) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.printf("%n");
        }
    }

    public void positionXandY(int limitPositionInX, int limitPositionInY){
        for (int x = turtle.getPositionInX(); x <= limitPositionInX; x++) {
            for (int y = turtle.getPositionInY(); y <= limitPositionInY; y++) {
                if (x == limitPositionInX && y == limitPositionInY) {
                    map[x][y] = SPACE_WITH_TRACE;
                }
            }
        }
        turtle.setPositionInX(limitPositionInX);
        turtle.setPositionInY(limitPositionInY);
    }
}
