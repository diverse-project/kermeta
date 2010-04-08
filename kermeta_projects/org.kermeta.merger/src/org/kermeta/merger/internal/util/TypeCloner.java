

/*$Id: TypeCloner.java,v 1.3 2008-04-30 13:58:32 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	TypeCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.util;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;

public class TypeCloner {

	static public Type clone(Type baseType, KermetaUnit unit) {
		if ( baseType != null ) {
			/*
			 * 
			 * Virtual Type Variable case
			 * 
			 */
			if ( baseType instanceof VirtualType ) {
				VirtualType vt = (VirtualType) baseType;
				// A virtual type is contained in a model type variable
				ModelTypeVariable mtv = (ModelTypeVariable) vt.eContainer();
				// Getting the class definition
				ClassDefinition cd = (ClassDefinition) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName( (NamedElement)mtv.eContainer()) );
				// Getting the model type variable
				ModelTypeVariable newmtv = (ModelTypeVariable) KermetaModelHelper.ClassDefinition.getTypeParameter(cd, mtv.getName() );
				// Check if it does already exist.
				VirtualType newvt = null;
				for ( VirtualType currentvt : newmtv.getVirtualType() )
					if ( currentvt.getName().equals(vt.getName()) ) {
						newvt = currentvt;
						break;
					}
				// Creating the new virtual type and setting its properties
				if ( newvt == null ) {
					newvt = StructureFactory.eINSTANCE.createVirtualType();
					ClassDefinition cdReferenced = (ClassDefinition) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName(vt.getClassDefinition()) );
					newvt.setClassDefinition( cdReferenced );
					newvt.setName( vt.getName() );
					newmtv.getVirtualType().add( newvt );
				}
				return newvt;
			/*
			 * 
			 * ObjectTypeVariable Case
			 * 
			 */
			} else if ( baseType instanceof ObjectTypeVariable ) {
				ObjectTypeVariable otv = (ObjectTypeVariable) baseType;
				if ( otv.eContainer() instanceof ClassDefinition ) {
					ClassDefinition cdef = (ClassDefinition) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName( (NamedElement) otv.eContainer()) );
					TypeVariable newotv = KermetaModelHelper.ClassDefinition.getTypeParameter(cdef, otv.getName());
					return newotv;
				} else if ( otv.eContainer() instanceof Operation ) {
					Operation baseoperation = (Operation) otv.eContainer();
					ClassDefinition cdef = (ClassDefinition) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName( baseoperation.getOwningClass()) );
					Operation newoperation = KermetaModelHelper.ClassDefinition.getOperationByName(unit, cdef, baseoperation.getName() );
					TypeVariable newotv = KermetaModelHelper.Operation.getTypeVariable(newoperation, otv.getName());
					return newotv;
				} 
				// This case should not happen... But there is probably a bug into KMT2KMTypeBuilder that creates bad containment links.
				// However we can solve that problem.
				else if ( otv.eContainer() instanceof TypeVariableBinding ) {
					Operation operation = null;
					ClassDefinition cdef = null;
					EObject current = otv.eContainer();
					while ( cdef == null ) {
						if ( current instanceof Operation )
							operation = (Operation) current;
						else if ( current instanceof ClassDefinition )
							cdef = (ClassDefinition) current;
						current = current.eContainer();
					}
					ClassDefinition newClassDefinition = (ClassDefinition) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName(cdef) );
					Operation newoperation = KermetaModelHelper.ClassDefinition.getOperationByName(unit, newClassDefinition, operation.getName() );
					
					// Getting the type variable
					TypeVariable tv = KermetaModelHelper.Operation.getTypeVariable(newoperation, otv.getName());
					return tv;
				}
			/*
			 * 
			 * Model Type Variable case
			 * 
			 */
			} else if ( baseType instanceof ModelTypeVariable ) {
				ModelTypeVariable mtv = (ModelTypeVariable) baseType;
				if ( mtv.eContainer() instanceof ClassDefinition ) {
					ClassDefinition cdef = (ClassDefinition) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName( (NamedElement) mtv.eContainer()) );
					TypeVariable newotv = KermetaModelHelper.ClassDefinition.getTypeParameter(cdef, mtv.getName());
					return newotv;
				}
			/*
			 * 
			 * Model Type case
			 * 
			 */
			} else if ( baseType instanceof ModelType ) {
				ModelType mt = (ModelType) baseType;
				return (ModelType) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName(mt) );
			/*
			 * 
			 * Class Case
			 * 
			 */
			} else if ( baseType instanceof Class ) {
				Class baseClass = (Class) baseType;
				Class c = StructureFactory.eINSTANCE.createClass();
					
				ClassDefinition cdef = (ClassDefinition) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName(baseClass.getTypeDefinition()) );
				c.setTypeDefinition( cdef );
					
				for ( TypeVariableBinding tvb : baseClass.getTypeParamBinding() ) {
					TypeVariableBinding newtvb = StructureFactory.eINSTANCE.createTypeVariableBinding();
						
					TypeVariable otv = KermetaModelHelper.ClassDefinition.getTypeParameter( cdef, tvb.getVariable().getName() );
					
					newtvb.setVariable(otv);
					newtvb.setType( clone(tvb.getType(), unit) );
					if ( newtvb.getType() == null )
						newtvb.setType( newtvb.getVariable() );
					else if ( ! (newtvb.getType() instanceof TypeDefinition) && ! (newtvb.getType() instanceof TypeVariable) )
						newtvb.getContainedType().add( newtvb.getType() );
					
					c.getTypeParamBinding().add( newtvb );
					
				}
				return c;
			/*
			 * 
			 * VoidType Case
			 * 
			 */
			} else if ( baseType instanceof VoidType ) {
				return StructureFactory.eINSTANCE.createVoidType();
			/*
			 * 
			 * Primitive Type Case
			 * 
			 */
			} else if ( baseType instanceof PrimitiveType ) {
				PrimitiveType basePrimitiveType = (PrimitiveType) baseType;
				PrimitiveType newPrimitiveType = (PrimitiveType) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName(basePrimitiveType) );
				return newPrimitiveType;
			/*
			 * 
			 * Enumeration Case
			 * 
			 */
			} else if ( baseType instanceof Enumeration ) {
				Enumeration baseEnumeration = (Enumeration) baseType;
				Enumeration newEnumeration = (Enumeration) unit.getTypeDefinitionByQualifiedName( KermetaModelHelper.NamedElement.qualifiedName(baseEnumeration) );
				return newEnumeration;
			/*
			 * 
			 * FunctionType Case
			 * 
			 */
			} else if ( baseType instanceof FunctionType ) {
				FunctionType baseFT = (FunctionType) baseType;
				FunctionType newFT = StructureFactory.eINSTANCE.createFunctionType();
				newFT.setLeft( clone(baseFT.getLeft(), unit) );
				newFT.setRight( clone(baseFT.getRight(), unit) );
				return newFT;
			/*
			 * 
			 * Product Type Case
			 * 
			 */
			} else if ( baseType instanceof ProductType ) {
				ProductType basePT = (ProductType) baseType;
				ProductType newPT = StructureFactory.eINSTANCE.createProductType();
				for ( Type t : basePT.getType() )
					newPT.getType().add( clone(t, unit) );
				return newPT;
			} else {
				System.out.println();
			}
		}
		return null;
	}

	
}


