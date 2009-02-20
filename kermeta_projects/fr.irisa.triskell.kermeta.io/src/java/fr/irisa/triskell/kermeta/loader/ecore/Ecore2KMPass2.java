/* $Id: Ecore2KMPass2.java,v 1.35 2009-02-20 09:20:50 dvojtise Exp $
 * Project : Kermeta io
 * File : ECore2Kermeta.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 mai 2005
 * Author : Franck Fleurey
 */ 

package fr.irisa.triskell.kermeta.loader.ecore;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2ECoreConversionException;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

/**
 * 
 * Setting the types of parameters, properties, operations, supertypes.
 * 
 */
public class Ecore2KMPass2 extends Ecore2KMPass {

	/**
	 * Hashtable that is dedicated to encode links between a method and the set of
	 * methods that overload it (in subclasses) when the QuickFix option is activated.
	 */
	protected Hashtable<Operation, ArrayList<Operation>> opTable = new Hashtable<Operation, ArrayList<Operation>>();

	public Hashtable<Operation, ArrayList<Operation>> getOpTable() {
		return opTable;
	}
	
	public Ecore2KMPass2(KermetaUnit kermetaUnit, Ecore2KMDatas datas, boolean isQuickFixEnabled, IProgressMonitor monitor) {
		super(kermetaUnit, datas, isQuickFixEnabled, monitor);
	}
	

	@Override
	public Object visit(EClass node) {	
		/*
		 * 
		 * Setting supertypes.
		 * 
		 */
		currentClassDefinition = (ClassDefinition) datas.getTypeDefinition( node );
		for ( EClass superclass : node.getESuperTypes() )
			currentClassDefinition.getSuperType().add( createType(superclass, null, node) );
		
		/*
		 * 
		 * If there is no supertypes, let's add Object.
		 * 
		 */
		String ecoreQualifiedName = EcoreHelper.getQualifiedName(node);
		if ( ! ecoreQualifiedName.equals("kermeta::language::structure::Object")
				&& ! ecoreQualifiedName.equals("kermeta::language::structure::KMStructureVisitable")
				&& ! ecoreQualifiedName.equals("kermeta::language::behavior::KMExpressionVisitable")) {
		
			if ( node.getESuperTypes().isEmpty() ) {
				String qualifiedName = "kermeta::language::structure::Object";
				GenericTypeDefinition typeDefinition = (GenericTypeDefinition) kermetaUnit.getTypeDefinitionByQualifiedName(qualifiedName, monitor);
				Class supertype = StructureFactory.eINSTANCE.createClass();
				supertype.setTypeDefinition(typeDefinition);
				currentClassDefinition.getSuperType().add( supertype );
			}
		}
		
		context.pushContext();
		for ( TypeVariable tv : currentClassDefinition.getTypeParameter() )
			context.addTypeVar(tv);
		
		acceptList( node.getETypeParameters() );
		acceptList( node.getEAttributes() );
		acceptList( node.getEOperations() );
		acceptList( node.getEReferences() );
		
		context.popContext();
		
		return null;
	}
	
	@Override
	public Object visit(EAttribute node) {
		return constructTypeForAttribute(node);
	}
	
	@Override
	public Object visit(EOperation node) {
		currentOperation = datas.getOperation(node);
		// Set the type of the operation
		Type t = null;
		
		context.pushContext();
		for ( TypeVariable tv : currentOperation.getTypeParameter() )
			context.addTypeVar(tv);
		
		if (node.getEType() != null) {
			t = createType(node.getEType(), node.getEGenericType(), node);
			//t = createTypeForEClassifier(node.getEType(), node);
			currentOperation.setType(t);
		} else {
			t = StructureFactory.eINSTANCE.createVoidType();
			currentOperation.setType(t);				
		}
		/*
		 * 
		 * Setting the super operations
		 * 
		 */
		Operation superop = findSuperOperation(node);
		if (superop != null) 
			currentOperation.setSuperOperation(superop);
		if ( isQuickFixEnabled ) {
			// If QuickFix enabled:
			// Build a hashtable providing the list of "submethods" of each
			// method that is overloaded
			if(superop != null) {
				if( opTable.containsKey(superop) ) {
					ArrayList<Operation> ar = opTable.get(superop);
					ar.add( currentOperation );
					opTable.put(superop, ar);
				}
				else {
					ArrayList<Operation> ar = new ArrayList<Operation>();
					ar.add( currentOperation );
					opTable.put(superop, ar);
				}
			}
		}
		/*
		 * 
		 * Setting the type of parameters.
		 * 
		 */
		acceptList( node.getEParameters() );
		
		/*
		 * 
		 * Setting the type of type parameters.
		 * 
		 */
		acceptList( node.getETypeParameters() );
		

		context.popContext();
		return currentOperation;
	}
	
	@Override
	public Object visit(EParameter node) {
		Parameter param = KermetaModelHelper.Operation.getParameter(currentOperation, node.getName() );
		// Set its type
		//Type t = createTypeForEClassifier(node.getEType(), node);
		Type t = createType(node.getEType(), node.getEGenericType(), node);
		param.setType(t);
		
		EAnnotation eAnnot = node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEVARIABLE_BINDINGS);
		if(eAnnot != null) {
			buildTypeVariableBindings((fr.irisa.triskell.kermeta.language.structure.Class) t, eAnnot.getDetails(), getVisibleTypeVariables(node));
		}
		return param;
	}
	
	@Override
	public Object visit(EReference node) {
		/*
		 * 
		 * Setting the type.
		 * 
		 */
		Object o = constructTypeForAttribute(node);
		/*
		 * 
		 * Setting the opposite if there is one.
		 * 
		 */
		if ( node.getEOpposite() != null ) {
			Property p = datas.getProperty( EcoreHelper.getQualifiedName(node.getEOpposite()) );
			Property current = datas.getProperty( EcoreHelper.getQualifiedName(node) );
			current.setOpposite( p );
			p.setOpposite(current);
		}
		return o;
	}
	
	public Object visit(EDataType node) {
		if ( node.getName().equals(KM2Ecore.KERMETA_TYPES) )
			return null;
		
		PrimitiveType result = datas.getPrimitiveType(node);
		/*
		 * 
		 * For special datatypes like String, Integer we have taken them from the framework.
		 * Their types are already set.
		 * 
		 */
		if ( result.getInstanceType() != null ) {
			return null;
		}
		
		// Get the instance class name of node
		String type_name = ((EDataType)node).getInstanceClassName();
		
		if (node.getEAnnotation(KM2Ecore.ANNOTATION)!=null) {// IMPORTANT!
			String s = (String)node.getEAnnotation(KM2Ecore.ANNOTATION).getDetails().get(KM2Ecore.ANNOTATION_ALIAS_DETAILS);
			if ( s != null )
				type_name = s;
			else if (datas.isAType(type_name)) {
				type_name = datas.getTypeName(type_name);
			}
		}//			 primitive_types_mapping : { javatype : kermetatype }
		else if (datas.isAType(type_name)) {
			type_name = datas.getTypeName(type_name);
		} // Find in alias // EDataType visit : handle alias
		// Try to find in the current unit if the given type_name can be found
		TypeDefinition type = null;
		if (type_name == null || type_name.equals(""))
		{
			kermetaUnit.warning("Instance class seems to be unset for EDatatype '" + 
					EcoreHelper.getQualifiedName((EDataType)node) + "' : replaced by Object", null);
			type = kermetaUnit.getTypeDefinitionByQualifiedName("kermeta::standard::Object", monitor);
				
//				StdLibKermetaUnitHelper.get_ROOT_TYPE_ClassDefinition();// get kermeta::language::structure::Object 
		}
		else
		{
			type = kermetaUnit.getTypeDefinitionByName(type_name, monitor);
			// FIXME : standard library is not browsable anymore?
			//if (type == null) type = StdLibKermetaUnitHelper.getKermetaUnit().typeDefinitionLookup(type_name);
			// FIXME : If type is still null, replacing by the basic Object type of Kermeta. 
			// Not the best way to process. Idea: annotate Kermeta alias with an extern "instanceClassName"?
			/*if (type == null) {
				kermetaUnit.warning("cannot find instance class " + type_name + " for primitive type " + 
						EcoreHelper.getQualifiedName((EDataType)node) + " (replaced by Object)", null);
				//type = StdLibKermetaUnitHelper.get_ROOT_TYPE_ClassDefinition();// get kermeta::language::structure::Object 
			}*/
		}
		
		if ( type == null ) {
			kermetaUnit.warning("The type " + type_name + " is not handled by Kermeta. It has been mapped to Object");
			type = kermetaUnit.getTypeDefinitionByQualifiedName("kermeta::language::structure::Object", monitor);
			Type t = createInstanceTypeForTypeDefinition(type);
			result.setInstanceType(t);			
		} else {
			Type t = createInstanceTypeForTypeDefinition(type);
			result.setInstanceType(t);
		}
		return result;
	}
	
	/**
	 * annotation.getSource() => "kermeta" or "kermeta.<smthg>" if the ann. is intended to be owned by kermeta code
	 * annotation.getDetails() => hashtable, with { "body" : <body_content> } for body operations
	 * This visit method only handle the details of EAnnotations that could be shared by any
	 */
	public Object visit(EAnnotation node) {	
		String result = "";
		// node.getSource() == "kermeta"
		if(node.getSource().equals(KM2Ecore.ANNOTATION)) {
			for (Object next :  node.getDetails().keySet()) {
				String crtKey = (String) next;
				result = (String)node.getDetails().get(crtKey);
				Tag tag = StructureFactory.eINSTANCE.createTag();
				tag.setName(crtKey);
				tag.setValue(result);
				fr.irisa.triskell.kermeta.language.structure.Object o = getObjectForEModelElement(node.getEModelElement()); 
				if (o!=null) {
					o.getOwnedTags().add(tag); // the tag is owned by this object
					o.getTag().add(tag); // compatibility with EMOF, 
				}
			}
		}
		// node.getSource() == "kermeta.req"
		/*else if(node.getSource().equals(KM2Ecore.ANNOTATION_REQUIRE)) {
			for (Object next :  node.getDetails().keySet()) {
				String uri = (String) next;
				KermetaUnit requiredUnit = null; 
				requiredUnit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
				requiredUnit.load();
				unit.importedUnits.add( requiredUnit );
			}
		}*/
		return result;
	}

	
	public String getURI(ENamedElement e){
		if (e.eResource() != null) return e.eResource().getURI().toFileString();		
		if (e.eContainer() instanceof ENamedElement) 
			return getURI((ENamedElement)e.eContainer()) + "/" + e.getName();
		else return "";
	}

	private Property constructTypeForAttribute(EStructuralFeature node) {
		currentProperty = (Property) datas.getProperty(EcoreHelper.getQualifiedName(node));
		// Set the type of this property
		Type t = null;
		if ( node.getEType() == null ) {
			String message = "Ecore Loader : the type of structural feature " + EcoreHelper.getQualifiedName(node) + " is null.";
			kermetaUnit.error(message, node);
		} else {
			t = createType(node.getEType(), node.getEGenericType(), node);
			/*if ( node.getUpperBound() != 1 ) {
				String collectionQualifiedName = "";
				if ( node.isOrdered() )
					if ( node.isUnique() )
						collectionQualifiedName = "kermeta::standard::OrderedSet";
					else
						collectionQualifiedName = "kermeta::standard::Sequence";
				else
					if ( node.isUnique() )
						collectionQualifiedName = "kermeta::standard::Set";
					else
						collectionQualifiedName = "kermeta::standard::Bag";
				ClassDefinition typeDefinition = (ClassDefinition) kermetaUnit.getTypeDefinitionByQualifiedName( collectionQualifiedName );
				Class c = StructureFactory.eINSTANCE.createClass();
				c.setTypeDefinition( typeDefinition );
				TypeVariableBinding tvb = StructureFactory.eINSTANCE.createTypeVariableBinding();
				tvb.setVariable( typeDefinition.getTypeParameter().get(0) );
				tvb.setType( t );
				c.getTypeParamBinding().add( tvb );
				t = c;
			}*/
			//t = createTypeForEClassifier(node.getEType(), node);
			currentProperty.setType(t);
			t = createType(node.getEType(), node.getEGenericType(), node);
		}
		
		EAnnotation eAnnot = node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEVARIABLE_BINDINGS);
		if(eAnnot != null) {
			buildTypeVariableBindings((fr.irisa.triskell.kermeta.language.structure.Class) t, eAnnot.getDetails(), getVisibleTypeVariables(node));
		}
		return currentProperty;
	}
	
	/**
	 * This method builds the type variable bindings structure of the provided class from
	 * the map of the class type variable bindings and the list of visible type variables. 
	 * @param cl    - targeted class
	 * @param map   - map containing the list of type variable bindings of the class
	 * @param tVars - list of visible type variables
	 */
	protected void buildTypeVariableBindings(
			fr.irisa.triskell.kermeta.language.structure.Class cl,
			EMap<String,String> map,
			ArrayList<TypeVariable> tVars) {

		TypeVariableBinding tvBinding = null;
		int i = 0;
		for(Object next : map) {
			EStringToStringMapEntryImpl entry = (EStringToStringMapEntryImpl) next;
			String qName = entry.getTypedValue();
			
			tvBinding = StructureFactory.eINSTANCE.createTypeVariableBinding();
			
			// Set binding variable			
			TypeVariable tVar = (TypeVariable) cl.getTypeDefinition().getTypeParameter().get(i);
			tvBinding.setVariable(tVar);
			
			// Set binding type
			tvBinding.setType( getTypeHierarchyFromQualifiedName(qName, tVars) );
			
			// Add binding to bindings list
			cl.getTypeParamBinding().add(tvBinding);
			i++;
		}
	}

	/**
	 * Search if a super operation of the given operation exists in the super classes of the operation owning  class
	 * @param node
	 * @return false if a super operation was not found, true otherwise 
	 */
	protected Operation findSuperOperation(EOperation node)
	{
		Operation superop = null; EOperation eoperation = null;
		EAnnotation ann = node.getEAnnotation(KM2Ecore.ANNOTATION);
		if (ann != null && ann.getDetails().containsKey(KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS))
		{ 
			// Is there an annotation for SuperOperation? "superOperation -> apackage::AClass"
			String str_result = (String)ann.getDetails().get(KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS);
			// Find the class definition owning this operation
			ClassDefinition cdef = (ClassDefinition) kermetaUnit.getTypeDefinitionByName(str_result, monitor);
			// We never know...
			if (cdef == null)
			{
				throw new KM2ECoreConversionException(
						"ECore2KM : ClassDefinition '" + str_result + "' not found during parsing of " + 
						KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS + " EAnnotation of '" +
						currentOperation.getName() + "' operation");	
			}
			else
			{
				superop = (Operation)KermetaModelHelper.ClassDefinition.getOperationByName(cdef, currentOperation.getName()); 
				currentOperation.setSuperOperation(superop);
			}
		}
		if (superop == null)
		{
			// If not provided, then find a default one in the inherited classes
			EClass owningclass = node.getEContainingClass();
			eoperation = findOperationInSuperTypes(owningclass.getESuperTypes(), node);
			if (eoperation != null)
				superop = datas.getOperation(eoperation);
		}
		return superop;
	}
	
	/**
	 * Recursive method that searches the most appropriated super operation, by parsing the super
	 * types "increasingly" (if inherited operation is not found in the super types, search in the super
	 * types of the super types :p)
	 * @param supertypes
	 * @param node
	 * @return
	 */
	protected EOperation findOperationInSuperTypes(List<EClass> supertypes, EOperation node)
	{
		EOperation result = null;
		Iterator<EClass> it = supertypes.iterator();
		while (it.hasNext() && result == null)
		{
			EClass next = it.next();
			// Get all the operations, find the one that has the same signature as the given operation
			EList<EOperation> eoperations = next.getEOperations();
			Iterator<EOperation> itop = eoperations.iterator(); 
			while (itop.hasNext() && result == null)
			{
				EOperation op = itop.next();
				if (op.getName().equals(node.getName()) && op != node && node.getEContainingClass()!=op.getEContainingClass())
					result = op;
			}
		}
		if (result == null)
		{
			for (Object type : supertypes) {
				List<EClass> next = ((EClass)type).getESuperTypes();
				result =  findOperationInSuperTypes(next, node);
			}
		}
		return result;
	}

	/** Create a type according to the current context
	 * (do not forget to push/pop the type variable in order to make it work correctly
	 * @param classfier
	 * @param genericType
	 * @param node
	 * @return
	 */
	private Type createType(EClassifier classfier, EGenericType genericType, ENamedElement node) {
		Type type = null;
		type = createTypeForEClassifier( classfier, node );
		
		/*
		 * 
		 * If the type is EJavaObject, it may refer to a type variable.
		 * Let's see that.
		 * 
		 */
		if ( type instanceof PrimitiveType ) {
			PrimitiveType primitiveType = (PrimitiveType) type;
			if ( (genericType != null) 
					&& NamedElementHelper.getQualifiedName(primitiveType).equals("ecore::EJavaObject") 
					&& genericType.getETypeParameter() != null ) {
				/*
				 * 
				 * Let's see the type variables of the current operation.
				 * 
				 */
				type = KermetaModelHelper.Operation.getTypeVariable(currentOperation, genericType.getETypeParameter().getName());
				/*
				 * 
				 * If no type variable found, Let's have a look into the class definition.
				 * 
				 */
				if ( type == null )	
					type = ClassDefinitionHelper.getTypeVariable(currentClassDefinition, genericType.getETypeParameter().getName() );
				
			}
				
		} else if ( type instanceof Class && (genericType != null) ) {
			Class c = (Class) type;
			for ( int i=0; i<genericType.getETypeArguments().size(); i++ ) {
				EGenericType gt = genericType.getETypeArguments().get(i);
				Type kermetaTypeParameter = null;
				if ( gt.getEClassifier() != null )
					kermetaTypeParameter = createType(gt.getEClassifier(), null, null);
				else if ( gt.getETypeParameter() != null ) {
					kermetaTypeParameter = context.typeVariableLookup(gt.getETypeParameter().getName()); 
				} else if ( gt.getERawType() != null ) {
					// last chance : check the raw type for a data type if this is not an EJavaObject
					if ( ! gt.getERawType().getName().equals("EJavaObject" ))
						kermetaTypeParameter = createType(gt.getERawType(), null, null);
				}
				if ( kermetaTypeParameter != null ) {
					TypeVariableBinding tvb = c.getTypeParamBinding().get(i);
					tvb.setType( kermetaTypeParameter );
				}
			}
		}
		return type;
	}

}
