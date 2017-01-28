package com.example.ian.mvpdemo;

import android.app.Application;


/**
 * Created by ian on 28/01/2017.
 */
/*This is where dagger will live for the entire lifetime of the application*/
//    We can define here all modules in our app such admin module and feature modules
public class App extends Application {

    private ApplicationComponent component;

    //component will be instantiated by dagger
    @Override
    public void onCreate() {
        super.onCreate();
//        Right now we have a signle application module
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build;


    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
