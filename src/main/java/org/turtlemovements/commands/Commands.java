package org.turtlemovements.commands;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Commands {

    START_PROGRAM(0),
    EXIT_PROGRAM(7),
    PEN_UP(1),
    PEN_DOWN(2),
    TURN_RIGHT(3),
    TURN_LEFT(4),
    MOVE_FORWARD(5),
    DISPLAY(6),
    END_DATA(9);

    private final int data;
}
