package org.turtlemovements.board;

import java.util.Arrays;

import static org.turtlemovements.constants.ConstantsForCreateTheMap.COLUMNS;
import static org.turtlemovements.constants.ConstantsForCreateTheMap.INITIAL_POSITION_IN_X;
import static org.turtlemovements.constants.ConstantsForCreateTheMap.INITIAL_POSITION_IN_Y;
import static org.turtlemovements.constants.ConstantsForCreateTheMap.ROWS;
import static org.turtlemovements.constants.ConstantsForCreateTheMap.SPACE_WITHOUT_TRACE;
import static org.turtlemovements.constants.ConstantsForCreateTheMap.SPACE_WITH_TRACE;

public class GeneratePrefixedMap {

    public final String[][] map;

    private final Turtle turtle;


    public GeneratePrefixedMap() {
        this.map = new String[ROWS][COLUMNS];
        turtle = Turtle.builder()
                .positionInX(INITIAL_POSITION_IN_X)
                .positionInY(INITIAL_POSITION_IN_Y)
                .build();
        fillMap();
    }

    private void fillMap() {
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

    public void displayBoard() {
        for (String[] strings : map) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.printf("%n");
        }
    }

    public void positionXandY(int limitPositionInX, int limitPositionInY) {
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
