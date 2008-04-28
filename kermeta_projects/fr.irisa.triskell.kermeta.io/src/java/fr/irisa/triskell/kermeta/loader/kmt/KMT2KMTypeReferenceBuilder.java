/* $Id: KMT2KMTypeReferenceBuilder.java,v 1.9 2008-04-28 11:50:13 ftanguy Exp $
 * Created on 6 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.parser.gen.ast.TypeRef;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class KMT2KMTypeReferenceBuilder extends KMT2KMPass {

	public static TypeReference process(LoadingContext context, TypeRef node, KermetaUnit builder, IProgressMonitor monitor) {
		if (node == null) return null;
		KMT2KMTypeReferenceBuilder visitor = new KMT2KMTypeReferenceBuilder(builder, context, monitor);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected TypeReference result;
	
	/**
	 * @param builder
	 */
	public KMT2KMTypeReferenceBuilder(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);
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
		result.setType(KMT2KMTypeBuilder.process(context, typeRef.getReftype(), builder, monitor));
		return false;
	}
}
