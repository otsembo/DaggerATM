package com.otsembo.atm.classes;

import com.otsembo.atm.interfaces.Outputter;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class SystemOutModule {

    @Provides
    static Outputter textOutputter(){
        return System.out::println;
    }

}
