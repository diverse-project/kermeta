package sitac.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import sitac.control.CtrlSoiec;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;

/**
 * 
 * @author Catalin Cupse
 * The class used for displaying the data in the Objectif tab of the SoiecActivity panel. A two-level expandable list
 * is used: the situation will be the parent of this structure; the objectifs will be the children.
 */

public class ExpListObjectif extends ExpandableListView {

	private final String NAME = "name";
	private final String COL1 = "name2";
	
	private EditText name;
	private int clickedview;
	
	protected ArrayList<HashMap<String, String>> headerData = new ArrayList<HashMap<String, String>>();
	protected ArrayList<ArrayList<HashMap<String, Object>>> childData = new ArrayList<ArrayList<HashMap<String, Object>>>();

	private final String[] letters={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	public ExpListObjectif(Context context)
	{
		super(context);
	}
	public ExpListObjectif(Context context, AttributeSet attrs) {
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
			public View getChildView(final int groupPosition,final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
				final View v = super.getChildView(groupPosition, childPosition, isLastChild, convertView, parent);
				((EditText)v.findViewById(R.id.objexplistchild)).setText((String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(COL1));
				((EditText)v.findViewById(R.id.objexplistchild)).setOnKeyListener(new OnKeyListener(){
					@Override
					public boolean onKey(View v, int keyCode, KeyEvent event) {
						if(keyCode==KeyEvent.KEYCODE_ENTER)
						{
							String s=((EditText)v).getText().toString();
							updateGoal(groupPosition,childPosition,s);
							childData.get(groupPosition).get(childPosition).put(COL1, s);
							return true;
						}
						return false;
					}
				});
				return v;
			}

			@Override
			public View newChildView(boolean isLastChild, ViewGroup parent) 
			{
				LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				return layoutInflater.inflate(R.layout.objexplistchild, null, false);
			}
			
			public View getGroupView(final int groupPosition,final boolean isExpanded, View convertView, ViewGroup parent)
			{
				final View v = super.getGroupView(groupPosition, isExpanded, convertView, parent);
				v.setOnLongClickListener(new OnLongClickListener(){
					@Override
					public boolean onLongClick(View arg0) {
						clickedview=groupPosition;
						enterNewObjectifDialog(groupPosition);
						return false;
					}					
				});
				v.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						if(isExpanded)
							ExpListObjectif.this.collapseGroup(groupPosition);
						else
							ExpListObjectif.this.expandGroup(groupPosition);
					}	
				});
				
				return v;
			}
			
		}
		);
	}

	/**
	 * The method used for adding a new situation in the list.
	 * @param text the description of the added situation
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
	 * Method used for adding a new objectif to a situation.
	 * @param groupPos the index of the situation
	 * @param text1 the description of the objectif
	 */
	public void addChild(int groupPos,String text1)
	{
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put(COL1, text1);
		childData.get(groupPos).add(map);	    	
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
	
	/**
	 * The method displays a dialog for inserting a new objectif to an existing situation.
	 * @param index the index of the situation
	 */
	private void enterNewObjectifDialog(final int index)
	{
		name= new EditText(this.getContext());
		AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
		builder.setMessage("New objectif for situation "+(clickedview+1)+" :")
		.setView(name)
		.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				String s=name.getText().toString();
				if((s!= null) && (s.trim().length() !=0))
				{
					addChild(clickedview,(index+1)+letters[childData.get(index).size()]+". "+s);
					if(ExpListObjectif.this.isGroupExpanded(clickedview))
					{
						ExpListObjectif.this.collapseGroup(clickedview);
						ExpListObjectif.this.expandGroup(clickedview);
					}
					CtrlSoiec.getInstance().addGoalToSituation(index, s);
				}            
			}
		});
		AlertDialog alert = builder.create();
		alert.show();
	}
	
	private void updateGoal(int sitindex,int objindex,String desc)
	{
		int x=desc.indexOf('.');
		String s=desc.substring(x+2);
		CtrlSoiec.getInstance().setGoalDesc(sitindex, objindex, s);
	}
}
