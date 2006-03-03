/*
 * Created on 6 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.ast.TypeRef;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMT2KMTypeReferenceBuilder extends KMT2KMPass {

	public static TypeReference process(TypeRef node, KermetaUnit builder) {
		if (node == null) return null;
		KMT2KMTypeReferenceBuilder visitor = new KMT2KMTypeReferenceBuilder(builder);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected TypeReference result;
	
	/**
	 * @param builder
	 */
	public KMT2KMTypeReferenceBuilder(KermetaUnit builder) {
		super(builder);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.TypeRef)
	 */
	public boolean beginVisit(TypeRef typeRef) {
		result = builder.behav_factory.createTypeReference();
		builder.storeTrace(result, typeRef);
		result.setIsOrdered(isOrdered(typeRef));
		result.setIsUnique(isUnique(typeRef));
		result.setLower(getLower(typeRef));
		result.setUpper(getUpper(typeRef));
		result.setType(KMT2KMTypeBuilder.process(typeRef.getReftype(), builder));
		return false;
	}
}
