package model;

public class Detachement {
	private Agent chef;
	
	public Detachement()
	{
		
	}
	
	public Detachement(Agent chef)
	{
		this.chef = chef;
	}
	
	public void setAgent(Agent chef)
	{
		this.chef = chef;
	}
	
	public Agent getAgent()
	{
		return chef;
	}
}
