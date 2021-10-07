package com.otsembo.atm.interfaces;

import com.otsembo.atm.classes.CommandRouter;
import com.otsembo.atm.classes.HelloWorldModule;
import com.otsembo.atm.classes.LoginCommandModule;
import com.otsembo.atm.classes.SystemOutModule;
import dagger.Component;

@Component(modules = {SystemOutModule.class, LoginCommandModule.class, HelloWorldModule.class})
public interface CommandRouterFactory {
    CommandRouter router();
}
