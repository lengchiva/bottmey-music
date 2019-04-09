package leng.chiva.bottmeymusic.other;

import android.app.Activity;
import android.os.Build;

public class GeneralFunction {

    /*
     * Kill activity
     * */
    public static void  killActivity(Activity activity) {
        activity.finishAffinity();

    }
}
