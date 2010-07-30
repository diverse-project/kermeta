package sitac.view;

import android.graphics.drawable.Drawable;

public class ItemType extends Draggable {

	private int type;
	private int group;
	private String description;
	private String title;
	private Drawable icon;
	
	public ItemType() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public ItemType(int type,int group,String title,String description)
	{
		this();
		this.type=type;
		this.group=group;
		this.title=title;
		this.description=description;
	}
	
	public ItemType(int type,int group,String title, String description,Drawable icon)
	{
		this(type,group,title,description);
		this.icon=icon;
	}
	
	public void setType(int type)
	{
		this.type=type;
	}
	
	public int getType()
	{
		return type;
	}

	public void setGroup(int group)
	{
		this.group=group;
	}
	
	public int getGroup()
	{
		return group;
	}
	
	public void setDescription(String description)
	{
		this.description=description;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setIcon(Drawable icon)
	{
		this.icon=icon;
	}
	
	public Drawable getIcon()
	{
		return icon;
	}
	
	public String toString()
	{
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Type: ");
		result.append(type);
		result.append(", Group: ");
		result.append(group);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}
}
