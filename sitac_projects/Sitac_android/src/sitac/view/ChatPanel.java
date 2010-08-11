package sitac.view;

import sitac.control.AbstractCommandFactory;
import sitac.control.Adapter;
import sitac.control.Ctrl;
import sitac.control.FactoryMaker;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class ChatPanel extends Activity {
	
	private ScrollView scrollview;
	private TextView textview;
	private Button button;
	private EditText textedit;
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        setContentView(R.layout.chat);
	        
	        this.scrollview=(ScrollView)findViewById(R.id.scroolview);
	        this.scrollview.setScrollbarFadingEnabled(false);
	        this.scrollview.setVerticalScrollBarEnabled(true);
	        
	        this.textview=(TextView)findViewById(R.id.label);
	        this.textview.setBackgroundColor(Color.WHITE);
	        this.textedit=(EditText)findViewById(R.id.entry);
	        
	        this.textedit.setTextColor(Color.BLUE);
	        
	        this.textedit.setOnKeyListener(new OnKeyListener()
	        {

				@Override
				public boolean onKey(View arg0, int arg1, KeyEvent arg2) {
					if(arg1==KeyEvent.KEYCODE_ENTER)
					{
						sendMessage();
						return true;
					}
					return false;
				}
	        	
	        });
	        
	        this.button=(Button)findViewById(R.id.send);
	        button.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v) {
					sendMessage();				
				}        	
	        });   

	    }
	 
	 private void sendMessage()
	 {		
		 FactoryMaker.getInstance().setAdapter(new Adapter(this));
		 FactoryMaker.getInstance().setMessage(this.textedit.getText().toString());
		 AbstractCommandFactory acf=FactoryMaker.getInstance().create(4);
		 Ctrl.getInstance().execute(acf.create());		 
	 }
	 
	 public TextView getTextView()
	 {
		 return textview;
	 }
	 
	 public EditText getEditText()
	 {
		 return textedit;
	 }
	 
}
