package sitac.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import sitac.control.CtrlMoyens;
import sitac.control.CtrlSoiec;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;

/**
 * 
 * @author Catalin Cupse
 * The class used for displaying the data for the Execution tab of the SoiecActivity panel. An expandable list is also
 * used ( because Android doesn't provide a true tree structure).
 */

public class ExpListExec extends ExpandableListView {

	private final String NAME = "name";
	private final String COL1 = "name2";
	
	private View selectedview;
	
	private boolean moyenselected=false;
	
	protected ArrayList<HashMap<String, String>> headerData = new ArrayList<HashMap<String, String>>();
	protected ArrayList<ArrayList<HashMap<String, Object>>> childData = new ArrayList<ArrayList<HashMap<String, Object>>>();

	private ArrayList<Boolean> visible=new ArrayList<Boolean>();
	private final String[] letters={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	public ExpListExec(Context context)
	{
		super(context);
	}
	
	public ExpListExec(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public void addDefaultAdapter()
	{
		this.setAdapter( new SimpleExpandableListAdapter(
				getContext(),
				headerData,
				R.layout.objidmexplist,
				new String[] { NAME },            
				new int[] { R.id.headerobjlist }, 
				childData,
				0,
				null,
				new int[] {}
		) {

			@SuppressWarnings("unchecked")
			@Override
			public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
				final View v = super.getChildView(groupPosition, childPosition, isLastChild, convertView, parent);
				((TextView)v.findViewById(R.id.exectext)).setText( (String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(COL1));
				
				((TextView)v.findViewById(R.id.exectext)).setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View arg0) {
						if(visible.get(groupPosition*headerData.size()+childPosition).equals(true))
						{
							((LinearLayout)v.findViewById(R.id.execlist)).removeAllViews();
							visible.remove(groupPosition*headerData.size()+childPosition);
							visible.add(groupPosition*headerData.size()+childPosition, false);
						}
							else
						{
					 		addIDMs(v,groupPosition,childPosition);
					 		visible.remove(groupPosition*headerData.size()+childPosition);
					 		visible.add(groupPosition*headerData.size()+childPosition,true);
						}
						}	
				});
				return v;
			}

			@Override
			public View newChildView(boolean isLastChild, ViewGroup parent) {
				LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				return layoutInflater.inflate(R.layout.execexplistchild, null, false);
			}
		}
		);
	}

	/**
	 * Method for adding a new situation.
	 * @param text the description of the situation
	 */
	public void addGroup(String text)
	{
		HashMap<String, String> group = new HashMap<String, String>();
		group.put(NAME, text);
		headerData.add( group);

		ArrayList<HashMap<String, Object>> newgroupdata = new ArrayList<HashMap<String, Object>>();
		childData.add(newgroupdata);

		this.addDefaultAdapter();
	}

	/**
	 * Method for adding an objectif to a situation
	 * @param groupPos the index of the situation
	 * @param text1 the description of the objectif
	 */
	public void addChild(int groupPos,String text1)
	{
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put(COL1, text1);
		childData.get(groupPos).add(map);	
		visible.add(groupPos*headerData.size()+childData.get(groupPos).size()-1, false);
	}
	
	public void removeAllData()
	{
		headerData.removeAll(headerData);
		childData.removeAll(childData);
	}
	
	public int getNrGroups()
	{
		return headerData.size();
	}
	
	public void setMoyenSelected(View v)
	{
		LayoutInflater layoutInflater = (LayoutInflater)ExpListExec.this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		selectedview=layoutInflater.inflate(R.layout.engine, null, false);
		((ImageView)selectedview.findViewById(R.id.engineimage)).setImageDrawable(((ImageView)v.findViewById(R.id.engineimage)).getDrawable());
		((TextView)selectedview.findViewById(R.id.enginename)).setText(((TextView)v.findViewById(R.id.enginename)).getText());
		((TextView)selectedview.findViewById(R.id.enginename)).setGravity(Gravity.CENTER_VERTICAL);
		((TextView)selectedview.findViewById(R.id.enginenumber)).setText(((TextView)v.findViewById(R.id.enginenumber)).getText());
		((TextView)selectedview.findViewById(R.id.enginenumber)).setGravity(Gravity.CENTER_VERTICAL);
	}
	
	public void setIsMoyenSelected(boolean sel)
	{
		moyenselected=sel;
	}

	/**
	 * Method used for adding techniques to an objectif and to assign engines for a task.
	 * @param v the view that displays the data
	 * @param group the index of the situation
	 * @param child the index of the objectif
	 */
	private void addIDMs(View v,final int group,final int child)
	{
		((LinearLayout)v.findViewById(R.id.execlist)).removeAllViews();
		((LinearLayout)v.findViewById(R.id.execlist)).setGravity(0x01);
		int size=CtrlSoiec.getInstance().getNrOfTechniques(group, child);
		for(int i=0;i<size;i++)
		{
			final int index=i;
			LinearLayout container=new LinearLayout(getContext());
			container.setOrientation(1);
			container.setGravity(Gravity.CENTER_HORIZONTAL);
			container.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v) {
					if(moyenselected==true)
					{
						selectedview.setLayoutParams(new LayoutParams(-2,-2));
						((LinearLayout)v).addView(selectedview);
						moyenselected=false;
						v.invalidate();
						CtrlSoiec.getInstance().addMoyenToTechnique(group, child, index, Integer.parseInt(((TextView)selectedview.findViewById(R.id.enginenumber)).getText().toString()));
					}
				}	
			});
			TextView view=new TextView(getContext());
			view.setText("		"+(group+1)+letters[child]+(i+1)+". "+CtrlSoiec.getInstance().getTechniqueDesc(group,child,i));
			container.addView(view);
			
			ArrayList<Integer> moyensid=CtrlSoiec.getInstance().getTechniqueMoyens(group, child, i);
			int nrmoyens=moyensid.size();
			for(int j=0;j<nrmoyens;j++)
			{
				LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				int number=moyensid.get(j);
				String type=CtrlMoyens.getInstance().getMoyenType(number);
				String name=CtrlMoyens.getInstance().getMoyenName(number);
				if(name==null)
					name="";
				View engine=layoutInflater.inflate(R.layout.engine, null, false);
				engine.setLayoutParams(new LayoutParams(-2,-2));
				((TextView)engine.findViewById(R.id.enginename)).setText(type+" "+name);
				((TextView)engine.findViewById(R.id.enginenumber)).setText(""+number);
				if(type.equals("FPT"))
				{
					if(CtrlMoyens.getInstance().getMoyenState(number)==false)
						((ImageView)engine.findViewById(R.id.engineimage)).setImageDrawable(getResources().getDrawable(R.drawable.redsingle));
					else
						((ImageView)engine.findViewById(R.id.engineimage)).setImageDrawable(getResources().getDrawable(R.drawable.fpttransit));
					container.addView(engine,1);
				}
				else
				{
					if(CtrlMoyens.getInstance().getMoyenState(number)==false)
						((ImageView)engine.findViewById(R.id.engineimage)).setImageDrawable(getResources().getDrawable(R.drawable.greensingle));
					else
						((ImageView)engine.findViewById(R.id.engineimage)).setImageDrawable(getResources().getDrawable(R.drawable.vsavtransit));
					container.addView(engine);
				}
				
			}
			((LinearLayout)v.findViewById(R.id.execlist)).addView(container);
		}
	}
	
	
}


