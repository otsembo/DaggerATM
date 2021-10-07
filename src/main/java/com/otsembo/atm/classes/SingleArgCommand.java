package com.otsembo.atm.classes;

import com.otsembo.atm.interfaces.Command;

import java.util.List;

public abstract class SingleArgCommand implements Command {

    @Override
    public Status handleInput(List<String> input) {
        return input.size() == 1 ? handleArg(input.get(0)) : Status.INVALID;
    }

    /** Handles the single argument to the command. */
    protected abstract Status handleArg(String arg);

}
