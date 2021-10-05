package com.otsembo.atm.classes;

import com.otsembo.atm.interfaces.Command;

import java.util.*;

import com.otsembo.atm.interfaces.Command;

import javax.inject.Inject;

final public class CommandRouter {


    @Inject
    CommandRouter(HelloWorldCommand helloWorldCommand){
        commands.put(helloWorldCommand.key(), helloWorldCommand);
    }

    //create map
    private  Map<String, Command> commands = Collections.emptyMap();

    public Command.Status route(String input){

        List<String> splitInput = split(input);
        if(splitInput.isEmpty()){
            return invalidCommand(input);
        }

        String commandKey = splitInput.get(0);
        Command command = commands.get(commandKey);
        if(command == null){
            return invalidCommand(input);
        }

        Command.Status status =
                command.handleInput(splitInput.subList(1, splitInput.size()));

        if(status == Command.Status.INVALID){
            System.out.println(commandKey + ": invalid arguments");
        }

        return status;
    }


    private Command.Status invalidCommand(String input) {
        System.out.printf("couldn't understand \"%s\". please try again.%n", input);
        return Command.Status.INVALID;
    }

    //split on whitespace
    private static List<String> split(String string){
        return new ArrayList<>(Arrays.asList(string.split(" ")));
    }

}
