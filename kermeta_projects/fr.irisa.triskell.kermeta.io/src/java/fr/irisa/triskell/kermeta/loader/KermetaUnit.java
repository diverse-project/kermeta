/* $Id: KermetaUnit.java,v 1.75 2006-09-28 14:40:35 zdrey Exp $
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
import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaCycleConstraintChecker;
import fr.irisa.triskell.kermeta.error.KermetaLoaderError;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.impl.BehaviorPackageImpl;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeContainer;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinitionContainer;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbol;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolInterpreterVariable;
import fr.irisa.triskell.kermeta.loader.message.KMUnitMessageManager;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.OperationBodyLoader;
import fr.irisa.triskell.traceability.helper.Tracer;

/**
 * A kermeta unit is an entity that embeds the model
 * of a Kermeta program, and provides a set of methods that are aimed at helping
 * the access to the model object
 */
public abstract class KermetaUnit {
	
    final static public Logger internalLog = LogConfigurationHelper.getLogger("KermetaUnit");
	
    public static String STD_LIB_URI = null;//"platform:/resource/fr.irisa.triskell.kermeta.io/lib/framework.km";
	
    public static String ROOT_CLASS_QNAME = "kermeta::language::structure::Object";
	
	protected static KermetaUnit std_lib = null;
	
	protected boolean constraint_checked = false;
	public boolean cycle_constraint_checked = false;
	
	/**
	 * those filters are used only in the case of jar unit
	 */
	public ArrayList<String> excludeFilters = new ArrayList<String>();
	public ArrayList<String> includeFilters = new ArrayList<String>();
	
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
		
		interpreter_symbols = new Hashtable<String, KMSymbol>();
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
	            for (KermetaUnit u : importedUnits) 
	            	u.typeCheck(null);
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
		for (KermetaUnit iu : getAllImportedUnits())
	        iu.typeCheck(null);
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
	            for (KermetaUnit u : importedUnits)
	    			u.constraintCheck(null);
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
		for (KermetaUnit iu : getAllImportedUnits())
	        iu.constraintCheck(null);
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
	
	public Package current_package;
	public ModelTypeDefinition current_modeltype;
	public ClassDefinition current_class;
	public Operation current_operation;
	public Property current_property;
	public Enumeration current_enum;
	public Assignment current_assignment;
	public Constraint current_constraint; //JMM ask the utility of these
	public CallFeature current_callFeature;
	
	
	/**
	 * The root package of the model being built
	 */
	public Package rootPackage = null;
	
	/**
	 * The Package objects by qualified names
	 */
	public Hashtable<String,Package> packages = new Hashtable<String,Package>();
	
	/**
	 * Pre loaded operation bodies as strings
	 * key = operation qualified name
	 * value = body of the op as a string 
	 */
	public Hashtable<String, String> operation_bodies = new Hashtable<String, String>();
	
	/**
	 * This tables store the mapping between Metacore model elements
	 * and AST nodes in both directions.
	 */
	protected Hashtable traceT2M = new Hashtable();
	protected Hashtable traceM2T = new Hashtable();
	
	public void storeTrace(fr.irisa.triskell.kermeta.language.structure.Object model_element, Object node) {
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
	 * @param object the model element (fr.irisa.triskell.kermeta.language.structure.FObject) that we want to find
	 * @return the KermetaUnit that contains the expected model element
	 * FIXME : not optimized at all, since getNodeByModelElement is finally called
	 * (duplicated hashtable access)
	 * wherever this method is used and whenever it returns a unit. (return result, uri?)
	 * FIXME : does not deal with unit in km format since it use the parser traces and not a reliable trace
	 * other loaders may have not filled these tables
	 */
	public KermetaUnit findUnitForModelElement(fr.irisa.triskell.kermeta.language.structure.Object object)
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

	public fr.irisa.triskell.kermeta.language.structure.Object getModelElementByNode(Object node) {
		return (fr.irisa.triskell.kermeta.language.structure.Object)traceT2M.get(node);
	}
	
	public Object getNodeByModelElement(fr.irisa.triskell.kermeta.language.structure.Object object) {
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
			for (Object next : traceT2M.keySet()) 
			{				
				KermetaASTNode astNode = (KermetaASTNode)next;
				fr.irisa.triskell.kermeta.language.structure.Object model_element = getModelElementByNode(astNode);
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
	 * symbol : { String : MCSymbol }
	 */
	protected Stack<Hashtable<String, KMSymbol>> symbols = new Stack<Hashtable<String, KMSymbol>>();
	
	/**
	 * This is a the same principle ast the symbol table
	 * but for type variables.
	 */
	protected Stack<Hashtable<String, TypeVariable>> typeVars = new Stack<Hashtable<String, TypeVariable>>();
	
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
	public ArrayList<KermetaUnit> importedUnits = new ArrayList<KermetaUnit>();
	
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
	public ArrayList<KermetaUnit> getAllImportedUnits()
	{
		ArrayList<KermetaUnit> result = new ArrayList<KermetaUnit>();
		getAllImportedUnits(result);
		return result;
	}
	public void getAllImportedUnits(ArrayList<KermetaUnit> currentList)
	{
	    for (int i=0; i<importedUnits.size(); i++) {
	        KermetaUnit iu = importedUnits.get(i);
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
	public Hashtable<String,TypeDefinition> typeDefs = new Hashtable<String,TypeDefinition>();
	
	/**
	 * A list of strings representing names of packages that are
	 * used in the unit.
	 * It allows writing short names instead of fully qualified names
	 */
	public ArrayList<String> usings = new ArrayList<String>();
	
	/**
	 * Get a package by its qualified name
	 * Returns null is not found
	 */
	public Package packageLookup(String qname) {
		
		Package result = (Package)packages.get(qname);
		if (result != null) return result;
		
		ArrayList iulist = getAllImportedUnits();
	    for (int i=0; i<iulist.size(); i++) {	        
	        KermetaUnit iu = (KermetaUnit)iulist.get(i);
	        result = (Package)iu.packages.get(qname);
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
	public TypeDefinition typeDefinitionLookup(String fully_qualified_name) 
	{
	    if (fully_qualified_name.lastIndexOf("::") < 0) return null;
	    
	    String tdef_container_name = fully_qualified_name.substring(0, fully_qualified_name.lastIndexOf("::"));
	    
	    String tname = fully_qualified_name.substring(fully_qualified_name.lastIndexOf("::") + 2);
	    
	    TypeDefinitionContainer tdef_container = packageLookup(tdef_container_name);
	    if (tdef_container == null) {
	    	// Maybe its inside a model type definition
    		if (tdef_container_name.lastIndexOf("::") < 0) return null;
	    	String pkg_name = tdef_container_name.substring(0, tdef_container_name.lastIndexOf("::"));
	    	Package pack = packageLookup(pkg_name);
	    	if (pack ==  null) {
	    		return null;
	    	} else {
	    		// OK, the package exists, see if it has a model type def inside it corresponding to the
	    		// second-last piece of the qualified name
	    		String mt_name = tdef_container_name.substring(tdef_container_name.lastIndexOf("::") + 2);
	    		for (Object tdefnext : pack.getOwnedTypeDefinition())
	    		{
	    			TypeDefinition td = (TypeDefinition)tdefnext;
	    			if ((td instanceof ModelTypeDefinition) && td.getName().equals(mt_name))
	    				tdef_container = (ModelTypeDefinition) td;
	    		}
	    	}
	    }	    
	    
	    if (tdef_container == null) return null;

	    for (Object tdnext : tdef_container.getOwnedTypeDefinition()) {
	        TypeDefinition td = (TypeDefinition)tdnext;
	        if (td.getName().equals(tname)) return td;
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
	public TypeDefinition getTypeDefinitionByName(String name) {
	    //System.out.println("\nXXXXXX   getTypeDefinitionByName " + name + "" );
		TypeDefinition result = typeDefinitionLookup(name);
		if (result == null && current_modeltype != null) result = typeDefinitionLookup(getQualifiedName(current_modeltype) + "::" + name);
		if (result == null && current_package != null) result = typeDefinitionLookup(getQualifiedName(current_package) + "::" + name);
		if (result == null)	result = typeDefinitionLookup(getQualifiedName(rootPackage) + "::" + name);
		for(int i=0; i<usings.size() && result == null; i++) {
			result = typeDefinitionLookup(usings.get(i) + "::" + name);
		}
		//System.out.println("XXXXXX   getTypeDefinitionByName " + name + " -> " +result);
		return result;
	}
	
	public void pushContext() {
		symbols.push(new Hashtable<String, KMSymbol>());
		typeVars.push(new Hashtable<String, TypeVariable>());
	}
	
	public void popContext() {
		symbols.pop();
		typeVars.pop();
	}
	
	public void addSymbol(KMSymbol s) {
		symbols.peek().put(s.getIdentifier(), s);
	}
	
	public void addTypeVar(TypeVariable var){
		typeVars.peek().put(var.getName(), var);
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
			try{
				unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(str_uri, packages);
			}
			catch(KermetaLoaderError e){
				unit = new DummyUnit(str_uri, packages);
				unit.messages.addError(e.getMessage(),null);
			}
			// zoe comment 20/06/06
			//unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(str_uri); //, new Hashtable());
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
	
	
	protected Hashtable<String, KMSymbol> interpreter_symbols;
	
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
	public TypeVariable typeVariableLookup(String name) {
		TypeVariable result = null;
		for (int i=typeVars.size()-1; i >-1; i--) {
			Hashtable table = (Hashtable)typeVars.get(i);
			result = (TypeVariable)table.get(name);
			if (result != null) break;
		}
		return result;
	}
	
	/**
	 * Get the fully qualified name of an FNamedElemenet
	 */
	public String getQualifiedName(NamedElement element) {
		if (element == null) return "";
		if (element.eContainer() != null && element.eContainer() instanceof NamedElement)
			return getQualifiedName( (NamedElement)element.eContainer() ) + "::" + element.getName();
		else return element.getName();
	}
	
	/**
	 * Get an operation by its name
	 */
	public Operation getOperationByName(ClassDefinition c, String name) {
		EList ops = c.getOwnedOperation();
		for (int i=0; i<ops.size(); i++) {
			Operation op = (Operation)ops.get(i);
			if (op.getName().equals(name)) return op;
		}
		return null;
	}
	
	/**
	 * Get a property by its name
	 */
	public Property getPropertyByName(ClassDefinition c, String name) {
		EList props = c.getOwnedAttribute();
		for (int i=0; i<props.size(); i++) {
			Property prop = (Property)props.get(i);
			if (prop.getName().equals(name)) return prop;
		}
		return null;
	}
	
	
	/**
	 * Get a Constraint by its name in ClassDef c
	 * @param c
	 * @param name
	 * @return
	 */
	public Constraint getInvariantByName(ClassDefinition c, String name) {
		EList invs = c.getInv();
		for (int i=0; i<invs.size(); i++) {
			Constraint inv = (Constraint) invs.get(i);
			if(inv.getName().equals(name))
				return inv;
		}
		return null;
	}
	
	
	/**
	 * Get a PreCondition by its name in Operation op
	 * @param op
	 * @param name
	 * @return
	 */
	public Constraint getPreConditionByName(Operation op, String name) {
		EList preConds = op.getPre();
		for (int i=0; i<preConds.size(); i++) {
			Constraint pre = (Constraint) preConds.get(i);
			if(pre.getName().equals(name))
				return pre;
		}
		return null;
	}
	
	
	/**
	 * Get a PostCondition by its name in Operation op
	 * @param op
	 * @param name
	 * @return
	 */
	public Constraint getPostConditionByName(Operation op, String name) {
		EList postConds = op.getPost();
		for (int i=0; i<postConds.size(); i++) {
			Constraint post = (Constraint) postConds.get(i);
			if(post.getName().equals(name))
				return post;
		}
		return null;
	}
	
	
	/**
	 * Get an operation by its name. search in the inheritance tree
	 */
	public Operation findOperationByName(ClassDefinition c, String name) {
		for (Object next : getAllOperations(c)) {
	        Operation op = (Operation)next;
	        if (op.getName().equals(name)) return op;
	    }
	    return null;
	}
	
	/**
	 * Get an property by its name. search in the inheritance tree
	 */
	public Property findPropertyByName(ClassDefinition c, String name) {
		Property result = getPropertyByName(c, name);
		if (result != null) return result;
		EList superclasses = c.getSuperType();
		for(int i=0; i<superclasses.size();i++) {
			ClassDefinition sc = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)superclasses.get(i)).getTypeDefinition();
			result = findPropertyByName(sc, name);
			if (result != null) return result;
		}
		return null;
	}
	
	
	/**
	 * Get a Constraint by its name in ClassDef c and its inheritance tree
	 * @param c
	 * @param name
	 * @return
	 */
	public Constraint findInvariantByName(ClassDefinition c, String name) {
		Constraint result = getInvariantByName(c, name);
		if (result != null) return result;
		EList superclasses = c.getSuperType();
		for(int i=0; i<superclasses.size();i++) {
			ClassDefinition sc = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)superclasses.get(i)).getTypeDefinition();
			result = findInvariantByName(sc, name);
			if (result != null) return result;
		}
		return null;
	}
	
	
	/**
	 * Get a PreCondition by its name in Operation op and its superoperations
	 * @param op
	 * @param name
	 * @return
	 */
	public Constraint findPreConditionByName(Operation op, String name) {
		Constraint result = getPreConditionByName(op, name);
		if (result != null) return result;
		
		Operation superOp = op.getSuperOperation();
		if(superOp != null) {
			result = findPreConditionByName(superOp, name);
			if(result != null) return result;
		}
		return null;
	}
	
	
	/**
	 * Get a PostCondition by its name in Operation op and its superoperations
	 * @param op
	 * @param name
	 * @return
	 */
	public Constraint findPostConditionByName(Operation op, String name) {
		Constraint result = getPostConditionByName(op, name);
		if (result != null) return result;
		
		Operation superOp = op.getSuperOperation();
		if(superOp != null) {
			result = findPostConditionByName(superOp, name);
			if(result != null) return result;
		}
		return null;
	}
	
	
	/**
	 * Return true if supercls is a super class of cls
	 * @param supercls the Super class to which we compare cls
	 * @param cls the class to compare to the super class
	 * @return
	 */
	public boolean isSuperClass(ClassDefinition supercls, ClassDefinition cls) {
		for(Object stype : cls.getSuperType()) {
			ClassDefinition scls = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)stype).getTypeDefinition();
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
	public ClassDefinition[] getDirectSuperClasses(ClassDefinition cls) {
		ArrayList result = new ArrayList();
		for(Object next : cls.getSuperType()) {
			result.add( ((fr.irisa.triskell.kermeta.language.structure.Class)next).getTypeDefinition() );
		}
		// THIS LOOKS USELESS
		/*
		// Add the type Object which is implicilty a direct supertype of everything
		ClassDefinition ObjectTypeDef = (ClassDefinition)typeDefinitionLookup(ROOT_CLASS_QNAME);
		if (ObjectTypeDef != null && cls != ObjectTypeDef && !result.contains(ObjectTypeDef)) {
			result.add(ObjectTypeDef);
		}
		*/
			
		return (ClassDefinition[])result.toArray(new ClassDefinition[result.size()]);
	}
	
	public ClassDefinition get_ROOT_TYPE_ClassDefinition() {
	    ClassDefinition result = (ClassDefinition)typeDefinitionLookup(ROOT_CLASS_QNAME);
	    if (result == null && STD_LIB_URI != null) {
	        result = (ClassDefinition)getStdLib().typeDefinitionLookup(ROOT_CLASS_QNAME);
	    }
	    
	    return result;
	}
	
	public ArrayList getAllOperations(ClassDefinition cls) {
		ArrayList result = new ArrayList();
		
		// Get the operations on object type :
		ClassDefinition ObjectTypeDef = get_ROOT_TYPE_ClassDefinition();
		if (ObjectTypeDef != null) {
		    result.addAll(getAllOperationsOnRootType(ObjectTypeDef));
		}
		
		for (Object next : cls.getOwnedOperation()) {
			Operation op = (Operation)next;
			// only take operation. no methods
			if (op.getSuperOperation() == null && !result.contains(op)) result.add(op);
		}
		// search recursively in super classes
		for (Object next : cls.getSuperType()) {
			result.addAll(getAllOperations((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)next).getTypeDefinition()));
		}
		return result;
	}
	
	/** @return all the type definitions available in this kermeta unit, in
	 * all packages */
	public ArrayList<TypeDefinition> getAllTypeDefinitions() {
		ArrayList<TypeDefinition> result = new ArrayList<TypeDefinition>();
		for (Package p : getAllPackages())
			result.addAll(p.getOwnedTypeDefinition());
		return result;
	}

	/**
	 * Get all the packages stored in all the loaded kermeta units.
	 * @return the list of all the packages in all the loaded kermeta units
	 */
	public ArrayList<Package> getAllPackages() {
		ArrayList<Package> result = new ArrayList<Package>();
		result.addAll(packages.values());
		for (KermetaUnit iu : getAllImportedUnits()) {
	        for (Package next : iu.packages.values())
	        	if (!result.contains(next)) result.add(next);
	    }  
		return result;
	}
	
	/**
	 * Get all the operations that are not a redefinition of a super operation.
	 * @param cls
	 * @return
	 */
	public ArrayList getAllOperationsOnRootType(ClassDefinition cls) {
		ArrayList result = new ArrayList();
		for (Object next : cls.getOwnedOperation()) {
			Operation op = (Operation)next;
			// only take operation. no methods
			if (op.getSuperOperation() == null) result.add(op);
		}
		// search recursively in super classes
		for (Object next : cls.getSuperType()) {
			result.addAll(getAllOperationsOnRootType((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)next).getTypeDefinition()));
		}
		return result;
	}
	
	/**
	 * @param classDefinition
	 * @return the list of all properties defined for the given class definition. This includes the inherited properties
	 */
	public ArrayList<Property> getAllProperties(ClassDefinition cls) {
		ArrayList<Property> result = new ArrayList<Property>();
		// ensures that each property is added only once.
		for (Object prop : cls.getOwnedAttribute()) {
			if(!result.contains(prop)) result.add( (Property) prop);
		}
		for (Object stnext : cls.getSuperType()) {
			//ensures that each property is added only once.
			for (Object prop : getAllProperties((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)stnext).getTypeDefinition()))
			{
				if(!result.contains(prop)) result.add( (Property) prop);
			}
		}
		return result;
	}
	
	public void prettyPrint(String file_name) {
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
		for (int i=0; i<importedUnits.size(); i++) {
	        KermetaUnit iu = importedUnits.get(i);
	        if (STD_LIB_URI != null && iu == getStdLib()) continue;
	        pp.getImports().add(iu.getResolvedURI(uri));
	    }
		pp.getUsings().addAll(usings);
		pp.ppPackage(rootPackage, new File(file_name));
	}
	
	/**
	 * Save Kermeta model. Saving the Kermeta model consists on adding each package of the kermeta unit
	 * in the resource (the main containers)
	 * @param file_path the xmi file. the extension of the file should be .km
	 */
	public void saveAsXMIModel(String file_path) {
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new XMIResourceFactoryImpl());
	    ResourceSet resource_set = new ResourceSetImpl();
	    ArrayList resource_tags = new ArrayList();
	    Resource resource = resource_set.createResource(URI.createFileURI(file_path));
	    for (Package p : packages.values()) {
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
	public static void addFTagsToResource(Resource resource, ArrayList pTags)
	{   
	    int tagsize = pTags.size();
	    for (int i=0; i<tagsize; i++)
	    {   
	        Tag tag = (Tag)pTags.get(i);
	        resource.getContents().add(tag);
	    }
	}
	
	
	/**
	 * If containedPackage has no container, we return it unchanged, else, we return its container,
	 * with only this containedPackage container, and the container containers. 
	 * @param containedPackage
	 * @return
	 */
	public static Package getRootPackageForSerialization(Package containedPackage) {
		
		Package container = containedPackage.getNestingPackage();
		if (container == null)
			return containedPackage;
		while (container.getNestingPackage()!=null) container = container.getNestingPackage();
		/*Package newContainer = copyPackageStructure(container);
		newContainer.getNestedPackage().add(containedPackage);
		while(newContainer.getNestingPackage() != null) newContainer = newContainer.getNestingPackage();
		return newContainer;*/
		return container;
	}
	
	/**
	 * Create and return a copy of the given package
	 * @deprecated
	 */
	private Package copyPackageStructure(Package pkg) {
		Package result = struct_factory.createPackage();
		result.setName(pkg.getName());
		if (pkg.eContainer() != null) {
			result.setNestingPackage(copyPackageStructure(pkg.getNestingPackage()));
		}
		return result;
	}
	
	/**
	 * 
	 * @param p The package in which we want to fix the tags
	 * @param myTags The tags to be added to the XMI resource
	 * @return the list of myTags, completed
	 */
	public static ArrayList fixPackageTags(Package p, ArrayList myTags)
	{
	    TreeIterator it = p.eAllContents();
		while(it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Object o = (fr.irisa.triskell.kermeta.language.structure.Object)it.next();
			myTags.addAll(o.getTag());
		}
		// Add the tags of the package itself
		myTags.addAll(p.getTag());
		return myTags;
	}
	
	/**
	 * Define a container for each element of the root package.
	 */
	public static void fixTypeContainement(Package p) {
		TreeIterator it = p.eAllContents();
		TypeContainementFixer fixer = new TypeContainementFixer();
		while(it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Object o = (fr.irisa.triskell.kermeta.language.structure.Object)it.next();
			if (o instanceof CallExpression) {
			    CallExpression e = (CallExpression)o;
			    fixer.addContainedTypes(e.getStaticTypeVariableBindings(), e);
			}
			
			if (o instanceof Expression) {
				Expression e = (Expression)o;
				if (e.getStaticType() != null) {
					fixer.addContainedTypes(e.getStaticType(), e);
					
				}
			}
			else if (o instanceof TypeContainer) {
				if (o != null) fixer.accept(o);
			}
		}
	}
	
	/**
	 * Get all the tags attached to class members, and return
	 * them, in order to save them in a resource (when saving as
	 * XMI) */
	public ArrayList fixClassMemberTags(ClassDefinition o)
	{	// for the class
	    ArrayList oTags = new ArrayList();
	    oTags.addAll(o.getTag());
	    // for its members
	    EList opLst = o.getOwnedOperation();
	    EList atLst = o.getOwnedAttribute();
	    if (opLst.size()>0)
	    for (int i=0; i<opLst.size();i++)
	    {  oTags.addAll(((Operation)opLst.get(i)).getTag());}
	    if (atLst.size()>0)
	    for (int i=0; i<atLst.size();i++)
	    {  oTags.addAll(((Property)atLst.get(i)).getTag());
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
	            messages.addError("Unexpected load error : "+ t.getClass().getName()+ " " + t.getMessage(), null);
	        }
	    }
	}
	
	boolean loading = false;
	
	
	private void loadAllImportedUnits() {
		try{
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
			loading = false;}
	    catch(Throwable t) {	    	
	        if (!messages.hasError()) {
	            KermetaUnit.internalLog.error("Unexpected load error", t);
	            messages.addError("Unexpected load error : " + t.getClass().getName()+" " + t.getMessage(), null);
	        }
	    }
	}
	
	private void loadAllTypeDefinitions() {
		try{
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
	    catch(Throwable t) {
	        if (!messages.hasError()) {
	            KermetaUnit.internalLog.error("Unexpected load error", t);
	            messages.addError("Unexpected load error : " +t.getClass().getName()+ " " + t.getMessage(), null);
	        }
	    }
	}
	
	private void loadAllStructuralFeatures() {
		try{
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
	    catch(Throwable t) {
	        if (!messages.hasError()) {
	            KermetaUnit.internalLog.error("Unexpected load error", t);
	            messages.addError("Unexpected load error : " +t.getClass().getName()+ " " + t.getMessage(), null);
	        }
	    }
	}
	
	private void loadAllOppositeProperties() {
		try{
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
	    catch(Throwable t) {
	        if (!messages.hasError()) {
	            KermetaUnit.internalLog.error("Unexpected load error", t);
	            messages.addError("Unexpected load error : " +t.getClass().getName()+ " " + t.getMessage(), null);
	        }
	    }
	}
	
	private void loadAllBodies() {
		try{
			//	System.out.println("loadAllBodies " + uri);
			if (doneLoadBodies) return;
			loading = true;
			// load imported units
			loadBodies();
			doneLoadBodies = true;
			for(KermetaUnit iu : importedUnits)
				if (!iu.loading) iu.loadAllBodies();
			
			loading = false;
		}
	    catch(Throwable t) {
	        if (!messages.hasError()) {
	            KermetaUnit.internalLog.error("Unexpected load error", t);
	            messages.addError("Unexpected load error : " +t.getClass().getName()+ " " + t.getMessage(), null);
	        }
	    }
	}
	
	private void loadAllAnnotations() {
		try{
			// since loading is used for all loads, recursion makes it unconsistant - for standard 
			// package in particular, they are loaded twice if no "doneLoadAnnotation test" is done 
			if (doneLoadAnnotations) return;
		    loading = true;
		    loadAnnotations();
		    doneLoadAnnotations = true;
		    for(KermetaUnit iu : importedUnits)
		        if (!iu.loading) iu.loadAllAnnotations();
		    loading = false;
		}
	    catch(Throwable t) {
	        if (!messages.hasError()) {
	            KermetaUnit.internalLog.error("Unexpected load error", t);
	            messages.addError("Unexpected load error : " +t.getClass().getName()+ " " + t.getMessage(), null);
	        }
	    }
	}
	
	/**
	 * Any pre-load action like parsing for instance
	 */
	public abstract void preLoad();
	
	/**
	 * Loads annotations : attach annotation to the corresponding Kermeta elements
	 */
	public abstract void loadAnnotations();
	private boolean doneLoadAnnotations = false;
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
    
    public Package getRootPackage() { return rootPackage; }

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
