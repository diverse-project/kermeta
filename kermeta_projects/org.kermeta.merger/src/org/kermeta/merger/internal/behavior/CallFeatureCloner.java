

/*$Id: CallFeatureCloner.java,v 1.3 2008-07-08 13:18:33 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	CallFeatureCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import org.kermeta.io.KermetaUnit;
import org.kermeta.merger.internal.util.TypeCloner;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Object;

public class CallFeatureCloner {

	static public Object clone(CallFeature node, AbstractBehaviorCloner visitor) {
		KermetaUnit unit = visitor.getKermetaUnit();
		CallFeature call = BehaviorFactory.eINSTANCE.createCallFeature();
		call.setIsAtpre( node.isIsAtpre() );
		call.setName( node.getName() );
		// A node can have one static operation OR one static enumeration OR one static property
		if ( node.getStaticOperation() != null ) {
			ClassDefinition baseClassDefinition = node.getStaticOperation().getOwningClass();
			ClassDefinition newClassDefinition = (ClassDefinition) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName(baseClassDefinition) );
			Operation newOperation = KermetaModelHelper.ClassDefinition.getOperationByName(unit, newClassDefinition, node.getStaticOperation().getName() );
			call.setStaticOperation( newOperation );
		}
		if ( node.getStaticEnumLiteral() != null ) {
			Enumeration enumeration = (Enumeration) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName(node.getStaticEnumLiteral().getEnumeration()) );
			EnumerationLiteral literal = KermetaModelHelper.Enumeration.getLiteral( enumeration, node.getStaticEnumLiteral().getName() );
			call.setStaticEnumLiteral( literal );
		}
		if ( node.getStaticProperty() != null ) {
			ClassDefinition baseClassDefinition = node.getStaticProperty().getOwningClass();
			ClassDefinition newClassDefinition = (ClassDefinition) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName(baseClassDefinition) );
			Property newProperty = KermetaModelHelper.ClassDefinition.getPropertyByName(unit, newClassDefinition, node.getStaticProperty().getName() );
			call.setStaticProperty( newProperty );
		}
		
		for ( Type staticType : node.getStaticTypeVariableBindings() ) {
			Type t = TypeCloner.clone( staticType, unit );
			call.getStaticTypeVariableBindings().add( t );
			if ( ! (t instanceof TypeVariable) && ! (t instanceof Enumeration) && ! (t instanceof PrimitiveType) )
				call.getContainedType().add( t ); 
		}
		
		// getting the post fix
		for ( Expression expression : node.getParameters() )
			call.getParameters().add( (Expression) visitor.accept(expression) );
		
		if ( node.getTarget() != null )
			call.setTarget( (Expression) visitor.accept(node.getTarget()) );
		
		return call;
	}
	
}


