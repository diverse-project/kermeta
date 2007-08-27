package fr.irisa.triskell.kermeta.exporter.ecore;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

public class KM2EcorePass3 extends KM2Ecore {
	

	private Hashtable<String, EDataType> datatypes = new Hashtable<String, EDataType> ();
	
	public KM2EcorePass3(Resource resource, Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject> mapping, KermetaUnit kermetaUnit, EDataType kermetaTypesAlias, ExporterOptions exporterOptions) {
		super(resource, kermetaUnit, kermetaTypesAlias, exporterOptions);
		km2ecoremapping = mapping;
	}

	@Override
	public Object visitPackage(Package node) {
		if ( currentPackage == null )
			currentPackage = node;
		return super.visitPackage(node);
	}
	
	@Override
	public Object visitProperty(Property node) {

		EStructuralFeature feature = (EStructuralFeature) km2ecoremapping.get( node );
		
		if ( node.getType() instanceof Class ) {
		
			TypeDefinition typeDefinition = (TypeDefinition) ((Class) node.getType()).getTypeDefinition();
			String qualifiedName = NamedElementHelper.getQualifiedName( typeDefinition );
			String javaClassQualifiedName = primitive_types_mapping.get( qualifiedName );
			if ( javaClassQualifiedName != null ) {
				EDataType type = datatypes.get( qualifiedName );
				if ( type == null ) {
					type = EcoreFactory.eINSTANCE.createEDataType();
					datatypes.put( qualifiedName, type );
					type.setName( typeDefinition.getName() );
					type.setInstanceClassName( javaClassQualifiedName );
					EPackage currentEcorePackage = (EPackage) km2ecoremapping.get( currentPackage );
					currentEcorePackage.getEClassifiers().add( type );
				}
				feature.setEType( type );
			}
		
		}

		return null;
	
	
	}
	
	@Override
	public Object visitOperation(Operation node) {
		EOperation operation = (EOperation) km2ecoremapping.get( node );
		
		if ( node.getType() instanceof Class ) {
		
			TypeDefinition typeDefinition = (TypeDefinition) ((Class) node.getType()).getTypeDefinition();
			String qualifiedName = NamedElementHelper.getQualifiedName( typeDefinition );
			String javaClassQualifiedName = primitive_types_mapping.get( qualifiedName );
			if ( javaClassQualifiedName != null ) {
				EDataType type = datatypes.get( qualifiedName );
				if ( type == null ) {
					type = EcoreFactory.eINSTANCE.createEDataType();
					datatypes.put( qualifiedName, type );
					type.setName( typeDefinition.getName() );
					type.setInstanceClassName( javaClassQualifiedName );
					EPackage currentEcorePackage = (EPackage) km2ecoremapping.get( currentPackage );
					currentEcorePackage.getEClassifiers().add( type );
				}
				operation.setEType( type );
			}
		
		}
		return super.visitOperation(node);
	}
	
	@Override
	public Object visitParameter(Parameter node) {
		EParameter parameter = (EParameter) km2ecoremapping.get( node );
		
		if ( node.getType() instanceof Class ) {
		
			TypeDefinition typeDefinition = (TypeDefinition) ((Class) node.getType()).getTypeDefinition();
			String qualifiedName = NamedElementHelper.getQualifiedName( typeDefinition );
			String javaClassQualifiedName = primitive_types_mapping.get( qualifiedName );
			if ( javaClassQualifiedName != null ) {
				EDataType type = datatypes.get( qualifiedName );
				if ( type == null ) {
					type = EcoreFactory.eINSTANCE.createEDataType();
					datatypes.put( qualifiedName, type );
					type.setName( typeDefinition.getName() );
					type.setInstanceClassName( javaClassQualifiedName );
					EPackage currentEcorePackage = (EPackage) km2ecoremapping.get( currentPackage );
					currentEcorePackage.getEClassifiers().add( type );
				}
				parameter.setEType( type );
			}
		
		}
		return null;
	}

	@Override
	public Object visitClassDefinition(ClassDefinition node) {

		EClass c = (EClass) km2ecoremapping.get( node );
		
		for ( Type supertype : node.getSuperType() ) {
			
			if ( supertype instanceof Class ) {
				
				ClassDefinition cdef = (ClassDefinition) ((Class) supertype).getTypeDefinition();
				String qualifiedName = NamedElementHelper.getQualifiedName( cdef );
				if ( qualifiedName.equals("kermeta::language::structure::Object") || qualifiedName.equals("kermeta::standard::Object") ) {
					
					for ( EClass cl : c.getESuperTypes() ) {
						String eQualifiedName = EcoreHelper.getQualifiedName( cl );
						if ( eQualifiedName.equals(qualifiedName) ) {
							c.getESuperTypes().remove( cl );
							break;
						}	
					}
					
				}
				
			}
			
		}
		
		return super.visitClassDefinition(node);
	}
}
