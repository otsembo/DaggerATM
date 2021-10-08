package com.otsembo.atm.interfaces;

import com.otsembo.atm.classes.*;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {SystemOutModule.class, LoginCommandModule.class, HelloWorldModule.class, UserCommandsModule.class})
public interface CommandRouterFactory {
    CommandRouter router();
}
