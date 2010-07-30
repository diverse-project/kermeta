package sitac.view;

public abstract class Selectable {

	protected boolean isSelected=false;
	
	public boolean isSelected()
	{
		return isSelected;
	}
	
	public void setSelected(boolean newSelected)
	{
		isSelected=newSelected;
	}
	
	public String toString()
	{
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (selected: ");
		result.append(isSelected);
		result.append(')');
		return result.toString();
	}
}
