package sitac.view;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TabView extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.tabs);

	    TabHost tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
	    Intent intent;  // Reusable Intent for each tab

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    intent = new Intent().setClass(this, MapWidget.class);

	    // Initialize a TabSpec for each tab and add it to the TabHost
	    spec = tabHost.newTabSpec("1").setIndicator("MapView").setContent(intent);
	    tabHost.addTab(spec);

	    // Do the same for the other tabs
	    intent = new Intent().setClass(this, SoiecActivity.class);
	    spec = tabHost.newTabSpec("2").setIndicator("SOIEC").setContent(intent);
	    tabHost.addTab(spec);
	    
	    intent = new Intent().setClass(this, EnginesActivity.class);
	    spec = tabHost.newTabSpec("3").setIndicator("Engines").setContent(intent);
	    tabHost.addTab(spec);
	    
	    intent = new Intent().setClass(this, ChatPanel.class);
	    spec = tabHost.newTabSpec("4").setIndicator("Messages").setContent(intent);
	    tabHost.addTab(spec);


	    tabHost.setCurrentTab(0);
	}
}
