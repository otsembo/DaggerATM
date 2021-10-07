package com.otsembo.atm.classes;

import com.otsembo.atm.interfaces.Outputter;

import javax.inject.Inject;

public class LoginCommand extends SingleArgCommand{

    private final Outputter outputter;

    @Inject
    LoginCommand(Outputter outputter){
        this.outputter = outputter;
    }

    @Override
    protected Status handleArg(String arg) {
        outputter.output(arg + " is logged in.");
        return null;
    }

    @Override
    public String key() {
        return "login";
    }
}
