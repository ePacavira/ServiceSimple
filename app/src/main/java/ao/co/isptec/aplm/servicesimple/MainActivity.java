package ao.co.isptec.aplm.servicesimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Increments the counter in the application context before starting the service
        MyApp app = (MyApp) getApplicationContext();

        // Start the service
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    //Start the service
    public void startService(View view) {
        startService(new Intent(this, MyService.class));

    }

    // Stop the service
    public void stopService(View view) {
        stopService(new Intent(this, MyService.class));
    }
}