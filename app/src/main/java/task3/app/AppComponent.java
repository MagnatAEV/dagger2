package task3.app;

import javax.inject.Singleton;

import dagger.Component;
import task3.DaggerActivity;
import task3.Red;
import task3.White;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(DaggerActivity daggerActivity);

    void inject(Red red);

    void inject(White white);
}
