/* $Id: KMT2KMPass2_1.java,v 1.2 2007-06-08 07:47:15 cfaucher Exp $
 * Project : Kermeta io
 * File : KMT2KMPass2_1.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Oct 2, 2006
 * Author : 
 *			Jim Steel
 * Description :
 * 	Second pass for the construct kcore representation of 
 *  a Kermeta program, mainly construct packages and types.
 */
package fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt;

import java.util.Stack;

import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Basictype;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.ModelTypeDecl;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.TypeVarDecl;

/**
 * 
 * @author Jim Steel
 * 
 * PASS 2.1 :
 *  - Where appropriate, replaces ObjectTypeVariables with ModelTypeVariables
 * 
 */
public class KMT2KMPass2_1 extends KMT2KMPass {

	/**
	 * 
	 * @param builder
	 */
	public KMT2KMPass2_1(KermetaUnit builder) {
		super(builder);
	}

	/**
	 * Keep stock of 
	 * FIXME CF ModelType 07-06-06
	 */
	/*private Stack<ModelTypeDefinition> mtdefs = new Stack<ModelTypeDefinition>();
	private ModelTypeDefinition current_mtdef() {
		return (ModelTypeDefinition)mtdefs.peek();
	}*/
	
	/**
	 * Build up the namespace stack in order to be able to track the container
	 * of the type variables
	 */
	public boolean beginVisit(ModelTypeDecl mtdef) {
		// FIXME CF ModelType 07-06-06
		//mtdefs.push((ModelTypeDefinition) builder.getModelElementByNode(mtdef));
		return super.beginVisit(mtdef);
	}
	
	/**
	 * Pop the mtdef from the namespace stack
	 */
	public void endVisit(ModelTypeDecl mtdef) {
		//mtdefs.pop();
		super.endVisit(mtdef);
	}
	
	/**
	 * The main method of the pass. Check if the supertype of a type variable is a model type, and if it is
	 * then replace the old ObjectTypeVariable with a ModelTypeVariable.
	 */
	public boolean beginVisit(TypeVarDecl typeVarDecl) {
		// Pass 2 has already created an ObjectTypeVariable.
		TypeVariable tv = (TypeVariable)builder.getModelElementByNode(typeVarDecl);
		// If its supertype is a ModelType, we need to dissociate it and replace it with a ModelTypeVariable
		// Unfortunately, its too early for types, but what we can do is find the typeDefinition and check that
		Basictype bsuper = (Basictype) typeVarDecl.getSupertype();
		// If there is no supertype, or if for some reason its not a basic type (impossible), we don't care any more
		if (null == bsuper) return false; 
		String qname = qualifiedIDAsString(bsuper.getName());
		// this can be a class, and enum or a type variable.
		TypeDefinition superdef = builder.getTypeDefinitionByName(qname);
		//Type supertype = KMT2KMTypeBuilder.process(typeVarDecl.getSupertype(), builder);
		
		// FIXME CF ModelType 07-06-06
		/*if (superdef instanceof ModelTypeDefinition) {
			ModelTypeVariable mtv = builder.struct_factory.createModelTypeVariable();
			mtv.setName(tv.getName());
			GenericTypeDefinition context;
			if (builder.current_class != null) {
				// We are parameterizing a model type definition
				context = builder.current_class;
			} else {
				// Otherwise it is a class
				context = (ModelTypeDefinition) current_mtdef();
			}
			context.getTypeParameter().set(context.getTypeParameter().indexOf(tv), mtv);
			builder.storeTrace(mtv, typeVarDecl);
			fr.irisa.triskell.kermeta.language.structure.Type supertype = KMT2KMTypeBuilder.process(bsuper, builder);
			mtv.setSupertype(supertype);
			// this supertype is contained by the ModeltypeVariable
			mtv.getContainedType().add(supertype);
		} else {
			// Set the supertype while we're here
			//tv.setSupertype(supertype);
		}*/
		// end of the FIXME CF ModelType 07-06-06
		
		return false;
	}
	
}
