package sitac.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SoiecActivity extends Activity {
	
	private TextView textview;

	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        setContentView(R.layout.table);
	        this.textview=(TextView)findViewById(R.id.newview);
	        this.textview.invalidate();
	    }

}
