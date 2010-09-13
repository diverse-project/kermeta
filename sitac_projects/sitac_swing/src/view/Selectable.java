package view;

public class Selectable {
    protected boolean selected=false;
    
    public Selectable()
    {
    	
    }
    
    public void setSelected(boolean b)
    {
    	selected=b;
    }
    
    public boolean isSelected()
    {
    	return selected;
    }
}
