package sitac.model;

public class PositionCivil extends Position {
	
	private String nomRue;
	private int numeroRue;
	private String cp;
	private String pays;
	
	public PositionCivil()
	{
		super();
	}
	
	public PositionCivil(String nom,int numero, String cp, String pays)
	{
		nomRue=nom;
		numeroRue=numero;
		this.cp=cp;
		this.pays=pays;
	}
	
	public void setNomRue(String nom)
	{
		nomRue=nom;
	}
	
	public void setNumeroRue(int numero)
	{
		numeroRue=numero;
	}
	
	public void setCP(String cp)
	{
		this.cp=cp;
	}
	
	public void setPays(String pays)
	{
		this.pays=pays;
	}
	
	public String getNomRue()
	{
		return nomRue;
	}
	
	public int getNumeroRue()
	{
		return numeroRue;
	}
	
	public String getCP()
	{
		return cp;
	}
	
	public String getPays()
	{
		return pays;
	}
	
	public double getLatitude()
	{
		//Geocoder implementation
		return 0.0;
	}
	
	public double getLongitude()
	{
		//Geocoder implementatio
		return 0.0;
	}

}
