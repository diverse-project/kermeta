

/*$Id: Ecore2KMPass1.java,v 1.37 2008-10-16 09:36:48 cfaucher Exp $
* Project : org.kermeta.io
* File : 	Ecore2KMpass1.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.loader.ecore;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecoretools.registration.EMFRegistryHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.parser.helper.KMTHelper;

/**
 * 
 * 
 * Collecting the requires and the usings.
 * Creating the structure : package, type definitions, operations, parameters, attributes, type parameter.
 * 
 * @author paco
 *
 */
public class Ecore2KMPass1 extends Ecore2KMPass {

	private Resource resource = null; 
	
	/**		A node can be visited as definition or as type. This boolean set to true means that the action top perform is a creation.		*/
	private boolean creation = true;
	
	public Ecore2KMPass1(KermetaUnit kermetaUnit, Ecore2KMDatas datas, boolean isQuickFixEnabled, Resource resource, IProgressMonitor monitor) {
		super(kermetaUnit, datas, isQuickFixEnabled, monitor);
		this.resource = resource;
		kermetaUnit.addRequire("kermeta", null);
	}
	
	
	@Override
	public Object visit(EAnnotation node) {

		String result = "";
		
		/*
		 * 
		 * Special case for kermeta_java.ecore because it needs the framework but it has no requires info.
		 * So we have to add it manually.
		 * 
		 */
		if ( kermetaUnit.getUri().equals("platform:/resource/fr.irisa.triskell.kermeta.model/build/ecore/kermeta_java.ecore"))
			kermetaUnit.addRequire("kermeta", null);
		
		/*
		 * 
		 * The annotation is the compilation unit.
		 * 
		 */
		if ( node.getSource().equals("ModelingUnit") ) {
			
			if ( node.getDetails().containsKey( "require" ) ) {
				String s = (String) node.getDetails().get("require");
				String splits[] = s.split("\\|");
				for ( int i = 0; i < splits.length; i++ ) {
					kermetaUnit.addRequire( splits[i], null );
				}
			}
			
			if ( node.getDetails().containsKey( "using" ) ) {
				String s = (String) node.getDetails().get("using");
				String splits[] = s.split("\\|");
				for ( int i = 0; i < splits.length; i++ )
					kermetaUnit.addUsing( splits[i] );
			}
						
		} else if ( node.getDetails().containsKey("mainClass") ) {
			Tag tag = KermetaModelHelper.Tag.create("mainClass", node.getDetails().get("mainClass") );
			kermetaUnit.getModelingUnit().getOwnedTags().add( tag );
		} else if ( node.getDetails().containsKey("mainOperation") ) {
			Tag tag = KermetaModelHelper.Tag.create("mainOperation", node.getDetails().get("mainOperation") );
			kermetaUnit.getModelingUnit().getOwnedTags().add( tag );
		}
			
		
		return result;
		
	}
	
	/** Visit EPackage : visit the owned classifiers and the sub packages */
	public Object visit(EPackage node) {
		Package p = kermetaUnit.addInternalPackage( EcoreHelper.getQualifiedName(node) );
		Tag t = KermetaModelHelper.Tag.create("ecore", "true");
		p.getOwnedTags().add(t);
		// FIXME : we have to test if URI is valid as a file path or not!
		// Was : pack.setUri(node.getNsURI());
		// node.getNsURI() is not always valid, so by default, we will take unit.getUri();
		if ( (node.getNsURI() != null) && (! node.getNsURI().equals("")) )
			p.setUri( node.getNsURI() );
		else
			p.setUri( kermetaUnit.getUri() );
		
		packagesStack.push(p);
		
		acceptList(node.getEAnnotations());
		for ( EClassifier c : node.getEClassifiers() ) {
			creation = true;
			accept(c);
		}
		//acceptList(node.getEClassifiers());
		acceptList(node.getESubpackages());
		
		packagesStack.pop();
		
		return p;
	}
	
	@Override
	public Object visit(EGenericType node) {
		if ( node.getEClassifier() != null ) {
			creation = false;
			accept(node.getEClassifier());
		}
/*		if ( (node.getEClassifier() != null) && node.getEClassifier().eResource() != resource ) {
			KermetaUnit unitToImport;
			try {
				unitToImport = IOPlugin.getDefault().getKermetaUnit( node.getEClassifier().eResource().getURI().toString() );
				kermetaUnit.getImportedKermetaUnits().add( unitToImport );
//				kermetaUnit.addRequire( unitToImport.getUri(), unitToImport );
			} catch (URIMalformedException e) {
				e.printStackTrace();
			} catch (NotRegisteredURIException e) {
				e.printStackTrace();
			}
		}
		return super.visit(node);*/
		return null;
	}

	
	/** Create a primitive type for given datatype */
    public Object visit(EDataType node) {
    	if ( ! isExternal(node) ) {
	    	// Special case of datatype used to represent type for TypeVariable/FunctionType:
	    	// no corresponding datatype in the KM representation
	    	if(node.getName().equals(KM2Ecore.KERMETA_TYPES)) 
	    		return null;
	    	
	    	// A datatype can be visited several times :
	    	// - when visited like a type definition
	    	// - when visited like a type
	    	if ( datas.getPrimitiveType(node) == null ) {
	    		currentPrimitiveType = KermetaModelHelper.PrimitiveType.create( node.getName() );
	    		Tag t = KermetaModelHelper.Tag.create("ecore", "true");
	    		currentPrimitiveType.getOwnedTags().add(t);
	    		if ( !datas.value_types.contains(EcoreHelper.getQualifiedName(node)) ) {
		    		if ( node.getInstanceClassName() != null ) {
		    			Tag t0 = KermetaModelHelper.Tag.create("ecore.EDataType_instanceClassName", node.getInstanceClassName());
		    			currentPrimitiveType.getOwnedTags().add(t0);
		    		}
		    		
		    		if ( node.isSerializable() ) {
		    			Tag t1 = KermetaModelHelper.Tag.create("ecore.EDataType_isSerializable", "true");
			    		currentPrimitiveType.getOwnedTags().add(t1);
		    		}
		    		
		    		
		    		if( node.getETypeParameters()!=null && node.getETypeParameters().size()>0 ) {
		    			String str_etp = "";
		    			int i=0;
			    		for( ETypeParameter etp : node.getETypeParameters() ) {
			    			if( i!=0 ) {
			    				str_etp += " , ";
			    			}
			    			str_etp += etp.getName();
			    			i++;
			    		}
			    		Tag t2 = KermetaModelHelper.Tag.create("ecore.EDataType_eTypeParameters", str_etp);
		    			currentPrimitiveType.getOwnedTags().add(t2);
		    		}
		    	}
	    		
	    		kermetaUnit.addTypeDefinition(currentPrimitiveType, getCurrentPackage());
	    		datas.store(currentPrimitiveType, node);
	    	}
    	}
    	return null;
    }
	
	/** Visit an EClass and convert it in a ClassDefinition*/
	public Object visit(EClass node) {
		if ( ! isExternal(node) && creation && datas.getTypeDefinition(node) == null ) {
			/*
			 * 
			 * Creating the class definition.
			 * 
			 */
			isClassTypeOwner = true;
			currentClassDefinition = StructureFactory.eINSTANCE.createClassDefinition();
			Tag t = KermetaModelHelper.Tag.create("ecore", "true");
			currentClassDefinition.getOwnedTags().add(t);
			currentClassDefinition.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
			currentClassDefinition.setIsAbstract(node.isAbstract() || node.isInterface());
			datas.store(currentClassDefinition, node);
			kermetaUnit.addTypeDefinition(currentClassDefinition, getCurrentPackage());
	
			/*
			 * 
			 * Creating the type parameters.
			 * 
			 */
			for ( ETypeParameter tp : node.getETypeParameters() ) {
				ObjectTypeVariable tv = StructureFactory.eINSTANCE.createObjectTypeVariable();
				tv.setName( tp.getName() );
				datas.store(tp, tv);
				currentClassDefinition.getTypeParameter().add( tv );
			}
			
			/*
			 * 
			 * Creating the attributes.
			 * 
			 */
			acceptList(((EClass)node).getEStructuralFeatures());
			/*
			 * 
			 * Creating the operations.
			 * 
			 */
			acceptList(((EClass)node).getEOperations());
			acceptList(node.getEAnnotations());
			acceptList( node.getESuperTypes() );
	
			return currentClassDefinition;
		}
		return null;
	}
    
	/** Converts an EOperation into kermeta type Operation. This method constructs the Operation
	 *  and sets its type. */
	public Object visit(EOperation node) {
		isClassTypeOwner = false;
		currentOperation = StructureFactory.eINSTANCE.createOperation();
		datas.store(currentOperation, node);
		Tag t = KermetaModelHelper.Tag.create("ecore", "true");
		currentOperation.getOwnedTags().add(t);
		currentOperation.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		
		currentOperation.setIsOrdered(node.isOrdered());
		currentOperation.setIsUnique(node.isUnique());
		currentOperation.setLower(node.getLowerBound());
		currentOperation.setUpper(node.getUpperBound());
		currentOperation.setIsAbstract(true);
		
		currentOperation.setOwningClass(currentClassDefinition);
		
		/*
		 * 
		 * Creating the type parameters.
		 * 
		 */
		for ( ETypeParameter tp : node.getETypeParameters() ) {
			ObjectTypeVariable tv = StructureFactory.eINSTANCE.createObjectTypeVariable();
			tv.setName( tp.getName() );
			datas.store(tp, tv);
			currentOperation.getTypeParameter().add( tv );
		}
		
		/*
		 * 
		 * Creating the parameters.
		 * 
		 */
		acceptList( node.getEParameters() );
		
		return currentOperation;
	}
	
	@Override
	public Object visit(EParameter node) {
		// Create a Parameter
		Parameter param = StructureFactory.eINSTANCE.createParameter();
		// Patch that escapes (with '~') Ecore names that corrresponds to KerMeta keywords.
		param.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		param.setIsOrdered(node.isOrdered());
		param.setIsUnique(node.isUnique());
		param.setUpper(node.getUpperBound());
		param.setLower(node.getLowerBound());
		param.setOperation(currentOperation);
		return param;
	}
	
	/** Visit an EAttribute and convert it in a Property. Also set its type; 
	 * so, this method is supposed to be called after the visit of ETypes.
	 * Note : an EAttribute has no opposite. */
	public Object visit(EAttribute node) {
		// Create the property
		currentProperty = StructureFactory.eINSTANCE.createProperty();
		Tag t = KermetaModelHelper.Tag.create("ecore", "true");
		currentProperty.getOwnedTags().add(t);
		datas.store(EcoreHelper.getQualifiedName(node), currentProperty);
	
		currentProperty.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		currentProperty.setIsOrdered(node.isOrdered());
		currentProperty.setIsUnique(node.isUnique());
		currentProperty.setUpper(node.getUpperBound());
		currentProperty.setLower(node.getLowerBound());
		currentProperty.setDefault(node.getDefaultValueLiteral());
		currentProperty.setIsDerived(node.isDerived());
		currentProperty.setIsReadOnly(!node.isChangeable());
		currentProperty.setOwningClass(currentClassDefinition);
		// EAttribute specific values
		currentProperty.setIsID(node.isID());
		// Composite? -> we get an annotation if there is one, otherwise by default it is composite.
		boolean isc = true;
		EAnnotation eAnnot = node.getEAnnotation(KM2Ecore.ANNOTATION);
		if(eAnnot != null) {
			if (eAnnot.getDetails().containsKey(KM2Ecore.ANNOTATION_ISCOMPOSITE_DETAILS)) {
				String res = (String)eAnnot.getDetails().get(KM2Ecore.ANNOTATION_ISCOMPOSITE_DETAILS);
				isc = Boolean.valueOf(res);
			} else if ( node.isDerived() )
				isc = false;
		} else if ( node.isDerived() )
			isc = false;
		
		if ( node.isDerived() ) {
			currentProperty.setIsGetterAbstract(true);
			currentProperty.setIsSetterAbstract(true);
		}
		
		addTransientTag(node, currentProperty);
		
		currentProperty.setIsComposite(isc);
		accept(node.getEAttributeType());
		return currentProperty;
	}

	/** Visit an EReference and convert it in a Property, with opposite if necessary. Also set
	 * its type. So, this method is supposed to be called after the visit of ETypes. */
	public Object visit(EReference node) {	
		/*
		 * 
		 * IMPORTANT : check if the type is a cross reference. If it is, add a dependency to its kermeta unit.
		 * 
		 */
		/*if ( node.getEType().eResource() != node.eResource() ) {
			try {
				kermetaUnit.getImportedKermetaUnits().add( IOPlugin.getDefault().getKermetaUnit(node.getEType().eResource().getURI().toString()) );
			} catch (URIMalformedException e) {
				e.printStackTrace();
			} catch (NotRegisteredURIException e) {
				e.printStackTrace();
			}
		}*/
		
		currentProperty = StructureFactory.eINSTANCE.createProperty();
		datas.store(EcoreHelper.getQualifiedName(node), currentProperty);
		Tag t = KermetaModelHelper.Tag.create("ecore", "true");
		currentProperty.getOwnedTags().add(t);
		currentProperty.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		currentProperty.setIsOrdered(node.isOrdered());
		currentProperty.setIsUnique(node.isUnique());
		currentProperty.setUpper(node.getUpperBound());
		currentProperty.setLower(node.getLowerBound());
		currentProperty.setDefault(node.getDefaultValueLiteral());
		currentProperty.setIsDerived(node.isDerived());
		currentProperty.setIsReadOnly(!node.isChangeable());
		currentProperty.setOwningClass(currentClassDefinition);
		// EReference specific values
		currentProperty.setIsID(false);
		currentProperty.setIsComposite(node.isContainment());
		// Set the opposite of this property
		if (node.getEOpposite() != null) {
			Property oprop = (Property) datas.getProperty(EcoreHelper.getQualifiedName(node.getEOpposite()));
			if ( oprop == null) {
				oprop = StructureFactory.eINSTANCE.createProperty();
				datas.store(EcoreHelper.getQualifiedName(node.getEOpposite()), oprop);
			}
			currentProperty.setOpposite(oprop);
		}
		
		addTransientTag(node, currentProperty);
		
		if ( node.isDerived() ) {
			currentProperty.setIsGetterAbstract(true);
			currentProperty.setIsSetterAbstract(true);
		}
		
		accept( node.getEGenericType() );
		
		return currentProperty;
	}
	
	public Object visit(EEnum node) {
		if ( ! isExternal(node) ) {
			currentEnumeration = (Enumeration) datas.getTypeDefinition(node);
			if ( currentEnumeration == null ) {
				currentEnumeration = KermetaModelHelper.Enumeration.create(KMTHelper.getUnescapedIdentifier(node.getName()));
				Tag t = KermetaModelHelper.Tag.create("ecore", "true");
				currentEnumeration.getOwnedTags().add(t);
				datas.store(currentEnumeration, node);
				kermetaUnit.addTypeDefinition(currentEnumeration, getCurrentPackage());
				acceptList(node.getELiterals());
			}		
			return currentEnumeration;
		}
		return null;
	}
	
	private boolean isExternal(EObject o) {
		boolean external = o.eResource() != resource;
		if ( external ) {
			try {
				// get the uri of the containing resource for this object
				String uri = o.eResource().getURI().toString(); // by default use the declared resource URI

				// maybe it comes from a registered EPackage, if true, use it instead
				if(o instanceof EClass){
					EPackage pack = (EPackage) o.eContainer();
					//EPackage.Registry.INSTANCE.getEPackage(pack.getNsURI())
					if(EMFRegistryHelper.isRegistered(pack)){
						uri = pack.getNsURI();
					}
				}
				//EPackage.Registry.INSTANCE.containsKey((EPackage)o.eContainer())
				KermetaUnit unitToImport = IOPlugin.getDefault().getKermetaUnit( uri );
				if ( ! unitToImport.isFramework() ) {
					kermetaUnit.getImportedKermetaUnits().add( unitToImport );
					kermetaUnit.addRequire(unitToImport.getUri(), unitToImport);
				}
			} catch (URIMalformedException e) {
				e.printStackTrace();
			} catch (NotRegisteredURIException e) {
				e.printStackTrace();
			}
		} else {
			external = ! KermetaModelHelper.NamedElement.qualifiedName(getCurrentPackage()).equals( EcoreHelper.getQualifiedName( (ENamedElement) o.eContainer()) );
		}
		return external;
	}
	
	private void addTransientTag(EStructuralFeature feature, Property prop) {
		if ( feature.isTransient() ) {
			Tag t = KermetaModelHelper.Tag.create("ecore.isTransient", "true");
			prop.getOwnedTags().add(t);
		}
	}
	
	public Object visit(EEnumLiteral node) {
		EnumerationLiteral lit = StructureFactory.eINSTANCE.createEnumerationLiteral();
		lit.setEnumeration(currentEnumeration);
		lit.setName(node.getName());
		return lit;
	}

}


