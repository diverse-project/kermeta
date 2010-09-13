package sitac.view;

import java.util.ArrayList;

public class Library {

	private ArrayList<ItemType> items;
	private String name;
	
	public Library()
	{
		items=new ArrayList<ItemType>();
		name="NewLibrary";
	}
	
	public Library(ArrayList<ItemType> items,String name)
	{
		this();
		this.items.addAll(items);
		this.name=name;
	}
	
	public void addItem(ItemType item)
	{
		items.add(item);
	}
	
	public ArrayList<ItemType> getItems()
	{
		return items;
	}
	
	public ItemType getItemAtIndex(int index)
	{
		return items.get(index);
	}
	
	public void setName(String newName)
	{
		name=newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int indexOf(ItemType item)
	{
		return items.indexOf(item);
	}
}
