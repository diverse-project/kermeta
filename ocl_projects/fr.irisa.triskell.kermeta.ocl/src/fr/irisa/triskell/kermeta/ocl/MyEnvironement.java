package fr.irisa.triskell.kermeta.ocl;

import java.util.List;

import org.eclipse.ocl.AbstractEnvironment;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EnvironmentFactory;
import org.eclipse.ocl.TypeResolver;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.types.OCLStandardLibrary;
import org.eclipse.ocl.utilities.OCLFactory;
import org.eclipse.ocl.utilities.UMLReflection;

public class MyEnvironement<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> extends  AbstractEnvironment<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> implements Environment<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>{

	public P defineAttribute(C owner, Variable<C, PM> variable, CT constraint) {
		// TODO Auto-generated method stub
		return null;
	}

	public O defineOperation(C owner, String name, C type, List<Variable<C, PM>> params, CT constraint) {
		// TODO Auto-generated method stub
		return null;
	}

	public CT getDefinition(Object feature) {
		// TODO Auto-generated method stub
		return null;
	}

	public EnvironmentFactory<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public OCLFactory getOCLFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public OCLStandardLibrary<C> getOCLStandardLibrary() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<S> getStates(C owner, List<String> pathPrefix) {
		// TODO Auto-generated method stub
		return null;
	}

	public TypeResolver<C, O, P> getTypeResolver() {
		// TODO Auto-generated method stub
		return null;
	}

	public UMLReflection<PK, C, O, P, EL, PM, S, COA, SSA, CT> getUMLReflection() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isInPostcondition(OCLExpression<C> exp) {
		// TODO Auto-generated method stub
		return false;
	}

	public C lookupClassifier(List<String> names) {
		// TODO Auto-generated method stub
		return null;
	}

	public PK lookupPackage(List<String> names) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setParent(Environment<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> env) {
		// TODO Auto-generated method stub
		
	}

	public void undefine(Object feature) {
		// TODO Auto-generated method stub
		
	}

}
