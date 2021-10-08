package com.otsembo.atm.classes;

import com.otsembo.atm.interfaces.Outputter;

import javax.inject.Inject;

public class LoginCommand extends SingleArgCommand{

    private final Outputter outputter;
    private final Database database;


    @Inject
    LoginCommand(Database database, Outputter outputter){
        this.outputter = outputter;
        this.database = database;
    }

    @Override
    protected Status handleArg(String arg) {
        Database.Account account = database.getAccount(arg);
        outputter.output(arg + " is logged in with balance: "+ account.balance());
        return Status.HANDLED;
    }

    @Override
    public String key() {
        return "login";
    }
}
