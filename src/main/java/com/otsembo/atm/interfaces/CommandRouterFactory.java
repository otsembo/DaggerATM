package com.otsembo.atm.interfaces;

import com.otsembo.atm.classes.CommandRouter;
import dagger.Component;

@Component
public interface CommandRouterFactory {
    CommandRouter router();
}
