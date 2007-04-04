/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileDependencyTreeItemImpl.java,v 1.1 2007-04-04 13:25:29 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.ui.impl;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.kpm.DependencyEntry;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.ui.FileDependencyTreeItem;
import fr.irisa.triskell.kermeta.ui.UiFactory;
import fr.irisa.triskell.kermeta.ui.UiPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Dependency Tree Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FileDependencyTreeItemImpl extends TreeItemImpl implements FileDependencyTreeItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileDependencyTreeItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UiPackage.Literals.FILE_DEPENDENCY_TREE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void calculateChildren() {
	
		if ( getChildren().size() == 0 ) {
			
			Unit unit = (Unit) getValue();
			Iterator<DependencyEntry> iterator = unit.getDependsOnUnits().iterator();
			while ( iterator.hasNext() ) {
				DependencyEntry currentEntry = iterator.next();
				FileDependencyTreeItem item = UiFactory.eINSTANCE.createFileDependencyTreeItem();
				item.setValue( currentEntry.getUnit() );
				item.setParent(this);
				getChildren().add( item );
			}
			
		}
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toText() {
		return ((Unit)getValue()).getValue();
	}
	
} //FileDependencyTreeItemImpl