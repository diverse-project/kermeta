/*
 * Created on 2 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.ast.AbstractModifier;
import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.DataTypeDecl;
import fr.irisa.triskell.kermeta.ast.EnumDecl;
import fr.irisa.triskell.kermeta.ast.EnumLiteral;
import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.ast.Operation;
import fr.irisa.triskell.kermeta.ast.OperationBody;
import fr.irisa.triskell.kermeta.ast.Param;
import fr.irisa.triskell.kermeta.ast.Property;
import fr.irisa.triskell.kermeta.ast.PropertyBody;
import fr.irisa.triskell.kermeta.ast.PropertyKind;
import fr.irisa.triskell.kermeta.ast.ReadOnlyModifier;
import fr.irisa.triskell.kermeta.ast.Type;
import fr.irisa.triskell.kermeta.ast.TypeVarDecl;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FEnumerationLiteral;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * PASS 3 :
 * The entire structure should be build at the end of this pass
 * 
 * Except :
 * For ops : body / abstract / superOp
 * For props : oposites / accessors
 * 
 */
public class KMT2KMPass3 extends KMT2KMPass {
	
	/**
	 * @param builder
	 */
	public KMT2KMPass3(KermetaUnit builder) {
		super(builder);
	}
	
	/*
	* *******************************************************
	*                  BUILD CLASSES
	* *******************************************************
	*/

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.AbstractModifier)
	 */
	public boolean beginVisit(AbstractModifier abstractModifier) {
		builder.current_class.setFIsAbstract(true);
		return super.beginVisit(abstractModifier);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	public boolean beginVisit(ClassDecl classDecl) {
		builder.pushContext();
		builder.current_class = (FClassDefinition)builder.getModelElementByNode(classDecl);
//		 add type variables to the context
		Iterator tvs = builder.current_class.getFTypeParameter().iterator();
		while(tvs.hasNext()) builder.addTypeVar((FTypeVariable)tvs.next());
		
		builder.current_class.setFIsAbstract(false); // false by default
		
		// super types - should be classes
		if (classDecl.getSuperTypes() != null) {
			ASTNode[] supertypes = classDecl.getSuperTypes().getChildren();
			for(int i=0; i<supertypes.length; i++) {
				//System.out.println(builder.current_class.getFName() +" Node in super type : " + supertypes[i].getClass().getName());
				if (supertypes[i] instanceof Type) {
					FType supertype = KMT2KMTypeBuilder.process((Type)supertypes[i], builder);
					//System.out.println(builder.current_class.getFName() + " Found a super type : " + supertype.getFName() + " : " + supertype.getClass().getName());
					if (!(supertype instanceof FClass)) {
						builder.error.add(new KMUnitError("PASS 3 : Class '"+builder.current_class.getFName()+"' - A class can only inherit from classes ("+supertype+" is not a class).",(KermetaASTNode)supertypes[i]));
						return false;
					}
					EList tmpsts = builder.current_class.getFSuperType();
					for(int a=0;a<tmpsts.size();a++) {
						if (((FClass)tmpsts.get(a)).getFClassDefinition() == ((FClass)supertype).getFClassDefinition()) {
							builder.error.add(new KMUnitError("PASS 3 : Class '"+builder.current_class.getFName()+"' - A class can only inherit once from another.",(KermetaASTNode)supertypes[i]));
							return false;
						}
					}
					builder.current_class.getFSuperType().add(supertype);
				}
			}
		}
		
		return super.beginVisit(classDecl);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.ClassDecl)
	 */
	public void endVisit(ClassDecl classDecl) {
		builder.popContext();
		super.endVisit(classDecl);
	}
	
	/*
	* *******************************************************
	*                  BUILD OPERATION
	* *******************************************************
	*/
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Operation)
	 */
	public boolean beginVisit(Operation operation) {
		builder.pushContext();
		// Create the operation:
		builder.current_operation = builder.struct_factory.createFOperation();
		builder.storeTrace(builder.current_operation, operation);
		// Name
		builder.current_operation.setFName(getTextForID(operation.getName()));
		if (operation.getTypeRef() != null) {
			// isOrdered :
			builder.current_operation.setFIsOrdered(isOrdered(operation.getTypeRef()));
			// isUnique :
			builder.current_operation.setFIsUnique(isUnique(operation.getTypeRef()));
			// upper :
			builder.current_operation.setFUpper(getUpper(operation.getTypeRef()));
			// lower :
			builder.current_operation.setFLower(getLower(operation.getTypeRef()));
		}
		// checks that the class do not have an op with the same name yet
		if (builder.getOperationByName(builder.current_class, builder.current_operation.getFName()) != null) {
			builder.error.add(new KMUnitError("PASS 3 : Class '"+builder.current_class.getFName()+"' duplicate definition of operation '"+builder.current_operation.getFName()+"'.",operation));
			return false;
		}
		if (builder.getPropertyByName(builder.current_class, builder.current_operation.getFName()) != null) {
			builder.error.add(new KMUnitError("PASS 3 : Class '"+builder.current_class.getFName()+"' contains both an operation and a property named '"+builder.current_operation.getFName()+"'.",operation));
			return false;
		}
		
		// owningClass :
		builder.current_class.getFOwnedOperation().add(builder.current_operation);
		return super.beginVisit(operation);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Operation)
	 */
	public void endVisit(Operation operation) {
		if (operation.getTypeRef() != null) {
			// type :
			builder.current_operation.setFType(getFType(operation.getTypeRef()));
		}
		// Exceptions
		if (operation.getExceptions() != null) {
			ASTNode[] exceptions = operation.getExceptions().getChildren();
			for(int i=0; i<exceptions.length; i++) {
				if (exceptions[i] instanceof Type) {
					builder.current_operation.getFRaisedException().add(KMT2KMTypeBuilder.process((Type)exceptions[i], builder));
				}
			}
		}
		builder.popContext();
		builder.current_operation = null;
		super.endVisit(operation);
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.TypeVarDecl)
	 */
	public boolean beginVisit(TypeVarDecl typeVarDecl) {
		FTypeVariable tv;
		if (builder.current_operation == null) {
			// it is a type variable for a class. the object already exists but
			// the supertype needs to be set
			tv = (FTypeVariable)builder.getModelElementByNode(typeVarDecl);
		}
		else {
			// it is a new type variable for an operation. needs to create it
			
			// create the parameter
			String name = getTextForID(typeVarDecl.getName());
			tv = builder.struct_factory.createFTypeVariable();
			tv.setFName(name);
			// check that another param with the same name does not exist yet
			EList other_params = builder.current_operation.getFTypeParameter();
			for (int i=0; i<other_params.size(); i++) {
				if (((FTypeVariable)other_params.get(i)).getFName().equals(name)) {
					builder.error.add(new KMUnitError("PASS 3 : Parametric operation '" + builder.current_operation.getFName() + "' already contains a type parameter named '"+name+"'.",typeVarDecl));
					return false;
				}
			}
			// add the parameter to the operation
			builder.current_operation.getFTypeParameter().add(tv);
			builder.storeTrace(tv, typeVarDecl);
			
		}
		
		tv.setFSupertype(KMT2KMTypeBuilder.process(typeVarDecl.getSupertype(), builder));
		// in both cases the variable should be added to the context
		builder.addTypeVar(tv);
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Param)
	 */
	public boolean beginVisit(Param param) {
		// Create the parameter and adds it to the current op
		FParameter parameter = builder.struct_factory.createFParameter();
		builder.storeTrace(parameter, param);
		// Name
		parameter.setFName(getTextForID(param.getName()));
		// isOrdered :
		parameter.setFIsOrdered(isOrdered(param.getTypeRef()));
		// isUnique :
		parameter.setFIsUnique(isUnique(param.getTypeRef()));
		// upper :
		parameter.setFUpper(getUpper(param.getTypeRef()));
		// lower :
		parameter.setFLower(getLower(param.getTypeRef()));
		// type :
		parameter.setFType(getFType(param.getTypeRef()));
		
		// check that another param with the same name does not exist yet
		EList other_params = builder.current_operation.getFOwnedParameter();
		for (int i=0; i<other_params.size(); i++) {
			if (((FParameter)other_params.get(i)).getFName().equals(parameter.getFName())) {
				builder.error.add(new KMUnitError("PASS 3 : Operation '" + builder.current_operation.getFName() + "' already contains a parameter named '"+parameter.getFName()+"'.",param));
				return false;
			}
		}
		
		// ownedOperation
		builder.current_operation.getFOwnedParameter().add(parameter);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.OperationBody)
	 */
	public boolean beginVisit(OperationBody operationBody) {
		// to avoid visiting the whole tree
		return false;
	}
	/*
	* *******************************************************
	*                  BUILD PROPERTY
	* *******************************************************
	*/
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Property)
	 */
	public boolean beginVisit(Property property) {
		// Create the parameter and adds it to the current op
		builder.current_property = builder.struct_factory.createFProperty();
		builder.storeTrace(builder.current_property, property);
		// Name
		builder.current_property.setFName(getTextForID(property.getName()));
		// isOrdered :
		builder.current_property.setFIsOrdered(isOrdered(property.getTypeRef()));
		// isUnique :
		builder.current_property.setFIsUnique(isUnique(property.getTypeRef()));
		// upper :
		builder.current_property.setFUpper(getUpper(property.getTypeRef()));
		// lower :
		builder.current_property.setFLower(getLower(property.getTypeRef()));
		// type :
		builder.current_property.setFType(getFType(property.getTypeRef()));
		// is readonly, false by default
		builder.current_property.setFIsReadOnly(false);
		
		if (builder.getPropertyByName(builder.current_class, builder.current_property.getFName()) != null) {
			builder.error.add(new KMUnitError("PASS 3 : Class '"+builder.current_class.getFName()+"' duplicate definition of property '"+builder.current_property.getFName()+"'.",property));
			return false;
		}
		
		// checks that the class do not have an op with the same name yet
		if (builder.getOperationByName(builder.current_class, builder.current_property.getFName()) != null) {
			builder.error.add(new KMUnitError("PASS 3 : Class '"+builder.current_class.getFName()+"' contains both an operation and a property named '"+builder.current_property.getFName()+"'.",property));
			return false;
		}
		
		// owningClass
		builder.current_class.getFOwnedAttributes().add(builder.current_property);
		return super.beginVisit(property);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Property)
	 */
	public void endVisit(Property property) {
		builder.current_property = null;
		super.endVisit(property);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.PropertyKind)
	 */
	public boolean beginVisit(PropertyKind propertyKind) {
		if (propertyKind.getText().equals("attribut")) {
			builder.current_property.setFIsDerived(false);
			builder.current_property.setFIsComposite(true);
		}
		else if (propertyKind.getText().equals("reference")) {
			builder.current_property.setFIsDerived(false);
			builder.current_property.setFIsComposite(false);
		}
		else if (propertyKind.getText().equals("property")) {
			builder.current_property.setFIsDerived(true);
			builder.current_property.setFIsComposite(false);
		}
		return super.beginVisit(propertyKind);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ReadOnlyModifier)
	 */
	public boolean beginVisit(ReadOnlyModifier readOnlyModifier) {
		builder.current_property.setFIsReadOnly(true);
		return super.beginVisit(readOnlyModifier);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.PropertyBody)
	 */
	public boolean beginVisit(PropertyBody propertyBody) {
//		 to avoid visiting the whole tree
		return false;
	}
	/*
	* *******************************************************
	*                  BUILD ENNUMERATIONS
	* *******************************************************
	*/
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.EnumDecl)
	 */
	public boolean beginVisit(EnumDecl enumDecl) {
		builder.current_enum = (FEnumeration)builder.getModelElementByNode(enumDecl);
		return super.beginVisit(enumDecl);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.EnumLiteral)
	 */
	public boolean beginVisit(EnumLiteral enumLiteral) {
		FEnumerationLiteral lit = builder.struct_factory.createFEnumerationLiteral();
		lit.setFName(getTextForID(enumLiteral.getName()));
		builder.storeTrace(lit, enumLiteral);
		builder.current_enum.getFOwnedLiteral().add(lit);
		return super.beginVisit(enumLiteral);
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.DataTypeDecl)
	 */
	public boolean beginVisit(DataTypeDecl node) {
		FPrimitiveType pt = (FPrimitiveType)builder.getModelElementByNode(node);
		pt.setFInstanceType(KMT2KMTypeBuilder.process(node.getInstanceClass(), builder));
		return false;
	}
}
