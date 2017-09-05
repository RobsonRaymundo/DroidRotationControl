package ray.droid.com.droidrotationcontrol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Robson on 03/05/2017.
 */

public class DroidRestartApp extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        DroidCommon.stopStartService(context, DroidCommon.AtivarBotaoFlutuante(context));
    }
}
