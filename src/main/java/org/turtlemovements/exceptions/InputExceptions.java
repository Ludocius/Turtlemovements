package org.turtlemovements.exceptions;

import lombok.experimental.StandardException;

@StandardException
public class InputExceptions extends RuntimeException {
    public InputExceptions(int inputEntered) {
        super("The next character: " + inputEntered + " is not a valid command.");
    }

    public InputExceptions(int inputEntered, Exception exception) {
        super("The next character: " + inputEntered + " is not a valid command.", exception);
    }
}
