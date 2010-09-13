package sitac.model;

public class InterventionType {
	
	private String code;
	
	public InterventionType()
	{
		super();
	}
	
	public InterventionType(String code)
	{
		this.code=code;
	}
	
	public void setCode(String newCode)
	{
		code=newCode;
	}
	
	public String getCode()
	{
		return code;
	}

}
