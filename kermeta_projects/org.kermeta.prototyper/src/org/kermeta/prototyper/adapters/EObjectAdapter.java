/*$Id: EObjectAdapter.java,v 1.1 2008-04-04 09:37:59 cfaucher Exp $
* Project : org.kermeta.prototyper
* File : 	KermetaConnector.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 31 juil. 07
* Authors : cfaucher
*/

package org.kermeta.prototyper.adapters;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.prototyper.PrototyperConstants;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

public class EObjectAdapter {
	
	/**
	 * 
	 * @param eobj
	 * @return
	 */
	public List<Operation> getOperationsAdapter(EObject eobj) {
		List<Operation> callableOperations = new ArrayList<Operation>();
		if(eobj != null) {
			callableOperations = getClassDefinitionAdapter(eobj).getOwnedOperation();
		}
		return callableOperations;
	}	
	
	/**
	 * 
	 * @param eobj
	 * @return
	 */
	public ClassDefinition getClassDefinitionAdapter(EObject eobj) {
		ClassDefinition classDef = null;
		
		String qualifiedName = EcoreHelper.getQualifiedName(eobj.eClass());
		if(qualifiedName != null) {
			KermetaUnit currentKU = getKermetaUnitFromEObject(eobj);
						
			if(currentKU != null ) {
				TypeDefinition currentTypeDef = currentKU.getTypeDefinitionByQualifiedName(qualifiedName);
				if(currentTypeDef instanceof ClassDefinition) {
					classDef = (ClassDefinition) currentTypeDef;
				}
			}
		}
				
		return classDef;
	}
	
	/**
	 * 
	 * @param eobj
	 * @return
	 */
	public KermetaUnit getKermetaUnitFromEObject(EObject eobj) {
		KermetaUnit expectedKU = null;
		
		Unit kpm_unit = getKpmUnitFromEObject(eobj);
		
		for(Dependency dependencies : kpm_unit.getDependencies()) {
			if(dependencies.getType().getName().equals(PrototyperConstants.CONFORMS_TO)) {
				Unit dependentUnit = dependencies.getTo();
				
				if(dependentUnit!=null && (dependentUnit.getValue().contains(PrototyperConstants.EXTENSION_KMT) || dependentUnit.getValue().contains(PrototyperConstants.EXTENSION_KMT))) {
					getKermetaUnitFromKpmUnit(dependentUnit);
					
				}
			}
		}
		return expectedKU;
	}
	
	/**
	 * 
	 * @param eobj
	 * @return
	 */
	public Unit getKpmUnitFromEObject(EObject eobj) {
		Unit expectedUnit = null;
		IFile file = ResourceHelper.getIFile(eobj.eResource().getURI().toString());
		KermetaProject currentProject = KermetaWorkspace.getInstance().getKermetaProject(file.getProject());
		expectedUnit = currentProject.getKpm().findUnit(file.getFullPath().toString());
		return expectedUnit;
	}
	
	/**
	 * 
	 * @param givenUnit
	 * @return
	 */
	public KermetaUnit getKermetaUnitFromKpmUnit(Unit givenUnit) {
		KermetaUnit expectedKU = null;
		try {
			expectedKU = IOPlugin.getDefault().loadKermetaUnit( PrototyperConstants.PREFIX_RESOURCE + givenUnit.getValue());
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KermetaIOFileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return expectedKU;
	}
}


