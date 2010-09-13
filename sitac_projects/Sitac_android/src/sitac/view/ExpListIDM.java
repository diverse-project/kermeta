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
import android.widget.LinearLayout;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;

/**
 * 
 * @author Catalin Cupse
 * The class used for displaying the data for the IDM tab of the SoiecActivity panel. Because in Android there is
 * no tree structure provided, an expandable list is used for simulating that.
 */

public class ExpListIDM extends ExpandableListView {

	private final String NAME = "name";
	private final String COL1 = "name2";
	
	private EditText name;
	private LinearLayout clickedview;
	
	protected ArrayList<HashMap<String, String>> headerData = new ArrayList<HashMap<String, String>>();
	protected ArrayList<ArrayList<HashMap<String, Object>>> childData = new ArrayList<ArrayList<HashMap<String, Object>>>();

	private ArrayList<Boolean> visible=new ArrayList<Boolean>();
	private final String[] letters={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	public ExpListIDM(Context context)
	{
		super(context);
	}
	
	public ExpListIDM(Context context, AttributeSet attrs) {
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
				((TextView)v.findViewById(R.id.idmtext)).setText( (String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(COL1));
				
				((TextView)v.findViewById(R.id.idmtext)).setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View arg0) {
						if(visible.get(groupPosition*headerData.size()+childPosition).equals(true))
						{
							((LinearLayout)v.findViewById(R.id.idmlist)).removeAllViews();
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
				
				((TextView)v.findViewById(R.id.idmtext)).setOnLongClickListener(new OnLongClickListener(){
					@Override
					public boolean onLongClick(View arg0) {
						clickedview=(LinearLayout)v.findViewById(R.id.idmlist);
						enterNewIDMDialog(groupPosition,childPosition);
						return false;
					}			
				});
				return v;
			}

			@Override
			public View newChildView(boolean isLastChild, ViewGroup parent) {
				LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				return layoutInflater.inflate(R.layout.idmexplistchild, null, false);
			}
		}
		);
	}

	/**
	 * Method used for adding a situation to the expandable list adapter. 
	 * @param text the description of the sitation.
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
	 * Method used for adding an objectif to a situation.
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

	/**
	 * Method used for adding techniques to an objectif.
	 * @param v the view displaying the data
	 * @param group the index of the situation
	 * @param child the index of the objectif
	 */
	private void addIDMs(View v,final int group,final int child)
	{
		((LinearLayout)v.findViewById(R.id.idmlist)).removeAllViews();
		int size=CtrlSoiec.getInstance().getNrOfTechniques(group, child);
		for(int i=0;i<size;i++)
		{
			final int index=i;
			EditText view=new EditText(getContext());
			view.setText((group+1)+letters[child]+(i+1)+". "+CtrlSoiec.getInstance().getTechniqueDesc(group,child,i));
			view.setOnKeyListener(new OnKeyListener(){
				@Override
				public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if(keyCode==KeyEvent.KEYCODE_ENTER)
                    {
                    	String s=((EditText)v).getText().toString();
                    	updateTechnique(group,child,index,s);
                    	return true;
                    }
					return false;
				}				
			});
			((LinearLayout)v.findViewById(R.id.idmlist)).addView(view);
		}
	}
	
	/**
	 * Method that displays a dialog for typing the description of a new technique 
	 * @param group the index of the situation
	 * @param child the index of the objectif
	 */
	private void enterNewIDMDialog(final int group,final int child)
	{
		name= new EditText(this.getContext());
		AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
		builder.setMessage("New IDM for situation "+(group+1)+" ,objectif "+letters[child]+" :")
		.setView(name)
		.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				String s=name.getText().toString();
				if((s!= null) && (s.trim().length() !=0))
				{
					EditText text=new EditText(ExpListIDM.this.getContext());
					text.setText((group+1)+letters[child]+(clickedview.getChildCount()+1)+". "+s);
					clickedview.addView(text);
					
					CtrlSoiec.getInstance().addTechniqueToGoal(group, child, s);
				}            
			}
		});
		AlertDialog alert = builder.create();
		alert.show();
	}
	
	private void updateTechnique(int sitindex,int objindex,int techindex,String s)
	{
		int x=s.indexOf('.');
		String desc=s.substring(x+2);
		CtrlSoiec.getInstance().setTechniqueDesc(sitindex, objindex, techindex, desc);
	}
}
