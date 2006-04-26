/* $Id: ECore2KMPass3.java,v 1.5 2006-04-26 21:46:26 dvojtise Exp $
 * Project : Kermeta 
 * File : ECore2KMPass3.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 10 févr. 2005
 * Author : ffleurey
 */
package fr.irisa.triskell.kermeta.loader.emfatic;


import com.ibm.eclipse.emfatic.core.ast.AbstractModifier;
import com.ibm.eclipse.emfatic.core.ast.Annotation;
import com.ibm.eclipse.emfatic.core.ast.Annotations;
import com.ibm.eclipse.emfatic.core.ast.Attribute;
import com.ibm.eclipse.emfatic.core.ast.ClassDecl;
import com.ibm.eclipse.emfatic.core.ast.DataTypeDecl;
import com.ibm.eclipse.emfatic.core.ast.EnumDecl;
import com.ibm.eclipse.emfatic.core.ast.EnumLiteral;
import com.ibm.eclipse.emfatic.core.ast.Modifiers;
import com.ibm.eclipse.emfatic.core.ast.Operation;
import com.ibm.eclipse.emfatic.core.ast.OptNegatedModifier;
import com.ibm.eclipse.emfatic.core.ast.PackageDecl;
import com.ibm.eclipse.emfatic.core.ast.Param;
import com.ibm.eclipse.emfatic.core.ast.QualifiedID;
import com.ibm.eclipse.emfatic.core.ast.QualifiedIDContainer;
import com.ibm.eclipse.emfatic.core.ast.Reference;
import com.ibm.eclipse.emfatic.core.ast.StringLiteralContainer;
import com.ibm.eclipse.emfatic.core.ast.StringLiteralOrQualifiedID;
import com.ibm.eclipse.emfatic.core.ast.SubPackageDecl;
import com.ibm.eclipse.emfatic.core.ast.TypeRef;
import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;


/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 * PAS 3 : build everithing except opposites for properties
 */
public class ECore2KMPass3 extends ECore2KMPass {

    /**
     * @param builder
     */
    public ECore2KMPass3(KermetaUnit builder) {
        super(builder);
    }
    
    
	public boolean beginVisit(AbstractModifier node) {
	    builder.current_class.setIsAbstract(true);
		return super.beginVisit(node);
	}
	public boolean beginVisit(Annotation node) {
		return super.beginVisit(node);
	}
	public boolean beginVisit(Annotations node) {
		return super.beginVisit(node);
	}
	public boolean beginVisit(Attribute node) {
		//System.out.println("  Attribute : " + node.getName().getText());
		// Create the corresponding property
		Property res = builder.struct_factory.createProperty();
		builder.storeTrace(res, node);
		// name :
		res.setName(node.getName().getText());
		// default :
		if (node.getDefaultValueExpr() != null)
			res.setDefault(node.getDefaultValueExpr().getText());
		// isComposite : 
		res.setIsComposite(!isModifierTrue(node.getModifiers(), "derived")); // An attribute is always contained
		// isDerived :
		res.setIsDerived(isModifierTrue(node.getModifiers(), "derived"));
		// isID :
		res.setIsID(isModifierTrue(node.getModifiers(), "id"));
		// isReadOnly :
		res.setIsReadOnly(isModifierTrue(node.getModifiers(), "readonly"));
		// isOrdered :
		res.setIsOrdered(isModifierTrue(node.getModifiers(), "ordered"));
		// isUnique :
		res.setIsUnique(isModifierTrue(node.getModifiers(), "unique"));
		// upper :
		res.setUpper(getUpper(node.getTypeRef()));
		// lower :
		res.setLower(getLower(node.getTypeRef()));
		// type : (A datatype)
		res.setType(getFTypeByRef(node.getTypeRef()));
		// opposite :
		res.setOpposite(null); // An attribute has no opposite
		// owningClass :
		builder.current_class.getOwnedAttribute().add(res);
		
		return super.beginVisit(node);
	}

	public boolean beginVisit(ClassDecl node) {
		// create
		builder.current_class = (ClassDefinition)builder.getModelElementByNode(node);
		// name
		builder.current_class.setName(node.getName().getText());
		// isAbstract
		builder.current_class.setIsAbstract(false); // By default it is false and it is changed in visitAbstractModifier if needed
		// superClass
		if (node.getSuperTypes() != null) {
			ASTNode[] sts = node.getSuperTypes().getChildren();
			for(int i=0; i<sts.length; i++) {
				if (sts[i] instanceof QualifiedID) {
					Type t = getFTypeByID((QualifiedID)sts[i]);
					if (t == null) builder.messages.addError("Cannot resolve type " + qualifiedIDAsString((QualifiedID)sts[i]), null);
					else builder.current_class.getSuperType().add(t);
				}
			}
		}
		// ownedAttribute and ownedOperation handeled by containement
		//System.out.println("ClassDecl : " + node.getName().getText());
		return super.beginVisit(node);
	}
	
	public boolean beginVisit(DataTypeDecl node) {
		PrimitiveType res = (PrimitiveType)builder.getModelElementByNode(node);
		// Name
		res.setName(node.getName().getText());
		// real type
		StringLiteralOrQualifiedID id = node.getInstClassName();
		String type_name = null;
		if (id instanceof StringLiteralContainer) {
			type_name = ((StringLiteralContainer)id).getString_literal().getText();
			type_name = type_name.substring(1, type_name.length()-1);
		}
		else {
			type_name = qualifiedIDAsString(((QualifiedIDContainer)id).getQualifiedID());
		}
		res.setInstanceType(getFTypeByID(type_name));
		return super.beginVisit(node);
	}
	
	public boolean beginVisit(EnumDecl node) {
		builder.current_enum = (Enumeration)builder.getModelElementByNode(node);
		// Name
		builder.current_enum.setName(node.getName().getText());
		// ownedLitteral set by containement
		return super.beginVisit(node);
	}
	public boolean beginVisit(EnumLiteral node) {
		EnumerationLiteral res = builder.struct_factory.createEnumerationLiteral();
		builder.storeTrace(res, node);
		// Name
		res.setName(node.getName().getText());
		// TODO : The value as an Annotation ?
		builder.current_enum.getOwnedLiteral().add(res);
		return super.beginVisit(node);
	}

	public boolean beginVisit(Operation node) {
		// Create the operation:
		builder.current_operation = builder.struct_factory.createOperation();
		builder.storeTrace(builder.current_operation, node);
		// Name
		builder.current_operation.setName(node.getName().getText());
		// isOrdered :
		builder.current_operation.setIsOrdered(isModifierTrue(node.getModifiers(), "ordered"));
		// isUnique :
		builder.current_operation.setIsUnique(isModifierTrue(node.getModifiers(), "unique"));
		// upper :
		builder.current_operation.setUpper(getUpper(node.getTypeRef()));
		// lower :
		builder.current_operation.setLower(getLower(node.getTypeRef()));
		// type :
		builder.current_operation.setType(getFTypeByRef(node.getTypeRef()));
		// Exceptions
		if (node.getExceptions() != null) {
			ASTNode[] exceptions = node.getExceptions().getChildren();
			for(int i=0; i<exceptions.length; i++) {
				if (exceptions[i] instanceof QualifiedID) {
					builder.current_operation.getRaisedException().add(getFTypeByID((QualifiedID)exceptions[i]));
				}
			}
		}
		// owningClass :
		builder.current_class.getOwnedOperation().add(builder.current_operation);
		// ownedParameter added while visiting  containement
		//System.out.println("  Operation : " + node.getName().getText());
		return super.beginVisit(node);
	}
	public boolean beginVisit(OptNegatedModifier node) {
		// TODO Auto-generated method stub
		return super.beginVisit(node);
	}

	public boolean beginVisit(PackageDecl node) {
	    builder.current_package = builder.rootPackage;
	    return super.beginVisit(node);
	}
	
	/**
	 * @see com.ibm.eclipse.emfatic.core.ast.EmfaticASTNodeVisitor#beginVisit(com.ibm.eclipse.emfatic.core.ast.SubPackageDecl)
	 */
	public boolean beginVisit(SubPackageDecl node) {
		 builder.current_package = (Package)builder.getModelElementByNode(node);
		return super.beginVisit(node);
	}
	
	/**
	 * @see com.ibm.eclipse.emfatic.core.ast.EmfaticASTNodeVisitor#endVisit(com.ibm.eclipse.emfatic.core.ast.SubPackageDecl)
	 */
	public void endVisit(SubPackageDecl arg0) {
		builder.current_package = builder.current_package.getNestingPackage();
		super.endVisit(arg0);
	}
	public boolean beginVisit(Param node) {
		// Create the parameter :
		Parameter res = builder.struct_factory.createParameter();
		builder.storeTrace(res, node);
		// Name
		res.setName(node.getName().getText());
		// isOrdered :
		res.setIsOrdered(isModifierTrue(node.getModifiers(), "ordered"));
		// isUnique :
		res.setIsUnique(isModifierTrue(node.getModifiers(), "unique"));
		// upper :
		res.setUpper(getUpper(node.getTypeRef()));
		// lower :
		res.setLower(getLower(node.getTypeRef()));
		// type :
		res.setType(getFTypeByRef(node.getTypeRef()));
		// Operation:
		builder.current_operation.getOwnedParameter().add(res);
		
		return super.beginVisit(node);
	}
	
	public boolean beginVisit(Reference node) {
		//System.out.println("  Reference : " + node.getName().getText() );
		// Create the corresponding property
		Property res = builder.struct_factory.createProperty();
		builder.storeTrace(res, node);
		// name :
		res.setName(node.getName().getText());
		// default : (no default for a reference)
		res.setDefault(null);
		// isComposite : 
		if (node.getReferenceKind().getText().equals("val")) { // containement = true
			res.setIsComposite(true);
		}
		else { // containement = false
			res.setIsComposite(false);
		}
		// isDerived :
		res.setIsDerived(isModifierTrue(node.getModifiers(), "derived"));
		// isID :
		res.setIsID(isModifierTrue(node.getModifiers(), "id"));
		// isReadOnly :
		res.setIsReadOnly(isModifierTrue(node.getModifiers(), "readonly"));
		// isOrdered :
		res.setIsOrdered(isModifierTrue(node.getModifiers(), "ordered"));
		// isUnique :
		res.setIsUnique(isModifierTrue(node.getModifiers(), "unique"));
		// upper :
		res.setUpper(getUpper(node.getTypeRef()));
		// lower :
		res.setLower(getLower(node.getTypeRef()));
		// type : (A datatype)
		res.setType(getFTypeByRef(node.getTypeRef()));
		// opposite :
		//if (node.getOppositeName() != null) { // there is an opposite
			// It can't be done here because the opposite property might not have been created yet
//			SetOppositeProperty sop = new SetOppositeProperty();
//			sop.property = res;
//			sop.oppType = (FClass)res.getFType();
//			sop.oppName = node.getOppositeName().getText();
//			oppProperties.add(sop);
//		}
//		else // there is no opposite
//			res.setFOpposite(null);
		
		// owningClass :
		builder.current_class.getOwnedAttribute().add(res);
		
		return super.beginVisit(node);
	}
	
	protected boolean isModifierTrue(Modifiers modifiers, String modifier) {
		ASTNode[] mods = modifiers.getChildren();
		OptNegatedModifier nmod;
		for(int i=0; i<mods.length; i++) {
			nmod = (OptNegatedModifier)mods[i];
			if (nmod.getModifier().getText().equals(modifier)) return nmod.getBang() == null;
		}
		if (modifier.equals("unique")) return true;  // by default it is true
		return false;
	}
	
	protected Type getFTypeByRef(TypeRef ref) {
		QualifiedID qid = ref.getName();
		return getFTypeByID(qid);
	}

}
