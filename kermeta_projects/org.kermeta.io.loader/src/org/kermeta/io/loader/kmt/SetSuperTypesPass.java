

/*$Id: SetSuperTypesPass.java,v 1.3 2008-03-05 07:55:16 ftanguy Exp $
* Project : org.kermeta.io.loader
* File : 	SetTypesPass.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.kmt;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.action.IKMTLoadingAction;
import org.kermeta.io.loader.action.ILoadingAction;
import org.kermeta.io.loader.datas.KMTLoadingDatas;
import org.kermeta.loader.LoadingContext;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.ast.helper.KermetaASTHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMTypeBuilder;
import fr.irisa.triskell.kermeta.parser.gen.ast.ClassDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNodeVisitor;
import fr.irisa.triskell.kermeta.parser.gen.ast.Operation;
import fr.irisa.triskell.kermeta.parser.gen.ast.TypeVarDecl;

/**
 * 
 * Set the super operations property.
 * 
 * 
 * @author paco
 *
 */
public class SetSuperTypesPass extends KermetaASTNodeVisitor implements ILoadingAction, IKMTLoadingAction {

	private KermetaUnit kermetaUnit;
	
	private LoadingContext context;
	
	public void performAction(ILoadingDatas datas, Map<?, ?> options) {
		performAction( (KMTLoadingDatas) datas, options );
	}

	public void performAction(KMTLoadingDatas datas, Map<?, ?> options) {
		kermetaUnit = datas.getKermetaUnit();
		context = datas.context;
		datas.ast.accept(this);
	}
	
	/*
	 * 
	 * Class Definition
	 * 
	 */
	@Override
	public boolean beginVisit(ClassDecl classDecl) {
		ClassDefinition classDefinition = (ClassDefinition) kermetaUnit.getModelElementByNode(classDecl);
		context.current_class = classDefinition;
		// Continue the visit
		return true;
	}
	
	@Override
	public void endVisit(ClassDecl classDecl) {
		context.current_class = null;
	}
	
	/*
	 * 
	 * Operation
	 * 
	 */
	@Override
	public boolean beginVisit(Operation operation) {
		fr.irisa.triskell.kermeta.language.structure.Operation o = (fr.irisa.triskell.kermeta.language.structure.Operation) kermetaUnit.getModelElementByNode(operation);
		/*
		 * 
		 * Setting the super operation
		 * 
		 */
		if ( operation.getOperationKind().getText().equals("method") ) {
			ClassDefinition owner = o.getOwningClass();
			if ( operation.getSuperSelection() != null ) {
				String qualifiedName = KermetaASTHelper.qualifiedIDAsString(operation.getSuperSelection());
				TypeDefinition supertypeDefinition = kermetaUnit.getTypeDefinitionByName(qualifiedName);
				fr.irisa.triskell.kermeta.language.structure.Operation superOperation = KermetaModelHelper.ClassDefinition.getSuperOperation(owner, KermetaModelHelper.NamedElement.qualifiedName(supertypeDefinition), o.getName());
				if ( superOperation != null )
					o.setSuperOperation(superOperation);
				else 	
					kermetaUnit.error("No super operation found in " + qualifiedName + " for operation " + o.getName(), o);
			} else {
				//fr.irisa.triskell.kermeta.language.structure.Operation superOperation = KermetaModelHelper.ClassDefinition.getFirstSuperOperation(owner, o.getName());
				List<fr.irisa.triskell.kermeta.language.structure.Operation> superOperations = KermetaModelHelper.ClassDefinition.getSuperOperations(owner, o.getName());
				switch (superOperations.size()) {
				case 0:
					kermetaUnit.error("No super operation found for method " + o.getName() + " in class definition " + KermetaModelHelper.NamedElement.qualifiedName((NamedElement)o.eContainer()), o);
					break;
				case 1:
					o.setSuperOperation( superOperations.get(0) );
					break;
				default:
					String message = "Several super operations found for method " + o.getName() + " in class definition " + KermetaModelHelper.NamedElement.qualifiedName((NamedElement)o.eContainer());
					message += "\nDefinitions coming from ";
					Iterator<fr.irisa.triskell.kermeta.language.structure.Operation> it = superOperations.iterator();
					while ( it.hasNext() ) {
						message += KermetaModelHelper.NamedElement.qualifiedName( (NamedElement) it.next().eContainer() );
						if ( it.hasNext() )
							message += ", ";
					}
					message += ".";
					kermetaUnit.error(message, o);
					break;
				}
			}
		}
		/*
		 * 
		 * Setting the super types of Type Variables
		 * 
		 */
		if ( operation.getTypeVarDecllst() != null )
			operation.getTypeVarDecllst().accept(this);
		// Continue the visit
		return false;
	}
		
	@Override
	public boolean beginVisit(TypeVarDecl typeVarDecl) {
		TypeVariable typeVariable = (TypeVariable) kermetaUnit.getModelElementByNode(typeVarDecl);
		if (! (typeVariable instanceof ModelTypeVariable) )
			typeVariable.setSupertype(KMT2KMTypeBuilder.process(context, typeVarDecl.getSupertype(), kermetaUnit, null));
		return false;
	}

}


