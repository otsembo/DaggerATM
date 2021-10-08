package com.otsembo.atm.interfaces;

import com.otsembo.atm.classes.CommandRouter;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

public interface Command {

    //token that indicates this command should be selected
    String key();

    //process the rest of the commands
    Status handleInput(List<String> input);

    class Result{

        private final Status status;
        private final Optional<CommandRouter> nestedCommandRouter;

        @Inject
        public Result(Status status, Optional<CommandRouter> nestedCommandRouter){
            this.status = status;
            this.nestedCommandRouter = nestedCommandRouter;
        }

        static Result enterNestedCommandSet(CommandRouter nestedCommandRouter){
            return new Result(Status.HANDLED, Optional.of(nestedCommandRouter));
        }

    }

    enum Status {
        INVALID,
        HANDLED,
        INPUT_COMPLETED
    }

}
