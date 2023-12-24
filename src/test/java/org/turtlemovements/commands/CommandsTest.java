package org.turtlemovements.commands;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CommandsTest {

    @Test
    @DisplayName("test command selection PEN UP")
    void testCommandSelectionPenUp() {
        int expectedPenUpSelection = 1;
        int commandPenUpUnderTest = Commands.PEN_UP.getData();
        assertThat(commandPenUpUnderTest).isEqualTo(expectedPenUpSelection);
    }

    @Test
    @DisplayName("test command selection PEN DOWN")
    void testCommandSelectionPendDown() {
        int expectedPenUpSelection = 2;
        int commandPenUpUnderTest = Commands.PEN_DOWN.getData();
        assertThat(commandPenUpUnderTest).isEqualTo(expectedPenUpSelection);
    }

    @Test
    @DisplayName("test command selection TURN RIGHT")
    void testCommandSelectionTurnRight() {
        int expectedPenUpSelection = 3;
        int commandPenUpUnderTest = Commands.TURN_RIGHT.getData();
        assertThat(commandPenUpUnderTest).isEqualTo(expectedPenUpSelection);
    }

    @Test
    @DisplayName("test command selection MOVE FORWARD")
    void testCommandSelectionMoveForward() {
        int expectedPenUpSelection = 5;
        int commandPenUpUnderTest = Commands.MOVE_FORWARD.getData();
        assertThat(commandPenUpUnderTest).isEqualTo(expectedPenUpSelection);
    }

    @Test
    @DisplayName("test command selection DISPLAY")
    void testCommandSelectionDisplay() {
        int expectedPenUpSelection = 6;
        int commandPenUpUnderTest = Commands.DISPLAY.getData();
        assertThat(commandPenUpUnderTest).isEqualTo(expectedPenUpSelection);
    }

    @Test
    @DisplayName("test command selection END DATA")
    void testCommandSelectionEndData() {
        int expectedPenUpSelection = 9;
        int commandPenUpUnderTest = Commands.END_DATA.getData();
        assertThat(commandPenUpUnderTest).isEqualTo(expectedPenUpSelection);
    }
}