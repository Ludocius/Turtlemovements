package org.turtlemovements.input;

import lombok.Getter;
import org.turtlemovements.commands.Commands;
import org.turtlemovements.exceptions.InputExceptions;

@Getter
public class ValidateInputs {

    protected static Commands counterState = null;

    private ValidateInputs() {

    }


    public static void setValidationStartInput(int validateStartInput) throws InputExceptions {
        if (Commands.START_PROGRAM.getData() == validateStartInput) {
            counterState = Commands.START_PROGRAM;
        } else {
            throw new InputExceptions();
        }
    }

    public static void setValidatationExitInput(int validateExitInput) throws InputExceptions {
        if (Commands.EXIT_PROGRAM.getData() == validateExitInput) {
            counterState = Commands.EXIT_PROGRAM;
        } else {
            throw new InputExceptions();
        }
    }

    public static void setValidationPenupInput(int validateExitInput) throws InputExceptions {
        if (Commands.PEN_UP.getData() == validateExitInput) {
            counterState = Commands.PEN_UP;
        } else {
            throw new InputExceptions();
        }
    }

    public static void setValidationPendownInput(int validateExitInput) throws InputExceptions {
        if (Commands.PEN_DOWN.getData() == validateExitInput) {
            counterState = Commands.PEN_DOWN;
        } else {
            throw new InputExceptions();
        }
    }

    public static void setValidationTurnrightInput(int validateExitInput) throws InputExceptions {
        if (Commands.TURN_RIGHT.getData() == validateExitInput) {
            counterState = Commands.TURN_RIGHT;
        } else {
            throw new InputExceptions();
        }
    }

    public static void setValidationTurnleftInput(int validateExitInput) throws InputExceptions {
        if (Commands.TURN_LEFT.getData() == validateExitInput) {
            counterState = Commands.TURN_LEFT;
        } else {
            throw new InputExceptions();
        }
    }

    public static void setValidationMoveforwardInput(int validateExitInput) throws InputExceptions {
        if (Commands.MOVE_FORWARD.getData() == validateExitInput) {
            counterState = Commands.MOVE_FORWARD;
        } else {
            throw new InputExceptions();
        }
    }

    public static void setValidationDisplayInput(int validateExitInput) throws InputExceptions {
        if (Commands.DISPLAY.getData() == validateExitInput) {
            counterState = Commands.DISPLAY;
        } else {
            throw new InputExceptions();
        }
    }

    public static void setValidationDeleteDataInput(int validateExitInput) throws InputExceptions {
        if (Commands.END_DATA.getData() == validateExitInput) {
            counterState = Commands.END_DATA;
        } else {
            throw new InputExceptions();
        }
    }
}
