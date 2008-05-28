/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileDependencyTreeItemImpl.java,v 1.4 2008-05-28 09:25:42 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.ui.impl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;

import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.ui.FileDependencyTreeItem;
import fr.irisa.triskell.kermeta.ui.UiFactory;
import fr.irisa.triskell.kermeta.ui.UiPackage;

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
	@Override
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
			Iterator<Dependency> iterator = unit.getDependents().iterator();
			while ( iterator.hasNext() ) {
				Dependency currentDependency = iterator.next();
				FileDependencyTreeItem item = UiFactory.eINSTANCE.createFileDependencyTreeItem();
				item.setValue( currentDependency.getTo() );
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
		return ((Unit)getValue()).getName();
	}
	
} //FileDependencyTreeItemImpl