/* $Id: String.java,v 1.17 2008-07-24 14:19:19 cfaucher Exp $
* Project : Kermeta interpreter
* File : String.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 mai 2005
* Author : Franck Fleurey
*/ 


package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

/** 
 * Implementation of Kermeta base type String 
 */
public class String {
    
	/** Implementation of method compareTo called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::compareTo(other)
	 */
	public static RuntimeObject compareTo(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, getValue(self).compareTo(getValue(param0)));
		return result;
	}
	
	/** Implementation of method equals called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::equals(element)
	 */
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self).equals(getValue(param0))) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	/** Implementation of method isNotEqual called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Character::isNotEqual(element)
	 */
	public static RuntimeObject isNotEqual(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self).equals(getValue(param0))) return self.getFactory().getMemory().falseINSTANCE;
		else return self.getFactory().getMemory().trueINSTANCE;
	}

	/** Implementation of method plus called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::plus(other)
	 */
	public static RuntimeObject plus(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		setValue(result, getValue(self) + getValue(param0));
		return result;
	}

	/** 
	 * Implementation of method append called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::append(other)
	 * A more efficient method is kermeta::utils::StringBuffer::append(other)
	 */
	public static RuntimeObject append(RuntimeObject self, RuntimeObject param0) {
		setValue(self, getValue(self) + getValue(param0));
		return self.getFactory().getMemory().voidINSTANCE;
	}

	/** Implementation of method elementAt called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::elementAt(index)
	 */
	public static RuntimeObject elementAt(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Character");
		Character.setValue(result, getValue(self).charAt(Integer.getValue(param0)));
		return result;
	}

	/** Implementation of method indexOf called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::indexOf(str)
	 */
	public static RuntimeObject indexOf(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, getValue(self).indexOf(getValue(param0)));
		return result;
	}

	/** Implementation of method subString called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::subString(index, length)
	 */
	public static RuntimeObject substring(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		setValue(result, getValue(self).substring(Integer.getValue(param0), Integer.getValue(param1)));
		return result;
	}

	/** Implementation of method size called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::size()
	 */
	public static RuntimeObject size(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, getValue(self).length());
		return result;
	}
	
	/** Implementation of method replace called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::replace(str1, str2)
	 */
	public static RuntimeObject replace(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		setValue(result, getValue(self).replace(getValue(param0), getValue(param1)));
		return result;
	}
	
	/** Implementation of method replace called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::contains(str1)
	 */
	public static RuntimeObject contains(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self).contains(getValue(param0))) return self.getFactory().getMemory().falseINSTANCE;
		else return self.getFactory().getMemory().trueINSTANCE;
	}
	
	/** Implementation of method replace called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::toUpperCase()
	 */
	public static RuntimeObject toUpperCase(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		setValue(result, getValue(self).toUpperCase());
		return result;
	}
	
	/** Implementation of method replace called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::toLowerCase()
	 */
	public static RuntimeObject toLowerCase(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		setValue(result, getValue(self).toLowerCase());
		return result;
	}
	
	/** Implementation of method replace called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::split(delimiter)
	 */
	public static RuntimeObject split(RuntimeObject self, RuntimeObject param0) {
	
		RuntimeObjectFactory factory = self.getFactory();
	    GenericTypeDefinition typeVarClassDef  = (GenericTypeDefinition)factory.getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::String");
	    fr.irisa.triskell.kermeta.language.structure.Class typeParam = StructureFactory.eINSTANCE.createClass();
	    typeParam.setTypeDefinition(typeVarClassDef);
		
	    RuntimeObject result = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.create("kermeta::standard::OrderedSet", factory, typeParam);
		
		for(java.lang.String string_item : getValue(self).split(getValue(param0))) {
			RuntimeObject addedString = self.getFactory().createObjectFromClassName("kermeta::standard::String");
			setValue(addedString, string_item);
			Collection.add(result, addedString);
		}

		return result;
	}
	
	/** Implementation of method toBoolean called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::toBoolean()
	 */
	public static RuntimeObject toBoolean(RuntimeObject self) {
		java.lang.String val = getValue(self).trim().toLowerCase();
		if (val.equals("true") || val.equals("t") || val.equals("yes") || val.equals("y") || val.equals("1")) 
			return self.getFactory().getMemory().trueINSTANCE;
		else if (val.equals("false") || val.equals("f") || val.equals("no") || val.equals("n") || val.equals("0")) 
			return self.getFactory().getMemory().falseINSTANCE;
		else return self.getFactory().getMemory().voidINSTANCE;
	}
	
	/** Implementation of method toInteger called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::toInteger()
	 */
	public static RuntimeObject toInteger(RuntimeObject self) {
		RuntimeObject result;
		try {
			int val = java.lang.Integer.parseInt(getValue(self).trim());
			result = Integer.create(val, self.getFactory());
		} catch (NumberFormatException e) {
			result = self.getFactory().getMemory().voidINSTANCE;
		}
		return result;
	}
	
	/** Implementation of method toReal called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::String::toReal()
	 */
	public static RuntimeObject toReal(RuntimeObject self) {
		RuntimeObject result;
		try {
			double val = java.lang.Double.parseDouble(getValue(self).trim());
			result = Real.create(val, self.getFactory());
		} catch (NumberFormatException e) {
			result = self.getFactory().getMemory().voidINSTANCE;
		}
		return result;
	}


	/** method used to set a RuntimeObject String with a java value
	 * @param str
	 * @param value
	 */
	public static void setValue(RuntimeObject str, java.lang.String value) {
		// DVK : removed the replace all,
		// I don't know why string should be transformed here
		// if this is for the parser, then the parser must do it
		// FIXME : patch until we know how to use regexp in java...
		//value = value.replaceAll("\\\\n","__newline__");
	    //value = value.replaceAll("\\\\", "");
	    //value = value.replaceAll("__newline__","\n");
	    str.setPrimitiveType(RuntimeObject.STRING_VALUE);
		str.setJavaNativeObject( value);
	}
	
	/**
	 * retreives the java string from the Runtime object Strings
	 * @param str
	 * @return
	 */
	public static java.lang.String getValue(RuntimeObject str) {
		if (!RuntimeObject.STRING_VALUE.equals(str.getPrimitiveType()))
			setValue(str, "");
		return (java.lang.String)str.getJavaNativeObject();
	}
	
	
	public static int nb_str = 0;
	
	public static RuntimeObject create(java.lang.String value, RuntimeObjectFactory factory) {
	    RuntimeObject result = factory.createObjectFromClassName("kermeta::standard::String");
	    setValue(result, value);
	    return result;
	}
	
}
/* END OF FILE */
