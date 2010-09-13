package sitac.view;

import sitac.control.CtrlMoyens;
import sitac.control.CtrlSoiec;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SoiecActivity extends Activity {

	private Button[] buttons;
	private Button addSituation,addCdt,addMoyen,hideMoyens;
	private RelativeLayout[] rellayouts;
	private LinearLayout layouts,layoutMoyens;
	private TextView textviewCdt;
	private ExpListObjectif objectifexplist;
	private ExpListIDM idmexplist;
	private ExpListExec execexplist;
	private EditText newSituation;

	private final String[] letters={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.soiec);

		buttons=new Button[5]; 
		buttons[0]=(Button)findViewById(R.id.buttonS);
		buttons[1]=(Button)findViewById(R.id.buttonO);
		buttons[2]=(Button)findViewById(R.id.buttonI);
		buttons[3]=(Button)findViewById(R.id.buttonE);
		buttons[4]=(Button)findViewById(R.id.buttonC);

		rellayouts=new RelativeLayout[5];
		rellayouts[0]=(RelativeLayout)findViewById(R.id.rellayoutS);
		rellayouts[1]=(RelativeLayout)findViewById(R.id.rellayoutO);
		rellayouts[2]=(RelativeLayout)findViewById(R.id.rellayoutI);
		rellayouts[3]=(RelativeLayout)findViewById(R.id.rellayoutE);
		rellayouts[4]=(RelativeLayout)findViewById(R.id.rellayoutC);

		layouts=(LinearLayout)findViewById(R.id.layoutS);
		textviewCdt=(TextView)findViewById(R.id.textviewC);
		layoutMoyens=(LinearLayout)findViewById(R.id.layoutmoyens);
		layoutMoyens.setVisibility(View.INVISIBLE);

		objectifexplist=(ExpListObjectif)findViewById(R.id.explistobjectif);
		idmexplist=(ExpListIDM)findViewById(R.id.explistidm);
		execexplist=(ExpListExec)findViewById(R.id.explistexec);

		for(int i=0;i<5;i++)
		{
			buttons[i].setBackgroundColor(Color.DKGRAY);
			buttons[i].setTextColor(Color.WHITE);
			buttons[i].setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v) {
					((Button)v).setBackgroundColor(Color.LTGRAY);
					for(int i=0;i<5;i++)
					{
						if(buttons[i].equals((Button)v)==false)
						{
							buttons[i].setBackgroundColor(Color.DKGRAY);
							rellayouts[i].setVisibility(View.INVISIBLE);
						}
						else
							rellayouts[i].setVisibility(View.VISIBLE);

						switch(i)
						{
						case 0: showSituations();
								break;
						case 1: showObjectifs();
								break;
						case 2: showTechniques();
								break;
						case 3: showExecs();
								addMoyen.setVisibility(View.VISIBLE);
								layoutMoyens.setVisibility(View.INVISIBLE);
								hideMoyens.setVisibility(View.INVISIBLE);
								break;
						}

					}
				}
			});

			rellayouts[i].setVisibility(View.INVISIBLE);
		}
		buttons[0].setBackgroundColor(Color.LTGRAY);
		rellayouts[0].setVisibility(View.VISIBLE);

		addSituation=(Button)findViewById(R.id.addS);
		addSituation.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				addNewSituationDialog();
			}		
		});

		addCdt=(Button)findViewById(R.id.addC);
		addCdt.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				addNewCdtDialog();
			}		
		});
		
		addMoyen=(Button)findViewById(R.id.addmoyens);
		addMoyen.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				showMoyens();
			}		
		});
		
		hideMoyens=(Button)findViewById(R.id.closemoyens);
		hideMoyens.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				addMoyen.setVisibility(View.VISIBLE);
				layoutMoyens.setVisibility(View.INVISIBLE);
				hideMoyens.setVisibility(View.INVISIBLE);
			}			
		});
	}

	private void addNewSituationDialog()
	{
		newSituation= new EditText(this);
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("New situation:")
		.setView(newSituation)
		.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				String s=newSituation.getText().toString();
				if((s!= null) && (s.trim().length() !=0))
				{
					CtrlSoiec.getInstance().addSituation(s);
					showSituations();
				}            
			}
		});
		AlertDialog alert = builder.create();
		alert.show();
	}

	private void addNewCdtDialog()
	{
		newSituation= new EditText(this);
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("New comment:")
		.setView(newSituation)
		.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				String s=newSituation.getText().toString();
				if((s!= null) && (s.trim().length() !=0))
				{
					textviewCdt.append("\n"+s);
				}            
			}
		});
		AlertDialog alert = builder.create();
		alert.show();
	}

	private void showSituations()
	{
		layouts.removeAllViews();
		int size=CtrlSoiec.getInstance().getNrOfSituations();
		for(int i=0;i<size;i++)
		{
			final int index=i;
			EditText text=new EditText(this);
			text.setText((i+1)+". "+CtrlSoiec.getInstance().getSituationDesc(i));
			text.setOnKeyListener(new OnKeyListener(){
				@Override
				public boolean onKey(View arg0, int arg1, KeyEvent arg2) {
					if(arg1==KeyEvent.KEYCODE_ENTER)
					{
						updateSituation(index);
						return true;
					}
					return false;
				}
			});
			layouts.addView(text);
		}
		layouts.invalidate();
	}

	private void showObjectifs()
	{
		objectifexplist.removeAllData();
		int size=CtrlSoiec.getInstance().getNrOfSituations();
		for(int i=0;i<size;i++)
		{
			objectifexplist.addGroup((i+1)+". "+CtrlSoiec.getInstance().getSituationDesc(i));
			int size2=CtrlSoiec.getInstance().getNrOfGoals(i);
			for(int j=0;j<size2;j++)
				objectifexplist.addChild(objectifexplist.getNrGroups()-1, (i+1)+letters[j]+". "+CtrlSoiec.getInstance().getGoalDesc(i, j));
		}
		objectifexplist.invalidate();
	}
	
	private void showTechniques()
	{
		idmexplist.removeAllData();
		int size=CtrlSoiec.getInstance().getNrOfSituations();
		for(int i=0;i<size;i++)
		{
			idmexplist.addGroup((i+1)+". "+CtrlSoiec.getInstance().getSituationDesc(i));
			int size2=CtrlSoiec.getInstance().getNrOfGoals(i);
			for(int j=0;j<size2;j++)
				idmexplist.addChild(idmexplist.getNrGroups()-1, (i+1)+letters[j]+". "+CtrlSoiec.getInstance().getGoalDesc(i, j));
		}
		idmexplist.invalidate();
	}
	
	private void showExecs()
	{
		execexplist.removeAllData();
		int size=CtrlSoiec.getInstance().getNrOfSituations();
		for(int i=0;i<size;i++)
		{
			execexplist.addGroup((i+1)+". "+CtrlSoiec.getInstance().getSituationDesc(i));
			int size2=CtrlSoiec.getInstance().getNrOfGoals(i);
			for(int j=0;j<size2;j++)
				execexplist.addChild(execexplist.getNrGroups()-1, (i+1)+letters[j]+". "+CtrlSoiec.getInstance().getGoalDesc(i, j));
		}
		execexplist.invalidate();
	}
	
	private void updateSituation(int index)
	{
		String s=((EditText)layouts.getChildAt(index)).getText().toString();
		int x=s.indexOf('.');
		String s2=s.substring(x+2);
		CtrlSoiec.getInstance().setSituationDesc(index, s2);
	}
	
	private void showMoyens()
	{
		layoutMoyens.removeAllViews();
		LayoutInflater layoutInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		TextView textv=new TextView(this);
		textv.setText("Fire engines");
		layoutMoyens.addView(textv);
		TextView textv2=new TextView(this);
		textv2.setText("Ambulances");
		layoutMoyens.addView(textv2);
		
		int fireindex=1;
		int medicindex=2;
		
		int size=CtrlMoyens.getInstance().getNrOfMoyens();
		for(int i=0;i<size;i++)
		{
			String type=CtrlMoyens.getInstance().getMoyenType(i);
			String name=CtrlMoyens.getInstance().getMoyenName(i);
			if(name==null)
				name="";
			View v=layoutInflater.inflate(R.layout.engine, null, false);
			((TextView)v.findViewById(R.id.enginename)).setText(type+" "+name);
			v.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					layoutMoyens.setVisibility(View.INVISIBLE);
					hideMoyens.setVisibility(View.INVISIBLE);
					addMoyen.setVisibility(View.VISIBLE);
					execexplist.setIsMoyenSelected(true);
					execexplist.setMoyenSelected(arg0);
				}
			});
			((TextView)v.findViewById(R.id.enginenumber)).setText(""+i);
			if(type.equals("FPT"))
			{
				if(CtrlMoyens.getInstance().getMoyenState(i)==false)
					((ImageView)v.findViewById(R.id.engineimage)).setImageDrawable(getResources().getDrawable(R.drawable.redsingle));
				else
					((ImageView)v.findViewById(R.id.engineimage)).setImageDrawable(getResources().getDrawable(R.drawable.fpttransit));
				layoutMoyens.addView(v,fireindex);
				fireindex++;
				medicindex++;
			}
			else
			{
				if(CtrlMoyens.getInstance().getMoyenState(i)==false)
					((ImageView)v.findViewById(R.id.engineimage)).setImageDrawable(getResources().getDrawable(R.drawable.greensingle));
				else
					((ImageView)v.findViewById(R.id.engineimage)).setImageDrawable(getResources().getDrawable(R.drawable.vsavtransit));
				layoutMoyens.addView(v,medicindex);
				medicindex++;
			}
			
		}
		if(layoutMoyens.getChildCount()!=2)
		{
			hideMoyens.setVisibility(View.VISIBLE);
			layoutMoyens.setVisibility(View.VISIBLE);
			addMoyen.setVisibility(View.INVISIBLE);
		}
	}

}
