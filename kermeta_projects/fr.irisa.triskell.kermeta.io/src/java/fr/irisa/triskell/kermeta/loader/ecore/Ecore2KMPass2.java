/* $Id: Ecore2KMPass2.java,v 1.23 2007-09-13 09:04:49 ftanguy Exp $
 * Project : Kermeta io
 * File : ECore2Kermeta.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 mai 2005
 * Author : Franck Fleurey
 */ 

package fr.irisa.triskell.kermeta.loader.ecore;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.ast.helper.KMTHelper;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
/**
 * @author Franck Fleurey
 */
public class Ecore2KMPass2 extends Ecore2KMPass {

	public Ecore2KMPass2(KermetaUnit kermetaUnit, Ecore2KMDatas datas, boolean isQuickFixEnabled, IProgressMonitor monitor) {
		super(kermetaUnit, datas, isQuickFixEnabled, monitor);
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
	
	/** Visit an EClass and convert it in a ClassDefinition*/
	public Object visit(EClass node) {
		
		isClassTypeOwner = true;
		currentClassDefinition = createClassDefinitionForEClass(node);
		
		//TypeDefinition td = kermetaUnit.getTypeDefinitionByQualifiedName(EcoreHelper.getQualifiedName(node));
		
/*		// Return a typedef if the element is not contained in ecore metamodel.
		isEcoreType = ((ENamedElement)node.eContainer()).getName().equals("ecore");
		if (td != null && isEcoreType) {
			// Ignore duplicate definition due to the ecore reflexivity
			currentClassDefinition = (ClassDefinition)td;
			kermetaUnit.warning("Ignore duplicate definition of ecore Type " + EcoreHelper.getQualifiedName(node), td);
			
			for ( EAttribute attribute : node.getEAttributes() ) {
				Property p = ClassDefinitionHelper.getPropertyByName( currentClassDefinition, attribute.getName() );
				String qualifiedName = EcoreHelper.getQualifiedName(attribute);
				datas.store(qualifiedName, p);
			}
			
			for ( EReference reference : node.getEReferences() ) {
				Property p = ClassDefinitionHelper.getPropertyByName( currentClassDefinition, reference.getName() );
				String qualifiedName = EcoreHelper.getQualifiedName(reference);
				datas.store(qualifiedName, p);
			}
			
			for ( EOperation operation : node.getEOperations() ) {
				Operation o = ClassDefinitionHelper.getOperationByName( currentClassDefinition, operation.getName() );
				datas.store(o, operation);
			}
			
			return td;
		}*/
		
		// Should we ignore the ecore metamodel types?
		getTopPackage().getOwnedTypeDefinition().add(currentClassDefinition);

		acceptList(((EClass)node).getEStructuralFeatures());
		acceptList(((EClass)node).getEOperations());
		acceptList(node.getEAnnotations());
				
		return currentClassDefinition;
	}
	
	/** Visit an EAttribute and convert it in a Property. Also set its type; 
	 * so, this method is supposed to be called after the visit of ETypes.
	 * Note : an EAttribute has no opposite. */
	public Object visit(EAttribute node) {
		// Create the property
		Property prop = createPropertyFromEStructuralFeature(node);
		
		// EAttribute specific values
		prop.setIsID(node.isID());
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
		prop.setIsComposite(isc);
		return prop;
	}
	
	/** Visit an EReference and convert it in a Property, with opposite if necessary. Also set
	 * its type. So, this method is supposed to be called after the visit of ETypes. */
	public Object visit(EReference node) {
		Property prop = createPropertyFromEStructuralFeature(node);
		// EReference specific values
		prop.setIsID(false);
		prop.setIsComposite(node.isContainment());
		// Set the opposite of this property
		if (node.getEOpposite() != null) {
			Property oprop = (Property) datas.getProperty(EcoreHelper.getQualifiedName(node.getEOpposite()));
			if ( oprop == null) {
				oprop = StructureFactory.eINSTANCE.createProperty();
				datas.store(EcoreHelper.getQualifiedName(node.getEOpposite()), oprop);
			}
			prop.setOpposite(oprop);
		}
		return prop;
	}
	
	/** This is a method shared by the visit methods of EAttribute and EReference. Sets
	 * all the properties of the resulting node, including the type. */
	protected Property createPropertyFromEStructuralFeature(EStructuralFeature node)
	{
		Property prop = (Property) datas.getProperty(EcoreHelper.getQualifiedName(node));
		if (prop == null) {
			prop = StructureFactory.eINSTANCE.createProperty();
			datas.store(EcoreHelper.getQualifiedName(node), prop);
		}
		currentProperty = prop;
		
		prop.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		
		prop.setIsOrdered(node.isOrdered());
		prop.setIsUnique(node.isUnique());
		prop.setUpper(node.getUpperBound());
		prop.setLower(node.getLowerBound());
		prop.setDefault(node.getDefaultValueLiteral());
		prop.setIsDerived(node.isDerived());
		prop.setOwningClass(currentClassDefinition);
		
		return prop;
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
		
		currentOperation.setOwningClass(currentClassDefinition);		
		return currentOperation;
	}
	
	public Object visit(EEnum node) {
		currentEnumeration = (Enumeration) datas.getTypeDefinition(node);
		if ( currentEnumeration == null ) {
			currentEnumeration = StructureFactory.eINSTANCE.createEnumeration();
			datas.store(currentEnumeration, node);
		}
		
		currentEnumeration.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		
		getTopPackage().getOwnedTypeDefinition().add(currentEnumeration);
		acceptList(node.getELiterals());
		return currentEnumeration;
	}
	
	public Object visit(EEnumLiteral node) {
		EnumerationLiteral lit = StructureFactory.eINSTANCE.createEnumerationLiteral();
		lit.setEnumeration(currentEnumeration);
		lit.setName(node.getName());
		return lit;
	}
	
	/** Create a primitive type for given datatype */
    public Object visit(EDataType node) {
    	// Special case of datatype used to represent type for TypeVariable/FunctionType:
    	// no corresponding datatype in the KM representation
    	if(node.getName().equals(KM2Ecore.KERMETA_TYPES)) 
    		return null;
    	
    	// Create a primitive type
        PrimitiveType result = createPrimitiveTypeForEDataType(node);
        currentPrimitiveType = result;

        datas.store(currentPrimitiveType, node);
        
        // BEGIN HORRIBLE TEMPORARY PATCH (the if)
        // This condition is used because we use the visitor for the definition of the type of model
        // elements, and sometimes, current package is null
        if (getTopPackage()!=null) {
        	getTopPackage().getOwnedTypeDefinition().add(result);
        }
    	 // END HORRIBLE TEMPORARY PATCH

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
					o.getOwnedTag().add(tag); // the tag is owned by this object
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
	
	/**
	 * Create a primitive type for given datatype.
	 * Doesn't set yet the instance class name of the primitive type (done
	 * in Ecore2KMPass2)
	 *  */
	public PrimitiveType createPrimitiveTypeForEDataType(EDataType etype) 
	{
		PrimitiveType result = datas.getPrimitiveType(etype);
		if (result == null)
		{
			result = StructureFactory.eINSTANCE.createPrimitiveType();
			result.setName(etype.getName());
			datas.store(result, etype);
		}
		return result; 
	}
	
	/** Get and complete the classDefinition equivalence for the given eclass */
	public ClassDefinition createClassDefinitionForEClass(EClass node)
	{	
		ClassDefinition result = (ClassDefinition) datas.getTypeDefinition( node );
		if (result == null)
		{
			result = StructureFactory.eINSTANCE.createClassDefinition();
			
			result.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
			
			result.setIsAbstract(node.isAbstract() || node.isInterface());
			datas.store(result, node);
		}
		return result;
	}
	



	





}
