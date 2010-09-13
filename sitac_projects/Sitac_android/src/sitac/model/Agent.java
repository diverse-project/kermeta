package sitac.model;

public class Agent extends Personne {
	
	private int matricule;
	
	public Agent()
	{
		super();
	}
	
	public Agent(String prenom, String nom)
	{
		super(prenom,nom);
	}
	
	public Agent(String prenom, String nom, int matricule)
	{
		super(prenom,nom);
		this.matricule=matricule;
	}
	
	public void setMatricule(int newMatricule)
	{
		matricule=newMatricule;
	}
	
	public int getMatricule()
	{
		return matricule;
	}

}
