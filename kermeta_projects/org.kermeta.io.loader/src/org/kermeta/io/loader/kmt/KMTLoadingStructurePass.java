

/*$Id: KMTLoadingStructurePass.java,v 1.7 2008-11-03 15:16:56 moha Exp $
* Project : org.kermeta.io.loader
* File : 	KMTLoadingStructurePass.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.kmt;

import java.util.Map;
import java.util.Stack;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.action.IKMTLoadingAction;
import org.kermeta.io.loader.action.ILoadingAction;
import org.kermeta.io.loader.datas.KMTLoadingDatas;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.ast.helper.KermetaASTHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Require;
import fr.irisa.triskell.kermeta.language.structure.Using;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.parser.gen.ast.ClassDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.DataTypeDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.EnumDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.EnumLiteral;
import fr.irisa.triskell.kermeta.parser.gen.ast.ImportStmt;
import fr.irisa.triskell.kermeta.parser.gen.ast.Invariant;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNodeVisitor;
import fr.irisa.triskell.kermeta.parser.gen.ast.ModelTypeDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.Operation;
import fr.irisa.triskell.kermeta.parser.gen.ast.OperationBody;
import fr.irisa.triskell.kermeta.parser.gen.ast.OperationEmptyBody;
import fr.irisa.triskell.kermeta.parser.gen.ast.PackageDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.Param;
import fr.irisa.triskell.kermeta.parser.gen.ast.Postcondition;
import fr.irisa.triskell.kermeta.parser.gen.ast.Precondition;
import fr.irisa.triskell.kermeta.parser.gen.ast.Property;
import fr.irisa.triskell.kermeta.parser.gen.ast.QualifiedID;
import fr.irisa.triskell.kermeta.parser.gen.ast.StringLiteralContainer;
import fr.irisa.triskell.kermeta.parser.gen.ast.StringLiteralOrQualifiedID;
import fr.irisa.triskell.kermeta.parser.gen.ast.SubPackageDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.TopLevelDecls;
import fr.irisa.triskell.kermeta.parser.gen.ast.TypeVarDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.TypeVarDecllst;
import fr.irisa.triskell.kermeta.parser.gen.ast.UsingStmt;

public class KMTLoadingStructurePass extends KermetaASTNodeVisitor implements ILoadingAction, IKMTLoadingAction {

	private KermetaUnit kermetaUnit;
	
	/**		A list used to add tags to the next processed object.	*/
	//private List<fr.irisa.triskell.kermeta.language.structure.Tag> currentTags = new ArrayList<fr.irisa.triskell.kermeta.language.structure.Tag>();
	
	/**		A stack of packages to retrieve easily the package we are working on.	*/
	private Stack<Package> packages = new Stack<Package>();
	
	/**		A reference to the class definition we are working on. Can be null.		*/
	private ClassDefinition currentClassDefinition = null;

	/**		A reference to the operation we are working on. Can be null.		*/
	private fr.irisa.triskell.kermeta.language.structure.Operation currentOperation = null;

	/**		A reference to the enumeration we are working on. Can be null.		*/
	private Enumeration currentEnumeration = null;
	
	public void performAction(ILoadingDatas datas, Map<?, ?> options) {
		performAction( (KMTLoadingDatas) datas, options );
	}

	public void performAction(KMTLoadingDatas datas, Map<?, ?> options) {
		kermetaUnit = datas.getKermetaUnit();
		datas.ast.accept(this);
	}
	
	/*
	 * 
	 * Comment
	 * 
	 */
	
	/*@Override
	public boolean beginVisit(Tag tag) {
		String qualifiedName = "";
		if ( tag.getName() instanceof AspectModifier )
			qualifiedName = ((AspectModifier) tag.getName()).getText();
		else
			qualifiedName = KermetaASTHelper.qualifiedIDAsString( ((SqualifiedID) tag.getName()).getQualifiedID() );
		String value = tag.getVal().getText().replace("\"", "");
		fr.irisa.triskell.kermeta.language.structure.Tag t = KermetaModelHelper.Tag.create(qualifiedName, value);
		currentTags.add( t );
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(ContextMultiLineComment contextMultiLineComment) {
		String text = contextMultiLineComment.getContext_multi_line_comment().getText();
		fr.irisa.triskell.kermeta.language.structure.Tag tag = KermetaModelHelper.Tag.create(text);
		currentTags.add( tag );
		// No needs to go on
		return false;
	}*/
	
	
	
	/*
	 * 
	 * scompUnit : packageDecl importStmts usingStmts topLevelDecls
	 * 
	 */
	
	@Override
	public boolean beginVisit(PackageDecl packageDecl) {
		String qualifiedName = KermetaASTHelper.qualifiedIDAsString(packageDecl.getName());
		//String uri = KermetaASTHelper.getURI(packageDecl);
		Package p = kermetaUnit.addInternalPackage(qualifiedName);
		kermetaUnit.storeTrace(p, packageDecl);
		packages.add( p );
		kermetaUnit.addUsing( qualifiedName );
		// Continue the visit
		return true;
	}

/*	@Override
	public void endVisit(PackageDecl packageDecl) {
		packages.pop();
	}*/
	
	@Override
	public boolean beginVisit(ImportStmt importStmt) {
		StringLiteralOrQualifiedID astNode = importStmt.getUri();
		String uri = null;
		if ( astNode instanceof QualifiedID )
			uri = KermetaASTHelper.qualifiedIDAsString( (QualifiedID) astNode ).replace("\"", "");
		else
			uri = ((StringLiteralContainer)astNode).getString_literal().getText().replace("\"", "");
		
		/*
		 * 
		 * We do not insert anything if the uri is null.
		 * 
		 */
		if ( uri != null ) {
			Require require = kermetaUnit.addRequire(uri, null);
			kermetaUnit.storeTrace(require, importStmt);
		}
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(UsingStmt usingStmt) {
		String qualifiedName = KermetaASTHelper.qualifiedIDAsString( usingStmt.getName() );
		Using using = kermetaUnit.addUsing( qualifiedName );
		kermetaUnit.storeTrace(using, usingStmt);
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(TopLevelDecls decls) {
		return true;
	}
	
	/*
	 * 
	 * sequence topLevelDecl : annotations annotableElement ;
	 * abstract annotableElement : subPackageDecl | modelTypeDecl | classDecl | enumDecl | dataTypeDecl; // mapEntryDecl ;
	 * 
	 */
	@Override
	public boolean beginVisit(SubPackageDecl subPackageDecl) {
		Package currentPackage = packages.peek();
		String qualifiedName = NamedElementHelper.getQualifiedName( currentPackage ) + "::" + KermetaASTHelper.getTextForID(subPackageDecl.getName());
		Package p = kermetaUnit.addInternalPackage( qualifiedName );
		kermetaUnit.addUsing( qualifiedName );
		kermetaUnit.storeTrace(p, subPackageDecl);
		packages.push(p);
		// Continue the visit
		return true;
	}
	
	@Override
	public void endVisit(SubPackageDecl subPackageDecl) {
		packages.pop();
	}
	
	@Override
	public boolean beginVisit(ModelTypeDecl modelTypeDecl) {
		Package currentPackage = packages.peek();
		String name = KermetaASTHelper.getTextForID(modelTypeDecl.getName());
		ModelType modelType = KermetaModelHelper.ModelType.create(name);
		kermetaUnit.storeTrace(modelType, modelTypeDecl);
		kermetaUnit.addTypeDefinition(modelType, currentPackage);
		// Continue the visit
		return true;
	}
	
	@Override
	public boolean beginVisit(ClassDecl classDecl) {
		Package currentPackage = packages.peek();
		String name = KermetaASTHelper.getTextForID(classDecl.getName());
		boolean isAspect = KermetaASTHelper.isAnAspect(classDecl);
		boolean isAbstract = classDecl.getAbstractModifier() != null ? true : false;
		ClassDefinition classDefinition = KermetaModelHelper.ClassDefinition.create(name, isAbstract, isAspect);
		kermetaUnit.addTypeDefinition(classDefinition, currentPackage);
		kermetaUnit.storeTrace(classDefinition, classDecl);
		currentClassDefinition = classDefinition;
		// Continue the visit
		return true;
	}
	
	@Override
	public void endVisit(ClassDecl classDecl) {
		currentClassDefinition = null;
	}
	
	@Override
	public boolean beginVisit(EnumDecl enumDecl) {
		Package currentPackage = packages.peek();
		String name = KermetaASTHelper.getTextForID(enumDecl.getName());
		Enumeration c = KermetaModelHelper.Enumeration.create(name);
		kermetaUnit.addTypeDefinition(c, currentPackage);
		kermetaUnit.storeTrace(c, enumDecl);
		currentEnumeration = c;
		// Continue the visit
		return true;
	}
	
	@Override
	public void endVisit(EnumDecl enumDecl) {
		currentEnumeration = null;
	}
	
	@Override
	public boolean beginVisit(EnumLiteral enumLiteral) {
		String name = KermetaASTHelper.getTextForID(enumLiteral.getName());
		EnumerationLiteral literal = KermetaModelHelper.EnumerationLiteral.create(name);
		currentEnumeration.getOwnedLiteral().add( literal );
		kermetaUnit.storeTrace(literal, enumLiteral);
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(DataTypeDecl dataTypeDecl) {
		Package currentPackage = packages.peek();
		String name = KermetaASTHelper.getTextForID(dataTypeDecl.getName());
		PrimitiveType primitiveType = KermetaModelHelper.PrimitiveType.create( name );
		kermetaUnit.addTypeDefinition(primitiveType, currentPackage);
		kermetaUnit.storeTrace(primitiveType, dataTypeDecl);
		// No needs to go on
		return false;
	}
	
	
	/*
	 * 
	 * list classMemberDecls :  annotableClassMemberDecl* ;
	 * sequence annotableClassMemberDecl : annotations classMemberDecl;
	 * abstract classMemberDecl :  invariant | operation | property;
	 * 
	 */
	@Override
	public boolean beginVisit(Invariant invariant) {
		String name = KermetaASTHelper.getTextForID(invariant.getName());
		Constraint constraint = KermetaModelHelper.Constraint.createInvariant(name);
		kermetaUnit.storeTrace(constraint, invariant);
		currentClassDefinition.getInv().add( constraint );
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(Operation operation) {
		String name = KermetaASTHelper.getTextForID(operation.getName());
		boolean isAbstract = operation.getOperationBody() instanceof OperationEmptyBody ? true : false;
		fr.irisa.triskell.kermeta.language.structure.Operation o = KermetaModelHelper.Operation.create(name, isAbstract);
		kermetaUnit.storeTrace(o, operation);
		currentClassDefinition.getOwnedOperation().add(o);
		currentOperation = o;
		// Continue the visit
		return true;
	}
	
	@Override
	public void endVisit(Operation operation) {
		currentOperation = null;
	}
	
	@Override
	public boolean beginVisit(Property property) {
		fr.irisa.triskell.kermeta.language.structure.Property p = null;
		String name = KermetaASTHelper.getTextForID(property.getName());
		String kind = property.getPropertyKind().getText();
		/*
		 * 
		 * Take care about the special case Property kind.
		 * 
		 */
		if ( kind.equals(KermetaModelHelper.Property.PROPERTY_KIND) ) {
			boolean isGetterAbstract = property.getGetterBody() != null ? false : true;
			boolean isSetterAbstract = property.getSetterBody() != null ? false : true;
			boolean isReadOnly = property.getReadOnlyModifier() == null ? false: true;
			p = KermetaModelHelper.Property.createDerived(name, isReadOnly, isGetterAbstract, isSetterAbstract);
		} else {
			p = KermetaModelHelper.Property.create(name);
			p.setIsReadOnly( property.getReadOnlyModifier() == null ? false: true);
		}
		p.setIsOrdered( KermetaASTHelper.isOrdered(property.getTypeRef()) );
		p.setIsUnique( KermetaASTHelper.isUnique(property.getTypeRef()) );
		p.setUpper( KermetaASTHelper.getUpper(property.getTypeRef()) );
		p.setLower( KermetaASTHelper.getLower(property.getTypeRef()) );
		if ( kind.equals(KermetaModelHelper.Property.ATTRIBUTE_KIND) )
			p.setIsComposite(true);
		
		currentClassDefinition.getOwnedAttribute().add( p );
		kermetaUnit.storeTrace(p, property);
		// No needs to go on
		return false;
	}
	
	
	/*
	 * 
	 * sequence precondition :  "pre" name=ID "is" body=fExpression ;
	 * sequence postcondition : "post" name=ID "is" body=fExpression ;
	 * 
	 */
	@Override
	public boolean beginVisit(Precondition precondition) {
		String name = KermetaASTHelper.getTextForID(precondition.getName());
		Constraint constraint = KermetaModelHelper.Constraint.createPrecondition(name);
		kermetaUnit.storeTrace(constraint, precondition);
		currentOperation.getPre().add( constraint );
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(Postcondition postcondition) {
		String name = KermetaASTHelper.getTextForID(postcondition.getName());
		Constraint constraint = KermetaModelHelper.Constraint.createPostcondition(name);
		kermetaUnit.storeTrace(constraint, postcondition);
		currentOperation.getPost().add( constraint );
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(OperationBody operationBody) {
		// No needs to go on
		// Saving time
		return false;
	}
	
	
	/*
	 * 
	 * sequence param : annotations  name=ID COLON typeRef;
	 * 
	 */
	@Override
	public boolean beginVisit(Param param) {
		String name = KermetaASTHelper.getTextForID(param.getName());
		Parameter parameter = KermetaModelHelper.Parameter.create(name);
		parameter.setIsOrdered( KermetaASTHelper.isOrdered(param.getTypeRef()) );
		parameter.setIsUnique( KermetaASTHelper.isUnique(param.getTypeRef()) );
		parameter.setUpper( KermetaASTHelper.getUpper(param.getTypeRef()) );
		parameter.setLower( KermetaASTHelper.getLower(param.getTypeRef()) );
		kermetaUnit.storeTrace(parameter, param);
		currentOperation.getOwnedParameter().add( parameter );
		// No needs to go on
		return false;
	}
	
	/*
	 * 
	 * list typeVarDecllst : tv1=typeVarDecl (COMMA tvn=typeVarDecl)*;
	 * sequence typeVarDecl : name=ID (COLON supertype=type)? ;
	 * 
	 */
	@Override
	public boolean beginVisit(TypeVarDecllst typeVarDecllst) {
		for ( ASTNode node : typeVarDecllst.getChildren() ) {
			if ( node instanceof TypeVarDecl ) {
				TypeVarDecl type = (TypeVarDecl) node;
				String name = KermetaASTHelper.getTextForID(type.getName());
				ObjectTypeVariable otv = KermetaModelHelper.ObjectTypeVariable.create(name);
				kermetaUnit.storeTrace(otv, node);
				/*
				 * 
				 * Container can be a class definition or an operation.
				 * 
				 */
				if ( currentOperation != null ) {
					currentOperation.getTypeParameter().add( otv );
					currentOperation.getContainedType().add( otv );
				} else if ( currentClassDefinition != null ) {
					currentClassDefinition.getTypeParameter().add( otv );
				}
			}
		}
		// No needs to go on
		return false;
	}
}


