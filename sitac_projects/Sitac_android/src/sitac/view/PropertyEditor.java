package sitac.view;

import sitac.control.AbstractCommandFactory;
import sitac.control.Adapter;
import sitac.control.Ctrl;
import sitac.control.FactoryMaker;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class PropertyEditor extends RelativeLayout {
	
	private Selectable selected;
	private Button buttoncol;
	private AlertDialog alert;

	public PropertyEditor(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public void setSelectable(Selectable newSelectable)
	{
		selected=newSelectable;
	}
	
	public Selectable getSelectable()
	{
		return selected;
	}
	
	public void setSelectableButtonsVisible(boolean visibility)
	{
		if(visibility==true)
			buttoncol.setVisibility(View.VISIBLE);
		else
			buttoncol.setVisibility(View.INVISIBLE);
	}
	
	protected void addDefaultButtons()
	{
		buttoncol=(Button)findViewById(R.id.button5);
		buttoncol.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				if(selected.isSelected==true)
					showDialog();				
			}        	
        });
	}
	
	private void changeSelectableColor(int color)
	{		
		FactoryMaker.getInstance().setAdapter(new Adapter(getContext()));
		FactoryMaker.getInstance().setSelectable(selected);
		FactoryMaker.getInstance().setIntParam(color);
		AbstractCommandFactory acf=FactoryMaker.getInstance().create(6);
		Ctrl.getInstance().execute(acf.create());
		
		this.setVisibility(View.INVISIBLE);
	}
	
	private void showDialog()
	{
		final CharSequence[] items = {"Red", "Blue", "Green", "Yellow","Black"};
		
    	AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
    	builder.setTitle("Choose color");
    	builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
    	    public void onClick(DialogInterface dialog, int item) {
    	       switch(item)
    	       {
    	       case 0:
    	    	   changeSelectableColor(Color.RED);
    	    	   break;
    	       case 1:
    	    	   changeSelectableColor(Color.BLUE);
    	    	   break;
    	       case 2:
    	    	   changeSelectableColor(Color.GREEN);
    	    	   break;
    	       case 3:
    	    	   changeSelectableColor(Color.YELLOW);
    	    	   break;
    	       case 4:
    	    	   changeSelectableColor(Color.BLACK);
    	    	   break;
    	       }
    	       alert.dismiss();
    	    }
    	});
    	this.alert = builder.create();
    	alert.show();
    	this.setVisibility(View.INVISIBLE);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent e)
	{
		this.setVisibility(View.INVISIBLE);
		return super.onTouchEvent(e);
	}
}
