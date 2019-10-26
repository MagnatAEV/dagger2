package task3.app;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import task3.Green;

@Module
public class AppModule {
    private final Application app;


    public AppModule(Application application) {
        this.app = application;
    }

    @Singleton
    @Provides
    Green provideGreen(){
        return new Green();
    }
}
