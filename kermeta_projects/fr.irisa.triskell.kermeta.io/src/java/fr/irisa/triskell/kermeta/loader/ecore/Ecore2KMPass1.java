

/*$Id: Ecore2KMPass1.java,v 1.17 2007-10-12 09:19:41 ftanguy Exp $
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.ast.helper.KMTHelper;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.modelhelper.StringHelper;

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
	
	public Ecore2KMPass1(KermetaUnit kermetaUnit, Ecore2KMDatas datas, boolean isQuickFixEnabled, Resource resource, IProgressMonitor monitor) {
		super(kermetaUnit, datas, isQuickFixEnabled, monitor);
		this.resource = resource;
	}
	
	
	@Override
	public Object visit(EAnnotation node) {

		String result = "";
		
		/*
		 * 
		 * The annotation is the compilation unit.
		 * 
		 */
		if ( node.getSource().equals("CompilationUnit") ) {
			
			if ( node.getDetails().containsKey( "require" ) ) {
				String s = (String) node.getDetails().get("require");
				String splits[] = s.split("\\|");
				for ( int i = 0; i < splits.length; i++ ) {
					kermetaUnit.addRequire( splits[i], null );
					/*String fileURI = "";
					if ( splits[i].equals("kermeta") ) {
						if ( kermetaUnit.isFramework() )
							fileURI = IOPlugin.getFrameWorkEcoreURI();
						else
							fileURI = IOPlugin.FRAMEWORK_KM_URI;
					} else if ( splits[i].matches("http://.+") )
						fileURI = splits[i];
					else if ( splits[i].matches("platform:/plugin.+") || splits[i].matches("platform:/resource.+") )
						fileURI = splits[i];
					else {
						int index = kermetaUnit.getUri().lastIndexOf("/");
						String path = kermetaUnit.getUri().substring(0, index);
						String relativeURI = path + "/" + splits[i];
						relativeURI = StringHelper.replaceExtension(relativeURI, "ecore");
						URI uri = URI.createURI( relativeURI );
						URIConverter converter = new URIConverterImpl();
						uri = converter.normalize(uri);
						uri = EcoreHelper.getCanonicalURI(uri);
						fileURI = uri.toString();
					}
					
					try {
						KermetaUnit importedUnit = IOPlugin.getDefault().getKermetaUnit( fileURI );
						kermetaUnit.getImportedKermetaUnits().add( importedUnit );
					} catch ( URIMalformedException exception ) {
						kermetaUnit.error( exception.getMessage() );
					}*/
				}
			}
			
			if ( node.getDetails().containsKey( "using" ) ) {
				String s = (String) node.getDetails().get("using");
				String splits[] = s.split("\\|");
				for ( int i = 0; i < splits.length; i++ )
					kermetaUnit.addUsing( splits[i] );
			}
						
		}
		
		return result;
		
	}
	
	/** Visit EPackage : visit the owned classifiers and the sub packages */
	public Object visit(EPackage node) {
		Package p = kermetaUnit.addInternalPackage( EcoreHelper.getQualifiedName(node) );

		// FIXME : we have to test if URI is valid as a file path or not!
		// Was : pack.setUri(node.getNsURI());
		// node.getNsURI() is not always valid, so by default, we will take unit.getUri();
		p.setUri( kermetaUnit.getUri() );
		
		packagesStack.push(p);
		
		acceptList(node.getEAnnotations());
		acceptList(node.getEClassifiers());
		acceptList(node.getESubpackages());
		
		packagesStack.pop();
		
		return p;
	}
	
	@Override
	public Object visit(EGenericType node) {
		if ( (node.getEClassifier() != null) && node.getEClassifier().eResource() != resource ) {
			KermetaUnit unitToImport;
			try {
				unitToImport = IOPlugin.getDefault().getKermetaUnit( node.getEClassifier().eResource().getURI().toString() );
				kermetaUnit.importKermetaUnit(unitToImport, false, false);
			} catch (URIMalformedException e) {
				e.printStackTrace();
			}
		}
		return super.visit(node);
	}
	
	/** Create a primitive type for given datatype */
    public Object visit(EDataType node) {
    	// Special case of datatype used to represent type for TypeVariable/FunctionType:
    	// no corresponding datatype in the KM representation
    	if(node.getName().equals(KM2Ecore.KERMETA_TYPES)) 
    		return null;
    	
    	/*
    	 * 
    	 * We do NOT create a new datatype if this one corresponds to one kermeta datatype.
    	 * 
    	 */
    	/*String qualifiedName = "kermeta::language::structure::" + node.getName();
    	currentPrimitiveType = (PrimitiveType) kermetaUnit.getTypeDefinitionByQualifiedName(qualifiedName);
    	if ( currentPrimitiveType == null ) {
    		// Create a primitive type
    		currentPrimitiveType = StructureFactory.eINSTANCE.createPrimitiveType();
    		currentPrimitiveType.setName( node.getName() );
    		
       		kermetaUnit.addTypeDefinition(currentPrimitiveType, getCurrentPackage());
    	}*/
    	
    	currentPrimitiveType = StructureFactory.eINSTANCE.createPrimitiveType();
    	currentPrimitiveType.setName( node.getName() );
    	kermetaUnit.addTypeDefinition(currentPrimitiveType, getCurrentPackage());
    	
    	datas.store(currentPrimitiveType, node);
    	return null;
    }
	
	/** Visit an EClass and convert it in a ClassDefinition*/
	public Object visit(EClass node) {
		/*
		 * 
		 * Creating the class definition.
		 * 
		 */
		isClassTypeOwner = true;
		currentClassDefinition = StructureFactory.eINSTANCE.createClassDefinition();
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

		return currentClassDefinition;
	}
    
	/** Converts an EOperation into kermeta type Operation. This method constructs the Operation
	 *  and sets its type. */
	public Object visit(EOperation node) {
		isClassTypeOwner = false;
		currentOperation = StructureFactory.eINSTANCE.createOperation();
		datas.store(currentOperation, node);
		
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
		datas.store(EcoreHelper.getQualifiedName(node), currentProperty);
	
		currentProperty.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		currentProperty.setIsOrdered(node.isOrdered());
		currentProperty.setIsUnique(node.isUnique());
		currentProperty.setUpper(node.getUpperBound());
		currentProperty.setLower(node.getLowerBound());
		currentProperty.setDefault(node.getDefaultValueLiteral());
		currentProperty.setIsDerived(node.isDerived());
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
			}
		} else if ( node.isDerived() )
			isc = false;
		
		if ( node.isDerived() ) {
			currentProperty.setIsGetterAbstract(true);
			currentProperty.setIsSetterAbstract(true);
		}
		
		currentProperty.setIsComposite(isc);
		return currentProperty;
	}

	/** Visit an EReference and convert it in a Property, with opposite if necessary. Also set
	 * its type. So, this method is supposed to be called after the visit of ETypes. */
	public Object visit(EReference node) {
		currentProperty = StructureFactory.eINSTANCE.createProperty();
		datas.store(EcoreHelper.getQualifiedName(node), currentProperty);
	
		currentProperty.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		currentProperty.setIsOrdered(node.isOrdered());
		currentProperty.setIsUnique(node.isUnique());
		currentProperty.setUpper(node.getUpperBound());
		currentProperty.setLower(node.getLowerBound());
		currentProperty.setDefault(node.getDefaultValueLiteral());
		currentProperty.setIsDerived(node.isDerived());
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
		
		if ( node.isDerived() ) {
			currentProperty.setIsGetterAbstract(true);
			currentProperty.setIsSetterAbstract(true);
		}
		
		return currentProperty;
	}
	
	public Object visit(EEnum node) {
		currentEnumeration = (Enumeration) datas.getTypeDefinition(node);
		if ( currentEnumeration == null ) {
			currentEnumeration = StructureFactory.eINSTANCE.createEnumeration();
			datas.store(currentEnumeration, node);
		}
		
		currentEnumeration.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		
		kermetaUnit.addTypeDefinition(currentEnumeration, getCurrentPackage());
		//getTopPackage().getOwnedTypeDefinition().add(currentEnumeration);
		acceptList(node.getELiterals());
		return currentEnumeration;
	}
	
	public Object visit(EEnumLiteral node) {
		EnumerationLiteral lit = StructureFactory.eINSTANCE.createEnumerationLiteral();
		lit.setEnumeration(currentEnumeration);
		lit.setName(node.getName());
		return lit;
	}

}


