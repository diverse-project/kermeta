package sitac.model;

import java.util.ArrayList;

public class Soiec {

	private String description;
	private ArrayList<Situation> situations;
	
	public Soiec(String desc)
	{
		description=desc;
		situations=new ArrayList<Situation>();
	}
	
	public void setDescription(String desc)
	{
		description=desc;
	}
	
	public String getDescripton()
	{
		return description;
	}
	
	public void addSituation(Situation sit)
	{
		situations.add(sit);
	}
	
	public void addSituations(ArrayList<Situation> sits)
	{
		situations.addAll(sits);
	}
	
	public ArrayList<Situation> getSituations()
	{
		return situations;
	}
	
	public Situation getSituation(int index)
	{
		return situations.get(index);
	}
	
	public int getNrSituations()
	{
		return situations.size();
	}
}
