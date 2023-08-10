package org.turtlemovements.input;

import org.turtlemovements.commands.Commands;
import org.turtlemovements.exceptions.InputExceptions;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.GLOBAL_LOGGER_NAME;


public class Inputs {
    static Scanner scanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger(GLOBAL_LOGGER_NAME);
    static Level infoLog = Level.INFO;

    private Inputs() {

    }

    public static void displayScreen() throws InputExceptions {
        logger.log(infoLog, Messages.WELCOME_TITLE);
        logger.log(infoLog, Messages.START_PROGRAM);
        ValidateInputs.setValidationStartInput(Integer.parseInt(scanner.next()));
        if (ValidateInputs.counterState == Commands.START_PROGRAM.getData()) {
            logger.log(infoLog, Messages.RUNNING_PROGRAM);
            while (ValidateInputs.counterState != Commands.EXIT_PROGRAM.getData()) {
                logger.log(infoLog, Messages.COMMAND_SELECTED);
                ValidateInputs.setValidatationExitInput(Integer.parseInt(scanner.next()));
            }
        }
    }
}


