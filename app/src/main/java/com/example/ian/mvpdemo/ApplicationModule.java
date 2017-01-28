package com.example.ian.mvpdemo;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ian on 28/01/2017.
 */
/*Used by dagger to keep track of dependencies
Add modules for every feature built
Dagger will look for variable methods and instance providers
*/

@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application){
        this.application = application;
    }

    //All methods with a return type should have @Provides annotation
    @Provides
    @Singleton
    public Context providerContext(){
        return application;
    }
}
