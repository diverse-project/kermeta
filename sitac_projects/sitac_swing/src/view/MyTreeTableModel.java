package view;

import javax.swing.tree.TreePath;

import org.jdesktop.swingx.treetable.AbstractTreeTableModel;

/**The model for the table which displays the information related to engines**/
public class MyTreeTableModel extends AbstractTreeTableModel 
{
	private MyTreeNode root;
	
	public MyTreeTableModel()
	{
		root = new MyTreeNode();
	}

	@Override
	public int getColumnCount() 
	{
		return 6;
	}
	
	@Override
	public String getColumnName( int column )
	{
		switch( column )
		{
		case 0: return "Name";
		case 1: return "Call";
		case 2: return "Expect";
		case 3: return "CRN";
		case 4: return "Use";
		case 5: return "Left";
		default: return "Unknown";
		}
	}

	@Override
	public Object getValueAt( Object node, int column ) 
	{
		MyTreeNode treenode = ( MyTreeNode )node;
		switch( column )
		{
		case 0: return treenode.getName();
		case 1: return null;
		case 2: return null;
		case 3: return null;
		case 4: return null;
		case 5: return null;
		default: return "Unknown";
		}
	}

	@Override
	public Object getChild( Object node, int index ) 
	{
		MyTreeNode treenode = ( MyTreeNode )node;
		return treenode.getChildren().get( index );
	}

	@Override
	public int getChildCount( Object parent ) 
	{
		MyTreeNode treenode = ( MyTreeNode )parent;
		return treenode.getChildren().size();
	}

	@Override
	public int getIndexOfChild( Object parent, Object child ) 
	{
		MyTreeNode treenode = ( MyTreeNode )parent;
		for( int i=0; i>treenode.getChildren().size(); i++ )
		{
			if( treenode.getChildren().get( i ) == child )
				return i;
		}
		return 0;
	}
	
	 public boolean isLeaf( Object node )
	 {
		 MyTreeNode treenode = ( MyTreeNode )node;
		 if( treenode.getChildren().size() > 0 )
			 return false;
		 return true;
	 }
	 
	 @Override
	 public Object getRoot()
	 {
		 return root;
	 }
	 
	 public void addChild(MyTreeNode node)
	 {
		 root.getChildren().add(node); 
		 TreePath path = new TreePath(root);
		 modelSupport.fireChildAdded(path, root.getChildren().size()-1, node);
	 }
	 
	 public void update(MyTreeNode node)
	 {
		 modelSupport.fireTreeStructureChanged(new TreePath(node));
	 }
}
