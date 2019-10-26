package task3.app;

import javax.inject.Singleton;

import dagger.Component;
import task3.DaggerActivity;

@Singleton
@Component(modules = {AppModule.class})
public class AppComponent {

    void inject(DaggerActivity daggerActivity);

    void inject(Red red);

    void inject(White white);
}
