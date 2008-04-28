/* $Id: TypeEqualityChecker.java,v 1.16 2008-04-28 11:50:10 ftanguy Exp $
* Project : Kermeta io
* File : TypeConformanceChecker.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 avr. 2005
* Authors : 
* 		Franck Fleurey
* 		Jim Steel
* Description :
*  This class implements equality for kermeta types
*/ 
package fr.irisa.triskell.kermeta.typechecker;


import java.util.ArrayList;
import java.util.List;

import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author Franck Fleurey
 * This class implements equality for kermeta types
 */
public class TypeEqualityChecker  extends KermetaOptimizedVisitor {

	
	public static boolean equals(Type required, Type provided) {
		// resolve primitive types
		if ( required instanceof PrimitiveType )
			required = KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) required);
		if ( provided instanceof PrimitiveType )
			provided = KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) provided);

		TypeEqualityChecker visitor = new TypeEqualityChecker(provided);
		boolean result = ((Boolean)visitor.accept(required)).booleanValue();
		return result;
	}
	
	/**
	 * The type provided
	 */
	protected Type provided;
	
	/**
	 * 
	 */
	public TypeEqualityChecker(Type provided) {
		super();
		this.provided = provided;
	}
	
	
	/**
	 * IMPLEMENTATION OF THE VISITOR
	 */
	public Object visitFunctionType(FunctionType arg0) {
		boolean result = false;
		if (provided instanceof FunctionType) {
			FunctionType p = (FunctionType)provided;
			if (TypeEqualityChecker.equals(arg0.getLeft(), p.getLeft()) &&
					TypeEqualityChecker.equals(arg0.getRight(), p.getRight()) ) {
				result = true;
			}
		}
		return result;
	}
	
	public Object visitClass(Class arg0) {
		Boolean result = false;
		if (provided instanceof Class) {
			Class p = (Class)provided;
			KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject( arg0.getTypeDefinition() );
			List<TypeDefinition> providedTypeDefinitions = new ArrayList<TypeDefinition>();
			providedTypeDefinitions.add( arg0.getTypeDefinition() );
			if ( unit.getAspects().get( arg0.getTypeDefinition() ) != null )
				providedTypeDefinitions.addAll( unit.getAspects().get( arg0.getTypeDefinition() ) );
			if ( unit.getBaseAspects().get( arg0.getTypeDefinition() ) != null )
				providedTypeDefinitions.addAll( unit.getBaseAspects().get( arg0.getTypeDefinition() ) );
			
			/*unit = KermetaUnitHelper.getKermetaUnitFromObject( p.getTypeDefinition() );
			List<TypeDefinition> requiredTypeDefinitions = new ArrayList<TypeDefinition>();
			requiredTypeDefinitions.add( p.getTypeDefinition() );
			if ( unit.getAspects().get( arg0.getTypeDefinition() ) != null )
				requiredTypeDefinitions.addAll( unit.getAspects().get( arg0.getTypeDefinition() ) );
			if ( unit.getBaseAspects().get( arg0.getTypeDefinition() ) != null )
				requiredTypeDefinitions.addAll( unit.getBaseAspects().get( arg0.getTypeDefinition() ) );
			*/
/*			Collection<TypeDefinition> context = KermetaModelHelper.ClassDefinition.getContext( (ClassDefinition) p.getTypeDefinition() );
			List<TypeDefinition> correctTypeDefinition = new ArrayList<TypeDefinition>();
			String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName( p.getTypeDefinition() );
			for ( TypeDefinition t : context ) {
				String currentQualifiedName = KermetaModelHelper.NamedElement.qualifiedName(t);
				if ( qualifiedName.equals(currentQualifiedName) )
					correctTypeDefinition.add(t);
			}*/
			
			if ( providedTypeDefinitions.contains(p.getTypeDefinition()) ) {
				result = true;
				if (arg0.getTypeParamBinding().size()== p.getTypeParamBinding().size())
					for(int i=0; i<arg0.getTypeParamBinding().size(); i++) {
						Type t1 = ((TypeVariableBinding)arg0.getTypeParamBinding().get(i)).getType();
						Type t2 = ((TypeVariableBinding)p.getTypeParamBinding().get(i)).getType();
						if (!TypeEqualityChecker.equals(t1, t2)) {
							result = false;
							break;
						}
						
					}
				else {
					
					result = false;
				}
				// special case of UnknownJavaObject, we need to check the real underlying type 
				// which is stored in a tag 
				//String t1JavaTypeName = JarUnit.getUnderlyingJavaTypeName(p);
				//String t2JavaTypeName = JarUnit.getUnderlyingJavaTypeName(arg0);
				//if(!t1JavaTypeName.equals(t2JavaTypeName)) 
				//	result = new Boolean(false);
			}
		}
		return result;
	}	

	public Object visitModelType(ModelType arg0) {
		// TODO Are model types equal if they have the same set of included types? Probably!
		return provided == arg0;
//		Boolean result = new Boolean(false);
//		if (provided instanceof ModelType) {
//			ModelType p = (ModelType)provided;
//			if (p.getTypeDefinition() == arg0.getTypeDefinition()) {
//				result = new Boolean(true);
//				for(int i=0; i<arg0.getTypeParamBinding().size(); i++) {
//					fr.irisa.triskell.kermeta.language.structure.Type t1 = ((TypeVariableBinding)arg0.getTypeParamBinding().get(0)).getType();
//					fr.irisa.triskell.kermeta.language.structure.Type t2 = ((TypeVariableBinding)p.getTypeParamBinding().get(0)).getType();
//					if (!TypeEqualityChecker.equals(t1, t2)) {
//						result = new Boolean(false);
//						break;
//					}
//				}
//			}
//		}
//		return result;
	}	


	public Object visitEnumeration(Enumeration arg0) {
		return new Boolean(provided == arg0);
	}
	
	public Object visitPrimitiveType(PrimitiveType arg0) {
		throw new Error("Type-Checker error : the required type should not be a primitive type");
	}
	
	public Object visitProductType(ProductType arg0) {
		Boolean result = false;
		if (provided instanceof ProductType) {
			ProductType p = (ProductType)provided;
			if(arg0.getType().size() == p.getType().size()) {
				for(int i=0; i< p.getType().size(); i++) {
					Type t1 = (Type)p.getType().get(0);
					Type t2 = (Type)arg0.getType().get(0);
					if (!TypeEqualityChecker.equals(t1, t2)) {
						result = false;
						break;
					}
				}
			}
		}
		return result;
	}

	
	public Object visitObjectTypeVariable(ObjectTypeVariable arg0) {
		if ( provided instanceof ObjectTypeVariable ) {
			ObjectTypeVariable otv = (ObjectTypeVariable) provided;
			if ( otv.getName().equals(arg0.getName()) )
				return true;
		}
		return false;
	}
	
	public Object visitVoidType(VoidType arg0) {
		return provided instanceof VoidType;
	}

	public Object visitVirtualType(VirtualType arg0) {
		return provided == arg0;
		//TODO Does this need to broadened?
	}
	
	public Object visitModelTypeVariable(ModelTypeVariable arg0) {
		return provided == arg0;
	}
}
