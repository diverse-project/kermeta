package sitac.model;

import java.util.ArrayList;

public class Goal {

	private String description;
	private ArrayList<Technique> idms;
	
	public Goal(String desc)
	{
		description=desc;
		idms=new ArrayList<Technique>();
	}
	
	public void setDescription(String desc)
	{
		description=desc;
	}
	
	public String getDescripton()
	{
		return description;
	}
	
	public void addTechnique(Technique idm)
	{
		idms.add(idm);
	}
	
	public void addTechniques(ArrayList<Technique> tech)
	{
		idms.addAll(tech);
	}
	
	public ArrayList<Technique> getTechniques()
	{
		return idms;
	}
	
	public Technique getTechnique(int index)
	{
		return idms.get(index);
	}
	
	public int getNumberTechniques()
	{
		return idms.size();
	}
}
