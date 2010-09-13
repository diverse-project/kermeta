package sitac.model;

public class Moyen {

	private MoyenType type;
	private String name;
	private Position posTarget, posRef;
	
	private boolean inTransit=true;
	
	public Moyen()
	{
		super();
	}
	
	public Moyen(MoyenType type)
	{
		this.type=type;
	}
	
	public Moyen(MoyenType type, String name)
	{
		this(type);
		this.name=name;
	}
	
	public MoyenType getType()
	{
		return type;
	}
	
	public void setType(MoyenType newType)
	{
		type=newType;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name=newName;
	}
	
	public void setInTransit(boolean value)
	{
		inTransit=value;
	}
	
	public boolean isInTransit()
	{
		return inTransit;
	}
	
	public void setPosTarget(Position posTarget)
	{
		this.posTarget=posTarget;
	}
	
	public void setPosRef(Position posRef)
	{
		this.posRef=posRef;
	}
	
	public Position getPosTarget()
	{
		return posTarget;
	}
	
	public Position getPosRef()
	{
		return posRef;
	}
}
