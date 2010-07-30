package sitac.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

public class LibToolBox extends ExpandableListView{

	private final String NAME = "name";
	private final String IMAGE = "image";
    protected ArrayList<HashMap<String, String>> headerData = new ArrayList<HashMap<String, String>>();
    protected ArrayList<ArrayList<HashMap<String, Object>>> childData = new ArrayList<ArrayList<HashMap<String, Object>>>();
    
    private ArrayList<Library> library;
    
	public LibToolBox(Context context) {
		super(context);
		library=new ArrayList<Library>();
		// TODO Auto-generated constructor stub
	}

    public LibToolBox(Context context,AttributeSet attrs)
    {
    	super(context,attrs);
    	library=new ArrayList<Library>();
    }
    
    public void init()
    {
    	final HashMap<String, String> group1 = new HashMap<String, String>();
		group1.put(NAME, "Engines");
		headerData.add( group1 );

		final HashMap<String, String> group2 = new HashMap<String, String>();
		group2.put(NAME, "Dangers");
		headerData.add( group2);
		
		final HashMap<String, String> group3 = new HashMap<String, String>();
		group3.put(NAME, "MapItems");
		headerData.add( group3);

		final ArrayList<HashMap<String, Object>> group1data = new ArrayList<HashMap<String, Object>>();
		childData.add(group1data);

		final ArrayList<HashMap<String, Object>> group2data = new ArrayList<HashMap<String, Object>>();
		childData.add(group2data);
		
		final ArrayList<HashMap<String, Object>> group3data = new ArrayList<HashMap<String, Object>>();
		childData.add(group3data);

        Library lib1=new Library();
        lib1.setName("Engines");
        Library lib2=new Library();
        lib2.setName("Dangers");
        Library lib3=new Library();
        lib3.setName("MapItems");
        
        OverlayItemFactory fact=new OverlayItemFactory();
        
		// Set up some sample data in both groups
		for( int i=0; i<9; ++i) {
			final HashMap<String, Object> map = new HashMap<String,Object>();
			ItemType item=fact.createNewItem(i, 0, getContext());
			map.put(NAME, item.getTitle());
			map.put(IMAGE, item.getIcon());
			if(i<=2)
			{
				group1data.add(map);
				lib1.addItem(item);
			}
			else if(i<=5)
			{
				group2data.add(map);
				lib2.addItem(item);
			}
			else if(i<=8)
			{
				group3data.add(map);
				lib3.addItem(item);
			}

		}
		
		library.add(lib1);
		library.add(lib2);
		library.add(lib3);

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

				// Populate your custom view here
				((TextView)v.findViewById(R.id.name)).setText( (String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(NAME) );
				((ImageView)v.findViewById(R.id.image)).setImageDrawable( (Drawable) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(IMAGE) );
                //((LibToolBox)v.findViewById(R.id.newlist2)).setBackgroundColor(Color.RED);
				
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
   
    private void addGroup(String name)
    {
    	HashMap<String, String> group = new HashMap<String, String>();
		group.put(NAME, name);
		headerData.add( group);
		
		ArrayList<HashMap<String, Object>> newgroupdata = new ArrayList<HashMap<String, Object>>();
		childData.add(newgroupdata);
		
		this.addDefaultAdapter();
    }
    
    private void addChild(int groupPos,String description,Drawable icon)
    {
    	HashMap<String, Object> map = new HashMap<String,Object>();
		map.put(NAME, description );
		map.put(IMAGE, icon);
    	childData.get(groupPos).add(map);
    	
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
    
   public void addDefaultClickListener()
   {
	   this.setOnChildClickListener(new ExpandableListView.OnChildClickListener(){

		@Override
		public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
			// TODO Auto-generated method stub
			
			int nrgroups=getNrLibraries();
			for(int i=0;i<nrgroups;i++)
				collapseGroup(i);
			
			MapWidget mpw=(MapWidget)getContext();
			
			if(groupPosition<2)
			{
			mpw.getItemizedOverlay().setNewItem(true);
			mpw.getItemizedOverlay().setNewItemType(library.get(groupPosition).getItemAtIndex(childPosition).getType());
			mpw.getItemizedOverlay().setNewItemGroup(library.get(groupPosition).getItemAtIndex(childPosition).getGroup());
			}
			
			if(groupPosition==2)
			{
				mpw.getPathOverlay().setItemType(childPosition);
				mpw.getPathOverlay().putNewItem(mpw.getMapView());
			}
			return true;
		}
		   
	   });
   }
   
   public boolean onTouchEvent(MotionEvent event)
   {
	   return super.onTouchEvent(event);
   }
}
