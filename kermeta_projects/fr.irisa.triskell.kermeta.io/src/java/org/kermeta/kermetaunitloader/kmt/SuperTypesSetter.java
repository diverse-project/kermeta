

/*$Id: SetSuperTypesPass.java,v 1.3 2008-03-05 07:55:16 ftanguy Exp $
* Project : org.kermeta.io.loader
* File : 	SetTypesPass.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.kermetaunitloader.kmt;

import java.util.Iterator;
import java.util.List;

import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.ast.helper.KermetaASTHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMT2KMTypeBuilder;
import fr.irisa.triskell.kermeta.parser.gen.ast.ClassDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.CompUnit;
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
public class SuperTypesSetter extends KermetaASTNodeVisitor  {

	private KermetaUnit kermetaUnit;
	
	private LoadingContext context;
	
	public SuperTypesSetter(KermetaUnit keremtaUnit, LoadingContext loadingContext) {
		this.kermetaUnit = keremtaUnit;
		this.context = loadingContext;		
	}

	public void setSuperTypes(CompUnit ast) {
		
		ast.accept(this);
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
				fr.irisa.triskell.kermeta.language.structure.Operation superOperation = KermetaModelHelper.ClassDefinition.getSuperOperation(kermetaUnit, owner, KermetaModelHelper.NamedElement.qualifiedName(supertypeDefinition), o.getName());
				if( superOperation == null ){
					// HACK retry after flushing out the cache DVK, probaly a problem in a previous step but seems very hard to sort it out ...
					kermetaUnit.getAllImportedKermetaUnitsCache().clear();
					kermetaUnit.getTypeDefinitionContextsCache().clear();
					superOperation = KermetaModelHelper.ClassDefinition.getSuperOperation(kermetaUnit, owner, KermetaModelHelper.NamedElement.qualifiedName(supertypeDefinition), o.getName());
				}
				if ( superOperation != null )
					o.setSuperOperation(superOperation);
				else 	{
					kermetaUnit.error("No super operation found in " + qualifiedName + " for operation " + o.getName(), o);
				}
			} else {
				//fr.irisa.triskell.kermeta.language.structure.Operation superOperation = KermetaModelHelper.ClassDefinition.getFirstSuperOperation(owner, o.getName());
				List<fr.irisa.triskell.kermeta.language.structure.Operation> superOperations = KermetaModelHelper.ClassDefinition.getDirectSuperOperations(kermetaUnit, owner, o.getName());
				switch (superOperations.size()) {
				case 0:
					kermetaUnit.error("No super operation found for method " + o.getName() + " in class definition " + KermetaModelHelper.NamedElement.qualifiedName((NamedElement)o.eContainer()), o);
					KermetaModelHelper.ClassDefinition.getSuperOperations(kermetaUnit, owner, o.getName());
					break;
				case 1:
					o.setSuperOperation( superOperations.get(0) );
					break;
				default:
					// check that all operations are the same (they may comes from different aspects
					fr.irisa.triskell.kermeta.language.structure.Operation firstOp = superOperations.get(0);
					boolean allTheSameOperation = true;
					for(fr.irisa.triskell.kermeta.language.structure.Operation  op :superOperations){
						if(op != firstOp) {
							// maybe there are aspect of one another
							allTheSameOperation = false;
						}
					}
					if(! allTheSameOperation){
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
					}
					else
						o.setSuperOperation( superOperations.get(0) );
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


