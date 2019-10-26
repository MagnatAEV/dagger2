package task3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dagger2.android.albul.ru.dagger2.R;

public class DaggerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_di);
        Green green = new Green();
        White white = new White(green);
        Red red = new Red(green);
    }
}
