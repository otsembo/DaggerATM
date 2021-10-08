package com.otsembo.atm.classes;

import com.otsembo.atm.interfaces.Command;
import com.otsembo.atm.interfaces.Outputter;

import javax.inject.Inject;
import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.List;

public final class DepositCommand implements Command {

    private final Database database;
    private final Outputter outputter;

    @Inject
    DepositCommand(Database database, Outputter outputter){
        this.database = database;
        this.outputter = outputter;
    }


    @Override
    public String key() {
        return null;
    }

    @Override
    public Status handleInput(List<String> input) {

        if(input.size() != 2){
            return Status.INVALID;
        }

        Database.Account account = database.getAccount(input.get(0));
        account.deposit(new BigDecimal(input.get(1)).floatValue());
        outputter.output(account.username() + " now has: "+ account.balance());
        return Status.HANDLED;
    }
}
