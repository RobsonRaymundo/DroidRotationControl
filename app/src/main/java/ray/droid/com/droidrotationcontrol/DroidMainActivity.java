package ray.droid.com.droidrotationcontrol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DroidMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intentService = new Intent(getBaseContext(), DroidHeadService.class);
        startService(intentService);
        finish();
    }
}
