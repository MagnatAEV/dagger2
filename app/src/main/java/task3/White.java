package task3;

import android.util.Log;

public class White {

    private String TAG = "WHITE";

    public White(Green green) {
        Log.d(TAG, "White: " + green.getStr() + " handler: " + green);
    }
}
