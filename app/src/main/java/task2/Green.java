package task2;

import android.util.Log;

public class Green {

    private String TAG = "GREEN";
    private String str = "green";

    public Green() {
        Log.e(TAG, "Green: " + "handler: " + this);
    }

    public String getStr() {
        return str;
    }
}
