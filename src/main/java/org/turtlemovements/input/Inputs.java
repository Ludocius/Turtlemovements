package org.turtlemovements.input;

import lombok.experimental.UtilityClass;
import org.turtlemovements.commands.Commands;
import org.turtlemovements.exceptions.InputExceptions;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.GLOBAL_LOGGER_NAME;

@UtilityClass
public class Inputs {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(GLOBAL_LOGGER_NAME);
    private static final Level infoLog = Level.INFO;

    public static void displayScreen() throws InputExceptions {
        logger.log(infoLog, Messages.WELCOME_TITLE);
        logger.log(infoLog, Messages.START_PROGRAM);
        var currentState = ValidateInputs.getStateByValidation(Integer.parseInt(scanner.next()));
        while (currentState.getData() != Commands.EXIT_PROGRAM.getData()) {
            logger.log(infoLog, Messages.RUNNING_PROGRAM);
            logger.log(infoLog, Messages.PRESS_A_COMMAND);
            currentState = ValidateInputs.getStateByValidation(Integer.parseInt(scanner.next()));
            var format = Messages.COMMAND_SELECTED + currentState;
            logger.log(infoLog, format);

        }
        logger.log(infoLog, Messages.EXIT_PROGRAM);

    }
}


