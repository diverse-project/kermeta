package sitac.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import sitac.control.AbstractCommandFactory;
import sitac.control.Adapter;
import sitac.control.Ctrl;
import sitac.control.CtrlMoyens;
import sitac.control.FactoryMaker;

import sitac.view.util.OverlayItemFactory;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;

/**
 * 
 * @author Catalin Cupse
 * The class for displaying the list from which you can choose the items to place on the map.
 * The engines contained are the ones added from the EnginesActivity panel.
 */

public class LibToolBox extends ExpandableListView{

	private final String NAME = "name";
	private final String IMAGE = "image";
	private final String ID="id";
    protected ArrayList<HashMap<String, String>> headerData = new ArrayList<HashMap<String, String>>();
    protected ArrayList<ArrayList<HashMap<String, Object>>> childData = new ArrayList<ArrayList<HashMap<String, Object>>>();
    
    private ArrayList<Library> library;
    
	public LibToolBox(Context context) {
		super(context);
		library=new ArrayList<Library>();
		CtrlMoyens.getInstance().setToolBox(this);
	}

    public LibToolBox(Context context,AttributeSet attrs)
    {
    	super(context,attrs);
    	library=new ArrayList<Library>();
    	CtrlMoyens.getInstance().setToolBox(this);
    }
    
    public void init()
    {
    	final HashMap<String, String> group1 = new HashMap<String, String>();
		group1.put(NAME, "Fire engines");
		headerData.add( group1 );
		
		final HashMap<String, String> group2 = new HashMap<String, String>();
		group2.put(NAME, "Ambulances");
		headerData.add( group2 );

		final HashMap<String, String> group3 = new HashMap<String, String>();
		group3.put(NAME, "Dangers");
		headerData.add( group3);
		
		final HashMap<String, String> group4 = new HashMap<String, String>();
		group4.put(NAME, "MapItems");
		headerData.add( group4);

		final ArrayList<HashMap<String, Object>> group1data = new ArrayList<HashMap<String, Object>>();
		childData.add(group1data);

		final ArrayList<HashMap<String, Object>> group2data = new ArrayList<HashMap<String, Object>>();
		childData.add(group2data);
		
		final ArrayList<HashMap<String, Object>> group3data = new ArrayList<HashMap<String, Object>>();
		childData.add(group3data);
		
		final ArrayList<HashMap<String, Object>> group4data = new ArrayList<HashMap<String, Object>>();
		childData.add(group4data);

        Library lib1=new Library();
        lib1.setName("Fire engines");
        Library lib2=new Library();
        lib2.setName("Ambulances");
        Library lib3=new Library();
        lib3.setName("Dangers");
        Library lib4=new Library();
        lib4.setName("MapItems");
        
        OverlayItemFactory fact=new OverlayItemFactory();
        
		// Set up some sample data in both groups
		for( int i=3; i<9; ++i) {
			final HashMap<String, Object> map = new HashMap<String,Object>();
			ItemType item=fact.createNewItem(i, 0, getContext());
			map.put(NAME, item.getTitle());
			map.put(IMAGE, item.getIcon());
			map.put(ID, "-1");
			if(i<=5)
			{
				group3data.add(map);
				lib3.addItem(item);
			}
			else if(i<=8)
			{
				group4data.add(map);
				lib4.addItem(item);
			}

		}
		
		library.add(lib1);
		library.add(lib2);
		library.add(lib3);
		library.add(lib4);
    }
    
    public void addDefaultAdapter()
    {
    	this.setAdapter( new SimpleExpandableListAdapter(
				getContext(),
				headerData,
				R.layout.explist,
				new String[] { NAME },            // the name of the field data
				new int[] { android.R.id.text1 }, // the text field to populate with the field data
				childData,
			    0,
				null,
				new int[] {}
		) {

			@SuppressWarnings("unchecked")
			@Override
			public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
				final View v = super.getChildView(groupPosition, childPosition, isLastChild, convertView, parent);
				((TextView)v.findViewById(R.id.name)).setText( (String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(NAME) );
				((ImageView)v.findViewById(R.id.image)).setImageDrawable( (Drawable) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(IMAGE) );
				((TextView)v.findViewById(R.id.number)).setText( (String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(ID) );				
				return v;
			}

			@Override
			public View newChildView(boolean isLastChild, ViewGroup parent) {
				LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				return layoutInflater.inflate(R.layout.child, null, false);
			}
		}
		);
    }
   
    public void addGroup(String name)
    {
    	HashMap<String, String> group = new HashMap<String, String>();
		group.put(NAME, name);
		headerData.add( group);
		
		ArrayList<HashMap<String, Object>> newgroupdata = new ArrayList<HashMap<String, Object>>();
		childData.add(newgroupdata);
		
		Library lib=new Library();
        lib.setName(name);
        library.add(lib);
		
		this.addDefaultAdapter();
    }
    
    public void addChild(int groupPos,String description,Drawable icon)
    {
    	HashMap<String, Object> map = new HashMap<String,Object>();
		map.put(NAME, description );
		map.put(IMAGE, icon);
		map.put(ID, "-1");
    	childData.get(groupPos).add(map);
    	
    	OverlayItemFactory fact=new OverlayItemFactory();
    	ItemType item=fact.createNewItem(groupPos, 0, getContext());
    	library.get(groupPos).addItem(item);   	
    }
    
    public void addMoyenChild(int groupPos,String title,String name,Drawable icon,int type,int moyenindex)
    {
    	HashMap<String, Object> map = new HashMap<String,Object>();
		map.put(NAME, title+" "+name );
		map.put(IMAGE, icon);
		map.put(ID, ""+moyenindex);
    	childData.get(groupPos).add(map);
    	
    	OverlayItemFactory fact=new OverlayItemFactory();
    	ItemType item=fact.createNewItem(groupPos, type, title, name, getContext());
    	item.setIcon(icon);
    	library.get(groupPos).addItem(item);   	
    }
    
    public void updateMoyenChildDescription(int index)
    {
    	for(int group=0;group<2;group++)
    	{
    		int size=childData.get(group).size();
    		for(int i=0;i<size;i++)
    		{
    			int nr=Integer.parseInt(childData.get(group).get(i).get(ID).toString());
    			if(nr==index)
    			{
    				childData.get(group).get(i).put(NAME,CtrlMoyens.getInstance().getMoyenType(index)+" "+CtrlMoyens.getInstance().getMoyenName(index));
    				if(isGroupExpanded(group))
    				{
    					collapseGroup(group);
    					expandGroup(group);
    				}
    				library.get(group).getItemAtIndex(i).setDescription(CtrlMoyens.getInstance().getMoyenName(index));
    				break;
    			}
    		}
    	}
    }
    
    public void updateMoyenChildIcon(int index)
    {
    	for(int group=0;group<2;group++)
    	{
    		int size=childData.get(group).size();
    		for(int i=0;i<size;i++)
    		{
    			int nr=Integer.parseInt(childData.get(group).get(i).get(ID).toString());
    			if(nr==index)
    			{
    				if(childData.get(group).get(i).get(NAME).toString().contains("FPT"))
    				{
    					childData.get(group).get(i).put(IMAGE,getResources().getDrawable(R.drawable.redsingle));
    					library.get(group).getItemAtIndex(i).setIcon(getResources().getDrawable(R.drawable.redsingle));
    				}
    				else
    				{
    					childData.get(group).get(i).put(IMAGE,getResources().getDrawable(R.drawable.greensingle));
    					library.get(group).getItemAtIndex(i).setIcon(getResources().getDrawable(R.drawable.greensingle));
    				}
    				if(isGroupExpanded(group))
    				{
    					collapseGroup(group);
    					expandGroup(group);
    				}
    				library.get(group).getItemAtIndex(i).setDescription(CtrlMoyens.getInstance().getMoyenName(index));
    				break;
    			}
    		}
    	}
    }
    
    public int getNrLibraries()
    {
    	return library.size();
    }
    
    public int getTotalLibraryItems()
    {
    	int total=0;
    	int size=library.size();
    	for(int i=0;i<size;i++)
    	{
    		total+=library.get(i).getItems().size();
    	}
    	return total;
    }
    
    public ArrayList<Library> getLibraries()
    {
    	return library;
    }
    
    public void addLibrary(Library lib)
    {
    	this.addGroup(lib.getName());
    	int size=lib.getItems().size();
    	for(int i=0;i<size;i++)
    	{
    		this.addChild(this.getNrLibraries()-1, lib.getItemAtIndex(i).getTitle(),lib.getItemAtIndex(i).getIcon());
    	}
    }
    
    public void deleteItemFromLibrary(ItemType item)
    {
    	for(int group=0;group<2;group++)
    	{
    		int index=library.get(group).indexOf(item);
    		if(index!=-1)
    		{
    			library.get(group).getItems().remove(index);
    			childData.get(group).remove(index);   			
    			break;
    		}
    	}
    }
    
    public void addItemToLibrary(ItemType item, int index)
    {
    	HashMap<String, Object> map = new HashMap<String,Object>();
		map.put(NAME, item.getTitle()+" "+item.getDescription() );
		map.put(IMAGE, item.getIcon());
		map.put(ID, ""+index);
    	
    	if(item.getTitle().equals("FPT"))
    	{
    		childData.get(0).add(map);
    		library.get(0).addItem(item);
    	}
    	else
    	{
    		childData.get(1).add(map);
    		library.get(1).addItem(item);
    	}
    	
    }
    
   public void addDefaultClickListener()
   {
	   this.setOnChildClickListener(new ExpandableListView.OnChildClickListener(){

		@Override
		public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
			
			int nrgroups=getNrLibraries();
			for(int i=0;i<nrgroups;i++)
				collapseGroup(i);
			
			if(groupPosition<3)
			{
			((MapWidget)getContext()).getItemizedOverlay().setNewItem(true);
			FactoryMaker.getInstance().setAdapter(new Adapter(getContext()));
			int engine=Integer.parseInt(((TextView)v.findViewById(R.id.number)).getText().toString());
			library.get(groupPosition).getItemAtIndex(childPosition).setMoyenId(engine);
			FactoryMaker.getInstance().setLibItemType(library.get(groupPosition).getItemAtIndex(childPosition));
			}
			
			if(groupPosition==3)
			{
				FactoryMaker.getInstance().setAdapter(new Adapter(getContext()));
				if(childPosition==0)
					FactoryMaker.getInstance().setItemType("MapPoint");
				if(childPosition==1)
					FactoryMaker.getInstance().setItemType("MapLine");
				if(childPosition==2)
					FactoryMaker.getInstance().setItemType("MapZone");
				AbstractCommandFactory acf=FactoryMaker.getInstance().create(0);
				Ctrl.getInstance().execute(acf.create());
			}
			return true;
		}
		   
	   });
   }
   
   @Override
public boolean onTouchEvent(MotionEvent event)
   {
	   return super.onTouchEvent(event);
   }
}
