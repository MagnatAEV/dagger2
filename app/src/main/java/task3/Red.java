package task3;

import android.util.Log;

public class Red {

    private String TAG = "RED";

    public Red(Green green) {
        Log.i(TAG, "Red: " + green.getStr() + "handle: " + green);
    }
}
