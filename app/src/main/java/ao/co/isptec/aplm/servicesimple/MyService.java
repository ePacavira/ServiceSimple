package ao.co.isptec.aplm.servicesimple;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Service was Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        // Accesses the application context counter
        MyApp app = (MyApp) getApplicationContext();
        app.incrementServiceStartCount();
        int startCount = app.getServiceStartCount();

        // Displays the current counter value
        Toast.makeText(this, "Service Started. Count: " + startCount, Toast.LENGTH_SHORT).show();
        return START_STICKY; // read more on: http://developer.android.com/reference/android/app/Service.html
    }

    @Override
    public void onDestroy() {

        /*MyApp app = (MyApp) getApplicationContext();
        app.setServiceStartCount(0);*/

        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_SHORT).show();
    }
}