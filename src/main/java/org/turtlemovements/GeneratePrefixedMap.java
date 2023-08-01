package org.turtlemovements;

public class GeneratePrefixedMap {

     int[][] map;

    public GeneratePrefixedMap(int[][] map) {
        this.map = map;
    }

    public int getColumns() {
        return map[0].length;
    }

    public int getRows() {
        return map.length;
    }
}
