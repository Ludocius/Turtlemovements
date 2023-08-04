package org.turtlemovements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeneratePrefixedMapTest {
    final int ROWS = 20;
    final int COLUMNS = 20;
    int[][] map = new int[ROWS][COLUMNS];
    private GeneratePrefixedMap generatePrefixedMap;

    private GeneratePrefixedMapTest(){}
    @BeforeEach
    void startup() {
        generatePrefixedMap = new GeneratePrefixedMap(map);
    }

    @Test
    @DisplayName("Test column size")
    void doesTheMapHaveTheColumnsDefined() {
        int columnsSize = generatePrefixedMap.getColumns();
        assertEquals(COLUMNS, columnsSize);
    }

    @Test
    @DisplayName("Test rows size")
    void doesTheMapHaveTheRowsDefined() {
        int rowsSize = generatePrefixedMap.getRows();
        assertEquals(ROWS, rowsSize);
    }

}