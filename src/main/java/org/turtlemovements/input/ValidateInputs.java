package org.turtlemovements.input;

import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.turtlemovements.commands.Commands;
import org.turtlemovements.exceptions.InputExceptions;

@Getter
@UtilityClass
public class ValidateInputs {

    public static Commands getStateByValidation(int validateStartInput) throws InputExceptions {
        if (Commands.START_PROGRAM.getData() == validateStartInput) {
            return Commands.START_PROGRAM;
        }
        if (Commands.EXIT_PROGRAM.getData() == validateStartInput) {
            return Commands.EXIT_PROGRAM;
        }
        if (Commands.PEN_UP.getData() == validateStartInput) {
            return Commands.PEN_UP;
        }
        if (Commands.PEN_DOWN.getData() == validateStartInput) {
            return Commands.PEN_DOWN;
        }
        if (Commands.TURN_RIGHT.getData() == validateStartInput) {
            return Commands.TURN_RIGHT;
        }
        if (Commands.TURN_LEFT.getData() == validateStartInput) {
            return Commands.TURN_LEFT;
        }
        if (Commands.MOVE_FORWARD.getData() == validateStartInput) {
            return Commands.MOVE_FORWARD;
        }
        if (Commands.DISPLAY.getData() == validateStartInput) {
            return Commands.DISPLAY;
        }
        if (Commands.END_DATA.getData() == validateStartInput) {
            return Commands.END_DATA;
        } else {
            throw new InputExceptions();
        }
    }
}
