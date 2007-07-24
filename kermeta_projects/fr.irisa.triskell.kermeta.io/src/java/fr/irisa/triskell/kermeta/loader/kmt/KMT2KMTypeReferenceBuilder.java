/*
 * Created on 6 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.ast.TypeRef;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMT2KMTypeReferenceBuilder extends KMT2KMPass {

	public static TypeReference process(LoadingContext context, TypeRef node, KermetaUnit builder) {
		if (node == null) return null;
		KMT2KMTypeReferenceBuilder visitor = new KMT2KMTypeReferenceBuilder(builder, context);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected TypeReference result;
	
	/**
	 * @param builder
	 */
	public KMT2KMTypeReferenceBuilder(KermetaUnit builder, LoadingContext context) {
		super(builder, context);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.TypeRef)
	 */
	public boolean beginVisit(TypeRef typeRef) {
		result = BehaviorFactory.eINSTANCE.createTypeReference();
		builder.storeTrace(result, typeRef);
		result.setIsOrdered(isOrdered(typeRef));
		result.setIsUnique(isUnique(typeRef));
		result.setLower(getLower(typeRef));
		result.setUpper(getUpper(typeRef));
		result.setType(KMT2KMTypeBuilder.process(context, typeRef.getReftype(), builder));
		return false;
	}
}
