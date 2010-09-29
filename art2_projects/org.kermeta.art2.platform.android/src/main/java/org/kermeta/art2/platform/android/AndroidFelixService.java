/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.platform.android;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Hashtable;
import org.osgi.framework.BundleContext;

/**
 *
 * @author ffouquet
 */
public class AndroidFelixService extends Service implements Art2AndroidPlatform {

    public class AndroidFelixServiceBinder extends Binder {

        AndroidFelixService getService() {
            return AndroidFelixService.this;
        }
    }
    private EmbeddedFelix felix = null;
    private final IBinder mBinder = new AndroidFelixServiceBinder();
    private NotificationManager mNM;

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mNM = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        /* Redirect Output stream */
        PrintStream m_out = new PrintStream(new OutputStream() {

            ByteArrayOutputStream output = new ByteArrayOutputStream();

            @Override
            public void write(int oneByte) throws IOException {
                output.write(oneByte);
                if (oneByte == '\n') {
                    Log.v("art2.platform.service.out", new String(output.toByteArray()));
                    output = new ByteArrayOutputStream();
                }
            }
        });
        System.setErr(m_out);
        System.setOut(m_out);

        felix = new EmbeddedFelix(getResources());
        Log.d("art2.platform.service", "Art2 Platform Service created");


        //Notification n = new Notification();

        // mNM.notify(0, new Notification());


    }

    @Override
    public void onDestroy() {
        Log.d("art2.platform.service", "Art2 Platform Service stopped");
        bootstrapthread.stop();
        felix.stop();
        felix = null;
        super.onDestroy();
    }

    private Thread bootstrapthread = null;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        felix.start();
        felix.getFrameworkBundleContext().registerService(Art2AndroidPlatform.class.getName(), this, new Hashtable());

        bootstrapthread = new Thread() {

            @Override
            public void run() {
                felix.bootstrap(getFrameworkBundleContext());
            }
        };
        bootstrapthread.start();

        Log.d("art2.platform.service", "Art2 Platform Service started");
        Toast.makeText(this, "Art2 Platform Service started", 3000).show();
        return START_STICKY;
    }




    public BundleContext getFrameworkBundleContext() {
        return this.felix.getFrameworkBundleContext();
    }
}
