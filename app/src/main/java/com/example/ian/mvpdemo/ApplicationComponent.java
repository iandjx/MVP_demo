package com.example.ian.mvpdemo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ian on 28/01/2017.
 */
/*this is the injector clss
This component tells dagger where to inject dependencies into
Assigns references to activities, services, and fragments
*/
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
//    Declare all activities, services and fragments here as individual inject methods

    void inject(MainActivity target);

}
