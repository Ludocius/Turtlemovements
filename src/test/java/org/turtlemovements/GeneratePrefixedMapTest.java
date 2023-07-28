package org.turtlemovements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class GeneratePrefixedMapTest {

    final int ROWS = 10;
    final int COLUMNS = 10;
    int[][] map = new int[ROWS][COLUMNS];
    GeneratePrefixedMap generatePrefixedMap;

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