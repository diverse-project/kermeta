/* $Id: Model.java,v 1.8 2008-02-14 07:13:57 uid21732 Exp $
 * Project : Kermeta interpreter
 * File : ModelType.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 14, 2006
 * Authors : 
 * 		Jim Steel
 */
package fr.irisa.triskell.kermeta.runtime.language;

import java.util.ArrayList;


import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.DataType;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.typechecker.TypeConformanceChecker;

public class Model {
	/** Implementation of method add called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Model.add(self, element)
	*/
	public static RuntimeObject add(RuntimeObject self, RuntimeObject element) {
		// There probably needs to be some sort of check here that the object being added
		// is an acceptable type for the model type.
		RuntimeObject contents_collection = self.getProperties().get("contents");
		ReflectiveCollection.add(contents_collection, element);
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	/** Implementation of method add called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Model.addAllCompatible(self, Collection<Object>)
	*/
	public static RuntimeObject addAllCompatible(RuntimeObject self, RuntimeObject elements) {
		RuntimeObjectFactory factory = self.getFactory();
		
		// There probably needs to be some sort of check here that the object being added
		// is an acceptable type for the model type.
		//RuntimeObject contents_collection = self.getProperties().get("contents");
		//ReflectiveCollection.add(contents_collection, element);
		
		// creates the collection for the result
		// will contain a list of the objects that have been added
		
	    
	    GenericTypeDefinition typeVarClassDef  = (GenericTypeDefinition)factory.getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::language::structure::Object");
	    fr.irisa.triskell.kermeta.language.structure.Class typeParam = StructureFactory.eINSTANCE.createClass();
	    typeParam.setTypeDefinition(typeVarClassDef);
		
	    
	    RuntimeObject result = Collection.create("kermeta::standard::Set", factory, typeParam);
	    
		
		// For all elements in the input collection
	    ArrayList elemArray = (ArrayList)elements.getJavaNativeObject();
	    for(java.lang.Object elem : elemArray ){
	    	RuntimeObject roElement = (RuntimeObject)elem;
	    		 
	    	RuntimeObject addedObject = Model.addCompatible(self, roElement);
	    	// add the element in the result collection
	    	if(!addedObject.equals(factory.getMemory().voidINSTANCE)){
	    		Collection.add(result, addedObject);
	    	}
	    }    
		
		return result;
	}
	
	/** Implementation of method add called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Model.addCompatible(self, Object)
	 * returns the object if is was added, void otherwise
	*/
	public static RuntimeObject addCompatible(RuntimeObject model, RuntimeObject element) {
		RuntimeObjectFactory factory = model.getFactory();
		
		// if this object is conform to one of the type of this model, add it
		Type elementType = (Type)element.getMetaclass().getKCoreObject();

		fr.irisa.triskell.kermeta.language.structure.ModelType modelType =
			(fr.irisa.triskell.kermeta.language.structure.ModelType) ((RuntimeObject) model.getModelType()).getKCoreObject();
		//ModelTypeDefinition modelTypeDef = (ModelTypeDefinition)modelType.getTypeDefinition();
		// for each of the type def of this model type def check if it is conformant
		for(java.lang.Object oTypeDef : modelType.getIncludedTypeDefinition()){
			Type requiredType = null; 
			if(oTypeDef instanceof ClassDefinition){
				fr.irisa.triskell.kermeta.language.structure.Class aclass = StructureFactory.eINSTANCE.createClass();
				aclass.setTypeDefinition((ClassDefinition)oTypeDef);
				if(!((ClassDefinition)oTypeDef).getTypeParameter().isEmpty()){
					// TODO do not deal with Parametrized ClassDefinition
					// must be done ...
				}
				requiredType =aclass;				
			}
			else if(oTypeDef instanceof fr.irisa.triskell.kermeta.language.structure.ModelType) {
				requiredType = (fr.irisa.triskell.kermeta.language.structure.ModelType) oTypeDef;
			}
			else if(oTypeDef instanceof DataType){
				requiredType =(DataType)oTypeDef;
			} 
			if (requiredType != null){
				if(TypeConformanceChecker.conforms(requiredType, elementType, model.getFactory().getMemory().getTypeCheckerContext())){
					// this element is compatible
					Model.add(model, element);
					return element;
				}
			}
		}
		return factory.getMemory().voidINSTANCE;
	}
}
