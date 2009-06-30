/*$Id: Ecore2KMPass.java,v 1.13 2008-04-28 11:50:12 ftanguy Exp $
* Project : io
* File : 	Ecore2KMPass.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.loader.ecore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2ECoreConversionException;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;

public class Ecore2KMPass extends EcoreVisitor {

	protected KermetaUnit kermetaUnit = null;
	
	protected ClassDefinition currentClassDefinition = null;
	
	protected PrimitiveType currentPrimitiveType = null;
	
	protected Enumeration currentEnumeration = null;
	
	protected EStructuralFeature currentStructuralFeature = null;
	
	protected Property currentProperty = null;
	
	protected Operation currentOperation = null;
	
	protected Ecore2KMDatas datas = null;
	
	protected IProgressMonitor monitor;
	
	protected LoadingContext context = new LoadingContext();
	
	public Ecore2KMPass(KermetaUnit kermetaUnit, Ecore2KMDatas datas, boolean isQuickFixEnabled, IProgressMonitor monitor) {
		this.kermetaUnit = kermetaUnit;
		this.datas = datas;
		this.isQuickFixEnabled = isQuickFixEnabled;
		this.monitor = monitor;
	}

	protected boolean isQuickFixEnabled = false;
	
	
	/**
	 * Hashtable used to manage the invariants annotations that are encoded in Ecore as annotations
	 * that refer the annotation containing the invariant.
	 * The structure enables to map the visited "invariants annotations" EAnnotations to the allocated
	 * Tag elements.
	 */
	public Hashtable<EAnnotation,fr.irisa.triskell.kermeta.language.structure.Object> nestedAnnotMap = new Hashtable<EAnnotation,fr.irisa.triskell.kermeta.language.structure.Object>();

	
	/**
	 * Visit a TypeParameter ('kermeta.typeParameter') EAnnotation.
	 * Such EAnnotation is supposed to be attached to either an EClass or an EOperation.
	 * @param node
	 * @return
	 */
	public Object visitTypeParameterAnnotation(EAnnotation node) {
		List<TypeVariable> params = new ArrayList<TypeVariable>();

		for (Object next :  node.getDetails().keySet()) {
			String name = (String)next;
			TypeVariable tv = StructureFactory.eINSTANCE.createObjectTypeVariable(); 
			tv.setName(name);
			// detail can be " A : Anothertype" -> means that A must inherit Anothertype
			String detail = (String)node.getDetails().get(name); 
			if (detail.indexOf(":")>0) {
				detail = detail.replaceAll(" ", ""); // strip spaces
				String str_cdef = detail.substring(detail.indexOf(":")+1);
				ClassDefinition cdef = (ClassDefinition) kermetaUnit.getTypeDefinitionByQualifiedName(str_cdef, monitor);
				fr.irisa.triskell.kermeta.language.structure.Class type = 
					StructureFactory.eINSTANCE.createClass();
		        type.setTypeDefinition((ClassDefinition)cdef);
				tv.setSupertype(type);
			}
			params.add(tv);
		} 

		// for current_class - add the parameter to the class
		if(node.getEModelElement() instanceof EClass) {
			currentClassDefinition.getTypeParameter().addAll(params);
		}
		// for current_op
		else {
			currentOperation.getTypeParameter().addAll(params);
		}
		return null;
	}
	
	
	

	// to differenciate the owner of a "KermetaTypeParameter" annotation -> either an EClass or an EOperation
	// since the info. is not contained in this annotation
	public boolean isClassTypeOwner = true;
	public boolean isEcoreType      = false;
	
	protected HashMap <ClassDefinition, Class> classes = new HashMap <ClassDefinition, Class> ();
	
	
	
	/** Create a type for given type definition */
	protected Type createInstanceTypeForTypeDefinition(TypeDefinition type) {
		Type iType = null;
		// Translation : if type is a DataType or an Enumeration (those
		// types implement both Type and TypeDefinition
        if (type instanceof Type) { iType = (Type)type; }
        else if (type instanceof ClassDefinition)
        { 
        	ClassDefinition cd = (ClassDefinition)type;
        	fr.irisa.triskell.kermeta.language.structure.Class fc = classes.get(cd);
        	if (fc == null) {
        		fc = StructureFactory.eINSTANCE.createClass();
        		fc.setTypeDefinition(cd);
        		classes.put(cd, fc);
        	}
        	iType = fc;
        }
        else
        {	
        	throw new Error("INTERNAL ERROR : type should be a ClassDefinition, not a " + type.getClass().getName());
        }
    	
        return iType;
	}
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////
	// TYPE VARIABLE BINDINGS specific methods:
	//   - analyseQualifiedName
	//   - getTypeFromName
	//   - getTypeVariableByName
	//   - getTypeHierarchyFromQualifiedName
	///////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * This method analyses the qualified name in order to identify both the Type represented
	 * by the qualified name and its eventual list of type parameters (encoded as qualified
	 * names).
	 * @param qName  - qualified name to analyse
	 * @param tVars  - list of visible type variables
	 * @param params - identified list of type parameters (should be empty at method call)
	 * @return       - type corresponding to the provided qualified name (null if not found)
	 */
	protected Type analyseQualifiedName(
			String qName,
			ArrayList<TypeVariable> tVars,
			ArrayList<String> params) {
		// Init result type
		Type result = null;
		
		/*
		 * 
		 * Handling case like : kermeta::standard::Set<alias Object : kermeta::language::structure::Object;>
		 * Something bad in the pretty printing of the binded type.
		 */
		qName = qName.replaceFirst("alias .+ : ", "");
		qName = qName.replace(";", "");
		
		// First character of qualified name is '<'
		// => Qualified name represents a FunctionType
		if(qName.charAt(0) == '<') {
			result = StructureFactory.eINSTANCE.createFunctionType();
			
			String signature = qName.substring(1, qName.length()-2).trim();
			
			int pdtTypes = 0;
			int parTypes = 0;
			boolean leftIsPdt = signature.charAt(0) == '[';
			boolean parsingMainArrow = false;
			boolean parsingArrow = false;
			boolean mainArrowParsed = false;
			StringBuffer crtName = new StringBuffer();
			for(int i=0; i<signature.length(); i++) {
				char c = signature.charAt(i);
				
				if(c == ',') {
					if(mainArrowParsed) {
						if(pdtTypes == 0 && parTypes == 0) {
							params.add(crtName.toString().trim());
							crtName = new StringBuffer();
						}
						else {
							crtName.append(c);
						}
					}
					else {
						if(leftIsPdt) {
							if(pdtTypes == 1 && parTypes == 0) {
								params.add(crtName.toString().trim());
								crtName = new StringBuffer();
							}
							else {
								crtName.append(c);
							}
						}
						else {
							if(pdtTypes == 0 && parTypes == 0) {
								params.add(crtName.toString().trim());
								crtName = new StringBuffer();
							}
							else {
								crtName.append(c);
							}
						}
					}
				}
				else if(c == '[') {
					pdtTypes++;
					if(i > 0) crtName.append(c);
				}
				else if(c == ']') {
					pdtTypes--;
					if(mainArrowParsed || pdtTypes > 0) crtName.append(c);
				}
				else if(c == '<') {
					parTypes++;
					crtName.append(c);
				}
				else if(c == '>') {
					if(parsingMainArrow) {
						parsingMainArrow = false;
						mainArrowParsed = true;
					}
					else if(parsingArrow) {
						parsingArrow = false;
						crtName.append(c);
					}
					else {
						parTypes--;
						crtName.append(c);
					}
				}
				else if(c == '-') {
					if(pdtTypes == 0 && parTypes == 0) {
						parsingMainArrow = true;
						params.add(crtName.toString().trim());
						crtName = new StringBuffer();
					}
					else {
						parsingArrow = true;
						crtName.append(c);
					}
				}
				else {
					crtName.append(c);
				}
			}
			// Add last recognized type to the list
			params.add(crtName.toString().trim());
		}

		// String "::" only appears if the qualified name contains any package name
		// => Qualified name includes some packages names
		else if(qName.indexOf("::") != -1) {
			String packName = null;
			String typeName = null;
			
			// String "<" only appears if the type has some type parameters
			// Identified type has no type parameters
			if(qName.indexOf("<") == -1) {
				packName = qName.substring(0, qName.lastIndexOf("::"));
				typeName = qName.substring(qName.lastIndexOf("::") + 2);
			}
			// Qualified name includes some type parameters
			else {
				// 'shortQName' corresponds to packages and type name, without any type parameter
				String shortQName = qName.substring(0, qName.indexOf("<"));
				packName = shortQName.substring(0, shortQName.lastIndexOf("::"));
				typeName = shortQName.substring(shortQName.lastIndexOf("::") + 2);
				
				// Type parameters analysis:
				// 'paramsStr' corresponds to the type parameters substring
				String paramsStr = qName.substring(qName.indexOf("<")+1, qName.lastIndexOf(">"));
				StringBuffer crtName = new StringBuffer();
				// Counter for currently opened type parameters lists
				int n = 0;
				for(int i=0; i<paramsStr.length(); i++) {
					char c = paramsStr.charAt(i);
					if(c == ',') {
						if(n == 0) {
							params.add(crtName.toString().trim());
							crtName = new StringBuffer();
						}
						else {
							crtName.append(c);
						}
					}
					else if(c == '<') {
						n++;
						crtName.append(c);
					}
					else if(c == '>') {
						n--;
						crtName.append(c);
					}
					else {
						crtName.append(c);
					}
				}
				// Add last recognized type to the list
				params.add(crtName.toString().trim());
			}
			
			if(packName.length() == 0) {
				result = getTypeVariableByName(typeName.toString(), tVars);
			}
			else {
				List <Package> packages = kermetaUnit.getPackages(packName.toString());
				Iterator <Package> iterator = packages.iterator();
				while ( iterator.hasNext() && (result == null) )
					result = getTypeFromName(iterator.next(), typeName.toString());
			}
		}
		
		// Qualified name includes no package name
		// Type must be a TypeVariable, and cannot have any type parameter
		else {
			result = getTypeVariableByName(qName, tVars);
		}
		
		return result;
	}
	
	
	/**
	 * This method returns a type from a given package and a type name.
	 * In case the type corresponds to a ClassDefinition, the method allocates and
	 * returns a new Class that points to this ClassDefinition.
	 * @param pack  - package in which the type is searched
	 * @param tName - name of the searched type
	 * @return      - found type (can be either a Class or a PrimitiveType)
	 */
	protected Type getTypeFromName(Package pack, String tName) {
		Type result = null;
		
		// Search for typeDef from name in pack
		boolean found = false;
		TypeDefinition tDef = null;
		Iterator<TypeDefinition> it = pack.getOwnedTypeDefinition().iterator();
		while(it.hasNext() && !found) {
			tDef = it.next();
			if(tDef.getName().equals(tName)) found = true;
		}
		if(! found) return null;
		
		// Found typeDef is a ClassDefinition: returned value is a newly allocated class
		// that points to this ClassDefinition
		if(tDef instanceof GenericTypeDefinition) {
			fr.irisa.triskell.kermeta.language.structure.Class newClass =
				StructureFactory.eINSTANCE.createClass();
			newClass.setTypeDefinition((GenericTypeDefinition) tDef);
			result = newClass;
		}
		// Found TypeDef is a PrimitiveType
		else if(tDef instanceof PrimitiveType) {
			result = (PrimitiveType) tDef;
		}
		
		return result;
	}
	
	
	
	/**
	 * Get the kermeta type corresponding to this EType.
	 * 
	 * This method is called from Ecore2KMPass2 and Ecore2KMPass3 that both refer to Ecore2Pass1.
	 * It is defined here for factorization purposes.
	 * 
	 * @param etype the EType to be transformed
	 * @param node  is only used to get the node for which this class was called
	 * @return
	 */
	protected Type createTypeForEClassifier(EClassifier etype, ENamedElement node) {
		Type result = null;
		TypeDefinition def = null;
		
		if (etype == null) { 
			//def = StdLibKermetaUnitHelper.getKermetaUnit().typeDefinitionLookup("kermeta::standard::Void");
			def = kermetaUnit.getTypeDefinitionByQualifiedName("kermeta::standard::Void", monitor);
		}
		
		else if ( etype.getName() == null ) {
			int index = etype.toString().lastIndexOf(":");
			String[] splits = etype.toString().substring(index+2).split("#");
			
			String uriFragment = splits[1].replace(")", "");
						
			Resource resource = null;
			if ( splits[0].equals("") )
				resource = node.eResource();
			else {
				index = node.eResource().getURI().toString().lastIndexOf("/");
				String stringURI = node.eResource().getURI().toString().substring(0, index+1) + splits[0];
				URI uri = URI.createURI( stringURI );
				ResourceSet resourceSet = node.eResource().getResourceSet();
				resource = resourceSet.getResource(uri, true);
			}
			etype = (EClassifier) resource.getEObject( uriFragment );

		}
		// Special case of the "KermetaTypeAlias" datatype that aims to represent, in the Ecore file,
		// type of elements that are typed by a type variable/ function type:
		if(etype.getName().equals(KM2Ecore.KERMETA_TYPES)) {
			// Compute list of visible type variables (depends on node type)
			ArrayList<TypeVariable> tVars = getVisibleTypeVariables(node);

			// Type corresponds to a TypeVariable
			if(node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEVARIABLE) != null) {
				// Get the name of the type variable from node annotation
				EAnnotation eAnnot = node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEVARIABLE);
				String tVarName = ((EStringToStringMapEntryImpl) eAnnot.getDetails().get(0)).getTypedKey();

				TypeVariable tVar = getTypeVariableByName(tVarName, tVars);
				
				// No matching type variable found: raise an exception
				if(tVar == null) {
					String node_str = null;
					if(node instanceof EStructuralFeature) {
						node_str = "property";
					}
					else if(node instanceof EOperation) {
						node_str = "operation";
					}
					else if(node instanceof EParameter) {
						node_str = "parameter";
					}

					throw new KM2ECoreConversionException(
							"Internal error of Ecore2KM conversion: no TypeVariable found for "
							+ node_str + " '" + node.getName() + "'.");
				}
				else {
					return tVar;
				}
			}
			// Type corresponds to a FunctionType
			else if(node.getEAnnotation(KM2Ecore.ANNOTATION_FUNCTIONTYPE) != null) {
				// Get FunctionType annotation
				EAnnotation eAnnot = node.getEAnnotation(KM2Ecore.ANNOTATION_FUNCTIONTYPE);
				EMap<String, String> map = eAnnot.getDetails();
				
				// Allocate a new FunctionType model element
				FunctionType fctType = StructureFactory.eINSTANCE.createFunctionType();
				
				// Set left part of function type (ie function parameters)
				// FunctionType has a signe parameter => left is a 'Type'
				String l_qName = null;
				if(map.size() == 2) {
					l_qName = ((EStringToStringMapEntryImpl) map.get(0)).getTypedValue();
					fctType.setLeft( getTypeHierarchyFromQualifiedName(l_qName, tVars) );
				}
				// FunctionType has several parameters => left is a ProductType
				else {
					// Create a new  ProductType element
					ProductType pdtType = StructureFactory.eINSTANCE.createProductType();
					// Set left part to this new ProductType
					fctType.setLeft(pdtType);

					// Iterate over function type parameters
					for(int i=0; i<map.size()-1; i++) {
						l_qName = ((EStringToStringMapEntryImpl) map.get(i)).getTypedValue();
						pdtType.getType().add( getTypeHierarchyFromQualifiedName(l_qName, tVars) );
					}
				}
				
				// Set right part of function type (function result)
				String r_qName = ((EStringToStringMapEntryImpl) map.get(map.size()-1)).getTypedValue();
				fctType.setRight( getTypeHierarchyFromQualifiedName(r_qName, tVars) );
				
				return fctType;
			}
		}
		else {
			def = kermetaUnit.getTypeDefinitionByQualifiedName(EcoreHelper.getQualifiedName(etype), monitor);
		}

		if (def == null) {
			if ( etype instanceof EEnum ) {
				EEnum enumeration = (EEnum) etype;
				def = kermetaUnit.getTypeDefinitionByQualifiedName(EcoreHelper.getQualifiedName(enumeration), monitor);
			} else if ( etype instanceof EDataType ) {
				EDataType datatype = (EDataType) etype;
				String kermetaQualifiedName = Ecore2KM.primitive_types_mapping.get( datatype.getInstanceClassName() );
				if ( kermetaQualifiedName != null )
					def = kermetaUnit.getTypeDefinitionByQualifiedName( kermetaQualifiedName, monitor );
			}
			if ( def == null )
				kermetaUnit.error("Internal error of Ecore2KM conversion: type '" + EcoreHelper.getQualifiedName(etype) + "' not found.");
			//throw new KM2ECoreConversionException("Internal error of Ecore2KM conversion: type '" + EcoreHelper.getQualifiedName(etype) + "' not found." );
		}
		// It can be a Type if the element is a EEnum (inherits datatype) or a EDatatype (inherits Type and TypeDefinition)
		if (def instanceof Type) {
			result = (Type)def;
		}
		else {
			// Otherwise it is always a ClassDefinition
			ClassDefinition cd = (ClassDefinition)def;
			fr.irisa.triskell.kermeta.language.structure.Class fc = StructureFactory.eINSTANCE.createClass();
			fc.setTypeDefinition(cd);
			result = fc;
			for ( TypeVariable tv : cd.getTypeParameter() ) {
				TypeVariableBinding tvb = StructureFactory.eINSTANCE.createTypeVariableBinding();
				tvb.setType( tv );
				tvb.setVariable( tv );
				fc.getTypeParamBinding().add( tvb );
			}
		}
		// Type should never be null
		if (result == null) {
			throw new Error("Internal error of ecore2kermeta transfo: type " +
					"of '" + node.getName() + node.eClass().getName() + ":" + etype.getName() + "' not found " +
							"in Kermeta side");
		}
		return result;
	}
	
	/**
	 * This method searches a type variable from its name in the provided list of type
	 * variables.
	 * @param tvName - name of searched type variable
	 * @param tVars  - list of visible type variables
	 * @return       - found type variable (null if not found)
	 */
	protected TypeVariable getTypeVariableByName(String tvName, ArrayList<TypeVariable> tVars) {
		TypeVariable tv = null;
		Iterator<TypeVariable> it = tVars.iterator();
		while(it.hasNext()) {
			tv = it.next();
			if(tv.getName().equals(tvName)) return tv;
		}
		return null;
	}
	


	/**
	 * This method computes the list of type variables that are visible for the provided
	 * model element (EStructuralFeature/EParameter/EOperation/EClass).
	 * @param node - any model element from which type variables can be visible
	 * @return     - list of visible type variables
	 */
	public ArrayList<TypeVariable> getVisibleTypeVariables(ENamedElement node) {
		// Build list of visible type variables according to the type of node:
		// EStructuralFeature, EOperation or EParameter
		ArrayList<TypeVariable> tVars = new ArrayList<TypeVariable>();

		// For an EStructuralFeature, visible TypeVariables are those declared by its
		// containing class
		if(node instanceof EStructuralFeature) {
			EClass eCls = (EClass) node.eContainer();
			ClassDefinition cDef = (ClassDefinition) datas.getTypeDefinition(eCls);
			tVars.addAll(cDef.getTypeParameter());
		}
		// For an EOperation, visible TypeVariables are those declared: 1) by the operation
		// itself, 2) by the containing class (order is important)
		else if(node instanceof EOperation) {
			Operation op = datas.getOperation( (EOperation) node );
			tVars.addAll(op.getTypeParameter());
			
			EClass eCls = (EClass) node.eContainer();
			ClassDefinition cDef = (ClassDefinition) datas.getTypeDefinition( eCls );
			tVars.addAll(cDef.getTypeParameter());
		}
		// For an EParameter, visible TypeVariables are those declared: 1) by the containing
		// operation, 2) by the containing class (order is important)
		else if(node instanceof EParameter) {
			EOperation eOp = (EOperation) node.eContainer();
			Operation op = datas.getOperation(eOp);
			tVars.addAll(op.getTypeParameter());
			
			EClass eCls = (EClass) node.eContainer().eContainer();
			ClassDefinition cDef = (ClassDefinition) datas.getTypeDefinition(eCls);
			tVars.addAll(cDef.getTypeParameter());
		}
		// For an EClass, visible TypeVariables are those declared by the class itself
		else if(node instanceof EClass) {
			ClassDefinition cDef = (ClassDefinition) datas.getTypeDefinition( (EClass) node);
			tVars.addAll(cDef.getTypeParameter());
		}
		
		return tVars;
	}
	
	/**
	 * This method returns the type hierarchy that corresponds to the provided qualified name.
	 * In case the main type has type variable bindings, the method recursively runs to resolve
	 * the type and type variable of these bindings.
	 * @param qName - qualified name of the type to return
	 * @param tVars - list of visible type variables
	 * @return      - type element corresponding to the provided qualified name
	 */
	protected Type getTypeHierarchyFromQualifiedName(String qName, ArrayList<TypeVariable> tVars) {
		Type result = null;
		
		qName = qName.replaceAll("alias Object : ", "");
		qName = qName.replaceAll(";", "");
		
		// Init list used to contain type parameters of identified types
		ArrayList<String> params = new ArrayList<String>();
		result = analyseQualifiedName(qName, tVars, params);
		
		// Returned type is a ParameterizedType:
		// Set type variable bindings of the ParameterizdType
		if(result instanceof ParameterizedType) {
			ParameterizedType paraType = (ParameterizedType) result;
			TypeVariableBinding tvBinding = null;
			int i = 0;
			for(Object next : params) {
				String tVarName = (String) next;
				tvBinding = StructureFactory.eINSTANCE.createTypeVariableBinding();
			
				// Set binding variable
				tvBinding.setVariable( (TypeVariable) paraType.getTypeDefinition().getTypeParameter().get(i) );
			
				// Set binding type
				tvBinding.setType(getTypeHierarchyFromQualifiedName(tVarName, tVars));
			
				// Add binding to bindings list
				paraType.getTypeParamBinding().add(tvBinding);
				i++;
			}
		}
		// Returned type is a FunctionType:
		// Set parameters (left and right properties) of the FunctionType
		else if(result instanceof FunctionType) {
			FunctionType fctType = (FunctionType) result;
			
			// Set left part of function type (ie function parameters)
			// FunctionType has a signe parameter => left is a 'Type'
			String l_qName = null;
			if(params.size() == 2) {
				l_qName = params.get(0);
				fctType.setLeft( getTypeHierarchyFromQualifiedName(l_qName, tVars) );
			}
			// FunctionType has several parameters => left is a ProductType
			else {
				// Create a new  ProductType element
				ProductType pdtType = StructureFactory.eINSTANCE.createProductType();
				// Set left part to this new ProductType
				fctType.setLeft(pdtType);

				// Iterate over function type parameters
				for(int i=0; i<params.size()-1; i++) {
					l_qName = params.get(i);
					pdtType.getType().add( getTypeHierarchyFromQualifiedName(l_qName, tVars) );
				}
			}

			// Set right part of function type (function result)
			String r_qName = params.get(params.size()-1);
			fctType.setRight( getTypeHierarchyFromQualifiedName(r_qName, tVars) );
		}
		
		return result;
	}
	
	/** This is AWFUL */
	public fr.irisa.triskell.kermeta.language.structure.Object getObjectForEModelElement(EModelElement element)
	{
		fr.irisa.triskell.kermeta.language.structure.Object result =  null; 
		if (element instanceof EPackage) result = getCurrentPackage();
		if (element instanceof EClassifier) {
			// I wish we could select {e| e instanceof EDatatype } more easily EDataTypes...
			try {
				result = datas.getTypeDefinition( (EClassifier) element ) != null ? datas.getTypeDefinition( (EClassifier) element):datas.getPrimitiveType( (EDataType) element);
			} catch (Exception r) {
				KermetaUnit.internalLog.warn("Exception received in getObjectForEModelElement",r);
			}
		}
		if (element instanceof EStructuralFeature)	result = currentProperty;
		if (element instanceof EOperation) result = datas.getOperation( (EOperation) element);
		return result;
	}
	
	protected Stack<Package> packagesStack = new Stack<Package>();

	/** Return the package currently visited */
	protected Package getCurrentPackage() {
		if (packagesStack.size() == 0) return null;
		return (Package)packagesStack.peek();
	}
	
}


