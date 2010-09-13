package sitac.model;

import java.util.ArrayList;

public class Technique {

	private String description;
	private ArrayList<Integer> moyens;
	
	public Technique(String desc)
	{
		description=desc;
		moyens=new ArrayList<Integer>();
	}
	
	public void setDescription(String desc)
	{
		description=desc;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void addMoyen(int id)
	{
		moyens.add(id);
	}
	
	public ArrayList<Integer> getMoyens()
	{
		return moyens;
	}
}
