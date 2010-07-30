package sitac.view;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TabView extends TabActivity {

	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.tabs);

	    TabHost tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
	    Intent intent;  // Reusable Intent for each tab

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    intent = new Intent().setClass(this, MapWidget.class);

	    // Initialize a TabSpec for each tab and add it to the TabHost
	    spec = tabHost.newTabSpec("artists").setIndicator("MapView").setContent(intent);
	    tabHost.addTab(spec);

	    // Do the same for the other tabs
	    intent = new Intent().setClass(this, SoiecActivity.class);
	    spec = tabHost.newTabSpec("albums").setIndicator("SOIEC").setContent(intent);
	    tabHost.addTab(spec);
	    
	    intent = new Intent().setClass(this, ChatPanel.class);
	    spec = tabHost.newTabSpec("albums").setIndicator("ChatPanel").setContent(intent);
	    tabHost.addTab(spec);


	    tabHost.setCurrentTab(0);
	}
}
