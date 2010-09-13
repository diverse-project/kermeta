package model;

public class Agent extends Personne{
	private int matricule;
	
	public Agent(String name, String surname, int matricule)
	{
		super(name,surname);
		this.matricule = matricule;
	}
	
	public void setMatricule(int matricule)
	{
		this.matricule = matricule;
	}
	
	public int getMatricule()
	{
		return matricule;
	}
}
