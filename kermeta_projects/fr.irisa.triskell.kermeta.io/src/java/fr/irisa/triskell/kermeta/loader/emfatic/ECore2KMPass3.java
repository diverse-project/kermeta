/*
 * Created on 10 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
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

import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FEnumerationLiteral;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FType;


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
	    builder.current_class.setFIsAbstract(true);
		return super.beginVisit(node);
	}
	public boolean beginVisit(Annotation node) {
		// TODO Auto-generated method stub
		return super.beginVisit(node);
	}
	public boolean beginVisit(Annotations node) {
		// TODO Auto-generated method stub
		return super.beginVisit(node);
	}
	public boolean beginVisit(Attribute node) {
		//System.out.println("  Attribute : " + node.getName().getText());
		// Create the corresponding property
		FProperty res = builder.struct_factory.createFProperty();
		builder.storeTrace(res, node);
		// name :
		res.setFName(node.getName().getText());
		// default :
		if (node.getDefaultValueExpr() != null)
			res.setFDefault(node.getDefaultValueExpr().getText());
		// isComposite : 
		res.setFIsComposite(!isModifierTrue(node.getModifiers(), "derived")); // An attribute is always contained
		// isDerived :
		res.setFIsDerived(isModifierTrue(node.getModifiers(), "derived"));
		// isID :
		res.setFIsID(isModifierTrue(node.getModifiers(), "id"));
		// isReadOnly :
		res.setFIsReadOnly(isModifierTrue(node.getModifiers(), "readonly"));
		// isOrdered :
		res.setFIsOrdered(isModifierTrue(node.getModifiers(), "ordered"));
		// isUnique :
		res.setFIsUnique(isModifierTrue(node.getModifiers(), "unique"));
		// upper :
		res.setFUpper(getUpper(node.getTypeRef()));
		// lower :
		res.setFLower(getLower(node.getTypeRef()));
		// type : (A datatype)
		res.setFType(getFTypeByRef(node.getTypeRef()));
		// opposite :
		res.setFOpposite(null); // An attribute has no opposite
		// owningClass :
		builder.current_class.getFOwnedAttributes().add(res);
		
		return super.beginVisit(node);
	}

	public boolean beginVisit(ClassDecl node) {
		// create
		builder.current_class = (FClassDefinition)builder.getModelElementByNode(node);
		// name
		builder.current_class.setFName(node.getName().getText());
		// isAbstract
		builder.current_class.setFIsAbstract(false); // By default it is false and it is changed in visitAbstractModifier if needed
		// superClass
		if (node.getSuperTypes() != null) {
			ASTNode[] sts = node.getSuperTypes().getChildren();
			for(int i=0; i<sts.length; i++) {
				if (sts[i] instanceof QualifiedID) {
					FType t = getFTypeByID((QualifiedID)sts[i]);
					if (t == null) builder.error.add(new KMUnitError("Cannot resulve type " + qualifiedIDAsString((QualifiedID)sts[i]), null));
					else builder.current_class.getFSuperType().add(t);
				}
			}
		}
		// ownedAttribute and ownedOperation handeled by containement
		//System.out.println("ClassDecl : " + node.getName().getText());
		return super.beginVisit(node);
	}
	
	public boolean beginVisit(DataTypeDecl node) {
		FPrimitiveType res = (FPrimitiveType)builder.getModelElementByNode(node);
		// Name
		res.setFName(node.getName().getText());
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
		res.setFInstanceType(getFTypeByID(type_name));
		return super.beginVisit(node);
	}
	
	public boolean beginVisit(EnumDecl node) {
		builder.current_enum = (FEnumeration)builder.getModelElementByNode(node);
		// Name
		builder.current_enum.setFName(node.getName().getText());
		// ownedLitteral set by containement
		return super.beginVisit(node);
	}
	public boolean beginVisit(EnumLiteral node) {
		FEnumerationLiteral res = builder.struct_factory.createFEnumerationLiteral();
		builder.storeTrace(res, node);
		// Name
		res.setFName(node.getName().getText());
		// TODO : The value as an Annotation ?
		builder.current_enum.getFOwnedLiteral().add(res);
		return super.beginVisit(node);
	}

	public boolean beginVisit(Operation node) {
		// Create the operation:
		builder.current_operation = builder.struct_factory.createFOperation();
		builder.storeTrace(builder.current_operation, node);
		// Name
		builder.current_operation.setFName(node.getName().getText());
		// isOrdered :
		builder.current_operation.setFIsOrdered(isModifierTrue(node.getModifiers(), "ordered"));
		// isUnique :
		builder.current_operation.setFIsUnique(isModifierTrue(node.getModifiers(), "unique"));
		// upper :
		builder.current_operation.setFUpper(getUpper(node.getTypeRef()));
		// lower :
		builder.current_operation.setFLower(getLower(node.getTypeRef()));
		// type :
		builder.current_operation.setFType(getFTypeByRef(node.getTypeRef()));
		// Exceptions
		if (node.getExceptions() != null) {
			ASTNode[] exceptions = node.getExceptions().getChildren();
			for(int i=0; i<exceptions.length; i++) {
				if (exceptions[i] instanceof QualifiedID) {
					builder.current_operation.getFRaisedException().add(getFTypeByID((QualifiedID)exceptions[i]));
				}
			}
		}
		// owningClass :
		builder.current_class.getFOwnedOperation().add(builder.current_operation);
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
		 builder.current_package = (FPackage)builder.getModelElementByNode(node);
		return super.beginVisit(node);
	}
	
	/**
	 * @see com.ibm.eclipse.emfatic.core.ast.EmfaticASTNodeVisitor#endVisit(com.ibm.eclipse.emfatic.core.ast.SubPackageDecl)
	 */
	public void endVisit(SubPackageDecl arg0) {
		builder.current_package = builder.current_package.getFNestingPackage();
		super.endVisit(arg0);
	}
	public boolean beginVisit(Param node) {
		// Create the parameter :
		FParameter res = builder.struct_factory.createFParameter();
		builder.storeTrace(res, node);
		// Name
		res.setFName(node.getName().getText());
		// isOrdered :
		res.setFIsOrdered(isModifierTrue(node.getModifiers(), "ordered"));
		// isUnique :
		res.setFIsUnique(isModifierTrue(node.getModifiers(), "unique"));
		// upper :
		res.setFUpper(getUpper(node.getTypeRef()));
		// lower :
		res.setFLower(getLower(node.getTypeRef()));
		// type :
		res.setFType(getFTypeByRef(node.getTypeRef()));
		// Operation:
		builder.current_operation.getFOwnedParameter().add(res);
		
		return super.beginVisit(node);
	}
	
	public boolean beginVisit(Reference node) {
		//System.out.println("  Reference : " + node.getName().getText() );
		// Create the corresponding property
		FProperty res = builder.struct_factory.createFProperty();
		builder.storeTrace(res, node);
		// name :
		res.setFName(node.getName().getText());
		// default : (no default for a reference)
		res.setFDefault(null);
		// isComposite : 
		if (node.getReferenceKind().getText().equals("val")) { // containement = true
			res.setFIsComposite(true);
		}
		else { // containement = false
			res.setFIsComposite(false);
		}
		// isDerived :
		res.setFIsDerived(isModifierTrue(node.getModifiers(), "derived"));
		// isID :
		res.setFIsID(isModifierTrue(node.getModifiers(), "id"));
		// isReadOnly :
		res.setFIsReadOnly(isModifierTrue(node.getModifiers(), "readonly"));
		// isOrdered :
		res.setFIsOrdered(isModifierTrue(node.getModifiers(), "ordered"));
		// isUnique :
		res.setFIsUnique(isModifierTrue(node.getModifiers(), "unique"));
		// upper :
		res.setFUpper(getUpper(node.getTypeRef()));
		// lower :
		res.setFLower(getLower(node.getTypeRef()));
		// type : (A datatype)
		res.setFType(getFTypeByRef(node.getTypeRef()));
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
		builder.current_class.getFOwnedAttributes().add(res);
		
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
	
	protected FType getFTypeByRef(TypeRef ref) {
		QualifiedID qid = ref.getName();
		return getFTypeByID(qid);
	}

}
