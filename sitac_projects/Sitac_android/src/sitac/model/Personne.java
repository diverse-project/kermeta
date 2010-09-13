package sitac.model;

public class Personne {

	private String prenom;
	private String nom;
	
	public Personne()
	{
		super();
	}
	
	public Personne(String prenom, String nom)
	{
		this.prenom=prenom;
		this.nom=nom;
	}
	
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	
	public void setPrenom(String prenom)
	{
		this.prenom=prenom;
	}
	
	public void setPrenomEtNom(String prenom, String nom)
	{
		this.prenom=prenom;
		this.nom=nom;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public String getPrenom()
	{
		return prenom;
	}
	
}
