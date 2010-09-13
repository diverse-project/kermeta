package sitac.model;

public class NSI extends Moyen {
	
	private Agent porteur;
	
	public NSI(Agent porteur)
	{
		super();
		this.porteur=porteur;
	}
	
	public NSI(MoyenType type, Agent porteur)
	{
		super(type);
		this.porteur=porteur;
	}
	
	public NSI(MoyenType type, String name, Agent porteur)
	{
		super(type,name);
		this.porteur=porteur;
	}
	
	public void setPorteur(Agent newPorteur)
	{
		porteur=newPorteur;
	}
	
	public Agent getPorteur()
	{
		return porteur;
	}

}
