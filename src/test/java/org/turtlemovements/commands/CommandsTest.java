package org.turtlemovements.commands;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CommandsTest {

    @DisplayName("test command selection")
    @ParameterizedTest
    @MethodSource("provideSources")
    void testCommandsSelection(int valueEntered, Commands commandExpected) {
        assertThat(valueEntered).isEqualTo(commandExpected.getData());
    }

    @DisplayName("test command valid selection")
    @ParameterizedTest
    @MethodSource("provideSources")
    void testGetReturnAValidCommand(int valueEntered) {
        Commands commands = Commands.returnAValidCommand(valueEntered);
        assertThat(commands.getData()).isEqualTo(valueEntered);
    }

    @DisplayName("test command invalid selection")
    @ParameterizedTest
    @MethodSource("provideSources")
    void testGetReturnAInvalidCommand(int valueEntered) {
        assertThatThrownBy(() -> Commands.returnAValidCommand(valueEntered + 11))
                .hasMessage("The next character: " + (valueEntered + 11) + " is not a valid command.");
    }

    private static Stream<Arguments> provideSources() {
        return Stream.of(
                Arguments.of(0, Commands.START_PROGRAM),
                Arguments.of(1, Commands.PEN_UP),
                Arguments.of(2, Commands.PEN_DOWN),
                Arguments.of(3, Commands.TURN_RIGHT),
                Arguments.of(4, Commands.TURN_LEFT),
                Arguments.of(5, Commands.MOVE_FORWARD),
                Arguments.of(6, Commands.DISPLAY),
                Arguments.of(7, Commands.EXIT_PROGRAM),
                Arguments.of(9, Commands.END_DATA)
        );
    }
}