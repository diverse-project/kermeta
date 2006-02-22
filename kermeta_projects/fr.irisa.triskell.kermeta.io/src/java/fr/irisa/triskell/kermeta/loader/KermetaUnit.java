/* $Id: KermetaUnit.java,v 1.51 2006-02-22 09:33:18 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : KermetaUnit.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 23, 2005
 * Author : ffleurey, zdrey
 */
package fr.irisa.triskell.kermeta.loader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Stack;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.behavior.FAssignement;
import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.behavior.impl.BehaviorPackageImpl;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaCycleConstraintChecker;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbol;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolInterpreterVariable;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FModelTypeDefinition;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.structure.FTypeContainer;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.structure.FTypeDefinitionContainer;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.StructureFactory;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.OperationBodyLoader;
import fr.irisa.triskell.traceability.helper.Tracer;

/**
 * A unit is related to the physical file that has loaded a bunch of kermeta definitons
 */
public abstract class KermetaUnit {
	
    final static public Logger internalLog = LogConfigurationHelper.getLogger("KermetaUnit");
	
    public static String STD_LIB_URI = null;//"platform:/resource/fr.irisa.triskell.kermeta.io/lib/framework.km";
	
    public static String ROOT_CLASS_QNAME = "kermeta::language::structure::Object";
	
	protected static KermetaUnit std_lib = null;
	
	protected boolean constraint_checked = false;
	public boolean cycle_constraint_checked = false;
	
	public static KermetaUnit getStdLib() {
		if (std_lib == null) {
			std_lib = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("kermeta", new Hashtable());
			
			try {
				std_lib.load();
			}
			catch(Throwable e) {
				std_lib.messages.addError("Exception while importing the standartd library : " + e, null);
				internalLog.error("Exception while importing the standartd library", e);
			}
		}
		return std_lib;
	}
	
	
	
	
    protected void finalize() throws Throwable {
    	internalLog.debug("Finalise kermeta unit " + this + " " + uri);
    }
	public KermetaUnit(String uri, Hashtable packages) {
		this.uri = uri;
		this.packages = packages;
		struct_factory = StructurePackageImpl.init().getStructureFactory();
		behav_factory = BehaviorPackageImpl.init().getBehaviorFactory();
		
		interpreter_symbols = new Hashtable();
		interpreter_symbols.put("stdio", new KMSymbolInterpreterVariable("stdio"));
		
		
	}
	
	protected boolean type_checked = false;
	
	public KermetaTypeChecker typeCheck(KermetaTypeChecker checker) {
	    
	    if (type_checked) return checker;
	   
	    if (checker == null) checker = new KermetaTypeChecker(this);
	    
	    if (!this.messages.hasError()) {
	        try {
	        	
	            checker.checkUnit();
	            setType_checked(true);
	            Iterator it = importedUnits.iterator();
	    		while(it.hasNext()) {
	    			KermetaUnit u = (KermetaUnit)it.next();
	    			u.typeCheck(null);
	    			
	    		}
	            return checker;
	        }
	        catch(Throwable t) {
	            messages.addError("Type checker internal error " + t.getMessage(), null);
	            KermetaUnit.internalLog.error("Type checker error", t);
	        }
	    }
	    return checker;
	}
	
	public void typeCheckAllUnits() {
		
		typeCheck(null);
		
		ArrayList iulist = getAllImportedUnits();
	    for (int i=0; i<iulist.size(); i++) {	        
	        KermetaUnit iu = (KermetaUnit)iulist.get(i);
	        iu.typeCheck(null);
	    }			   
	}
	
	/**
	 * start a constraint check on the unit
	 * @param checker
	 * @return the KermetaConstraintChecker
	 */
	public KermetaConstraintChecker constraintCheck(KermetaConstraintChecker constraint_checker) {
		if (constraint_checked) return constraint_checker;
		   
	    if (constraint_checker == null) constraint_checker = new KermetaConstraintChecker(this);
	    
	    if (!this.messages.hasError()) {
	        try {
	        	
	        	constraint_checker.checkUnit();
	            setConstraint_checked(true);
	            Iterator it = importedUnits.iterator();
	    		while(it.hasNext()) {
	    			KermetaUnit u = (KermetaUnit)it.next();
	    			u.constraintCheck(null);
	    			
	    		}
	            return constraint_checker;
	        }
	        catch(Throwable t) {
	            messages.addError("Constraint checker internal error " + t.getMessage(), null);
	            KermetaUnit.internalLog.error("Constraint checker error", t);
	        }
	    }
	    return constraint_checker;
	}
	/**
	 * start a constraint check on the unit
	 * @param checker
	 * @return the KermetaConstraintChecker
	 */
	public KermetaCycleConstraintChecker cycleConstraintCheck(KermetaCycleConstraintChecker constraint_checker) {
		if (cycle_constraint_checked && constraint_checker != null) return constraint_checker;
		if (cycle_constraint_checked && constraint_checker == null) {
			// was checked by another enclosing unit
			return new KermetaCycleConstraintChecker(this);
		}
		
		   
	    if (constraint_checker == null) constraint_checker = new KermetaCycleConstraintChecker(this);
	    
	    if (!this.messages.hasError()) {
	        try {
	        	
	        	constraint_checker.check();
	        	setCycle_constraint_checked(true);
	            return constraint_checker;
	        }
	        catch(Throwable t) {
	            messages.addError("Constraint checker internal error " + t.getMessage(), null);
	            KermetaUnit.internalLog.error("Constraint checker error", t);
	        }
	    }
	    return constraint_checker;
	}
	public void constraintCheckAllUnits() {
		
		constraintCheck(null);
		
		ArrayList iulist = getAllImportedUnits();
	    for (int i=0; i<iulist.size(); i++) {	        
	        KermetaUnit iu = (KermetaUnit)iulist.get(i);
	        iu.constraintCheck(null);
	    }			   
	}
	
	protected void importStdlib() {
		//if (STD_LIB_URI != null && this != std_lib) importedUnits.add(getStdLib());
		//System.out.println("importStdlib " + this + " != " + std_lib);
	}

	
	/**
	 * URI of the Unit
	 */
	protected String uri;
	
	/**
	 * Factory to build MC structural elements
	 */
	public StructureFactory struct_factory;
	/**
	 * Factory to build MC behavioral elements
	 */
	public BehaviorFactory behav_factory;
	
	public FPackage current_package;
	public FModelTypeDefinition current_modeltype;
	public FClassDefinition current_class;
	public FOperation current_operation;
	public FProperty current_property;
	public FEnumeration current_enum;
	public FAssignement current_assignment;
	
	
	/**
	 * The root package of the model being built
	 */
	public FPackage rootPackage = null;
	
	/**
	 * The FPackage objects by qualified names
	 */
	public Hashtable packages = new Hashtable();
	
	/**
	 * Pre loaded operation bodies as strings
	 * key = operation qualified name
	 * value = body of the op as a string 
	 */
	public Hashtable operation_bodies = new Hashtable();
	
	/**
	 * This tables store the mapping between Metacore model elements
	 * and AST nodes in both directions.
	 */
	protected Hashtable traceT2M = new Hashtable();
	protected Hashtable traceM2T = new Hashtable();
	
	public void storeTrace(FObject model_element, Object node) {
		traceM2T.put(model_element, node);
		traceT2M.put(node, model_element);
		
		if(tracer !=  null)			
		{	
			KermetaASTNode astNode = (KermetaASTNode)node;
			astNode.getRangeStart();
			tracer.addTextInputTrace(this.uri, 
					getLineNumber(astNode, this.uri), // todo : we MUST do a lazy count instead to avoid loosing performance!
					astNode.getRangeStart(),
					astNode.getRangeStart()+ astNode.getRangeLength(), 
					model_element, 
					traceDefaultShortDescription + astNode.getTypeName() );
			
		}
	}
	
	/** *
	 * Method copied from Traceback class in interpreter project; counts the new lines
	 * in the given file until the given node is found. (getKMTLineNumber)
	 * Should it be moved else where?
	 * @param node
	 * @param unit_struri
	 * @return the line number as a String
	 */
    protected int getLineNumber(KermetaASTNode node, String unit_struri)
    {
    	int linenum = 1;int c; int charcount = 0;
        int charnum = node.getRangeStart();
        try
        {
            InputStream in = new URIConverterImpl( ).createInputStream(URI.createURI(unit_struri));
            while ((c = in.read()) != -1 && charcount<=charnum) {
                charcount += 1;
                if (c=='\n') linenum += 1;
            }
            in.close();
        } catch (IOException e) { e.printStackTrace(); }
        return linenum;
    }
	
	/**
	 * Helper method that looks into all the imported unit to find the researched 
	 * model element
	 * @param object the model element (FObject) that we want to find
	 * @return the KermetaUnit that contains the expected model element
	 * FIXME : not optimized at all, since getNodeByModelElement is finally called
	 * (duplicated hashtable access)
	 * wherever this method is used and whenever it returns a unit. (return result, uri?)
	 * FIXME : does not deal with unit in km format since it use the parser traces and not a reliable trace
	 * other loaders may have not filled these tables
	 */
	public KermetaUnit findUnitForModelElement(FObject object)
	{
	    Object result = getNodeByModelElement(object);
	    if (result != null) return this;
	    
	    
	    ArrayList iulist = getAllImportedUnits();
	    for (int i=0; i<iulist.size(); i++) {	        
	        KermetaUnit iu = (KermetaUnit)iulist.get(i);
	        result = iu.getNodeByModelElement(object);
		    if (result != null) return iu;
	    }
	    return null;		
	}

	public FObject getModelElementByNode(Object node) {
		return (FObject)traceT2M.get(node);
	}
	
	public Object getNodeByModelElement(FObject object) {
		return traceM2T.get(object);
	}
	

	/**
	 * code>tracer</code> uses the traceability metamodel for storing traces info
	 */
	public Tracer tracer=null;
	public String traceDefaultShortDescription="Parsing of ";
	public void setTracer(Tracer newTracer)
	{
		tracer = newTracer;
	}
	public void loadTracerWithInternalHashTable(String shortDescription)
	{
		if(tracer !=  null)			
		{	
			Iterator it = traceT2M.keySet().iterator();
			while (it.hasNext())
			{				
				KermetaASTNode astNode = (KermetaASTNode)it.next();
				FObject model_element = getModelElementByNode(astNode);
				astNode.getRangeStart();
				tracer.addTextInputTrace(this.uri, 
						0,	// TODO I don't know how to retreive line number
						astNode.getRangeStart(),
						astNode.getRangeStart()+ astNode.getRangeLength(), 
						model_element, 
						shortDescription);
			}
		}
	}
	
	/**
	 * This is a symbol table. It is a stack of hashtable.
	 * it contains 
	 *    - the attributes and methods of the current class and its superclasses.
	 * 	  - the parameters of the operation that is being defined.
	 * 	  - the local variables of the current block.
	 * 	  - the parameters of the current lambda expression.
	 * Each hashtable contains a mapping
	 * symbol : String -> MCSymbol
	 */
	protected Stack symbols = new Stack();
	
	/**
	 * This is a the same principle ast the symbol table
	 * but for type variables.
	 */
	protected Stack typeVars = new Stack();
	
	/**
	 * The list of unit messages.
	 * This contains typically errors and warnings detected while building the model
	 */
	public KMUnitMessageManager messages = new KMUnitMessageManager(this);	
	
	/**
	 * The imported kermeta units
	 * This is the list of unit directly imported by this one
	 * @see getAllImportedUnits 
	 */
	public ArrayList importedUnits = new ArrayList();
	
	/**
	 * Allows to retreive the node that has defined each of the imported units
	 * Key: an importedUnit
	 * Value: and ast node 
	 * Used by the error manager for imported unit errors.
	 */
	public Hashtable traceImportedUnits= new Hashtable();
		
	/**
	 * retreives all the imported unit recursively
	 * @return a list of unique units imported by this one
	 */
	public ArrayList getAllImportedUnits()
	{
		ArrayList<KermetaUnit> result = new ArrayList<KermetaUnit>();
		getAllImportedUnits(result);
		return result;
	}
	public void getAllImportedUnits(ArrayList<KermetaUnit> currentList)
	{
	    for (int i=0; i<importedUnits.size(); i++) {
	        KermetaUnit iu = (KermetaUnit)importedUnits.get(i);
	       
	        if(!currentList.contains(iu)) 
	        {
	        	currentList.add(iu);
	        	iu.getAllImportedUnits(currentList);	        	
	        }
	    }
	}
	
	/**
	 * A table of types defined in the current Metacore model
	 * (This table is filled by a first pass).
	 * Qualified_name -> TypeDefinition
	 */
	public Hashtable typeDefs = new Hashtable();
	
	/**
	 * A list of strings representing names of packages that are
	 * used in the unit.
	 * It allows writing short names instead of fully qualified names
	 */
	public ArrayList usings = new ArrayList();
	
	
/*	public String getMessagesAsString() {
		String result = "";
		Iterator it = getError().iterator();
		while(it.hasNext()) result += ((KMUnitMessage)it.next()).getMessage() + "\n";
		it = warning.iterator();
		while(it.hasNext()) result += ((KMUnitMessage)it.next()).getMessage() + "\n";
		return result;
	}*/
	
	/**
	 * Return all the error messages as a string
	 * @return
	 */
/*	public String getAllMessagesAsString() {
		String result = "";
		KMUnitMessage kmumessage;
		FObject fo;
		KermetaUnit ku = null;
		Iterator it = getAllErrors().iterator();
		while(it.hasNext()) { 
			kmumessage = (KMUnitMessage)it.next();
			result += kmumessage.getMessage() + "\n";
			result += "->   " + getLocationAsString(kmumessage.getNode()) + "\n";					
		}
		it = warning.iterator();
		while(it.hasNext()) {
			kmumessage = (KMUnitMessage)it.next();
			result += kmumessage.getMessage() + "\n";
			result += "->   " + getLocationAsString(kmumessage.getNode()) + "\n";
		}
		return result;
	}*/
	
	//protected boolean visited = false;
	
	/**
	 * Get a package by its qualified name
	 * Returns null is not found
	 */
	public FPackage packageLookup(String qname) {
		
		FPackage result = (FPackage)packages.get(qname);
		if (result != null) return result;
		
		ArrayList iulist = getAllImportedUnits();
	    for (int i=0; i<iulist.size(); i++) {	        
	        KermetaUnit iu = (KermetaUnit)iulist.get(i);
	        result = (FPackage)iu.packages.get(qname);
			if (result != null) break;
	    }	   
		return result;
	}
	
	/**
	 * Get the TypeDefinition from its qualified name
	 * It looks first in the "local" type definitions and
	 * then in the imported Metacore models
	 * returns null if type not found
	 */
	public FTypeDefinition typeDefinitionLookup(String fully_qualified_name) {
	/*
//	  System.out.println("typeDefinitionLookup " + uri + " " +fully_qualified_name);
		FTypeDefinition result = (FTypeDefinition)typeDefs.get(fully_qualified_name);
		if (result == null) {
			visited = true;
		    for (int i=0; i<importedUnits.size(); i++) {
		        KermetaUnit iu = (KermetaUnit)importedUnits.get(i);
		        if (!iu.visited) result = iu.typeDefinitionLookup(fully_qualified_name);
		        if (result != null) break;
		    }
		    visited = false;
		}
		//System.out.println("typeDefinitionLookup " + uri + " " +fully_qualified_name + " -> " + result);
		return result;
	    */
	    // Get the package:
	    
	    if (fully_qualified_name.lastIndexOf("::") < 0) return null;
	    
	    String tdef_container_name = fully_qualified_name.substring(0, fully_qualified_name.lastIndexOf("::"));
	    
	    String tname = fully_qualified_name.substring(fully_qualified_name.lastIndexOf("::") + 2);
	    
	    FTypeDefinitionContainer tdef_container = packageLookup(tdef_container_name);
	    if (tdef_container == null) {
	    	// Maybe its inside a model type definition
    		if (tdef_container_name.lastIndexOf("::") < 0) return null;
	    	String pkg_name = tdef_container_name.substring(0, tdef_container_name.lastIndexOf("::"));
	    	FPackage pack = packageLookup(pkg_name);
	    	if (pack ==  null) {
	    		return null;
	    	} else {
	    		// OK, the package exists, see if it has a model type def inside it corresponding to the
	    		// second-last piece of the qualified name
	    		String mt_name = tdef_container_name.substring(tdef_container_name.lastIndexOf("::") + 2);
	    		Iterator it = pack.getFOwnedTypeDefinition().iterator();
	    		while (it.hasNext()) {
	    			FTypeDefinition td = (FTypeDefinition)it.next();
	    			if ((td instanceof FModelTypeDefinition) && td.getFName().equals(mt_name))
	    				tdef_container = (FModelTypeDefinition) td;
	    		}
	    	}
	    }
	    
//	    FPackage pack = packageLookup(pkg_name);
	    
	    if (tdef_container == null) return null;
   
	    Iterator it = tdef_container.getFOwnedTypeDefinition().iterator();
	    while(it.hasNext()) {
	        FTypeDefinition td = (FTypeDefinition)it.next();
	        if (td.getFName().equals(tname)) return td;
	    }
	    return null;
		
	}
	
	/**
	 * Get a typeDefinition from its name. The name can be either a fully qualified
	 * name or a short name. In case of a qualified name, this method just calls
	 * typeDefinitionLookup. In case of a short name, the name is qualified by
	 * the usings directives.
	 * returns null if type not found
	 */
	public FTypeDefinition getTypeDefinitionByName(String name) {
	    //System.out.println("\nXXXXXX   getTypeDefinitionByName " + name + "" );
		FTypeDefinition result = typeDefinitionLookup(name);
		if (result == null && current_modeltype != null) result = typeDefinitionLookup(getQualifiedName(current_modeltype) + "::" + name);
		if (result == null && current_package != null) result = typeDefinitionLookup(getQualifiedName(current_package) + "::" + name);
		if (result == null) result = typeDefinitionLookup(getQualifiedName(rootPackage) + "::" + name);
		for(int i=0; i<usings.size() && result == null; i++) {
			result = typeDefinitionLookup(usings.get(i) + "::" + name);
		}
		//System.out.println("XXXXXX   getTypeDefinitionByName " + name + " -> " +result);
		return result;
	}
	
	public void pushContext() {
		symbols.push(new Hashtable());
		typeVars.push(new Hashtable());
	}
	
	public void popContext() {
		symbols.pop();
		typeVars.pop();
	}
	
	public void addSymbol(KMSymbol s) {
		((Hashtable)symbols.peek()).put(s.getIdentifier(), s);
	}
	
	public void addTypeVar(FTypeVariable var){
		((Hashtable)typeVars.peek()).put(var.getFName(), var);
	}
	
	public void addUsing(String name) {
		//TODO: check that the package exists. generate a warning if not.
		usings.add(name);
	}
	
	protected String getResolvedURI(String base_uri) {
		String result = this.uri;
		URI uri = URI.createURI(result);
		if (uri.isRelative()) {
			URIConverter c = new URIConverterImpl();
			result = uri.resolve(c.normalize(URI.createURI(base_uri))).toString();
		}
		return result;
	}
	
	
	/**
	 * @param str_uri
	 * @return the new imported unit
	 */
	public KermetaUnit importModelFromURI(String str_uri) {
		URI uri = URI.createURI(str_uri);
		URIConverter c = new URIConverterImpl();
		if (uri.fileExtension() != null && uri.isRelative() && this.uri != null) {
			str_uri = uri.resolve(c.normalize(URI.createURI(this.uri))).toString();
			
		}

		// To import method bodies from another file
		if (uri.fileExtension() != null && uri.fileExtension().equals("mctbodies")) {
			new OperationBodyLoader().load(this, str_uri);
			return null;
		}
		else {
			KermetaUnit unit;
			// This is a normal behavior
			unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(str_uri, packages);
			if (messages.unitHasError) {
				messages.addError("Errors in imported model " + str_uri + " : \n" +  unit.messages.getAllMessagesAsString(), null);
			}
			importedUnits.add(unit);
			return unit;
		}
	}
	

	public KermetaUnit importModelFromID(String qid) {
		return importModelFromURI(qid);
	}
	
	
	protected Hashtable interpreter_symbols;
	
	/**
	 * Find a symbol in the symbol tables
	 * It starts from the top of the stack.
	 * returns null if the symbol was not found
	 */
	public KMSymbol symbolLookup(String symbol) {
		KMSymbol result = null;
		for (int i=symbols.size()-1; i >-1; i--) {
			Hashtable table = (Hashtable)symbols.get(i);
			result = (KMSymbol)table.get(symbol);
			if (result != null) break;
		}
		// search in the interpreter variables :
		if (result == null) {
			result = (KMSymbol)interpreter_symbols.get(symbol);
		}
		return result;
	}
	
	/**
	 * Find a type variable in the context.
	 * returns null if the variable was not found
	 */
	public FTypeVariable typeVariableLookup(String name) {
		FTypeVariable result = null;
		for (int i=typeVars.size()-1; i >-1; i--) {
			Hashtable table = (Hashtable)typeVars.get(i);
			result = (FTypeVariable)table.get(name);
			if (result != null) break;
		}
		return result;
	}
	
	/**
	 * Get the fully qualified name of an FNamedElemenet
	 */
	public String getQualifiedName(FNamedElement element) {
		if (element == null) return "";
		if (element.eContainer() != null && element.eContainer() instanceof FNamedElement)
			return getQualifiedName( (FNamedElement)element.eContainer() ) + "::" + element.getFName();
		else return element.getFName();
	}
	
	/**
	 * Get an operation by its name
	 */
	public FOperation getOperationByName(FClassDefinition c, String name) {
		EList ops = c.getFOwnedOperation();
		for (int i=0; i<ops.size(); i++) {
			FOperation op = (FOperation)ops.get(i);
			if (op.getFName().equals(name)) return op;
		}
		return null;
	}
	
	/**
	 * Get a property by its name
	 */
	public FProperty getPropertyByName(FClassDefinition c, String name) {
		EList props = c.getFOwnedAttributes();
		for (int i=0; i<props.size(); i++) {
			FProperty prop = (FProperty)props.get(i);
			if (prop.getFName().equals(name)) return prop;
		}
		return null;
	}
	
	/**
	 * Get an operation by its name. search in the inheritance tree
	 */
	public FOperation findOperationByName(FClassDefinition c, String name) {
		
	    Iterator it = getAllOperations(c).iterator();
	    while(it.hasNext()) {
	        FOperation op = (FOperation)it.next();
	        if (op.getFName().equals(name)) return op;
	    }
	    return null;
	}
	
	/**
	 * Get an property by its name. search in the inheritance tree
	 */
	public FProperty findPropertyByName(FClassDefinition c, String name) {
		FProperty result = getPropertyByName(c, name);
		if (result != null) return result;
		EList superclasses = c.getFSuperType();
		for(int i=0; i<superclasses.size();i++) {
			FClassDefinition sc = (FClassDefinition) ((FClass)superclasses.get(i)).getFTypeDefinition();
			result = findPropertyByName(sc, name);
			if (result != null) return result;
		}
		return null;
	}
	
	/**
	 * Return true if supercls is a super class of cls
	 * @param supercls the Super class to which we compare cls
	 * @param cls the class to compare to the super class
	 * @return
	 */
	public boolean isSuperClass(FClassDefinition supercls, FClassDefinition cls) {
		EList stypes = cls.getFSuperType();
		for(int i=0; i< stypes.size(); i++) {
			FClassDefinition scls = (FClassDefinition) ((FClass)stypes.get(i)).getFTypeDefinition();
			if (supercls == scls) return true;
			else if(isSuperClass(supercls, scls)) return true;
		}
		return false;
	}
	
	/**
	 * Get the list of direct parents of a class
	 * @param cls Class for which we get the first-level parents
	 * @return a Array of the <b>cls</b>'s first-level parents
	 */
	public FClassDefinition[] getDirectSuperClasses(FClassDefinition cls) {
		EList scs = cls.getFSuperType();
		ArrayList result = new ArrayList();
		for(int i=0; i<scs.size(); i++) {
			result.add( ((FClass)scs.get(i)).getFTypeDefinition() );
		}
		
		// THIS LOOKS USELESS
		/*
		// Add the type Object which is implicilty a direct supertype of everything
		FClassDefinition ObjectTypeDef = (FClassDefinition)typeDefinitionLookup(ROOT_CLASS_QNAME);
		if (ObjectTypeDef != null && cls != ObjectTypeDef && !result.contains(ObjectTypeDef)) {
			result.add(ObjectTypeDef);
		}
		*/
			
		return (FClassDefinition[])result.toArray(new FClassDefinition[result.size()]);
	}
	
	public FClassDefinition get_ROOT_TYPE_ClassDefinition() {
	    FClassDefinition result = (FClassDefinition)typeDefinitionLookup(ROOT_CLASS_QNAME);
	    if (result == null && STD_LIB_URI != null) {
	        result = (FClassDefinition)getStdLib().typeDefinitionLookup(ROOT_CLASS_QNAME);
	    }
	    
	    return result;
	}
	
	public ArrayList getAllOperations(FClassDefinition cls) {
		ArrayList result = new ArrayList();
		
		// Get the operations on object type :
		FClassDefinition ObjectTypeDef = get_ROOT_TYPE_ClassDefinition();
		if (ObjectTypeDef != null) {
		    result.addAll(getAllOperationsOnRootType(ObjectTypeDef));
		}
		
		Iterator it = cls.getFOwnedOperation().iterator();
		while(it.hasNext()) {
			FOperation op = (FOperation)it.next();
			// only take operation. no methods
			if (op.getFSuperOperation() == null && !result.contains(op)) result.add(op);
		}
		// search recursively in super classes
		it = cls.getFSuperType().iterator();
		while(it.hasNext()) {
			result.addAll(getAllOperations((FClassDefinition) ((FClass)it.next()).getFTypeDefinition()));
		}
		return result;
	}
	
	/** @return all the type definitions available in this kermeta unit, in
	 * all packages */
	public ArrayList getAllTypeDefinitions() {
		ArrayList<FTypeDefinition> result = new ArrayList<FTypeDefinition>();
		for (Iterator<FPackage> it = getAllPackages().iterator(); it.hasNext();)
			result.addAll(it.next().getFOwnedTypeDefinition());
		System.err.println("Number of type defs : " + result.size());
		return result;
	}
	
	public ArrayList<FPackage> getAllPackages() {
		ArrayList<FPackage> result = new ArrayList<FPackage>();
		result.addAll(packages.values());
		
		ArrayList iulist = getAllImportedUnits();
	    for (int i=0; i<iulist.size(); i++) {	        
	        KermetaUnit iu = (KermetaUnit)iulist.get(i);
	        for (Iterator it = iu.packages.values().iterator(); it.hasNext();)
	        {
	        	FPackage n = (FPackage)it.next();
	        	if (!iu.packages.contains(n)) result.add(n);
	        }
	    }  
		return result;
	}
	
	private ArrayList getAllOperationsOnRootType(FClassDefinition cls) {
		ArrayList result = new ArrayList();
		Iterator it = cls.getFOwnedOperation().iterator();
		while(it.hasNext()) {
			FOperation op = (FOperation)it.next();
			// only take operation. no methods
			if (op.getFSuperOperation() == null) result.add(op);
		}
		// search recursively in super classes
		it = cls.getFSuperType().iterator();
		while(it.hasNext()) {
			result.addAll(getAllOperationsOnRootType((FClassDefinition) ((FClass)it.next()).getFTypeDefinition()));
		}
		
		
		return result;
	}{
	    
	}
	
	public ArrayList getAllProperties(FClassDefinition cls) {
		ArrayList result = new ArrayList();
		result.addAll(cls.getFOwnedAttributes());
		// search recursively in super classes
		Iterator it = cls.getFSuperType().iterator();
		while(it.hasNext()) {
			result.addAll(getAllProperties((FClassDefinition) ((FClass)it.next()).getFTypeDefinition()));
		}
		return result;
	}
	
	public void prettyPrint(String file_name) {
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
		for (int i=0; i<importedUnits.size(); i++) {
	        KermetaUnit iu = (KermetaUnit)importedUnits.get(i);
	        if (STD_LIB_URI != null && iu == getStdLib()) continue;
	        pp.getImports().add(iu.getResolvedURI(uri));
	    }
		pp.getUsings().addAll(usings);
		pp.ppPackage(rootPackage, new File(file_name));
	}
	
	/**
	 * Save Kermeta model
	 * @param file_path the xmi file. the extension of the file should be .km
	 */
	public void saveAsXMIModel(String file_path) {
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new XMIResourceFactoryImpl());
	    ResourceSet resource_set = new ResourceSetImpl();
	    ArrayList resource_tags = new ArrayList();
	    Resource resource = resource_set.createResource(URI.createFileURI(file_path));
	    Iterator it = packages.values().iterator();
	    while(it.hasNext()) {
	        FPackage p = (FPackage)it.next();    
	        if (p.eResource() == null && p.eContainer() == null) {
	            fixTypeContainement(p);
	            resource.getContents().add(p);	           
		        resource_tags = fixPackageTags(p, resource_tags);
	        }
	    }
	    // Add the tags registered in tags list to the resource
	    this.addFTagsToResource(resource, resource_tags);
	    try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		    e.printStackTrace();
			throw new Error(e);
		}
	}
	
	/**
	 * Add the given tag to resource. Used in the KMT2KMPass7.java, to add tag in resource without
	 * adding it to a container (since a tag can be linked to one or more elements, and unlinked as well).
	 */
	public void addFTagsToResource(Resource resource, ArrayList pTags)
	{   
	    int tagsize = pTags.size();
	    for (int i=0; i<tagsize; i++)
	    {   
	        FTag tag = (FTag)pTags.get(i);
	        resource.getContents().add(tag);
	    }
	}
	
	
	/**
	 * If containedPackage has no container, we return it unchanged, else, we return its container,
	 * with only this containedPackage container, and the container containers. 
	 * @param containedPackage
	 * @return
	 */
	public FPackage getRootPackageForSerialization(FPackage containedPackage) {
		
		FPackage container = containedPackage.getFNestingPackage();
		if (container == null) return containedPackage;
		FPackage newContainer = copyPackageStructure(container);
		newContainer.getFNestedPackage().add(containedPackage);
		FPackage result = newContainer;
		while(result.getFNestingPackage() != null) result = result.getFNestingPackage();
		return result;
	}
	
	/**
	 * Create and return a copy of the given package
	 */
	private FPackage copyPackageStructure(FPackage toCopy) {
		FPackage result = struct_factory.createFPackage();
		result.setFName(toCopy.getFName());
		if (toCopy.eContainer() != null) {
			result.setFNestingPackage(copyPackageStructure(toCopy.getFNestingPackage()));
		}
		return result;
	}
	
	/**
	 * 
	 * @param p The package in which we want to fix the tags
	 * @param myTags The tags to be added to the XMI resource
	 * @return the list of myTags, completed
	 */
	public ArrayList fixPackageTags(FPackage p, ArrayList myTags)
	{
	    TreeIterator it = p.eAllContents();
		while(it.hasNext()) {
			FObject o = (FObject)it.next();
			myTags.addAll(o.getFTag());
		}
		// Add the tags of the package itself
		myTags.addAll(p.getFTag());
		return myTags;
	}
	
	/**
	 * Define a container for each element of the root package
	 */
	public void fixTypeContainement(FPackage p) {
		TreeIterator it = p.eAllContents();
		TypeContainementFixer fixer = new TypeContainementFixer();
		while(it.hasNext()) {
			FObject o = (FObject)it.next();
			if (o instanceof FCallExpression) {
			    FCallExpression e = (FCallExpression)o;
			    fixer.addContainedTypes(e.getFStaticTypeVariableBindings(), e);
			}
			
			if (o instanceof FExpression) {
				FExpression e = (FExpression)o;
				if (e.getFStaticType() != null) {
					fixer.addContainedTypes(e.getFStaticType(), e);
					
				}
			}
			else if (o instanceof FTypeContainer) {
				if (o != null) fixer.accept(o);
			}
		}
	}
	
	/**
	 * Get all the tags attached to class members, and return
	 * them, in order to save them in a resource (when saving as
	 * XMI) */
	public ArrayList fixClassMemberTags(FClassDefinition o)
	{	// for the class
	    ArrayList oTags = new ArrayList();
	    oTags.addAll(o.getFTag());
	    // for its members
	    EList opLst = o.getFOwnedOperation();
	    EList atLst = o.getFOwnedAttributes();
	    if (opLst.size()>0)
	    for (int i=0; i<opLst.size();i++)
	    {  oTags.addAll(((FOperation)opLst.get(i)).getFTag());}
	    if (atLst.size()>0)
	    for (int i=0; i<atLst.size();i++)
	    {  oTags.addAll(((FProperty)atLst.get(i)).getFTag());
	    }
	    return oTags;
	}
	
	public void load() {
		//System.out.println("\nLOAD " + uri);
	    //importStdlib();
		// load imported units
	    try {
	        loadAllImportedUnits();
	        loadAllTypeDefinitions();
	        loadAllStructuralFeatures();
	        loadAllOppositeProperties();
	        loadAllBodies();
	        loadAllAnnotations();
	    }
	    catch(Throwable t) {
	        if (!messages.hasError()) {
	            KermetaUnit.internalLog.error("Unexpected load error", t);
	            messages.addError("INTERNAL ERROR : " + t.getMessage(), null);
	        }
	    }
	}
	
	boolean loading = false;
	
	
	private void loadAllImportedUnits() {
		//System.out.println("loadAllImportedUnits " + uri);
		if (doneLoadImportedUnits) return;
		loading = true;
		// load imported units
		preLoad();
		loadImportedUnits();
		doneLoadImportedUnits = true;
		for(int i=0; i<importedUnits.size(); i++) {
			KermetaUnit iu = (KermetaUnit)importedUnits.get(i);
			if (!iu.loading) iu.loadAllImportedUnits();
		}
		loading = false;
	}
	
	private void loadAllTypeDefinitions() {
		//		System.out.println("loadAllTypeDefinitions " + uri);
		if (doneLoadTypeDefinitions) return;
		loading = true;
		doneLoadTypeDefinitions = true;
		// load imported units
		for(int i=0; i<importedUnits.size(); i++) {
			KermetaUnit iu = (KermetaUnit)importedUnits.get(i);
			if (!iu.loading) iu.loadAllTypeDefinitions();
		}
		loadTypeDefinitions();
		loading = false;
	}
	
	private void loadAllStructuralFeatures() {
		//		System.out.println("loadAllStructuralFeatures " + uri);
		if (doneLoadStructuralFeatures) return;
		loading = true;
		// load imported units
		loadStructuralFeatures();
		doneLoadStructuralFeatures = true;
		for(int i=0; i<importedUnits.size(); i++) {
			KermetaUnit iu = (KermetaUnit)importedUnits.get(i);
			if (!iu.loading) iu.loadAllStructuralFeatures();
		}
		loading = false;
	}
	
	private void loadAllOppositeProperties() {
		//	System.out.println("loadAllOppositeProperties " + uri);
		if (doneLoadOppositeProperties) return;
		loading = true;
		// load imported units
		loadOppositeProperties();
		doneLoadOppositeProperties = true;
		for(int i=0; i<importedUnits.size(); i++) {
			KermetaUnit iu = (KermetaUnit)importedUnits.get(i);
			if (!iu.loading) iu.loadAllOppositeProperties();
		}
		loading = false;
	}
	
	private void loadAllBodies() {
		//	System.out.println("loadAllBodies " + uri);
		if (doneLoadBodies) return;
		loading = true;
		// load imported units
		loadBodies();
		doneLoadBodies = true;
		for(int i=0; i<importedUnits.size(); i++) {
			KermetaUnit iu = (KermetaUnit)importedUnits.get(i);
			if (!iu.loading) iu.loadAllBodies();
		}
		loading = false;
	}
	
	private void loadAllAnnotations() {
	    loading = true;
	    loadAnnotations();
	    for (int i=0; i<importedUnits.size(); i++) {
	        KermetaUnit iu = (KermetaUnit)importedUnits.get(i);
	        if (!iu.loading) iu.loadAllAnnotations();
	    }
	    loading = false;
	}
	
	/**
	 * Any pre-load action like parsing for instance
	 */
	public abstract void preLoad();
	
	/**
	 * Loads annotations : attach annotation to the corresponding Kermeta elements
	 */
	public abstract void loadAnnotations();
	
	/**
	 * Loads dependencies ( handles require, using, ...)
	 */
	public abstract void loadImportedUnits();
	private boolean doneLoadImportedUnits = false;
	/**
	 * Create packages and type definitions
	 */
	public abstract void loadTypeDefinitions();
	private boolean doneLoadTypeDefinitions = false;
	/**
	 * Updates type definitions relationships (inheritance, ...)
	 * Create properties / operations
	 */
	public abstract void loadStructuralFeatures();
	private boolean doneLoadStructuralFeatures = false;
	/**
	 * Update structural features relationships
	 * opposite properties...
	 */
	public abstract void loadOppositeProperties();
	private boolean doneLoadOppositeProperties = false;
	/**
	 * Creates Bodies for operations and derived properties
	 */
	public abstract void loadBodies();
	private boolean doneLoadBodies = false;
	
	/**
	 * @return Returns the error from this unit. If there is an error in imported unit, 
	 * 	only report the name of the unit that contain the error
	 */
/*	public ArrayList getError() {
	    visited = true;
	    ArrayList result = new ArrayList();
	    result.addAll(error);
	    for (int i=0; i<importedUnits.size(); i++) {
	        KermetaUnit iu = (KermetaUnit)importedUnits.get(i);
	        if (iu.visited) continue;
	        if (iu.getError().size() != 0) {
	            result.add(new KMUnitError("Error in imported unit " + iu.getUri(), null));
	        }
	    }
	    visited = false;
		return result;
	}*/
	
/*	public ArrayList getAllErrors() {
	    visited = true;
	    ArrayList result = new ArrayList();
	    result.addAll(error);
	    for (int i=0; i<importedUnits.size(); i++) {
	        
	        KermetaUnit iu = (KermetaUnit)importedUnits.get(i);
	        if (iu.visited) continue;
	        result.addAll(iu.getAllErrors());
	    }
	    visited = false;
		return result;
	}*/
		
	/**
	 * @return Returns the uri.
	 */
	public String getUri() {
		return uri;
	}
	/**
	 * @param uri The uri to set.
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}
    
    /**
     * 
     */
    public static void unloadStdLib() {
       std_lib = null;
    }
    
    /** @return the trace handler */
    public Tracer getTracer() { return tracer; }

    /** @return the packages available in this KermetaUnit */
    public Hashtable getPackages() { return packages; }


	/**
	 * @return Returns the type_checked.
	 */
	synchronized public boolean isType_checked() {
		return type_checked;
	}

	/**
	 * @param type_checked The type_checked to set.
	 */
	synchronized public void setType_checked(boolean type_checked) {
		this.type_checked = type_checked;
	}




	/**
	 * @return Returns the constraint_checked.
	 */
	public synchronized boolean isConstraint_checked() {
		return constraint_checked;
	}




	/**
	 * @param constraint_checked The constraint_checked to set.
	 */
	public synchronized void setConstraint_checked(boolean constraint_checked) {
		this.constraint_checked = constraint_checked;
	}




	/**
	 * @return Returns the cycle_constraint_checked.
	 */
	public synchronized boolean isCycle_constraint_checked() {
		return cycle_constraint_checked;
	}




	/**
	 * @param cycle_constraint_checked The cycle_constraint_checked to set.
	 */
	public synchronized void setCycle_constraint_checked(
			boolean cycle_constraint_checked) {
		this.cycle_constraint_checked = cycle_constraint_checked;
	}
    

    
}

