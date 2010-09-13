package control;

import java.util.ArrayList;
import java.util.List;

import model.Soiec;
import model.SoiecNodeInfo;
import view.SoiecPanel;

/**The controller for the soiec panel**/
public class SoiecControl {
	private Soiec soiec;
	private SoiecPanel soiecPanel;
	
	public SoiecControl()
	{
		soiec = new Soiec();
	}
	
	public void addView(SoiecPanel s)
	{
		soiecPanel = s;
	}
	
	public void insertNode(Object parent, SoiecNodeInfo child)
	{
		SoiecNodeInfo node = (SoiecNodeInfo)parent;
		if (node==null)
			return;
		node.addChild(child);
		soiecPanel.updateView();
	}
	
	public void insertNode(String desc)
	{
		soiec.getRoot().addChild(new SoiecNodeInfo(desc));
		soiecPanel.updateView();
	}
	
	public void updateNode(Object node, String desc)
	{
		SoiecNodeInfo n = (SoiecNodeInfo)node;
		n.setDesc(desc);
	}
	
	public void removeNode(Object parent, Object child)
	{
		((SoiecNodeInfo)parent).removeChild((SoiecNodeInfo)child);
		soiecPanel.updateView();
	}
	
	public void removeNode(String desc)
	{
		SoiecNodeInfo node = soiec.getChild(desc);
		if (node != null)
		{
			soiec.getRoot().removeChild(node);
			soiecPanel.updateView();
		}
	}
	
	public SoiecNodeInfo getRoot()
	{
		return soiec.getRoot();
	}
	
	public List<String> getRootChildrenDesc()
	{
		List<SoiecNodeInfo> children = getRootChildren();
		List<String> desc = new ArrayList<String>();
		for (int i=0; i<children.size(); i++)
			desc.add(children.get(i).getDesc());
		return desc;
	}
	
	public List<SoiecNodeInfo> getRootChildren()
	{
		return soiec.getRoot().getChildren();
	}
	
	public List<SoiecNodeInfo> getChildren(Object parent)
	{
		SoiecNodeInfo node = (SoiecNodeInfo)parent;
		return node.getChildren();
	}
}
