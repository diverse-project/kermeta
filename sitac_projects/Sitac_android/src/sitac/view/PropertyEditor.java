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
	private MyOverlayItem item;
	private Button buttoncol,buttonplus,buttonminus;
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
	
	public void setOverlayItem(MyOverlayItem newItem)
	{
		item=newItem;
	}
	
	public MyOverlayItem getOverlayItem()
	{
		return item;
	}
	
	public void setSelectableButtonsVisible()
	{
		buttoncol.setVisibility(View.VISIBLE);
		buttonplus.setVisibility(View.INVISIBLE);
		buttonminus.setVisibility(View.INVISIBLE);
	}
	
	public void setItemButtonsVisible()
	{
		buttoncol.setVisibility(View.INVISIBLE);
		buttonplus.setVisibility(View.VISIBLE);
		buttonminus.setVisibility(View.VISIBLE);
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
		
		buttonplus=(Button)findViewById(R.id.button3);
		buttonplus.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v) {
					if(item.isSelected()==true)
						moreLessItems(1);				
				}        	
	        });
		buttonplus.setVisibility(View.INVISIBLE);
		
		buttonminus=(Button)findViewById(R.id.button4);
		buttonminus.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v) {
					if(item.isSelected()==true)
						moreLessItems(-1);				
				}        	
	        });
		buttonminus.setVisibility(View.INVISIBLE);
	}
	
	private void changeSelectableColor(int color)
	{		
		FactoryMaker.getInstance().setAdapter(new Adapter(getContext()));
		FactoryMaker.getInstance().setSelectable(selected);
		FactoryMaker.getInstance().setIntParam2(color);
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
	
	private void moreLessItems(int dir)
	{
    	FactoryMaker.getInstance().setAdapter(new Adapter(getContext()));
		FactoryMaker.getInstance().setOverlayItem(item);
		FactoryMaker.getInstance().setIntParam2(dir);
		AbstractCommandFactory acf=FactoryMaker.getInstance().create(11);
		Ctrl.getInstance().execute(acf.create());
	}
	
	public boolean onTouchEvent(MotionEvent e)
	{
		this.setVisibility(View.INVISIBLE);
		return super.onTouchEvent(e);
	}
}
