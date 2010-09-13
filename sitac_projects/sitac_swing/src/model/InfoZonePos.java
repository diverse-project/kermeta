package model;

public class InfoZonePos extends InfoLignePos{
	private String name;
	
	public InfoZonePos(String name)
	{
		super();
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}