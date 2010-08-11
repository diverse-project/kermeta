package sitac.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.andnav.osm.DefaultResourceProxyImpl;
import org.andnav.osm.ResourceProxy;
import org.andnav.osm.views.OpenStreetMapView;
import org.andnav.osm.views.overlay.OpenStreetMapViewItemizedOverlay;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import sitac.control.AbstractCommandFactory;
import sitac.control.Adapter;
import sitac.control.Ctrl;
import sitac.control.FactoryMaker;
import sitac.view.util.OverlayItemFactory;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.util.Xml;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MapWidget extends Activity {
    /** Called when the activity is first created. */

    private OpenStreetMapView mOsmv; 
    private MyPathOverlay pathoverlay;
    private MyItemizedOverlay mMyLocationOverlay; 
    private ResourceProxy mResourceProxy;
    private Button button,button2;
    private AlertDialog alert;
    private LibToolBox listview;
    private PropertyEditor propedit;

	@Override    
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        
        mResourceProxy = new DefaultResourceProxyImpl(getApplicationContext());
        
        this.setContentView(R.layout.main);
        this.mOsmv=(OpenStreetMapView)findViewById(R.id.osmapview);
        
        /* Itemized Overlay */
        {
        	Drawable draw=this.getResources().getDrawable(R.drawable.icon);
        	draw.setAlpha(150);
        	draw.setBounds(0,0, draw.getIntrinsicWidth(), draw.getIntrinsicHeight());

        	final ArrayList<MyOverlayItem> items = new ArrayList<MyOverlayItem>();                

        	/* OnTapListener for the Markers, shows a simple Toast. */
        	this.mMyLocationOverlay = new MyItemizedOverlay(this, items,null,null, new OpenStreetMapViewItemizedOverlay.OnItemTapListener<MyOverlayItem>(){
        		@Override
        		public boolean onItemTap(int index, MyOverlayItem item) {
        			Toast t=  Toast.makeText(MapWidget.this, "Item '" + item.getTitle() + "' : "+item.getDescription(), Toast.LENGTH_LONG);
        			t.setDuration(100);
        			t.show();
        			item.setSelected(true);
        			FactoryMaker.getInstance().setAdapter(new Adapter(MapWidget.this));
        			FactoryMaker.getInstance().setOverlayItem(item);
        			try {
        				FactoryMaker.getInstance().setOldMapPoint((MapPoint)item.getPosition().clone());
        			} catch (CloneNotSupportedException e) {
        				e.printStackTrace();
        			}
        			propedit.setOverlayItem(item);
        			propedit.setItemButtonsVisible();
        			propedit.setVisibility(View.VISIBLE);
        			return true; // We 'handled' this event.
        		}
        	}, mResourceProxy);
        	this.mOsmv.getOverlays().add(this.mMyLocationOverlay);
        }
        
        this.mOsmv.setBuiltInZoomControls(true);
        this.mOsmv.getController().setCenter(new MapPoint(47.25,-1.38).toGeoPoint());
        this.mOsmv.getController().setZoom(10);
        
        this.pathoverlay=new MyPathOverlay(Color.BLACK,this);
        this.mOsmv.getOverlays().add(this.pathoverlay);
        
        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				saveCoord();				
			}        	
        });
        
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				loadCoord();				
			}        	
        });
        
        listview=(LibToolBox)findViewById(R.id.newlist);
        listview.setVisibility(View.VISIBLE);
        listview.init();
        listview.addDefaultAdapter();
        listview.addDefaultClickListener();
        
        propedit=(PropertyEditor)findViewById(R.id.newpropedit);
        propedit.setVisibility(View.INVISIBLE);
        propedit.addDefaultButtons();
        
       
        this.alert=null;
        this.mOsmv.invalidate();
   
    }
   
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    
	    case R.id.item:
	    	final CharSequence[] items = {"Red", "Green", "Blue"};

	    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    	builder.setTitle("Choose type");
	    	builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
	    	    public void onClick(DialogInterface dialog, int item) {
	    	       FactoryMaker.getInstance().setIntParam1(item);
	    	       dialog();
	    	    }
	    	});
	    	this.alert = builder.create();
	    	alert.show();
	        return true;
	    case R.id.delete:
	    	int index=this.pathoverlay.getItemIndex();
	    	if(index!=-1)
	    	{
	    		int nr=pathoverlay.getItems().get(index).getPoints().size();
                
	    		FactoryMaker.getInstance().setAdapter(new Adapter(this));
	    		FactoryMaker.getInstance().setMapItem(pathoverlay.getItems().get(index));
	    		AbstractCommandFactory acf=FactoryMaker.getInstance().create(8);
	    		Ctrl.getInstance().execute(acf.create());
	    		
	    		Ctrl.getInstance().deleteCommandsOnDelete(nr);
	    	}
	    	index=this.mMyLocationOverlay.itemSelected();
	    	if(index!=-1)
	    	{
	    		FactoryMaker.getInstance().setAdapter(new Adapter(this));
	    		FactoryMaker.getInstance().setOverlayItem(mMyLocationOverlay.getOverlayItems().get(index));
	    		AbstractCommandFactory acf=FactoryMaker.getInstance().create(9);
	    		Ctrl.getInstance().execute(acf.create());
	    	}
	        return true;
	    case R.id.undo:
	    	Ctrl.getInstance().undo();
	    	return true;
	    case R.id.redo:
	    	Ctrl.getInstance().redo();
	    	return true;
	    case R.id.black:
	    	this.pathoverlay.setColor(Color.BLACK);
	    	return true;
	    case R.id.blue:
	    	this.pathoverlay.setColor(Color.BLUE);
	    	return true;
	    case R.id.green:
	        this.pathoverlay.setColor(Color.GREEN);
	    	return true;
	    case R.id.red:
	    	this.pathoverlay.setColor(Color.RED);
	    	return true;
	    case R.id.yellow:
	    	this.pathoverlay.setColor(Color.YELLOW);
	    	return true;
	    default: return super.onOptionsItemSelected(item);
	        	
	    }
	}
	
	private void saveCoord()
	{
		File newxmlfile = new File(Environment.getExternalStorageDirectory()+"/coord.xml");
		        try{
		                newxmlfile.createNewFile();
		        }catch(IOException e){
		                Log.e("IOException", "exception in createNewFile() method");
		        }
		        //we have to bind the new file with a FileOutputStream
		        FileOutputStream fileos = null;        
		        try{
		                fileos = new FileOutputStream(newxmlfile);
		        }catch(FileNotFoundException e){
		                Log.e("FileNotFoundException", "can't create FileOutputStream");
		        }
		        //we create a XmlSerializer in order to write xml data
		        XmlSerializer serializer = Xml.newSerializer();
		        try {
		                //we set the FileOutputStream as output for the serializer, using UTF-8 encoding
		                        serializer.setOutput(fileos, "utf-8");
		                        //Write <?xml declaration with encoding (if encoding not null) and standalone flag (if standalone not null)
		                        serializer.startDocument(null, Boolean.valueOf(true));
		                        //set indentation option
		                        serializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
		                        //start a tag called "root"
		                        serializer.startTag(null, "map");
		                                serializer.startTag(null, "center");
		                                serializer.attribute(null, "lat", mOsmv.getMapCenter().getLatitudeE6()+"");
		                                serializer.attribute(null, "long", mOsmv.getMapCenter().getLongitudeE6()+"");
		                                serializer.endTag(null, "center");
		                                int size=this.mMyLocationOverlay.getOverlayItems().size();
		                                for(int i=0;i<size;i++)
		                                {
		                                	MyOverlayItem item=(MyOverlayItem)this.mMyLocationOverlay.getOverlayItems().get(i);
		                                	serializer.startTag(null,"item");
		                                	serializer.attribute(null, "lat", item.getPosition().getLatitudeE6()+"");
		                                	serializer.attribute(null, "long", item.getPosition().getLongitudeE6()+"");
		                                	serializer.attribute(null, "title",item.mTitle);
		                                	serializer.attribute(null, "desc",item.mDescription);
		                                	serializer.attribute(null,"type",item.getType()+"");
		                                	serializer.attribute(null, "group", item.getGroup()+"");
		                                	serializer.endTag(null, "item");
		                                }
		                                size=this.pathoverlay.getItems().size();
		                                for(int i=0;i<size;i++)
		                                {
		                                	ArrayList<MapPoint> l=this.pathoverlay.getItems().get(i).getPoints();
		                                	serializer.startTag(null,"shape");
		                                	int dim=l.size();
		                                	serializer.attribute(null, "nopoints", dim+"");
		                                	if(this.pathoverlay.getItems().get(i) instanceof MapZone)
		                                		serializer.attribute(null, "type", "triangle");
		                                	else serializer.attribute(null,"type", "random");
		                                	for(int j=0;j<dim;j++)
		                                	{     	
		                                	serializer.attribute(null, "lat"+j, l.get(j).getLatitudeE6()+"");
		                                	serializer.attribute(null, "long"+j, l.get(j).getLongitudeE6()+"");
		                                	}
		                                	serializer.attribute(null, "color",this.pathoverlay.getItems().get(i).getColor()+"");
		                                	serializer.endTag(null,"shape");
		                                }
		                        serializer.endTag(null, "map");
		                        serializer.endDocument();
		                        //write xml data into the FileOutputStream
		                       serializer.flush();
		                        //finally we close the file stream
		                        fileos.close();
		                       
		                } catch (Exception e) {
		                        Log.e("Exception","error occurred while creating xml file");
		                         }	
	}
	
	private void loadCoord()
	{
		this.mMyLocationOverlay.getOverlayItems().clear();
		this.pathoverlay.getItems().clear();
		
		 try{	
				XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		        factory.setNamespaceAware(true);
		        XmlPullParser xpp = factory.newPullParser();
		        
		        FileInputStream fis = new FileInputStream(Environment.getExternalStorageDirectory()+"/coord.xml");
		        xpp.setInput(new InputStreamReader(fis,"utf-8"));
		        int eventType = xpp.getEventType();
		        while (eventType != XmlPullParser.END_DOCUMENT) {
		         if(eventType == XmlPullParser.START_DOCUMENT) {
		             System.out.println("Start document");
		         } else if(eventType == XmlPullParser.END_DOCUMENT) {
		             System.out.println("End document");
		             this.mOsmv.invalidate();
		         } else if(eventType == XmlPullParser.START_TAG) {
	            	 System.out.println("Start tag "+xpp.getName());
		             if(xpp.getName().equals("center"))
		             {
		            	 String lat=xpp.getAttributeValue(null, "lat");
		            	 String longit=xpp.getAttributeValue(null,"long");
		            	 MapPoint gp=new MapPoint(Integer.parseInt(lat),Integer.parseInt(longit));
		            	 mOsmv.getController().animateTo(gp.toGeoPoint());
		            	 mOsmv.invalidate();
		             }
		             else if(xpp.getName().equals("item"))
		             {
		            	 String lat=xpp.getAttributeValue(null, "lat");
		            	 String longit=xpp.getAttributeValue(null,"long");
		            	 int type=Integer.parseInt(xpp.getAttributeValue(null, "type"));
		            	 int group=Integer.parseInt(xpp.getAttributeValue(null, "group"));
		            	 MapPoint gp=new MapPoint(Integer.parseInt(lat),Integer.parseInt(longit));
		            	 OverlayItemFactory fact=new OverlayItemFactory();
		            	 ItemType itemtype=fact.createNewItem(type, group,this);
		            	 MyOverlayItem item=new MyOverlayItem(itemtype,gp);
		            	 this.mMyLocationOverlay.addItem(item);
		            	 this.mOsmv.invalidate();
		             }
		             else if(xpp.getName().equals("shape"))
		             {	     
		            	 MapItem s=null;
		            	 String color=xpp.getAttributeValue(null, "color");
		            	 int dim=Integer.parseInt(xpp.getAttributeValue(null, "nopoints"));
		            	 String type=xpp.getAttributeValue(null,"type");
		            	 if(type.equals("triangle"))
		            	 {
		            	    s=new MapZone();
		            	 }
		            	 else
		            	 {
		            	    s=new MapLine();
		            	 }
		            	 
		            	 for(int i=0;i<dim;i++)
		            	 {
		            		 String lat=xpp.getAttributeValue(null,"lat"+i);
			            	 String longit=xpp.getAttributeValue(null,"long"+i);
			            	 MapPoint gp=new MapPoint(Integer.parseInt(lat),Integer.parseInt(longit));
			            	 s.addPoint(gp);
		            	 }
                        s.setColor(Integer.parseInt(color)); 
                        this.pathoverlay.addItem(s);
		             }
		         } else if(eventType == XmlPullParser.END_TAG) {
		             System.out.println("End tag "+xpp.getName());
		         } else if(eventType == XmlPullParser.TEXT) {
		             System.out.println("Text "+xpp.getText());
		         }
		         eventType = xpp.next();
		        }

			  }
			  catch(Exception e)
			  {
				  e.printStackTrace();
				  this.mMyLocationOverlay.addItem(new MyOverlayItem(e.toString(),null,new MapPoint(this.mOsmv.getMapCenterLatitudeE6(),this.mOsmv.getMapCenterLongitudeE6())));
			      this.mOsmv.invalidate();
			  }
	}
	
	private void dialog()
	{
		this.alert.dismiss();
		final CharSequence[] items = {"Single", "Group", "Group of groups"};

    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setTitle("Choose number");
    	builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
    	    public void onClick(DialogInterface dialog, int item) {
    	       mMyLocationOverlay.setNewItem(true);
    	       FactoryMaker.getInstance().setIntParam2(item);
    	       alert.dismiss();
    	    }
    	});
    	this.alert = builder.create();
    	alert.show();
	}
	
	public MyItemizedOverlay getItemizedOverlay()
	{
		return this.mMyLocationOverlay;
	}
	
	public PropertyEditor getPropertyEditor()
	{
		return this.propedit;
	}
	
	public MyPathOverlay getPathOverlay()
	{
		return this.pathoverlay;
	}
	
	public OpenStreetMapView getMapView()
	{
		return this.mOsmv;
	}
}