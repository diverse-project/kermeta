/* $Id: KermetaGLNavigateUI.java,v 1.1 2005-12-05 19:14:30 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : KermetaGLNavigateUI.java
 * License : GPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */

package fr.irisa.triskell.kermeta.touchnavigator.graphlayout.interaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import com.touchgraph.graphlayout.interaction.GLEditUI;
import com.touchgraph.graphlayout.interaction.GLNavigateUI;

import fr.irisa.triskell.kermeta.touchnavigator.graphlayout.KermetaGLPanel;

/** KermetaGLNavigateUI:  User Interface for editing the graph.
 *
 * @author   Didier Vojtisek
 * @version  1.21  $Id: KermetaGLNavigateUI.java,v 1.1 2005-12-05 19:14:30 dvojtise Exp $
 */
public class KermetaGLNavigateUI extends GLNavigateUI {
	
	
	// ............
	
	
	
	public KermetaGLNavigateUI( KermetaGLPanel glPanel ) {
		super(glPanel);
	}
	
	protected void setUpNodePopup() { 
		super.setUpNodePopup();
		
		// add new menu to the standard navigation popups for nodes 
		JMenuItem menuItem;
		menuItem = new JMenuItem("Merge Generalizations");
		ActionListener MergeGeneralizationAction = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(popupNode!=null) {
					((KermetaGLPanel)glPanel).getGraphTransform().mergeGeneralization(popupNode);					
				}
			}
		};		
		menuItem.addActionListener(MergeGeneralizationAction);
		nodePopup.add(menuItem);
		// ---
		/* menuItem = new JMenuItem("Expand Generalizations");
		ActionListener ExpandGeneralizationAction = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(popupNode!=null) {
					tgPanel.expandNode(popupNode);
				}
			}
		};		
		menuItem.addActionListener(ExpandGeneralizationAction);
		nodePopup.add(menuItem);
		*/
		// ---
		menuItem = new JMenuItem("Merge Specializations");
		ActionListener MergeSpecializationAction = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(popupNode!=null) {
					((KermetaGLPanel)glPanel).getGraphTransform().mergeSpecialization(popupNode);
				}
			}
		};		
		menuItem.addActionListener(MergeSpecializationAction);
		nodePopup.add(menuItem);
		//	---
		menuItem = new JMenuItem("Expand Specializations");
		ActionListener expandSpecializationAction = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(popupNode!=null) {
					((KermetaGLPanel)glPanel).getGraphTransform().expandSpecialization(popupNode);
				}
			}
		};		
		menuItem.addActionListener(expandSpecializationAction);
		nodePopup.add(menuItem);
		
		
	}
	
} 
