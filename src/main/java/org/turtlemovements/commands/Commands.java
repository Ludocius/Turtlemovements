package org.turtlemovements.commands;

import lombok.Getter;
import org.turtlemovements.exceptions.InputExceptions;

import java.util.Arrays;

@Getter
public enum Commands {

    START_PROGRAM(0),
    PEN_UP(1),
    PEN_DOWN(2),
    TURN_RIGHT(3),
    TURN_LEFT(4),
    MOVE_FORWARD(5),
    DISPLAY(6),
    EXIT_PROGRAM(7),
    END_DATA(9);

    private final int data;

    Commands(int data) {
        this.data = data;
    }

    public static Commands returnAValidCommand(int data) throws InputExceptions {
        return Arrays.stream(Commands.values())
                .filter(value -> value.getData() == data)
                .findFirst()
                .orElseThrow(() -> new InputExceptions(data));
    }
}
