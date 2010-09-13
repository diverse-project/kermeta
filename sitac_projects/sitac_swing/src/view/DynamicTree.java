package view;
/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

import java.util.EventObject;

import javax.swing.JTree;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

/**This class represents the tree that is be displayed in the soiec panel**/
public class DynamicTree extends JTree {
    private DefaultMutableTreeNode rootNode;
    private DefaultTreeModel treeModel;
    private int level;

    public DynamicTree(int level) 
    {
    	super();
    	this.level = level;
        rootNode = new DefaultMutableTreeNode();
        treeModel = new TreePanel.MyTreeModel(rootNode);
        setModel(treeModel);
        setEditable(true);
        getSelectionModel().setSelectionMode
                (TreeSelectionModel.SINGLE_TREE_SELECTION);
        setShowsRootHandles(true);
        setRootVisible(false);
        setRowHeight(30);
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
		renderer.setLeafIcon(null);
		renderer.setClosedIcon(null);
		renderer.setOpenIcon(null);
		setCellRenderer(renderer);
		TreeCellEditor editor = new LeafCellEditor(this, renderer);
		setCellEditor(editor);
    }
    
    public void clear() {
        rootNode.removeAllChildren();
        treeModel.reload();
    }

    /** Remove the currently selected node. */
    public Object[] removeCurrentNode() {
        TreePath currentSelection = getSelectionPath();
        if (currentSelection != null && currentSelection.getPathCount()==level) {
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode)
                         (currentSelection.getLastPathComponent());
            MutableTreeNode parent = (MutableTreeNode)(currentNode.getParent());
            if (parent != null) {
                treeModel.removeNodeFromParent(currentNode);
                Object[] path = currentSelection.getPath();
                Object obj1 = ((DefaultMutableTreeNode)path[path.length-2]).getUserObject();
                Object obj2 = currentNode.getUserObject();
                return new Object[]{obj1, obj2};
            }
        } 
        return null;
    }

    public DefaultMutableTreeNode addObject(Object child) {
        DefaultMutableTreeNode parentNode = null;
        TreePath parentPath = getSelectionPath();
        if (parentPath == null) 
            parentNode = rootNode;
        else if (parentPath.getPathCount()==level-1) 
            parentNode = (DefaultMutableTreeNode)
                         (parentPath.getLastPathComponent());
        else
        	return null; 
        return addObject(parentNode, child, true);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child) {
        return addObject(parent, child, false);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child, 
                                            boolean shouldBeVisible) {
        DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(child);
        if (parent == null) {
            parent = rootNode;
        }	
        treeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());
        if (shouldBeVisible) {
            scrollPathToVisible(new TreePath(childNode.getPath()));
        }
        return childNode;
    }
    
    public void addTreeModelListener(TreeModelListener listener)
    {
    	treeModel.addTreeModelListener(listener);
    }
    
    private class LeafCellEditor extends DefaultTreeCellEditor {

		public LeafCellEditor(JTree tree, DefaultTreeCellRenderer renderer) {
			super(tree, renderer);
		}

		public boolean isCellEditable(EventObject event) {
			boolean returnValue = super.isCellEditable(event);
			if (returnValue) {
				Object node = tree.getLastSelectedPathComponent();
				if ((node != null) && (node instanceof TreeNode)) {
					TreeNode treeNode = (TreeNode) node;
					returnValue = treeNode.isLeaf();
				}
			}
			return returnValue;
		}
	}
}
