package com.otsembo.atm.classes;

import com.otsembo.atm.interfaces.Command;

import javax.inject.Inject;
import java.util.List;

public class HelloWorldCommand implements Command {

    @Inject
    HelloWorldCommand(){}

    @Override
    public String key() {
        return "hello";
    }

    @Override
    public Status handleInput(List<String> input) {
        if(!input.isEmpty()){
            return Status.INVALID;
        }
        System.out.println("world!");
        return Status.HANDLED;
    }
}
