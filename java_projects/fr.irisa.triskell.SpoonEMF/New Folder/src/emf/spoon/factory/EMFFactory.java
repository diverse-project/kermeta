package emf.spoon.factory;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import spoon.reflect.CoreFactory;
import spoon.reflect.Factory;
import spoon.reflect.code.CtArrayAccess;
import spoon.reflect.code.CtAssert;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtBreak;
import spoon.reflect.code.CtCase;
import spoon.reflect.code.CtCatch;
import spoon.reflect.code.CtCodeSnippetExpression;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtConditional;
import spoon.reflect.code.CtContinue;
import spoon.reflect.code.CtDo;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtFor;
import spoon.reflect.code.CtForEach;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtNewArray;
import spoon.reflect.code.CtNewClass;
import spoon.reflect.code.CtOperatorAssignment;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.code.CtSwitch;
import spoon.reflect.code.CtSynchronized;
import spoon.reflect.code.CtThrow;
import spoon.reflect.code.CtTry;
import spoon.reflect.code.CtUnaryOperator;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.code.CtWhile;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtAnnotationType;
import spoon.reflect.declaration.CtAnonymousExecutable;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtEnum;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtInterface;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtTypeParameter;
import spoon.reflect.reference.CtArrayTypeReference;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtLocalVariableReference;
import spoon.reflect.reference.CtPackageReference;
import spoon.reflect.reference.CtParameterReference;
import spoon.reflect.reference.CtTypeParameterReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.code.CtCodeSnippetExpressionImpl;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;
import spoon.support.reflect.cu.CompilationUnitImpl;
import emf.spoon.reflect.code.CodeFactory;
import emf.spoon.reflect.code.impl.CtArrayAccessImpl;
import emf.spoon.reflect.code.impl.CtAssertImpl;
import emf.spoon.reflect.code.impl.CtAssignmentImpl;
import emf.spoon.reflect.code.impl.CtBinaryOperatorImpl;
import emf.spoon.reflect.code.impl.CtBlockImpl;
import emf.spoon.reflect.code.impl.CtBreakImpl;
import emf.spoon.reflect.code.impl.CtCaseImpl;
import emf.spoon.reflect.code.impl.CtCatchImpl;
import emf.spoon.reflect.code.impl.CtConditionalImpl;
import emf.spoon.reflect.code.impl.CtContinueImpl;
import emf.spoon.reflect.code.impl.CtDoImpl;
import emf.spoon.reflect.code.impl.CtFieldAccessImpl;
import emf.spoon.reflect.code.impl.CtForImpl;
import emf.spoon.reflect.declaration.DeclarationFactory;
import emf.spoon.reflect.declaration.impl.CtAnnotationImpl;
import emf.spoon.reflect.declaration.impl.CtAnnotationTypeImpl;
import emf.spoon.reflect.declaration.impl.CtAnonymousExecutableImpl;
import emf.spoon.reflect.declaration.impl.CtClassImpl;
import emf.spoon.reflect.declaration.impl.CtConstructorImpl;
import emf.spoon.reflect.declaration.impl.CtEnumImpl;
import emf.spoon.reflect.declaration.impl.CtFieldImpl;
import emf.spoon.reflect.declaration.impl.CtPackageImpl;
import emf.spoon.reflect.reference.ReferenceFactory;
import emf.spoon.reflect.reference.impl.CtArrayTypeReferenceImpl;
import emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl;
import emf.spoon.reflect.reference.impl.CtFieldReferenceImpl;

public class EMFFactory implements CoreFactory {
	Factory factory = null;

	Resource resource = null;

	protected void addInResouces(Object o) {
		
		if (resource != null)
			this.resource.getContents().add((EObject) o);
		else{
			for (CtPackage p1 : factory.Package().getAll()){
				emf.spoon.reflect.declaration.CtPackage p =(emf.spoon.reflect.declaration.CtPackage) p1;
				if (p.eResource()!=null){
					resource = p.eResource();
					System.err.println("Resource is not null");
					this.resource.getContents().add((EObject) o);
					break;
				}
				else{
					System.err.println("Resource is null");
				}
			}
		}
	}

	public EMFFactory(Resource e) {
		this.resource = e;
	}

	public <T> T clone(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	public CtAnnotation createAnnotation() {
		CtAnnotationImpl a = (CtAnnotationImpl) DeclarationFactory.eINSTANCE
				.createCtAnnotation();
		a.setFactory(factory);
		this.addInResouces(a);
		
		return a;
	}

	public CtAnnotationType createAnnotationType() {
		CtAnnotationTypeImpl a = (CtAnnotationTypeImpl) DeclarationFactory.eINSTANCE
				.createCtAnnotationType();

		a.setFactory(factory);
		this.addInResouces(a);
		return a;

	}

	public CtAnonymousExecutable createAnonymousExecutable() {
		CtAnonymousExecutableImpl a = (CtAnonymousExecutableImpl) DeclarationFactory.eINSTANCE
				.createCtAnonymousExecutable();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T, E extends CtExpression<?>> CtArrayAccess<T, E> createArrayAccess() {
		CtArrayAccessImpl a = (CtArrayAccessImpl) CodeFactory.eINSTANCE
				.createCtArrayAccess();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtArrayTypeReference<T> createArrayTypeReference() {
		CtArrayTypeReferenceImpl a = (CtArrayTypeReferenceImpl) ReferenceFactory.eINSTANCE
				.createCtArrayTypeReference();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtAssert createAssert() {
		CtAssertImpl a = (CtAssertImpl) CodeFactory.eINSTANCE.createCtAssert();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T, A extends T> CtAssignment<T, A> createAssignment() {
		CtAssignmentImpl a = (CtAssignmentImpl) CodeFactory.eINSTANCE
				.createCtAssignment();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtBinaryOperator<T> createBinaryOperator() {
		CtBinaryOperatorImpl a = (CtBinaryOperatorImpl) CodeFactory.eINSTANCE
				.createCtBinaryOperator();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <R> CtBlock<R> createBlock() {

		CtBlockImpl a = (CtBlockImpl) CodeFactory.eINSTANCE.createCtBlock();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtBreak createBreak() {
		CtBreakImpl a = (CtBreakImpl) CodeFactory.eINSTANCE.createCtBreak();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <S> CtCase<S> createCase() {
		CtCaseImpl a = (CtCaseImpl) CodeFactory.eINSTANCE.createCtCase();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtCatch createCatch() {
		CtCatchImpl a = (CtCatchImpl) CodeFactory.eINSTANCE.createCtCatch();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtClass<T> createClass() {
		CtClassImpl a = (CtClassImpl) DeclarationFactory.eINSTANCE
				.createCtClass();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtConditional<T> createConditional() {
		CtConditionalImpl a = (CtConditionalImpl) CodeFactory.eINSTANCE
				.createCtConditional();
		a.setFactory(factory);
		this.addInResouces(a);
		return a; 
	}

	public CtConstructor createConstructor() {
		CtConstructorImpl a = (CtConstructorImpl) DeclarationFactory.eINSTANCE
				.createCtConstructor();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtContinue createContinue() {
		CtContinueImpl a = (CtContinueImpl) CodeFactory.eINSTANCE
				.createCtContinue();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtDo createDo() {
		CtDoImpl a = (CtDoImpl) CodeFactory.eINSTANCE.createCtDo();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtEnum createEnum() {
		CtEnumImpl a = (CtEnumImpl) DeclarationFactory.eINSTANCE.createCtEnum();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtExecutableReference<T> createExecutableReference() {
		CtExecutableReferenceImpl a = (CtExecutableReferenceImpl) ReferenceFactory.eINSTANCE
				.createCtExecutableReference();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtField<T> createField() {
		CtFieldImpl a = (CtFieldImpl) DeclarationFactory.eINSTANCE
				.createCtField();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtFieldAccess<T> createFieldAccess() {
		CtFieldAccessImpl a = (CtFieldAccessImpl) CodeFactory.eINSTANCE
				.createCtFieldAccess();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtFieldReference<T> createFieldReference() {
		CtFieldReferenceImpl a = (CtFieldReferenceImpl) ReferenceFactory.eINSTANCE
				.createCtFieldReference();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtFor createFor() {
		CtForImpl a = (CtForImpl) CodeFactory.eINSTANCE.createCtFor();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtForEach createForEach() {
		CtForEach a = CodeFactory.eINSTANCE.createCtForEach();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtIf createIf() {
		CtIf a = CodeFactory.eINSTANCE.createCtIf();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtInterface<T> createInterface() {
		CtInterface a = DeclarationFactory.eINSTANCE.createCtInterface();

		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtInvocation<T> createInvocation() {
		CtInvocation a = CodeFactory.eINSTANCE.createCtInvocation();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtLiteral<T> createLiteral() {
		CtLiteral a = CodeFactory.eINSTANCE.createCtLiteral();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtLocalVariable<T> createLocalVariable() {
		CtLocalVariable a = CodeFactory.eINSTANCE.createCtLocalVariable();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtLocalVariableReference<T> createLocalVariableReference() {
		CtLocalVariableReference a = ReferenceFactory.eINSTANCE
				.createCtLocalVariableReference();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtMethod<T> createMethod() {
		CtMethod a = DeclarationFactory.eINSTANCE.createCtMethod();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtNewArray<T> createNewArray() {
		CtNewArray a = CodeFactory.eINSTANCE.createCtNewArray();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtNewClass<T> createNewClass() {
		CtNewClass a = CodeFactory.eINSTANCE.createCtNewClass();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T, A extends T> CtOperatorAssignment<T, A> createOperatorAssignment() {
		CtOperatorAssignment a = CodeFactory.eINSTANCE
				.createCtOperatorAssignment();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	private Collection<emf.spoon.reflect.declaration.CtPackage> packs  =new ArrayList<emf.spoon.reflect.declaration.CtPackage>();
	public CtPackage createPackage() {
		emf.spoon.reflect.declaration.CtPackage a = DeclarationFactory.eINSTANCE.createCtPackage();
		a.setFactory(factory);
		packs.add(a);
		this.addInResouces(a);
		return a;
	}

	public CtPackageReference createPackageReference() {
		CtPackageReference a = ReferenceFactory.eINSTANCE
				.createCtPackageReference();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtParameter<T> createParameter() {
		CtParameter a = DeclarationFactory.eINSTANCE.createCtParameter();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtParameterReference<T> createParameterReference() {
		CtParameterReference a = ReferenceFactory.eINSTANCE
				.createCtParameterReference();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <R> CtReturn<R> createReturn() {
		CtReturn a = CodeFactory.eINSTANCE.createCtReturn();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public SourcePosition createSourcePosition(String sourceFileName, int line,
			int column) {
		SourcePosition a = DeclarationFactory.eINSTANCE.createSourcePosition();

		this.addInResouces(a);
		return a;
	}

	public <R> CtStatementList<R> createStatementList() {
		CtStatementList a = CodeFactory.eINSTANCE.createCtStatementList();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <S> CtSwitch<S> createSwitch() {
		CtSwitch a = CodeFactory.eINSTANCE.createCtSwitch();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtSynchronized createSynchronized() {
		CtSynchronized a = CodeFactory.eINSTANCE.createCtSynchronized();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtThrow createThrow() {
		CtThrow a = CodeFactory.eINSTANCE.createCtThrow();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtTry createTry() {
		CtTry a = CodeFactory.eINSTANCE.createCtTry();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtTypeParameter createTypeParameter() {
		CtTypeParameter a = DeclarationFactory.eINSTANCE
				.createCtTypeParameter();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtTypeParameterReference createTypeParameterReference() {
		CtTypeParameterReference a = ReferenceFactory.eINSTANCE
				.createCtTypeParameterReference();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtTypeReference<T> createTypeReference() {
		CtTypeReference a = ReferenceFactory.eINSTANCE.createCtTypeReference();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtUnaryOperator<T> createUnaryOperator() {
		CtUnaryOperator a = CodeFactory.eINSTANCE.createCtUnaryOperator();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public <T> CtVariableAccess<T> createVariableAccess() {
		CtVariableAccess a = CodeFactory.eINSTANCE.createCtVariableAccess();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;
	}

	public CtWhile createWhile() {
		CtWhile a = CodeFactory.eINSTANCE.createCtWhile();
		a.setFactory(factory);
		this.addInResouces(a);
		return a;

	}

	public Factory getMainFactory() {
		return this.factory;
	}

	public void setMainFactory(Factory mainFactory) {
		this.factory = mainFactory;
	}


	public void addPackage(CtPackageImpl ctPackage) {
		this.packs.add(ctPackage);
		
	}


	public <T> CtCodeSnippetExpression<T> createCodeSnippetExpression() {
		CtCodeSnippetExpression<T> e = new CtCodeSnippetExpressionImpl<T>();
		e.setFactory(getMainFactory());
		return e;
	}

	public CtCodeSnippetStatement createCodeSnippetStatement() {
		CtCodeSnippetStatement e = new CtCodeSnippetStatementImpl();
		e.setFactory(getMainFactory());
		return e;
	}
	

		public SourcePosition createSourcePosition(CompilationUnit compilationUnit, int start,
				int end, int[] lineSeparatorPositions) {
			return DeclarationFactory.eINSTANCE.createSourcePosition();
		}

		public CompilationUnit createCompilationUnit() {
			CompilationUnit cu=new CompilationUnitImpl();
			cu.setFactory(getMainFactory());
			return cu;
		}



		public CompilationUnit createVirtualCompilationUnit() {
			CompilationUnit cu=new CompilationUnitImpl();
			cu.setFactory(getMainFactory());
			return cu;
		}
}
