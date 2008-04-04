/* $Id: KM2JavaPrettyPrinter.java,v 1.1 2008-04-04 09:51:09 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : KM2JavaPrettyPrinter.java
 * License   : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Authors : 
 * 	Franck Fleurey	ffleurey@irisa.fr
 *  Zoe Drey 		zdrey@irisa.fr
 *  Didier Vojtisek	dvojtise@irisa.fr
 *  Cyril Faucher	cfaucher@irisa.fr
 */
package org.kermeta.compiler.exporter;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.kermeta.model.KermetaModelHelper;
import org.kermeta.simk.SIMKModel;
import org.kermeta.simk.SMContext;
import org.kermeta.simk.SMPackage;
import org.kermeta.simk.SMParameter;
import org.kermeta.simk.SMReturn;
import org.kermeta.simk.SMUsage;
import org.kermeta.simk.SimkFactory;
import org.kermeta.simk.StaticMethod;

import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;
import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation;
import fr.irisa.triskell.kermeta.language.behavior.CallValue;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Conditional;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral;
import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;
import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
import fr.irisa.triskell.kermeta.language.behavior.Loop;
import fr.irisa.triskell.kermeta.language.behavior.Raise;
import fr.irisa.triskell.kermeta.language.behavior.Rescue;
import fr.irisa.triskell.kermeta.language.behavior.SelfExpression;
import fr.irisa.triskell.kermeta.language.behavior.StringLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.behavior.VoidLiteral;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;
import fr.irisa.triskell.kermeta.parser.helper.KMTHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;


/**
 * PrettyPrinter that prints a Kermeta program in its concrete syntax. 
 * ie. Prints a kermeta model into a human-readable form (which is KMT)
 */
public class KM2JavaPrettyPrinter extends KermetaOptimizedVisitor {

	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	
	private Operation current_modelOperation;
	
	protected String root_pname;
	protected String current_pname;
	
	protected String prefixTab = "\t";
	
	private SIMKModel helperModel = null;
	
	/**
	 * Boolean variable used to manage the prefix printing
	 */
	protected boolean alreadyPrefixed = false;
	
	/** If the visitor (i.e This printer:)) is currently visiting a typedefinition, this
	 *  boolean is set to true (this allows the visitor to print differently some things
	 *  according to the context inside which it is (i.e typeDefintion or not typeDefinition) */
	protected boolean typedef = true;
	
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KM2JAVA");
	
	private EcoreExporter km2ecore = null;
	
	public KM2JavaPrettyPrinter(EcoreExporter km2ecore) {
		this.km2ecore = km2ecore;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Constraint)
	 */
	public Object visitConstraint(Constraint node) {
		String result = ppTags(node.getTag());
		
		if(alreadyPrefixed)
			result += node.getStereotype().toString();
		else
			result += getPrefix() + node.getStereotype().toString();

		result += node.getName()!=null ? " "+node.getName():"";
		result += " is\n";
		if (node.getBody() != null) {
			pushPrefix();
			result += getPrefix() + this.accept(node.getBody());
			popPrefix();
		}
		else {
			pushPrefix();
			result += getPrefix() + "//TODO: implement constraint\n"; 
			result += getPrefix() + "throw kermeta.exceptions.ExceptionsFactory.eINSTANCE.createNotImplementedException()\n";
			popPrefix();
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FAssignement)
	 */
	public Object visitAssignment(Assignment node) {
		
		String left = this.accept(node.getTarget()).toString();
		String right = this.accept(node.getValue()).toString();
		
		// Patch that adds the 'function' keyword in case the assigned value is a function
		if(node.getValue() instanceof LambdaExpression)
			right = "function " + right;
		
		String op = "";//(node.isIsCast())?"?":":";
		
		/*if(tgt instanceof CallFeature) {
			result += "get" + CodeGenUtil.capName(KMTHelper.getMangledIdentifier(node.getName()));
		} else {*/
		
		if(node.getTarget() instanceof CallFeature) {
			//left = left.substring(0,left.length()-2);
			
			left.replace(".", ";");
			
			String[] tabLeft = left.split(";");
			
			String result = "";
			for(int i=0; i<tabLeft.length; i++) {
				
				if( i < (tabLeft.length-1) ) {
					result += tabLeft[i] + ".";
				}
				if( i == (tabLeft.length-1) ) {
					result += "set" + CodeGenUtil.capName(tabLeft[i]);
				}
			}
			
			return result + "(" + right + ");";
		} else {
			return left + " " + op + "= " + right + ";";
		}
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Block)
	 * compiler ready
	 */
	public Object visitBlock(Block node) {
		String result = "";
		
		boolean firstBlock = false;
		// If the parent is a root statement of the operation
		if(getParent().eContainer() instanceof ClassDefinition) {
			firstBlock = true;
		}
		if(!firstBlock) {
			result = "{";
		}
		alreadyPrefixed = false;
		pushPrefix();
		result += ppCRSeparatedNode(node.getStatement());
		
		popPrefix();
		
		for(Rescue itRB : node.getRescueBlock()) {
			result += getPrefix() + this.accept((Rescue) itRB) + "\n";
		}

		if(!firstBlock) {
			result += getPrefix() + "}";
		}
		
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Rescue)
	 */
	public Object visitRescue(Rescue node) {
		String result = "rescue";
		if (node.getExceptionName() != null) {
			result += "(" + node.getExceptionName() + " : " + this.accept(node.getExceptionType()) + ")";
		}
		result += "\n";
		pushPrefix();
		result += ppCRSeparatedNode(node.getBody());
		popPrefix();
		return result;
	}
	

	public String ppCRSeparatedNode(EList expressions) {
		String result = "";
		int expNb = expressions.size();
		for(int i=0; i<expNb; i++) {
			if((i==0) && (alreadyPrefixed) && (!prefix.equals(prefixTab))) {
				result += this.accept((EObject)expressions.get(i)) + "\n";
			}
			else if((i==0) && (!alreadyPrefixed)) {
				alreadyPrefixed = true;
				result += getPrefix() + this.accept((EObject)expressions.get(i)) + "\n";
			}
			else {
				alreadyPrefixed = true;
				result += getPrefix() + this.accept((EObject)expressions.get(i)) + "\n";
			}
		}

		if(expNb > 0) alreadyPrefixed = false;
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.BooleanLiteral)
	 */
	public Object visitBooleanLiteral(BooleanLiteral node) {
		return ""+node.isValue();
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.CallSuperOperation)
	 * @reqComp "comp_callSuperoperation"
	 */
	public Object visitCallSuperOperation(CallSuperOperation node) {
		String result = "super(";
		result += ppComaSeparatedNodes(node.getParameters());
		result += ")";
		return result;
	}
	
	public String ppComaSeparatedNodes(EList expressions) {
		String result = "";
		Iterator it = expressions.iterator();
		while(it.hasNext()) {
			EObject o = (EObject)it.next();
			result += this.accept(o);
			if (it.hasNext()) result +=  ", ";
		}
		return result;
	}
	
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node) {
		String qname = NamedElementHelper.getMangledQualifiedName(node.getTypeDefinition(), NamedElementHelper.simplePointSeparator);
		String name = KMTHelper.getMangledIdentifier(node.getTypeDefinition().getName());
		if(qname == null || name == null){
			internalLog.error("Problem visiting a Class node with TypeDefinition name == null" );
			return "";
		}
		String result = ppTypeName(qname, name);
		if (node.getTypeParamBinding().size() > 0) {
			result += "<" + ppComaSeparatedNodes(node.getTypeParamBinding()) + ">";
		}
		return result;
	}
	
	public Object visitModelType(ModelType node) {
		String qname = NamedElementHelper.getMangledQualifiedName(node);
		String name = KMTHelper.getMangledIdentifier(node.getName());
		String result = ppTypeName(qname, name);
//		if (node.getTypeParamBinding().size() > 0) {
//			result += "<" + ppComaSeparatedNodes(node.getTypeParamBinding()) + ">";
//		}
		result += "\n" + getPrefix() + "{\n";
		pushPrefix();

		Iterator included = node.getIncludedTypeDefinition().iterator();
		while (included.hasNext()) {
			TypeDefinition tdef = (TypeDefinition) included.next();
			result += NamedElementHelper.getMangledQualifiedName(tdef);
			if (included.hasNext()) {
				result += ", ";
			}
		}
		popPrefix();
		result += getPrefix() + "}\n";
		return result;
	}
	
	/**
	 * 
	 * @param qname the qualified name of the type
	 * @param name the name of the type
	 * @return a String. 
	 * FIXED : test of qname.startsWith was not good
	 * examples : if rootpackage is "a" and qname="a1" the test considers that
	 * the type (identified by qname) belongs to current root package
	 */
	protected String ppTypeName(String qname, String name) {
		String result = "";
		if (qname.equals(current_pname + NamedElementHelper.simplePointSeparator + name)) result += name;
		else {
			for(int i=0; i<usings.size(); i++) {
				if (qname.equals(usings.get(i) + NamedElementHelper.simplePointSeparator + name)) {
					result += name;
					break;
				}
			}
			if (qname.startsWith(root_pname + NamedElementHelper.simplePointSeparator))
			{
				result += qname.substring(root_pname.length() + 2);
			}
		}
		if (result.equals("")) result += qname;
		
		if( result.equals("kermeta::standard::String") || result.equals("kermeta.standard.String") ) {
			result = "String";
		}
		
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.TypeVariableBinding)
	 */
	public Object visitTypeVariableBinding(TypeVariableBinding node) {
		return this.accept(node.getType());
	}
	
		
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType node) {
		// FIXME we should deal the primitive type
		/*setParent(node);
		if (typedef == true) {
			typedef = false;
			String result = "alias " + node.getName() + " : " + this.accept(node.getInstanceType()) + ";";
			typedef = true;
			return result;
		}
		else {
			String qname = NamedElementHelper.getMangledQualifiedName(node, NamedElementHelper.simplePointSeparator);
			String name = KMTHelper.getMangledIdentifier(node.getName());
			String result = ppTypeName(qname, name);
			return result;
		}*/
		return null;
	}
	
	public String ppTypeVariableDeclaration(EList tparams) {
		String result = "";
		Iterator it = tparams.iterator();
		while (it.hasNext()) {
			TypeVariable node = (TypeVariable)it.next();
			result += KMTHelper.getMangledIdentifier(node.getName());
			if (node.getSupertype() != null) result += " : " + this.accept(node.getSupertype());
			if (it.hasNext()) result +=  ", ";
		}
		return result;
	}
	
	/** Prettyprint the annotations */
	public String ppTags(EList tagList) {
		String result = "/**\n";
	    
		int tagNb = tagList.size();
		for(int i=0; i<tagNb; i++) {
			if((i==0) && (alreadyPrefixed)) {
				result += this.accept((EObject)tagList.get(i)) + "\n";
			}
			else if((i==0) && (!alreadyPrefixed)) {
				alreadyPrefixed = true;
				result += getPrefix() + this.accept((EObject)tagList.get(i)) + "\n";
			}
			else {
				result += getPrefix() + this.accept((EObject)tagList.get(i)) + "\n";
			}
		}
		if(tagNb > 0) alreadyPrefixed = false;
	    return result + "\n*/";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FConditionnal)
	 * @reqComp "comp_conditional"
	 */
	public Object visitConditional(Conditional node) {
		String result = "if( " + this.accept(node.getCondition()) + ") {\n";
		pushPrefix(); 
		// Both type of ThenBody and ElseBody are "Block" (see also KMT2KMPrimitiveExpressionBuilder)
		// And block textual syntax is already represented by "then..else..end"
		alreadyPrefixed = false;
		if (node.getThenBody() != null) 
			result += this.ppCRSeparatedNode(((Block)node.getThenBody()).getStatement()) + "\n";
		popPrefix();
		if (node.getElseBody() != null) {
			result += getPrefix() + "} else {\n";
			pushPrefix();
			result += this.ppCRSeparatedNode(((Block)node.getElseBody()).getStatement()) + "\n";
			popPrefix();
		}
		result += getPrefix() + "}";
		return result;
	}
	
	/**
	 * Enumeration are used by the compiler, but I don't know why?
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Enumeration)
	 */
	public Object visitEnumeration(Enumeration node) {
		if (typedef == true) {
			typedef = false;
			String result = "enumeration " + KMTHelper.getMangledIdentifier(node.getName()) + "\n";
			result += getPrefix() + "{\n";
			pushPrefix();
			alreadyPrefixed = false;
			result += ppCRSeparatedNode(node.getOwnedLiteral());
			popPrefix();
			result += getPrefix() + "}";
			typedef = true;
			return result;
		}
		else {
			String qname = NamedElementHelper.getMangledQualifiedName(node, NamedElementHelper.simplePointSeparator);
			String name = KMTHelper.getMangledIdentifier(node.getName());
			String result = ppTypeName(qname, name);
			return result;
		}
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.EnumerationLiteral)
	 */
	public Object visitEnumerationLiteral(EnumerationLiteral node) {
		return KMTHelper.getMangledIdentifier(node.getName()) + ";";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FunctionType)
	 */
	public Object visitFunctionType(FunctionType node) {
		return "< " + this.accept(node.getLeft()) + "->" + this.accept(node.getRight()) + " >";
	}
	
	/**
	 */
	public Object visitIntegerLiteral(IntegerLiteral node) {
		return "" + node.getValue();
	}
	
	/**
	 * @reqComp "comp_javaStaticCall"
	 */
	public Object visitJavaStaticCall(JavaStaticCall node) {
		String result = /*"extern " +*/ node.getJclass().replace("::", ".") + "." + KMTHelper.getMangledIdentifier(node.getJmethod()) + "(";
		result += ppComaSeparatedNodes(node.getParameters());
		result += ")";
		return result;
	}
	
	private boolean isACollectionMethod(LambdaExpression node) {
		if(node.eContainer()!=null 
				&& ((CallFeature) node.eContainer()).getStaticOperation()!=null
				&& ((CallFeature) node.eContainer()).getStaticOperation().eContainer()!=null
				&& ((CallFeature) node.eContainer()).getStaticOperation().eContainer() instanceof ClassDefinition
				) {
		String typeOfOp = ((ClassDefinition)((CallFeature) node.eContainer()).getStaticOperation().eContainer()).getName();
		String opName = ((CallFeature) node.eContainer()).getStaticOperation().getName();
		
			//String paramType = "";
			for(EObject eobj1 : node.eContainer().eContents()) {
				if(eobj1 instanceof CallFeature) {
					CallFeature cf = (CallFeature) eobj1;
					for(EObject eobj2 : cf.eContents()) {
						if(eobj2 instanceof Class) {
							Class aClass = (Class) eobj2;
							typeOfOp = aClass.getTypeDefinition().getName();
							//paramType = TypeHelper.getName(((TypeVariableBinding)aClass.getTypeDefinition()).getType());
						}
					}
				}
			}
			if(typeOfOp.equals("Collection") && (opName.equals("each") || opName.equals("select") || opName.equals("detect"))) {
				return true;
			}
			if(typeOfOp.equals("Set") && (opName.equals("each") || opName.equals("select") || opName.equals("detect"))) {
				return true;
			}
			if(typeOfOp.equals("OrderedSet") && (opName.equals("each") || opName.equals("select") || opName.equals("detect"))) {
				return true;
			}
			if(typeOfOp.equals("Sequence") && (opName.equals("each") || opName.equals("select") || opName.equals("detect"))) {
				return true;
			}
			if(typeOfOp.equals("Bag") && (opName.equals("each") || opName.equals("select") || opName.equals("detect"))) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * A lambda expression is printed differently according to its use.
	 * But for now we will only authorize it to be :
	 * - a CallFeature (a parameter)
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.LambdaExpression)
	 */
	public Object visitLambdaExpression(LambdaExpression node) {
		
		String result = "";	
		if(isACollectionMethod(node)) {
			
			String paramType = "";
			for(EObject eobj1 : node.eContainer().eContents()) {
				if(eobj1 instanceof CallFeature) {
					CallFeature cf = (CallFeature) eobj1;
					for(EObject eobj2 : cf.eContents()) {
						System.out.println("toto222222222");
						if(eobj2 instanceof Class) {
							Class aClass = (Class) eobj2;
							//typeOfOp = aClass.getTypeDefinition().getName();
							System.out.println("titi");
							if(((TypeVariableBinding)aClass.getTypeParamBinding().get(0)).getType() instanceof Type) {
								Type aParamType = (Type) ((TypeVariableBinding)aClass.getTypeParamBinding().get(0)).getType();
								if(aParamType instanceof PrimitiveType) {
									paramType = ((PrimitiveType) aParamType).getName();
									System.out.println("tata");
								}
								if(aParamType instanceof ParameterizedType) {
									paramType = ((ParameterizedType) aParamType).getTypeDefinition().getName();
									System.out.println("tutu");
								}
							}
						}
					}
				}
			}
			
			StaticMethod newStaticMethod = SimkFactory.eINSTANCE.createStaticMethod();
			newStaticMethod.setName(((CallFeature) node.eContainer()).getStaticOperation().getName());
			
			SMParameter newParameter = SimkFactory.eINSTANCE.createSMParameter();
			newParameter.setName(node.getParameters().get(0).getName());
			newParameter.setType(paramType);
			
			SMReturn newReturn = SimkFactory.eINSTANCE.createSMReturn();
			newReturn.setType(TypeHelper.getName(((CallFeature) node.eContainer()).getStaticType()));
			
			newStaticMethod.getSMParameters().add(newParameter);
			newStaticMethod.setSMReturn(newReturn);
			
			newStaticMethod.setId(Integer.toString(helperModel.getNextId()));
			newStaticMethod.setBody((String) this.accept(node.getBody()));
			
			//org.kermeta.simk.Class newClass = SimkFactory.eINSTANCE.createClass();
			//newClass.setName("");
			
			SMPackage newPackage = SimkFactory.eINSTANCE.createSMPackage();
			newPackage.setName(((NamedElement)current_modelOperation.eContainer().eContainer()).getName());
			
			//newClass.setPackage(newPackage);
			
			SMContext newContext = SimkFactory.eINSTANCE.createSMContext();
			//newContext.setClass(newClass);
			newContext.setSMPackage(newPackage);
			
			newStaticMethod.setParentMethod((EOperation) this.km2ecore.getKm2ecoremapping().get(current_modelOperation));
			newStaticMethod.getUsages().add(SMUsage.FUNCTION_TYPE);
			
			/*SimkMethodHelper aHM = new SimkMethodHelper(
					((CallFeature) node.eContainer()).getStaticOperation().getName(),
					node.getParameters().get(0).getName(),
					paramType,
					TypeHelper.getName(((CallFeature) node.eContainer()).getStaticType()),
					current_modelOperation,
					(String) this.accept(node.getBody()),
					((NamedElement)current_modelOperation.eContainer().eContainer()).getName(),
					NamedElementHelper.getQualifiedName((NamedElement) current_modelOperation.eContainer().eContainer()),
					Integer.toString(helperModel.getNextId())
							);*/
			
			if(!NamedElementHelper.getQualifiedName((NamedElement) current_modelOperation.eContainer().eContainer()).contains("kermeta")) {
				helperModel.getSMContexts().add(newContext);
				helperModel.getStaticMethods().add(newStaticMethod);
				newStaticMethod.setSMContext(newContext);
			}
		} else {
			result = "{";
			result += ppComaSeparatedNodes(node.getParameters());
			result += " | ";
			pushPrefix();
			result += this.accept(node.getBody());
			popPrefix();
			result += "}";
		}
		return result;
	}
	
	/**
	 */
	public Object visitLambdaParameter(LambdaParameter node) {
		String result = KMTHelper.getMangledIdentifier(node.getName());
		if (node.getType() != null) {
			result += " : " + this.accept(node.getType());
		}
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Loop)
	 * @reqComp "comp_loop"
	 */
	public Object visitLoop(Loop node) {
		String result = "" ; 
		result += this.accept(node.getInitialization()) + "\n";
		result += "while ( " + this.accept(node.getStopCondition()) + " ) {\n";
		//result += getPrefix() +"loop\n";
		alreadyPrefixed = false;
		pushPrefix();
		// Precise type of Loop is always "Block" (see also KMT2KMPrimitiveExpressionBuilder)
		// And block textual syntax is already represented by "loop..end"
		result += this.ppCRSeparatedNode(((Block)node.getBody()).getStatement());
		popPrefix();
		result += getPrefix() + "}";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation node) {
		setParent(node);
		
		if(node.eContainer() instanceof ClassDefinition) {
			current_modelOperation = node;
		}
		
		String result = "";//ppTags(node.getTag());
		
		/*if(!alreadyPrefixed) result += getPrefix();
		
		if (node.getSuperOperation() != null)
			result += "method ";
		else
			result += "operation ";
		
		result += KMTHelper.getMangledIdentifier(node.getName());
		if (node.getTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getTypeParameter());
			result += ">";
		}
		result += "(";
		result += ppComaSeparatedNodes(node.getOwnedParameter());
		result += ")";
		// Type of operation is allowed to be null..
		if(node.getType() != null) {
			result += " : " + ppTypeFromMultiplicityElement(node);
		}
		else {
			result += " : kermeta::standard::~Void" ;
		}
	
		if (node.getSuperOperation() != null) {
			ClassDefinition cDef = node.getSuperOperation().getOwningClass();
			if(! NamedElementHelper.getMangledQualifiedName(cDef, NamedElementHelper.simplePointSeparator).equals("kermeta::reflection::Object"))
				result += " from " + KMTHelper.getMangledIdentifier(NamedElementHelper.getMangledQualifiedName(node.getSuperOperation().getOwningClass(), NamedElementHelper.simplePointSeparator));
		}
		if (node.getRaisedException().size() > 0) {
			result += " raises " + ppComaSeparatedNodes(node.getRaisedException());
		}
		if (node.getPre().size() != 0 || node.getPost().size() != 0){
			result += "\n";
			alreadyPrefixed = false;
			pushPrefix();
			result += ppCRSeparatedNode(node.getPre());
			result += ppCRSeparatedNode(node.getPost());
			popPrefix();
			result += getPrefix() + "is\n";
		}
		else
			result += " is\n";
		
		pushPrefix();
		alreadyPrefixed = false;
		*/
		
		if (node.getBody() != null) {
			
			String resultType = "";
			if(node.getType()!=null) {
				boolean void_t = false;
				if(node.getType() instanceof VoidType) {
					void_t = true;
				}
				if(TypeHelper.getName(node.getType()).equals("String")) {
					void_t = false;
				}
				if(TypeHelper.getName(node.getType()).equals("Boolean")) {
					void_t = false;
				}
				if(TypeHelper.getName(node.getType()).equals("Integer")) {
					void_t = false;
				}
				if(void_t) {
					
				} else {
					Object resultTypeObj = TypeHelper.getName(node.getType());
					if(resultTypeObj!=null) {
						resultType = (String) resultTypeObj;
						if(resultType.equals("void")) {
							resultType = "";
						}
					}
				}
			}
			
			if(!resultType.equals("")) {
				result += resultType + "\nresult=null;\n";
			}
			
			result += this.accept(node.getBody());
			
			if(!resultType.equals("")) {
				result += "\nreturn result;";
			}
		}
		else if (node.isIsAbstract()) {
			//result += getPrefix() + "abstract\n";
		}
		if(result.equals("")) {
			result += "//TODO: implement operation " + node.getName() + "\n"; 
			result += "throw new kermeta.exceptions.NotImplementedException();";
		}
		/*popPrefix();*/

		return result;
	}
	
	/**
	 * 
	 * @param elem
	 * @return
	 */
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
		result += this.accept(elem.getType());
		if (elem.getLower() != 0 || elem.getUpper() != 1) {
			result += "[" + elem.getLower() + "..";
			result += (elem.getUpper()<0)?"*":""+elem.getUpper();
			result += "]";
		}
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
	 * FIXME CF maybe we should take into account the derived property
	 * @param node
	 * @param body_type
	 * @return
	 * @reqComp "2.15"
	 */
	protected String getEmptyDerivedPropertyBody(Property node, String body_type) {
		String result = "{\n";
		pushPrefix();
		result += getPrefix() + "//TODO: implement "+ body_type + " for derived property " + node.getName() + "\n"; 
		result += getPrefix() + "throw new NotImplementedException() \n";
		popPrefix();
		result += getPrefix() + "}";
		return result;
	}

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Raise)
	 */
	public Object visitRaise(Raise node) {
		return "throw " + this.accept(node.getExpression());
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.SelfExpression)
	 */
	public Object visitSelfExpression(SelfExpression node) {
		return "this";
	}

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.StringLiteral)
	 */
	public Object visitStringLiteral(StringLiteral node) {
		return "\"" + node.getValue().replace("\"", "\\\"") +"\"";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.TypeLiteral)
	 */
	public Object visitTypeLiteral(TypeLiteral node) {
		return this.accept(node.getTyperef());
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.TypeReference)
	 */
	public Object visitTypeReference(TypeReference node) {
	    return ppTypeFromMultiplicityElement(node);
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.ObjectTypeVariable)
	 */
	public Object visitObjectTypeVariable(ObjectTypeVariable node) {
		return KMTHelper.getMangledIdentifier(node.getName());
	}
	public Object visitModelTypeVariable(ModelTypeVariable node) {
		return KMTHelper.getMangledIdentifier(node.getName());
	}
	public Object visitVirtualType(VirtualType node) {
		String result = KMTHelper.getMangledIdentifier(((ModelTypeVariable) node.getModelType()).getName());
		result += "::";
		result += KMTHelper.getMangledIdentifier(node.getName());
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.VariableDecl)
	 */
	public Object visitVariableDecl(VariableDecl node) {
		setParent(node);
//		String result = "var " + KMTHelper.getMangledIdentifier(node.getIdentifier()) + " : " + this.accept(node.getType());
//		if (node.getInitialization() != null)
//			result += " init " + this.accept(node.getInitialization());
		
		String localType = (String) this.accept(node.getType());
		
		String result = localType + " " + KMTHelper.getMangledIdentifier(node.getIdentifier());
		
		// FIXME CF-Compiler
		if (node.getInitialization() != null) {
			if(((String) this.accept(node.getInitialization())).contains(".new()")) {
				result += getCreateFactory(localType);
			} else {
				result += " = " + this.accept(node.getInitialization());
			}
		}
		else {
			result += getCreateFactory(localType);
		}
		return result + ";";
	}
	
	/**
	 * Give the String corresponding to the CreateFactory  of a type
	 * @param localType
	 * @return
	 */
	private String getCreateFactory(String localType) {
		String text = "";
		
		if(localType.equals("String")) {
			text = " = \"\"";
			
		} else {
			String localType2 = localType.replace(".", "%");

			String[] name = localType2.split("%");
			
			String allPackages_label = localType.substring(0, localType.length()-name[name.length-1].length());
			
			if(name.length>=2) {
				text = " = " + allPackages_label + CodeGenUtil.capName(name[name.length-2]) +"Factory.eINSTANCE.create" + name[name.length-1] + "()";
			}
		}

		return text;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.VoidLiteral)
	 */
	public Object visitVoidLiteral(VoidLiteral node) {
		return "null";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.VoidType)
	 */
	public Object visitVoidType(VoidType node) {
		return "void";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.CallFeature)
	 */
	public Object visitCallFeature(CallFeature node) {
		
		//System.out.println("DEBUG-Compiler CallFeature:" + node.toString());
		
		/*
		setParent(node);
		String result = "";
		if (node.getTarget() != null) result += this.accept(node.getTarget());
		else result += "self";
		result += "." + KMTHelper.getMangledIdentifier(node.getName());
		// handle the special case where there is 1 parameter, and when This
		// parameter is a lambdaPostFix
		//	TODO : throw an exception if type is not a LambdaExpression
		if (node.getParameters().size()==1 && LambdaExpression.class.isInstance(node.getParameters().get(0)))
		{
		   result+= ppComaSeparatedNodes(node.getParameters());
		}
		// the classic case : a list of parameters
		else if (node.getParameters().size()> 0) {
			result += "(" + ppComaSeparatedNodes(node.getParameters()) + ")";
		}
		
		return result;
		*/
		
		setParent(node);
		String result = "";
		
		// FIXME Compiler Manage the case where node.getName().equals("new")
		String fName = node.getName();
		
		// Feature calls that correspond to primitive types operators have specific
		// serialization scheme. As an example, calling the feature "not" onto a boolean
		// is serialized as "not boolVariable" instead of "boolVariable.not"
		Expression tgt = node.getTarget();
		if(tgt != null) {
			
			if(fName == "not" && isBooleanTypeDef(tgt.getStaticType())) {
					result += "! (";
					result += this.accept(tgt);
					result += ")";
				}
			else if(fName == "and" && isBooleanTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " && ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "or" && isBooleanTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " || ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "plus" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " + ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "minus" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " - ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "mult" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " * ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "div" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " / ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "isGreater" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " > ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "isLower" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " < ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "isGreaterOrEqual" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " >= ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "isLowerOrEqual" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " <= ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "equals" && (isBooleanTypeDef(tgt.getStaticType()) || isNumericalTypeDef(tgt.getStaticType()))) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " == ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "isNotEqual" && (isBooleanTypeDef(tgt.getStaticType()) || isNumericalTypeDef(tgt.getStaticType()))) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " != ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else {
				// Other feature calls...
				result += this.accept(tgt);
				result += "." + KMTHelper.getMangledIdentifier(node.getName());
				
				// handle the special case where there is 1 parameter, and when This
				// parameter is a lambdaPostFix
				//	TODO : throw an exception if type is not a LambdaExpression
				if (node.getParameters().size()==1 && LambdaExpression.class.isInstance(node.getParameters().get(0))) {
				   result+= ppComaSeparatedNodes(node.getParameters());
				}
				// the classic case : a list of parameters
				else if (node.getParameters().size()> 0) {
					result += "(" + ppComaSeparatedNodes(node.getParameters()) + ")";
				} else {
					// We have never passed here?
					result += "();";
				}
			}
		}
		else {
			result += KMTHelper.getMangledIdentifier(node.getName());
			
			// handle the special case where there is 1 parameter, and when This
			// parameter is a lambdaPostFix
			//	TODO : throw an exception if type is not a LambdaExpression
			if (node.getParameters().size()==1 && LambdaExpression.class.isInstance(node.getParameters().get(0))) {
			   result+= ppComaSeparatedNodes(node.getParameters());
			}
			// the classic case : a list of parameters
			else if (node.getParameters().size()> 0) {
				result += "(" + ppComaSeparatedNodes(node.getParameters()) + ")";
			}
		}
		
		return result;
	}
	
	/** @see kermeta.visitor.KermetaVisitor#visit(kermeta.behavior.CallResult)
	 * @reqComp "comp_callResult"
	 */
	public Object visitCallResult(CallResult node) {
		String result = "";
		
/*		if( node.getStaticType() != null ) {
			result += accept(node.getStaticType()).toString();
		}
		*/
		result += "result";
		return result;
	}
	
	/** 
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitCallValue(fr.irisa.triskell.kermeta.language.behavior.CallValue)
	 */
	public Object visitCallValue(CallValue node) { return "value"; }

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.CallVariable)
	 */
	public Object visitCallVariable(CallVariable node) {
		
		//System.out.println("DEBUG-Compiler CallVariable:" + node.toString());
		
		String result = KMTHelper.getMangledIdentifier(node.getName());
		
		if(result.contains("stdio")) {
			result = "StdIO";
		}
		
		if (node.getParameters().size()> 0) {
			result += "(" + ppComaSeparatedNodes(node.getParameters()) + ")";
		}
		return result;
	}
	
    /**
     * Tag is used to store comments in the source code.
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.language.structure.Tag)
     */
    public Object visitTag(Tag node) {
        String result = "";
        // User can choose to add a "@kdoc" tag
        if (node.getName().equals(KermetaModelHelper.Tag.KERMETA_DOCUMENTATION) && !node.getValue().startsWith("/**"))
        {
            result = "/**" + node.getValue() + "*/";
        }
        // Or simple comment /** */ delimitor TODO also remove pretty "*" 
        else if (node.getValue().startsWith("/**"))
        {
            result = node.getValue();
        }
        else
        {
            result = "@"+node.getName()+" \""+node.getValue()+"\"";
        }
        return result;
    }
    
	protected String prefix = "";
	
	protected String getPrefix() {
		return prefix;
	}
	
	protected void pushPrefix() {
		prefix = prefix + prefixTab;
	}
	
	protected void popPrefix() {
		prefix = prefix.substring(prefixTab.length());
	}
	
	/**
	 * To see this is used
	 * @return Returns the imports.
	 */
	public ArrayList getImports() {
		return imports;
	}
	/**
	 * To see this is used
	 * @return Returns the imports.
	 */
	public ArrayList getUsings() {
		return usings;
	}

	
	/**
	 * Get a list of tag which name is <code>name</code>
	 * Later, we will think about the relevance of having not unique tags (depends on how we handle
	 * code documentation => extern system, or integrated?)
	 */
	public Tag[] getFTagsByName(EList ftagList, String name)
	{
	    Iterator it = ftagList.iterator();
	    Tag[] result_tagArray = new Tag[10];
	    int i = 0;
	    while (it.hasNext())
	    {
	        Tag tag = (Tag)it.next();
	        if (tag.getName().equals(name))
	        {
	            result_tagArray[i] = tag;
	            i++;
	        }
	    }
	    return result_tagArray;
	}
	
	/**
	 * Set the printing context. Printing kermeta programs changes if we are inside a classdefinition or not.
	 * In particular, this context boolean is used when printing Enumeration or PrimitiveType : 
	 * if they are defined as type of an attribute, it is printed as "String",
	 * otherwise, it is printed as "alias String : blablab")
	 * @param typedef The typedef to set.
	 */
	public void setTypedef(boolean typedef) {
		this.typedef = typedef;
	}
	
	/**
	 * Tests whether the Type t corresponds to a Kermeta numerical type, which can be encoded
	 * either as the Integer/Real PrimitiveType or the Integer/Real class.
	 * @param t
	 * @return
	 */
	protected boolean isNumericalTypeDef(Type t) {
		String tName = null;
		if(t instanceof Class) {
			tName = ((Class) t).getTypeDefinition().getName();
			return tName.equals("Integer") || tName.equals("Real");
		}
		else if(t instanceof PrimitiveType) {
			tName = ((PrimitiveType) t).getName();
			return tName.equals("Integer") || tName.equals("Real");
		}
		else
			return false;
	}
	
	/**
	 * Tests whether the Type t corresponds to the Kermeta Boolean type, which can be encoded
	 * either as the Boolean PrimitiveType or the Boolean class.
	 * @param t
	 * @return
	 */
	protected boolean isBooleanTypeDef(Type t) {
		if(t instanceof Class) {
			return ((Class) t).getTypeDefinition().getName().equals("Boolean");
		}
		else if(t instanceof PrimitiveType) {
			return ((PrimitiveType) t).getName().equals("Boolean");
		}
		else
			return false;
	}

	public SIMKModel getHelperModel() {
		return helperModel;
	}

	public void setHelperModel(SIMKModel helperModel) {
		this.helperModel = helperModel;
	}

}
