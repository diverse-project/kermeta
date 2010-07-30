package sitac.view;

import sitac.view.util.OverlayItemFactory;
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
		// TODO Auto-generated constructor stub
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
	
	protected void setSelectableButtonsVisible()
	{
		buttoncol.setVisibility(View.VISIBLE);
		buttonplus.setVisibility(View.INVISIBLE);
		buttonminus.setVisibility(View.INVISIBLE);
	}
	
	protected void setItemButtonsVisible()
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
				// TODO Auto-generated method stub
				if(selected.isSelected==true)
					showDialog();				
			}        	
        });
		
		buttonplus=(Button)findViewById(R.id.button3);
		buttonplus.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(item.isSelected()==true)
						moreLessItems(1);				
				}        	
	        });
		buttonplus.setVisibility(View.INVISIBLE);
		
		buttonminus=(Button)findViewById(R.id.button4);
		buttonminus.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(item.isSelected()==true)
						moreLessItems(-1);				
				}        	
	        });
		buttonminus.setVisibility(View.INVISIBLE);
	}
	
	private void changeSelectableColor(int color)
	{
		if(selected instanceof MapItem)
		{
			MapItem item=(MapItem)selected;
			item.setColor(color);
			selected.setSelected(false);
			((MapWidget)getContext()).getMapView().invalidate();
		}
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
    		int type=item.getType();
    		int group=item.getGroup();
    		int newgroup=group+dir;
    		if((newgroup<=2)&&(newgroup>=0))
    		{   		
    			OverlayItemFactory fact=new OverlayItemFactory();
    			ItemType itemtype=fact.createNewItem(type, newgroup, getContext());
    			item.setItemType(itemtype);
    		}
    	
    	this.setVisibility(View.INVISIBLE);
	}
	
	public boolean onTouchEvent(MotionEvent e)
	{
		this.setVisibility(View.INVISIBLE);
		return super.onTouchEvent(e);
	}
}
