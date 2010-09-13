package control;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreePath;

import model.CIS;
import model.Moyen;
import model.MoyenType;
import view.ItemType;
import view.MoyenClipboard;
import view.MyTreeNode;
import view.MyTreeTableModel;
import view.SymbolsLibrary;

/**The controller for the moyen clipboard**/
public class MoyenControl {
	private CIS cis;
	private MoyenClipboard clipboard;
	private SymbolsLibrary library;
	
	public MoyenControl()
	{
		cis = new CIS();
	}
	
	public void addView(MoyenClipboard clipboard)
	{
		this.clipboard = clipboard;
	}
	
	public void addView(SymbolsLibrary library)
	{
		this.library = library;
	}

	public MyTreeTableModel createTreeTable()
	{
		MyTreeTableModel model = new MyTreeTableModel();
		MyTreeNode root = (MyTreeNode)model.getRoot();
		List<Moyen> moyens = cis.getMoyens();
		for (int i=0; i<moyens.size(); i++)
		{
			MyTreeNode node = new MyTreeNode();
			node.setName(moyens.get(i).getName());
			node.setCode(moyens.get(i).getType().getCode());
			root.getChildren().add(node);
			List<Moyen> children1 = moyens.get(i).getChildren();
			for (int j=0; j<children1.size(); j++)
			{
				MyTreeNode node1 = new MyTreeNode();
				node1.setName(children1.get(j).getName());
				node1.setCode(children1.get(j).getType().getCode());
				node.getChildren().add(node1);
				List<Moyen> children2 = children1.get(j).getChildren();
				for (int k=0; k<children2.size(); k++)
				{
					MyTreeNode node2 = new MyTreeNode();
					node2.setName(children2.get(k).getName());
					node2.setCode(children2.get(k).getType().getCode());
					node1.getChildren().add(node2);
				}
			}
		}
		return model;
	}
	
	public void addMoyen(int type, String name)
	{
		Moyen m = new Moyen(new MoyenType(type), name);
		cis.getMoyens().add(m);
		MyTreeNode node = new MyTreeNode();
		node.setName(m.getName());
		node.setCode(type);
		clipboard.addChild(node);
		if (type == 1)
			library.addItem(new ItemType(Color.red,name,0));
		else
			library.addItem(new ItemType(Color.blue,name,0));
	}
	
	public void groupMoyens(TreePath[] paths)
	{
		if (paths != null && paths.length > 1) {
			List<MyTreeNode> nodes = new ArrayList<MyTreeNode>();
			for (int i = 0; i < paths.length - 1; i++)
			{
				MyTreeNode node1 = (MyTreeNode)paths[i].getLastPathComponent();
				MyTreeNode node2 = (MyTreeNode)paths[i+1].getLastPathComponent();
				int h1 = node1.getHeight() + paths[i].getPathCount();
				int h2 = node2.getHeight() + paths[i+1].getPathCount();
				if (paths[i].getParentPath() != paths[i + 1].getParentPath()
						|| h1 > 3 || h1 != h2 || node1.getCode() != node2.getCode())
					return;
				else
					nodes.add((MyTreeNode) paths[i].getLastPathComponent());
			}
			nodes.add((MyTreeNode) paths[paths.length - 1].getLastPathComponent());
			MyTreeNode newNode = new MyTreeNode();
			newNode.setName("Group");
			MyTreeNode parent = (MyTreeNode) paths[0].getParentPath().getLastPathComponent();
			int[] ind = new int[nodes.size()];
			for (int i=0; i<nodes.size(); i++)
				ind[i] = parent.getChildren().indexOf(nodes.get(i));
			parent.getChildren().removeAll(nodes);
			newNode.getChildren().addAll(nodes);
			parent.getChildren().add(newNode);
			clipboard.update(parent);
			if (parent.equals(clipboard.getRoot()))
				library.update(ind, newNode.getName());
				
		}
	}
	
	public List<ItemType> getItems()
	{
		List<ItemType> items = new ArrayList<ItemType>();
		List<Moyen> moyens = cis.getMoyens();
		for (int i=0; i<moyens.size(); i++)
		{
			Moyen m = moyens.get(i);
			int nbLines = m.getHeight();
			String desc = m.getName() + m.getNumber();
			Color color;
			if (m.getType().getCode() == 1)
				color = Color.red;
			else
				color = Color.blue;
			items.add(new ItemType(color,desc,nbLines));
		}
		return items;
	}
}
