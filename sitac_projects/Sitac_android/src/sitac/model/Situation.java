package sitac.model;

import java.util.ArrayList;

public class Situation {
	private String description;
	private ArrayList<Goal> objectifs;
	
	public Situation(String desc)
	{
		description=desc;
		objectifs=new ArrayList<Goal>();
	}
	
	public void setDescription(String desc)
	{
		description=desc;
	}
	
	public String getDescripton()
	{
		return description;
	}
	
	public void addGoal(Goal objectif)
	{
		objectifs.add(objectif);
	}
	
	public void addGoals(ArrayList<Goal> obj)
	{
		objectifs.addAll(obj);
	}
	
	public ArrayList<Goal> getGoals()
	{
		return objectifs;
	}
	
	public Goal getGoal(int index)
	{
		return objectifs.get(index);
	}
	
	public int getNrGoals()
	{
		return objectifs.size();
	}
}
