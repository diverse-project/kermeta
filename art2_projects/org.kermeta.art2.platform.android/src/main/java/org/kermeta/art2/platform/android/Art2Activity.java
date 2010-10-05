package org.kermeta.art2.platform.android;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import org.osgi.framework.BundleContext;

/**
 * Hello world!
 *
 */
public class Art2Activity extends Activity {

    private EmbeddedFelix felix;

    @Override
    protected void onStart() {
        super.onStart();
        //Log.i("art2", "art2 platform begin");
        //felix.start();
        //Log.i("art2", "art2 platform ok");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Log.i("art2", "stop");
        //felix.stop();

       // Intent intent = new Intent(".AndroidFelixService.ACTION");
        //stopService(intent);

    }

    private Boolean alreadyStarted = false;

    @Override
    protected synchronized void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.main);

        
        final Context app_ctx = this.getApplicationContext();

        final Context ctx = this;

        Button btstart = (Button) findViewById(R.id.StartFelix);
        btstart.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                Intent intent_start = new Intent(ctx,AndroidFelixService.class);
                Log.i("art2.service", "start bind service");
                startService(intent_start);
                /*
                bindService(intent_start, new ServiceConnection() {
                    @Override
                    public void onServiceConnected(ComponentName name, IBinder service) {
                        AndroidFelixServiceBinder felixservicebinder = (AndroidFelixServiceBinder) service;
                        BundleContext ctx = felixservicebinder.getService().getFrameworkBundleContext();
                        //Toast.makeText(app_ctx, "size=" + ctx.getBundles().length, 3000).show();
                    }

                    @Override
                    public void onServiceDisconnected(ComponentName name) {
                        //throw new UnsupportedOperationException("Not supported yet.");
                    }
                }, BIND_AUTO_CREATE);
*/
                //startService(intent_start);
            }
        });

        Button btstop = (Button) findViewById(R.id.StopFelix);
        btstop.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                Log.i("art2.platform", "try to stop the platform");
                Intent intent_stop = new Intent(ctx,AndroidFelixService.class);
                stopService(intent_stop);
            }
        });


    }
}
