/* $Id: GetTextVisitor.java,v 1.16 2008-04-29 16:09:43 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : GetTextVisitor.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 feb. 2005
* Authors : 
* 		Franck Fleurey (ffleurey@irisa.fr)
* 		Francois Tanguy
* 		Didier Vojtisek
*/

package fr.irisa.triskell.kermeta.texteditor.outline;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.modelhelper.TypeDefinitionHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author Franck Fleurey
 */
public class GetTextVisitor extends KermetaOptimizedVisitor {
	
    protected KermetaOutline outline;
	
	

	public GetTextVisitor(KermetaOutline outline) {
	    this.outline = outline;
		//pp = new KM2KMTPrettyPrinter();
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#genericVisitChildren(org.eclipse.emf.ecore.EObject)
	 */
	public Object genericVisitChildren(EObject arg0) {
		return null;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.ClassDefinition)
	 */
	public Object visitClassDefinition(ClassDefinition node) {
		String result = node.getName();
		if (node.getTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getTypeParameter());
			result += ">";
		}
		
		// build the list of inherited classes using all aspects
		List<TypeDefinition> context = TypeDefinitionHelper.getAllAspects(outline.getKermetaUnit(), KermetaModelHelper.ClassDefinition.qualifiedName(node) );
		//context.addAll( TypeDefinitionHelper.getBaseAspects(outline.getKermetaUnit().getModelingUnit(), node) );
				
		EList<Type> allSuperTypes = new BasicEList<Type>();
		for ( TypeDefinition typeDefinition : context ) {	    	
	    	if ( typeDefinition instanceof ClassDefinition ) {
	    		ClassDefinition cl = (ClassDefinition) typeDefinition;
	    		for ( Type t : cl.getSuperType()) {
	    			if(t instanceof ParameterizedType){
	    				ParameterizedType pt = (ParameterizedType)t;
	    				TypeDefinition td = pt.getTypeDefinition();
	    				// no duplicate
	    				if(!allSuperTypes.contains(td)) 
	    					allSuperTypes.add(t);
	    			}
	    		}
	    	}	    	
	    }
		if (allSuperTypes.size() > 0) {
			result += " -> ";
			result += ppComaSeparatedNodes(allSuperTypes);
		}
		
		return result;
	}
	
	public String ppTypeVariableDeclaration(EList<TypeVariable> tparams) {
		String result = "";
		Iterator<TypeVariable> it = tparams.iterator();
		while (it.hasNext()) {
			TypeVariable node = it.next();
			result += node.getName();
			if (node.getSupertype() != null) result += " : " + ((fr.irisa.triskell.kermeta.language.structure.Class)node.getSupertype()).getTypeDefinition().getName();
			if (it.hasNext()) result +=  ", ";
		}
		return result;
	}
	
	public Object visitTypeVariable(TypeVariable arg0) {
		return arg0.getName();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Constraint)
	 */
	public Object visitConstraint(Constraint node) {
		String result = node.getName() + " : " + node.getStereotype().getName();		
		return result;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Enumeration)
	 */
	public Object visitEnumeration(Enumeration arg0) {
		return arg0.getName();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.EnumerationLiteral)
	 */
	public Object visitEnumerationLiteral(EnumerationLiteral arg0) {
		return arg0.getName();
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation node) {
		String result = node.getName();
		if (node.getTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getTypeParameter());
			result += ">";
		}
		result += "(";
		result += ppComaSeparatedNodes(node.getOwnedParameter());
		result += ")";
		if(node.getType() != null) {
			result += " : " + ppTypeFromMultiplicityElement(node);
		}
		return result;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Package)
	 */
	public Object visitPackage(Package arg0) {
		return getQualifiedName(arg0);
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType arg0) {
		if(arg0.getInstanceType() != null){
			return arg0.getName() + " => " +accept(arg0.getInstanceType()).toString();
		}
		return arg0.getName();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Property)
	 */
	public Object visitProperty(Property node) {
		String result = node.getName() + " : " + ppTypeFromMultiplicityElement(node);
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.ProductType)
	 */
	public Object visitProductType(ProductType node) {
		String result = "[" + ppComaSeparatedNodes(node.getType()) + "]";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FunctionType)
	 */
	public Object visitFunctionType(FunctionType node) {
		return "< " + this.accept(node.getLeft()) + "->" + this.accept(node.getRight()) + " >";
	}
	
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.VoidType)
	 */
	public Object visitVoidType(VoidType node) {
		return "Void";
	}
	
	/**
	 * @see kermeta.visitor.KermetaVisitor#visit(kermeta.structure.Class)
	 */
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node) {
		String result = node.getTypeDefinition().getName();
		if (node.getTypeParamBinding().size() > 0) {
			result += "<" + ppComaSeparatedNodes(node.getTypeParamBinding()) + ">";
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.TypeVariableBinding)
	 */
	public Object visitTypeVariableBinding(TypeVariableBinding node) {
	    if (node.getType() == null) return "!NULL!";
		return this.accept(node.getType());
	}
	
	public Object visitObjectTypeVariable(fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable node) {
		return node.getName();
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Parameter)
	 */
	public Object visitParameter(Parameter node) {
		return node.getName() + " : " + ppTypeFromMultiplicityElement(node);
	}
	
	@Override
	public Object visitModelType(ModelType node) {
		
		return node.getName();
	}
	
	public String getQualifiedName(NamedElement element) {
		if (element.eContainer() != null && element.eContainer() instanceof NamedElement)
			return getQualifiedName( (NamedElement)element.eContainer() ) + "::" + element.getName();
		else return element.getName();
	}
	
	public String ppComaSeparatedNodes(EList<? extends EObject> expressions) {
		String result = "";
		Iterator<? extends EObject> it = expressions.iterator();
		while(it.hasNext()) {
			EObject o = it.next();
			 result += this.accept(o);
			if (it.hasNext()) result +=  ", ";
		}
		return result;
	}
	
	public String ppTypeFromMultiplicityElement(MultiplicityElement elem) {
		String result = "";
		if (elem.getUpper() != 1) {
			if (elem.isIsOrdered()) {
				if (!elem.isIsUnique()) result +="seq ";
			}
			else {
				if (elem.isIsUnique()) result +="set ";
				else result +="bag ";
			}
		}
		if(elem.getType() == null) result+= "<undefined>";
		else
			result += this.accept(elem.getType());
		if (elem.getLower() != 0 || elem.getUpper() != 1) {
			result += "[" + elem.getLower() + "..";
			result += (elem.getUpper()<0)?"*":""+elem.getUpper();
			result += "]";
		}
		return result;
	}
	
}

