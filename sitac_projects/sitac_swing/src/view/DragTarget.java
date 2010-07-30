/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import javax.swing.JComponent;

public class DragTarget extends JComponent implements DropTargetListener {
    public DragTarget() {
        new DropTarget(this, this);
    }
    
    public void dragEnter(DropTargetDragEvent evt) {
        // Called when the user is dragging and enters this drop target.
    	System.out.println("enter");
    }
    public void dragOver(DropTargetDragEvent evt) {
        // Called when the user is dragging and moves over this drop target.
    	System.out.println("over");
    }
    public void dragExit(DropTargetEvent evt) {
        // Called when the user is dragging and leaves this drop target.
    	System.out.println("exit");
    }
    public void dropActionChanged(DropTargetDragEvent evt) {
        // Called when the user changes the drag action between copy or move.
    	System.out.println("changed");
    }
    public void drop(DropTargetDropEvent evt) {
        // Called when the user finishes or cancels the drag operation.
    	System.out.println("drop");
    }
}
