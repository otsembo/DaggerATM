package com.otsembo.atm.classes;

import com.otsembo.atm.interfaces.Command;
import com.otsembo.atm.interfaces.Outputter;

import javax.inject.Inject;
import java.util.List;

public class HelloWorldCommand implements Command {

    private final Outputter outputter;

    @Inject
    HelloWorldCommand(Outputter outputter){
        this.outputter = outputter;
    }

    @Override
    public String key() {
        return "hello";
    }

    @Override
    public Status handleInput(List<String> input) {
        outputter.output("world!");
        return Status.HANDLED;
    }
}
