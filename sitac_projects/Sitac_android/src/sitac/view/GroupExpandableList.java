package sitac.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import sitac.control.CtrlMoyens;
import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * 
 * @author Catalin Cupse
 * The class used for displaying engines in groups.
 */

public class GroupExpandableList extends ExpandableListView {

	private final String NAME = "name";
	private final String COL0 = "col0";
	private final String COL1 = "col1";
	private final String COL2 = "col2";
	private final String COL3 = "col3";
	private final String COL4 = "col4";
	private final String COL5 = "col5";
	private final String COL6 = "col6";
	protected ArrayList<HashMap<String, String>> headerData = new ArrayList<HashMap<String, String>>();
	protected ArrayList<ArrayList<HashMap<String, Object>>> childData = new ArrayList<ArrayList<HashMap<String, Object>>>();

	private TextView clickedview;
	private EditText name;

	//handler used for updating the time left every minute
	private Handler handler = new Handler();
	private Runnable runnable = new Runnable() {
		   @Override
		   public void run() {
		      updateTimeLeft();
		      handler.postDelayed(this, 60*1000);
		   }
		};
	
	public GroupExpandableList(Context context)
	{
		super(context);
		handler.postDelayed(runnable, 1000);
	}

	public GroupExpandableList(Context context, AttributeSet attrs) 
	{
		super(context, attrs);
		handler.postDelayed(runnable, 1000);
	}

	public void addDefaultAdapter()
	{
		this.setAdapter( new SimpleExpandableListAdapter(
				getContext(),
				headerData,
				R.layout.enginegroup,
				new String[] { NAME },            
				new int[] { R.id.text2 }, 
				childData,
				0,
				null,
				new int[] {}
		) {

			@SuppressWarnings("unchecked")
			@Override
			public View getChildView(final int groupPosition,final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
				final View v = super.getChildView(groupPosition, childPosition, isLastChild, convertView, parent);

				((TextView)v.findViewById(R.id.col0)).setText( (String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(COL0));
				((TextView)v.findViewById(R.id.col1)).setText( (String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(COL1));
				((TextView)v.findViewById(R.id.col1)).setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						clickedview=(TextView)v;
						enterNameDialog(groupPosition,childPosition);
					}				
				});
				((TextView)v.findViewById(R.id.col2)).setText( (String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(COL2));
				((TextView)v.findViewById(R.id.col3)).setText( (String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(COL3));
				((TextView)v.findViewById(R.id.col3)).setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						clickedview=(TextView)v;
						showTimeDialog(groupPosition,childPosition);
					}				
				});
				((TextView)v.findViewById(R.id.col4)).setText( (String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(COL4));
				((TextView)v.findViewById(R.id.col5)).setText( (String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(COL5));
				((TextView)v.findViewById(R.id.col6)).setText( (String) ((Map<String,Object>)getChild(groupPosition, childPosition)).get(COL6));


				return v;
			}

			@Override
			public View newChildView(boolean isLastChild, ViewGroup parent) {
				LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				return layoutInflater.inflate(R.layout.tablerow, null, false);
			}
		}
		);
	}

	public void addGroup()
	{
		HashMap<String, String> group = new HashMap<String, String>();
		group.put(NAME, "Group"+(headerData.size()+1)+"");
		headerData.add( group);

		ArrayList<HashMap<String, Object>> newgroupdata = new ArrayList<HashMap<String, Object>>();
		childData.add(newgroupdata);

		this.addDefaultAdapter();
	}

	public void addChild(int groupPos,String[] description)
	{
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put(COL0, description[0]);
		map.put(COL1, description[1]);
		map.put(COL2, description[2]);
		map.put(COL3, description[3]);
		map.put(COL4, description[4]);
		map.put(COL5, description[5]);
		map.put(COL6, description[6]);
		childData.get(groupPos).add(map);	    	
	}

	public int getNumberOfGroups()
	{
		return headerData.size();
	}

	/**
	 * Method that displays a dialog for selecting the estimated time of arrival of an engine from a group.
	 * @param group the index of the group
	 * @param child the index of the specific engine
	 */
	private void showTimeDialog(final int group,final int child)
	{
		final Calendar c = Calendar.getInstance();
		int mHour = c.get(Calendar.HOUR_OF_DAY);
		int mMinute = c.get(Calendar.MINUTE);

		TimePickerDialog timepicker=new TimePickerDialog(this.getContext(),
				new TimePickerDialog.OnTimeSetListener() {
			@Override
			public void onTimeSet(TimePicker view,int hourOfDay, int minute) {
				if(minute<10)
					clickedview.setText(hourOfDay+":0"+minute);
				else
					clickedview.setText(hourOfDay+":"+minute);
				((TextView)((TableRow)clickedview.getParent()).getChildAt(12)).setText(getTimeDiff(getCurrentTime(),hourOfDay+":"+minute));
				childData.get(group).get(child).put(COL3, clickedview.getText());
				childData.get(group).get(child).put(COL6, getTimeDiff(getCurrentTime(),hourOfDay+":"+minute));	
			}
		},
		mHour,
		mMinute,
		true
		);
		timepicker.show();

		if(isGroupExpanded(group))
		{
			collapseGroup(group);
			expandGroup(group);
		}
	}

	/**
	 * Method that displays a dialog for typing a name to an engine from a group.
	 * @param group the index of the group
	 * @param child the index of the specific engine 
	 */
	private void enterNameDialog(final int group,final int child)
	{
		name= new EditText(this.getContext());
		name.setText(clickedview.getText().toString()+" ");
		AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
		builder.setMessage("Engine name:")
		.setView(name)
		.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				String s=name.getText().toString();
				if((s!= null) && (s.trim().length() !=0))
				{
					clickedview.setText(s.toUpperCase());
					childData.get(group).get(child).put(COL1, s.toUpperCase());
					String engid=((TextView)((TableRow)clickedview.getParent()).getChildAt(0)).getText().toString();
					int nr=Integer.parseInt(engid);
					CtrlMoyens.getInstance().setMoyenName(nr, s.substring(s.indexOf(' ')+1).toUpperCase());
				}             
			}
		});
		AlertDialog alert = builder.create();
		alert.show();
	}

	private String getCurrentTime()
	{
		final Calendar c = Calendar.getInstance();
		int mHour = c.get(Calendar.HOUR_OF_DAY);
		int mMinute = c.get(Calendar.MINUTE);

		if(mMinute<10)
			return mHour+":0"+mMinute;
		else
			return mHour+":"+mMinute;
	}
	
	private void updateTimeLeft()
	{
		int nrgroups=headerData.size();
		for(int i=0;i<nrgroups;i++)
		{
			int size=childData.get(i).size();
			for(int j=0;j<size;j++)
			{
				String s=childData.get(i).get(j).get(COL3).toString();
				if((s!= null) && (s.trim().length() !=0))
				{
					childData.get(i).get(j).put(COL6,getTimeDiff(getCurrentTime(),s));
					if(getTimeDiff(getCurrentTime(),s).equals("0"))
					{
						int index=Integer.parseInt(childData.get(i).get(j).get(COL0).toString());
						CtrlMoyens.getInstance().setMoyenState(index, false);
						CtrlMoyens.getInstance().updateMoyenIcon(index);
					}
				}

			}
			if(isGroupExpanded(i))
			{
				collapseGroup(i);
				expandGroup(i);
			}
		}
	}

	private String getTimeDiff(String oldtime,String newtime)
	{
		String old[]=oldtime.split(":");
		int oldhours=Integer.parseInt(old[0]);
		int oldminutes=Integer.parseInt(old[1]);

		String current[]=newtime.split(":");
		int newhours=Integer.parseInt(current[0]);
		int newminutes=Integer.parseInt(current[1]);

		if(newminutes-oldminutes<0)
		{
			newminutes+=60;
			newhours--;
		}

		int hoursRemained=newhours-oldhours;
		int minutesRemained=newminutes-oldminutes;

		if(hoursRemained<0)
			return "0";
		
		if(hoursRemained==0)
			return ""+minutesRemained;
		else
			return minutesRemained>10 ? hoursRemained+":"+minutesRemained : hoursRemained+":0"+minutesRemained;
	}


}
