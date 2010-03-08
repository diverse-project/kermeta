

/*$Id: AddContentToModelType.java,v 1.2 2008-02-14 07:12:48 uid21732 Exp $
* Project : org.kermeta.io.loader
* File : 	SetTypesPass.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.kermetaunitloader.kmt;


import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.ast.helper.KermetaASTHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMT2KMTypeBuilder;
import fr.irisa.triskell.kermeta.parser.gen.ast.Basictype;
import fr.irisa.triskell.kermeta.parser.gen.ast.ClassDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.CompUnit;
import fr.irisa.triskell.kermeta.parser.gen.ast.DataTypeDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.EnumDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNodeVisitor;
import fr.irisa.triskell.kermeta.parser.gen.ast.ModelTypeDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.QualifiedID;
import fr.irisa.triskell.kermeta.parser.gen.ast.TypeVarDecl;

/**
 * 
 * Set the super operations property.
 * 
 * 
 * @author paco
 *
 */
public class ModelTypeContentBuilder extends KermetaASTNodeVisitor {

	private KermetaUnit kermetaUnit;
	
	private ClassDefinition current_classDef;
	
	protected LoadingContext loadingContext;
	
	

	public ModelTypeContentBuilder(KermetaUnit kermetaUnit, LoadingContext loadingContext) {
		this.kermetaUnit = kermetaUnit;
		this.loadingContext = loadingContext;
	}
	
	public void generateContent(CompUnit ast){
		ast.accept(this);
	}
		
	@Override
	public boolean beginVisit(EnumDecl enumDecl) {
		return false;
	}
	
	@Override
	public boolean beginVisit(DataTypeDecl dataTypeDecl) {
		return false;
	}
	
	@Override
	public boolean beginVisit(ClassDecl classDecl) {
		if ( classDecl.getTypeVarDecllst() != null ) {
			current_classDef = (ClassDefinition) kermetaUnit.getModelElementByNode(classDecl);
			classDecl.getTypeVarDecllst().accept(this);
		}
		return false;
	}
	
	/*
	 * 
	 * Model Type
	 * 
	 */
	@Override
	public boolean beginVisit(ModelTypeDecl modelTypeDecl) {
		ModelType modelType = (ModelType) kermetaUnit.getModelElementByNode(modelTypeDecl);
		ASTNode[] included = modelTypeDecl.getIncluded().getChildren();
		for (int i=0; i < included.length ; i++) {
			if ( included[i] instanceof QualifiedID ) {
				String qid = KermetaASTHelper.qualifiedIDAsString((QualifiedID) included[i]);
				TypeDefinition referredTD = kermetaUnit.getTypeDefinitionByName(qid, null);
				if (null == referredTD) {
					kermetaUnit.error("Type definition not found : " + qid, modelType);
					return false;
				}
				if ((referredTD instanceof GenericTypeDefinition) && !((GenericTypeDefinition) referredTD).getTypeParameter().isEmpty()) {
					kermetaUnit.error("PASS 3 : Generic type definitions are not permitted in model types");
					return false;
				} else {
					modelType.getIncludedTypeDefinition().add(referredTD);
				}
			}
		}
		return false;
	}
	
	/**
	 * The main method of the pass. Check if the supertype of a type variable is a model type, and if it is
	 * then replace the old ObjectTypeVariable with a ModelTypeVariable.
	 */
	public boolean beginVisit(TypeVarDecl typeVarDecl) {
		
		// Pass 2 has already created an ObjectTypeVariable.
		TypeVariable tv = (TypeVariable) kermetaUnit.getModelElementByNode(typeVarDecl);
		// If its supertype is a ModelType, we need to dissociate it and replace it with a ModelTypeVariable
		// Unfortunately, its too early for types, but what we can do is find the typeDefinition and check that
		Basictype bsuper = (Basictype) typeVarDecl.getSupertype();
		// If there is no supertype, or if for some reason its not a basic type (impossible), we don't care any more
		if (null == bsuper) 
			return false; 
		String qname = KermetaASTHelper.qualifiedIDAsString(bsuper.getName());
		
		// this can be a class, and enum or a type variable.
		TypeDefinition superdef = kermetaUnit.getTypeDefinitionByName(qname, null);
		//Type supertype = KMT2KMTypeBuilder.process(typeVarDecl.getSupertype(), builder);
		if (superdef instanceof ModelType) {
			ModelTypeVariable mtv = StructureFactory.eINSTANCE.createModelTypeVariable();
			mtv.setName(tv.getName());
			GenericTypeDefinition typeDefinition;
				
			typeDefinition = current_classDef;
			//context = ((ModelType) superdef).g
			
			typeDefinition.getTypeParameter().set(typeDefinition.getTypeParameter().indexOf(tv), mtv);
			kermetaUnit.storeTrace(mtv, typeVarDecl);
			fr.irisa.triskell.kermeta.language.structure.Type supertype = KMT2KMTypeBuilder.process(loadingContext, bsuper, kermetaUnit, null);
			mtv.setSupertype(supertype);
			// this supertype is contained by the ModeltypeVariable
			//mtv.getContainedType().add(supertype);
		} else {
			// Set the supertype while we're here
			//tv.setSupertype(supertype);
		}
		return false;
	}
}


