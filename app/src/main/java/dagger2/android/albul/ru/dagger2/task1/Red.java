package dagger2.android.albul.ru.dagger2.task1;

import android.util.Log;

public class Red {

    private String TAG = "RED";

    public Red() {
        Green green = new Green();
        Log.i(TAG, "Red: " + green.getStr() + "handle: " + green);
    }
}
