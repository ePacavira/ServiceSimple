package ao.co.isptec.aplm.servicesimple;

import android.app.Application;

public class MyApp extends Application {
    private int serviceStartCount = 0;

    public int getServiceStartCount() {
        return serviceStartCount;
    }

    public int setServiceStartCount(int count){
        return serviceStartCount = count;
    }

    public void incrementServiceStartCount() {
        serviceStartCount++;
    }
}
