package org.turtlemovements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.turtlemovements.board.GeneratePrefixedMap;

import static org.assertj.core.api.Assertions.assertThat;

class GeneratePrefixedMapTest {
    final int ROWS = 20;
    final int COLUMNS = 20;
    int[][] map = new int[ROWS][COLUMNS];
    private GeneratePrefixedMap generatePrefixedMap;

    private GeneratePrefixedMapTest() {
    }

    @BeforeEach
    void startup() {
        generatePrefixedMap = new GeneratePrefixedMap();
    }

    @Test
    @DisplayName("Test column size")
    void doesTheMapHaveTheColumnsDefined() {
        int columnsSize = generatePrefixedMap.getColumns();
        assertThat(columnsSize).isEqualTo(COLUMNS);
    }

    @Test
    @DisplayName("Test rows size")
    void doesTheMapHaveTheRowsDefined() {
        int rowsSize = generatePrefixedMap.getRows();
        assertThat(rowsSize).isEqualTo(ROWS);
    }

}