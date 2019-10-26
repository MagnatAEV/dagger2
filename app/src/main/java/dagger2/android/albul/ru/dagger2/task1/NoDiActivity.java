package dagger2.android.albul.ru.dagger2.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger2.android.albul.ru.dagger2.R;

public class NoDiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_di);
        Green green = new Green();
        White white = new White();
        Red red = new Red();
    }
}
