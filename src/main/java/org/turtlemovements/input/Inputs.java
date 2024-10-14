package org.turtlemovements.input;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.turtlemovements.commands.Commands;
import org.turtlemovements.exceptions.InputExceptions;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.GLOBAL_LOGGER_NAME;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Inputs {
    static Scanner scanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger(GLOBAL_LOGGER_NAME);
    static Level infoLog = Level.INFO;

    public static void displayScreen() throws InputExceptions {
        logger.log(infoLog, Messages.WELCOME_TITLE);
        logger.log(infoLog, Messages.START_PROGRAM);
        var userInput = scanner.nextInt();
        try {
            var currentCommand = Commands.returnAValidCommand(userInput);
            if (currentCommand.getData() != Commands.EXIT_PROGRAM.getData()) {
                logger.log(infoLog, Messages.RUNNING_PROGRAM);
                logger.log(infoLog, Messages.EXIT_PROGRAM);
                loopOverTheInputsAndOutputs(currentCommand);
            }
        } catch (InputExceptions exceptions) {
            throw new InputExceptions(userInput, exceptions);
        }
    }

    private static void loopOverTheInputsAndOutputs(Commands startCommand) throws InputExceptions {
        Commands initalCommand = startCommand;
        while (initalCommand.getData() != Commands.EXIT_PROGRAM.getData()) {
            var userInput = scanner.nextInt();
            try {
                logger.log(infoLog, Messages.COMMAND_SELECTED);
                initalCommand = Commands.returnAValidCommand(userInput);
            } catch (InputExceptions exceptions) {
                throw new InputExceptions(userInput, exceptions);
            }
        }
    }
}


