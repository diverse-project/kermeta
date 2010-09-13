package sitac.view;

import java.util.ArrayList;
import java.util.Calendar;

import sitac.control.CtrlMoyens;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.AdapterView.OnItemClickListener;

/**
 * 
 * @author Catalin Cupse
 * The class which display the engines table, handles the requests for more engines and provides
 * the possibility of creating groups.
 */

public class EnginesActivity extends Activity {

	private TableLayout engtable;
	private TableRow engtablerow;
	private ListView optionslist;
	private Button moreengines,closemenu,group;
	private EditText name;
	private TextView clickedview;
	private GroupExpandableList grouplist;
	private ArrayList<Boolean> isrowselected;

	private int nrengines=-1;
	
	private static final String[] options = new String[] {"FireEngine","MedicalEngine"};

	//a handler used for updating the time left every minute
	private Handler handler = new Handler();
	private Runnable runnable = new Runnable() {
		   @Override
		   public void run() {
		      updateTimeLeft();
		      handler.postDelayed(this, 60*1000);
		   }
		};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.engtable);
		this.engtable=(TableLayout)findViewById(R.id.enginetable);
		this.engtable.invalidate();

		this.engtablerow=(TableRow)findViewById(R.id.engtablerow);
		this.engtablerow.invalidate();

		this.moreengines=(Button)findViewById(R.id.moreengines);
		this.moreengines.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				moreengines.setVisibility(View.INVISIBLE);
				closemenu.setVisibility(View.VISIBLE);
				optionslist.setVisibility(View.VISIBLE);
			}

		});

		this.closemenu=(Button)findViewById(R.id.closemenu);
		this.closemenu.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				closemenu.setVisibility(View.INVISIBLE);
				optionslist.setVisibility(View.INVISIBLE);
				moreengines.setVisibility(View.VISIBLE);
			}
		});
		this.closemenu.setVisibility(View.INVISIBLE);

		this.group=(Button)findViewById(R.id.group);
		this.group.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				makeGroup();
			}
		});

		this.optionslist=(ListView)findViewById(R.id.optionslist);
		this.optionslist.setTextFilterEnabled(true);
		this.optionslist.setAdapter(new ArrayAdapter<String>(this,R.layout.optionslist_item,options));
		this.optionslist.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				requestMoreEngines(position);
			}
		});
		this.optionslist.setVisibility(View.INVISIBLE);

		for(int i=0;i<7;i++)
		{
			((TextView)engtablerow.getChildAt(i*2)).setTextColor(Color.RED);
		}

		this.isrowselected=new ArrayList<Boolean>();
		this.isrowselected.add(false);
		this.isrowselected.add(false);

		this.engtablerow.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				int size=isrowselected.size();
				for(int i=0;i<size;i++)
				{
					isrowselected.remove(i);
					isrowselected.add(false);
					if(i%2==0)
						engtable.getChildAt(i).setBackgroundColor(Color.BLACK);
				}
				engtable.invalidate();
			}
			
		});

		this.grouplist=(GroupExpandableList)findViewById(R.id.newlist2);
		this.grouplist.addDefaultAdapter();

		handler.postDelayed(runnable, 1000);

	}

	/**
	 * The method adds a new row to the engines table, representing the engine that you have
	 * just requested.
	 * @param id the type of the requested engine 
	 */
	private void requestMoreEngines(int id)
	{		
		nrengines++;
		TableRow row=new TableRow(this);
		int size=this.engtablerow.getChildCount();
		for(int i=0;i<size;i++)
		{
			if(i%2==0)
			{
				TextView v=new TextView(this);
				v.setLayoutParams(((TextView)findViewById(R.id.engcol1)).getLayoutParams());
				v.setGravity(0x01);
				v.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						int rowindex=engtable.indexOfChild(((TableRow)v.getParent()));
						int cellindex=((TableRow)v.getParent()).indexOfChild(v);
						if((isrowselected.get(rowindex).equals(true))&&(cellindex==6))
						{
							clickedview=(TextView)v;
							showTimeDialog();
						}
						else if((isrowselected.get(rowindex).equals(true))&&(cellindex==2))
						{
							clickedview=(TextView)v;
							enterNameDialog();
						}
						((TableRow)v.getParent()).setBackgroundColor(Color.RED);
						isrowselected.remove(rowindex);
						isrowselected.add(rowindex, true);

					}				
				});
				row.addView(v);
			}
			else
			{
				View v=new View(this);
				v.setLayoutParams((findViewById(R.id.verticalseparator)).getLayoutParams());
				v.setBackgroundColor(0xFF909090);
				row.addView(v);
			}
		}

		if(id==0)
		{
			((TextView)row.getChildAt(2)).setText("FPT");
			CtrlMoyens.getInstance().addMoyen("FPT");
		}
		else if(id==1)
		{
			((TextView)row.getChildAt(2)).setText("VSAV");
			CtrlMoyens.getInstance().addMoyen("VSAV");
		}

		((TextView)row.getChildAt(0)).setText(""+nrengines);
		
		((TextView)row.getChildAt(4)).setText(getCurrentTime());
		this.engtable.addView(row);
		this.isrowselected.add(false);

		View v=new View(this);
		v.setBackgroundColor(0xFF909090);
		v.setLayoutParams((findViewById(R.id.horizontlseparator)).getLayoutParams());
		this.engtable.addView(v);
		this.isrowselected.add(false);
		this.engtable.invalidate();

	}

	/**
	 * The method displays the dialog from which you can choose the time estimated for the arrival
	 * of the engine.
	 */
	private void showTimeDialog()
	{	
		final Calendar c = Calendar.getInstance();
		int mHour = c.get(Calendar.HOUR_OF_DAY);
		int mMinute = c.get(Calendar.MINUTE);

		TimePickerDialog timepicker=new TimePickerDialog(this,
				new TimePickerDialog.OnTimeSetListener() {
			@Override
			public void onTimeSet(TimePicker view,int hourOfDay, int minute) {
				if(minute<10)
					clickedview.setText(hourOfDay+":0"+minute);
				else
					clickedview.setText(hourOfDay+":"+minute);
				((TextView)((TableRow)clickedview.getParent()).getChildAt(12)).setText(getTimeDiff(getCurrentTime(),hourOfDay+":"+minute));
			}
		},
		mHour,
		mMinute,
		true
		);
		timepicker.show();
		
	}

	/**
	 * The method displays a dialog where you can provide a new name to a requested engine.
	 */
	private void enterNameDialog()
	{
		name= new EditText(this);
		name.setText(clickedview.getText().toString()+" ");
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Engine name:")
		.setView(name)
		.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				String s=name.getText().toString();
				if((s!= null) && (s.trim().length() !=0))
				{
					clickedview.setText(s.toUpperCase());
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
	
	private void updateTimeLeft()
	{
		int size=isrowselected.size();
		for(int i=2;i<size;i++)
		{
			if(i%2==0)
			{
				String s=((TextView)((TableRow)engtable.getChildAt(i)).getChildAt(6)).getText().toString();
				if((s!= null) && (s.trim().length() !=0))
				{
					((TextView)((TableRow)engtable.getChildAt(i)).getChildAt(12)).setText(getTimeDiff(getCurrentTime(),s));
					if(getTimeDiff(getCurrentTime(),s).equals("0"))
					{
						int index=Integer.parseInt(((TextView)((TableRow)engtable.getChildAt(i)).getChildAt(0)).getText().toString());
						CtrlMoyens.getInstance().setMoyenState(index, false);
						CtrlMoyens.getInstance().updateMoyenIcon(index);
					}
				}
			}
		}
		engtable.invalidate();
	}

	/**
	 * The selected rows of the engines table will be placed in a group. The created group is displayed
	 * under the engines table.
	 */
	private void makeGroup()
	{
		int size=isrowselected.size();
		int enginesselected=0;
		int fire=0,medic=0;
		for(int i=0;i<size;i++)
		{
			if(isrowselected.get(i).equals(true))
			{
				enginesselected++;
				String s=((TextView)((TableRow)engtable.getChildAt(i)).getChildAt(2)).getText().toString();
				if(s.startsWith("FPT"))
					fire++;
				else
					medic++;
			}
		}
		if((enginesselected>1)&&((fire==0)||(medic==0)))
		{
			grouplist.addGroup();
			int i=0;
			while(i<isrowselected.size())
				if(isrowselected.get(i).equals(true))
				{
					String[] columns=new String[7];
					columns[0]=((TextView)((TableRow)engtable.getChildAt(i)).getChildAt(0)).getText().toString();
					columns[1]=((TextView)((TableRow)engtable.getChildAt(i)).getChildAt(2)).getText().toString();
					columns[2]=((TextView)((TableRow)engtable.getChildAt(i)).getChildAt(4)).getText().toString();
					columns[3]=((TextView)((TableRow)engtable.getChildAt(i)).getChildAt(6)).getText().toString();
					columns[4]=((TextView)((TableRow)engtable.getChildAt(i)).getChildAt(8)).getText().toString();
					columns[5]=((TextView)((TableRow)engtable.getChildAt(i)).getChildAt(10)).getText().toString();
					columns[6]=((TextView)((TableRow)engtable.getChildAt(i)).getChildAt(12)).getText().toString();
					grouplist.addChild(grouplist.getNumberOfGroups()-1, columns);

					engtable.removeViewAt(i);
					engtable.removeViewAt(i);
					isrowselected.remove(i);
					isrowselected.remove(i);
				}
				else
				{
					i++;
				}
		}

	}
}

