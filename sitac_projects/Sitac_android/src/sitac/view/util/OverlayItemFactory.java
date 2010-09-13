package sitac.view.util;

import sitac.view.ItemType;
import sitac.view.R;
import android.content.Context;
import android.graphics.drawable.Drawable;

public class OverlayItemFactory extends OverlayItemAbstractFactory {

	@Override
	public ItemType createNewItem(int type, int group, Context ctx)
	{
		ItemType item=null;
		switch(type)
		{
		case 0:
			switch(group)
			{
			case 0:
				Drawable draw=ctx.getResources().getDrawable(R.drawable.redsingle);
				draw.setBounds(0, 0, draw.getIntrinsicWidth(), draw.getIntrinsicHeight());
				item=new ItemType(0,0,"FireEngine","Single",draw);
				break;
			case 1:
				Drawable draw1=ctx.getResources().getDrawable(R.drawable.redgroup);
				draw1.setBounds(0, 0, draw1.getIntrinsicWidth(), draw1.getIntrinsicHeight());
				item=new ItemType(0,1,"FireEngine","Group",draw1);
				break;
			case 2:
				Drawable draw2=ctx.getResources().getDrawable(R.drawable.redgroups);
				draw2.setBounds(0, 0, draw2.getIntrinsicWidth(), draw2.getIntrinsicHeight());
				item=new ItemType(0,2,"FireEngine","Group of groups",draw2);
				break;
			}
			break;
		case 1:
			switch(group)
			{
			case 0:
				Drawable draw=ctx.getResources().getDrawable(R.drawable.greensingle);
				draw.setBounds(0, 0, draw.getIntrinsicWidth(), draw.getIntrinsicHeight());
				item=new ItemType(1,0,"Medical eng.","Single",draw);
				break;
			case 1:
				Drawable draw1=ctx.getResources().getDrawable(R.drawable.greengroup);
				draw1.setBounds(0, 0, draw1.getIntrinsicWidth(), draw1.getIntrinsicHeight());
				item=new ItemType(1,1,"Medical eng.","Group",draw1);
				break;
			case 2:
				Drawable draw2=ctx.getResources().getDrawable(R.drawable.greengroups);
				draw2.setBounds(0, 0, draw2.getIntrinsicWidth(), draw2.getIntrinsicHeight());
				item=new ItemType(1,2,"Medical eng.","Group of groups",draw2);
				break;
			}
			break;
		case 2:
			switch(group)
			{
			case 0:
				Drawable draw=ctx.getResources().getDrawable(R.drawable.bluesingle);
				draw.setBounds(0, 0, draw.getIntrinsicWidth(), draw.getIntrinsicHeight());
				item=new ItemType(2,0,"Water supp.","Single",draw);
				break;
			case 1:
				Drawable draw1=ctx.getResources().getDrawable(R.drawable.bluegroup);
				draw1.setBounds(0, 0, draw1.getIntrinsicWidth(), draw1.getIntrinsicHeight());
				item=new ItemType(2,1,"Water supp.","Group",draw1);
				break;
			case 2:
				Drawable draw2=ctx.getResources().getDrawable(R.drawable.bluegroups);
				draw2.setBounds(0, 0, draw2.getIntrinsicWidth(), draw2.getIntrinsicHeight());
				item=new ItemType(2,2,"Water supp.","Group of groups",draw2);
				break;
			}
			break;
		case 3:
			Drawable draw=ctx.getResources().getDrawable(R.drawable.fire);
			draw.setBounds(0, 0, draw.getIntrinsicWidth(), draw.getIntrinsicHeight());
			item=new ItemType(3,0,"Fire","danger",draw);
			break;
		case 4:
			Drawable draw1=ctx.getResources().getDrawable(R.drawable.water);
			draw1.setBounds(0, 0, draw1.getIntrinsicWidth(), draw1.getIntrinsicHeight());
			item=new ItemType(4,0,"Water","danger",draw1);
			break;
		case 5:
			Drawable draw2=ctx.getResources().getDrawable(R.drawable.waste);
			draw2.setBounds(0, 0, draw2.getIntrinsicWidth(), draw2.getIntrinsicHeight());
			item=new ItemType(5,0,"Toxic waste","danger",draw2);
			break;
		case 6:
			Drawable draw3=ctx.getResources().getDrawable(R.drawable.point);
			draw3.setBounds(0, 0, draw3.getIntrinsicWidth(), draw3.getIntrinsicHeight());
			item=new ItemType(6,0,"MapPoint","MapItem",draw3);
			break;
		case 7:
			Drawable draw4=ctx.getResources().getDrawable(R.drawable.line);
			draw4.setBounds(0, 0, draw4.getIntrinsicWidth(), draw4.getIntrinsicHeight());
			item=new ItemType(7,0,"MapLine","MapItem",draw4);
			break;
		case 8:
			Drawable draw5=ctx.getResources().getDrawable(R.drawable.zone);
			draw5.setBounds(0, 0, draw5.getIntrinsicWidth(), draw5.getIntrinsicHeight());
			item=new ItemType(8,0,"MapZone","MapItem",draw5);
			break;
		}

		return item;
	}

	@Override
	public ItemType createNewItem(int type, int group, String title, String desc, Context ctx)
	{
		ItemType item=this.createNewItem(type, group, ctx);
		item.setTitle(title);
		item.setDescription(desc);		
		return item;
	}
	
}
