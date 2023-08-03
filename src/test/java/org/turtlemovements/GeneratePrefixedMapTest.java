package org.turtlemovements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void doesTheMapHaveTheColumnsDefined() {
        int columnsSize = generatePrefixedMap.getColumns();
        Assertions.assertEquals(COLUMNS, columnsSize);
    }

    @Test
    void doesTheMapHaveTheRowsDefined() {
        int rowsSize = generatePrefixedMap.getRows();
        Assertions.assertEquals(ROWS, rowsSize);
    }

}