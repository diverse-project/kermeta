package model;

import java.util.ArrayList;
import java.util.List;

public class Intervention {
	private int number;
	private String precision;
	private InterventionType type;
	private List<Detachement> detachements = new ArrayList<Detachement>();
	
	public Intervention(int number, String precision, InterventionType type)
	{
		this.number = number;
		this.precision = precision;
		this.type = type;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getPrecision()
	{
		return precision;
	}
	
	public List<Detachement> getDetachements()
	{
		return detachements;
	}
	
	public InterventionType getType()
	{
		return type;
	}
}
