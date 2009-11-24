/**
 * <copyright>
 * </copyright>
 *
 * $Id: DependentFileTreeItemImpl.java,v 1.6 2008-06-24 11:45:37 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.ui.impl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;

import fr.irisa.triskell.kermeta.kpm.Usage;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.ui.DependentFileTreeItem;
import fr.irisa.triskell.kermeta.ui.UiFactory;
import fr.irisa.triskell.kermeta.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependent File Tree Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DependentFileTreeItemImpl extends TreeItemImpl implements DependentFileTreeItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependentFileTreeItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.DEPENDENT_FILE_TREE_ITEM;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void calculateChildren() {
	
		if ( getChildren().size() == 0 ) {
			
			Unit unit = (Unit) getValue();
			Iterator<Usage> iterator = unit.getUsedBy().iterator();
			while ( iterator.hasNext() ) {
				Usage currentDependency = iterator.next();
				DependentFileTreeItem item = UiFactory.eINSTANCE.createDependentFileTreeItem();
				item.setValue( currentDependency.getUserUnit() );
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

} //DependentFileTreeItemImpl