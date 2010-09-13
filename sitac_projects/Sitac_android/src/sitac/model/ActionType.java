package sitac.model;

public class ActionType {
	
	private String code;
	
	public ActionType()
	{
		super();
	}
	
	public ActionType(String code)
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
