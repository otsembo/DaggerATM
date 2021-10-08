package com.otsembo.atm.classes;

import com.otsembo.atm.interfaces.Command;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayDeque;
import java.util.Deque;

@Singleton
public final class CommandProcessor {

    private final Deque<CommandRouter> commandRouterStack = new ArrayDeque<>();

    @Inject
    CommandProcessor(CommandRouter firstCommandRouter){
        commandRouterStack.push(firstCommandRouter);
    }

    Command.Status process(String input){

        /*Command.Status result = commandRouterStack.peek().route(input);
        if(result.)*/
    return null;
    }

}
