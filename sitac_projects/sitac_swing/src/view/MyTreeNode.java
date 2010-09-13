package view;

import java.util.ArrayList;
import java.util.List;

public class MyTreeNode {
	private List<MyTreeNode> children = new ArrayList<MyTreeNode>();
	private String name;
	private int code;
	
	public MyTreeNode()
	{
		
	}
	
	public List<MyTreeNode> getChildren() 
	{
		return children;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setCode(int code)
	{
		this.code = code;
	}
	
	public int getCode()
	{
		return code;
	}
	
	public int getHeight()
	{
		if (children.size() == 0)
			return 0;
		else
		{
			int[] val = new int[children.size()];
			for (int i=0; i<children.size(); i++)
				val[i] = children.get(i).getHeight();
			return 1 + max(val);
		}
	}
	
	private int max(int[] val)
	{
		int max = val[0];
		for (int i=1; i<val.length; i++)
			if (val[i] > max)
				max = val[i];
		return max;
	}
}
