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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.kermeta.art2.android.framework.service.Art2AndroidUI;
import org.kermeta.art2.platform.android.ui.PreExistingViewFactory;
import org.osgi.framework.BundleContext;

/**
 * Hello world!
 *
 */
public class Art2Activity extends Activity implements Art2AndroidUI {

    public static Art2AndroidUI last = null;

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
    private TabHost tabs = null;

    @Override
    protected synchronized void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.last = this;

        LinearLayout main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        setContentView(main);
        tabs = new TabHost(this);
        tabs.setId(android.R.id.tabhost);
        main.addView(tabs);
        TabWidget tabWidget = new TabWidget(this);
        tabWidget.setId(android.R.id.tabs);
        tabs.addView(tabWidget);
        FrameLayout tabContent = new FrameLayout(this);
        tabContent.setId(android.R.id.tabcontent);
        tabContent.setPadding(0, 65, 0, 0);
        tabs.addView(tabContent);
        tabs.setup();

        TabSpec tspec1 = tabs.newTabSpec("Admin");
        tspec1.setIndicator("Admin", this.getResources().getDrawable(android.R.drawable.ic_menu_preferences));

        LinearLayout adminLayout = new LinearLayout(this);
        Button btstart = new Button(this);
        btstart.setText("Start");
        Button btstop = new Button(this);
        btstop.setText("Stop");

        adminLayout.addView(btstart);
        adminLayout.addView(btstop);

        tspec1.setContent(new PreExistingViewFactory(adminLayout));
        tabs.addTab(tspec1);
        /*
        TabSpec tspec2 = tabs.newTabSpec("Tab2");
        tspec2.setIndicator("Two", this.getResources().getDrawable(android.R.drawable.star_on));
        tspec2.setContent(new PreExistingViewFactory(content2));
        tabs.addTab(tspec2);
        TabSpec tspec3 = tabs.newTabSpec("Tab3");
        tspec3.setIndicator("Three", this.getResources().getDrawable(android.R.drawable.star_on));
        tspec3.setContent(new PreExistingViewFactory(content3));
        tabs.addTab(tspec3);


        this.setContentView(R.layout.main);
         */

        final Context app_ctx = this.getApplicationContext();

        final Context ctx = this;

        //   Button btstart = (Button) findViewById(R.id.StartFelix);
        btstart.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                Intent intent_start = new Intent(ctx, AndroidFelixService.class);
                Log.i("art2.service", "start bind service");
                if (!alreadyStarted) {
                    startService(intent_start);
                    alreadyStarted = true;
                }

                // Toast.makeText(ctx, "Art2 Platform Started !", 3000).show();


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

        //  Button btstop = (Button) findViewById(R.id.StopFelix);
        btstop.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                Log.i("art2.platform", "try to stop the platform");
                if (alreadyStarted) {
                    Intent intent_stop = new Intent(ctx, AndroidFelixService.class);
                    stopService(intent_stop);
                    alreadyStarted = false;
                }
            }
        });


    }

    @Override
    public Activity getRootActivity() {
        return this;
    }

    @Override
    public void addToGroup(final String groupKey, final View view) {
        this.runOnUiThread(new Runnable() {

            @Override
            public void run() {
                TabSpec tspec3 = tabs.newTabSpec(groupKey);
                tspec3.setIndicator(groupKey, getResources().getDrawable(android.R.drawable.star_on));
                tspec3.setContent(new PreExistingViewFactory(view));
                tabs.addTab(tspec3);
            }
        });

    }
}
