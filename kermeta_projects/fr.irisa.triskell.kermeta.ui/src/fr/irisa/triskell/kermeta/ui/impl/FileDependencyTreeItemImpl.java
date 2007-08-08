/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileDependencyTreeItemImpl.java,v 1.3 2007-08-08 12:58:23 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.ui.impl;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.kpm.Dependency;
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
			Iterator<Dependency> iterator = unit.getDependencies().iterator();
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
		return ((Unit)getValue()).getValue();
	}
	
} //FileDependencyTreeItemImpl