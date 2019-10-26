package dagger2.android.albul.ru.dagger2.task1;

import android.util.Log;

public class White {

    private String TAG = "WHITE";

    public White() {
        Green green = new Green();
        Log.d(TAG, "White: " + green.getStr() + " handler: " + green);
    }
}
