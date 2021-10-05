package com.otsembo.atm.interfaces;

import java.util.List;

public interface Command {

    //token that indicates this command should be selected
    String key();

    //process the rest of the commands
    Status handleInput(List<String> input);

    enum Status {
        INVALID,
        HANDLED
    }

}
