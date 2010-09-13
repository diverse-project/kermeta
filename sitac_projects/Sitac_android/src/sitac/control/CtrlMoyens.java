package sitac.control;

import java.util.ArrayList;

import sitac.model.Moyen;
import sitac.model.MoyenType;
import sitac.model.PositionGPS;

import sitac.view.ItemType;
import sitac.view.LibToolBox;
import sitac.view.MyItemizedOverlay;
import sitac.view.R;

public class CtrlMoyens {

	private LibToolBox toolbox;
	private MyItemizedOverlay itemizedOverlay;
	private static CtrlMoyens instance;
	private ArrayList<Moyen> moyens;
	
	private CtrlMoyens()
	{
		moyens=new ArrayList<Moyen>();
	}
	
	public static CtrlMoyens getInstance()
	{
		if(instance==null)
			instance=new CtrlMoyens();
		return instance;
	}
	
	public void setToolBox(LibToolBox toolbox)
	{
		this.toolbox=toolbox;
	}
	
	public void setItemizedOverlay(MyItemizedOverlay itemizedOverlay)
	{
		this.itemizedOverlay=itemizedOverlay;
	}
	
	public void addMoyen(String type, String name)
	{
		Moyen newMoyen=new Moyen(new MoyenType(type),name);
		moyens.add(newMoyen);
		if(type.equals("FPT"))
			toolbox.addMoyenChild(0, type, name, toolbox.getResources().getDrawable(R.drawable.fpttransit), 0, getNrOfMoyens()-1);
		else
			toolbox.addMoyenChild(1, type, name, toolbox.getResources().getDrawable(R.drawable.vsavtransit), 0, getNrOfMoyens()-1);
	}
	
	public void addMoyen(String type)
	{
		Moyen newMoyen=new Moyen(new MoyenType(type));
		moyens.add(newMoyen);
		if(type.equals("FPT"))
			toolbox.addMoyenChild(0, type, "", toolbox.getResources().getDrawable(R.drawable.fpttransit), 0, getNrOfMoyens()-1);
		else
			toolbox.addMoyenChild(1, type, "", toolbox.getResources().getDrawable(R.drawable.vsavtransit), 0, getNrOfMoyens()-1);
	
	}
	
	public int getNrOfMoyens()
	{
		return moyens.size();
	}
	
	public void setMoyenName(int index,String name)
	{
		moyens.get(index).setName(name);
		toolbox.updateMoyenChildDescription(index);
		itemizedOverlay.updateItemDescription(index);
	}
	
	public String getMoyenName(int index)
	{
		return moyens.get(index).getName();
	}
	
	public String getMoyenType(int index)
	{
		return moyens.get(index).getType().getCode();
	}
	
	public boolean getMoyenState(int index)
	{
		return moyens.get(index).isInTransit();
	}
	
	public void setMoyenState(int index, boolean state)
	{
		moyens.get(index).setInTransit(state);
	}
	
	public int indexOf(String type,String name)
	{
		int index=-1;
		int size=moyens.size();
		for(int i=0;i<size;i++)
		{
			String mtype=moyens.get(i).getType().getCode();
			String mname=moyens.get(i).getName();
			if(type.equals(mtype)&&name.equals(mname))
			{
				index=i;
				break;
			}
		}
		
		return index;
	}
	
	public void deleteMoyenFromListView(ItemType item)
	{
		toolbox.deleteItemFromLibrary(item);
	}
	
	public void addMoyenToListView(ItemType item)
	{
		toolbox.addItemToLibrary(item, item.getMoyenId());
	}
	
	public void updateMoyenIcon(int index)
	{
		toolbox.updateMoyenChildIcon(index);
		itemizedOverlay.updateItemIcon(index);
	}
	
	public void setMoyenPosTarget(int index, double lat,double longit)
	{
		moyens.get(index).setPosTarget(new PositionGPS(lat,longit));
	}
	
	public double[] getMoyenPosTarget(int index)
	{
		double[] coord=new double[2];
		coord[0]=moyens.get(index).getPosTarget().getLatitude();
		coord[1]=moyens.get(index).getPosTarget().getLongitude();
		return coord;
	}
	
}
