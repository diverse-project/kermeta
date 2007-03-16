/* $Id: Object.java,v 1.18 2007-03-16 16:22:58 ffleurey Exp $
 * Project   : Kermeta interpreter
 * File      : Object.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 7, 2005
 * Authors       : 
 *		Zo� Drey <zdrey@irisa.fr>
 * Description : 
 * 		Implementation of Kermeta base type Object
 */


package fr.irisa.triskell.kermeta.runtime.language;

import java.util.ArrayList;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.interpreter.CallFrame;
import fr.irisa.triskell.kermeta.interpreter.ExpressionCallFrame;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.impl.StructureFactoryImpl;
import fr.irisa.triskell.kermeta.loader.expression.DynamicExpressionUnit;
import fr.irisa.triskell.kermeta.runtime.KCoreRuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.typechecker.TypeConformanceChecker;
/**
 *  Implementation of Kermeta base type Object
 *  This act as a wrapper to the concrete java runtime object in memory 
 *  Each methods takes as its first parameter the runtime object corresponding to self object
 *  in kermeta call
 */
public class Object {

	/** Implementation of method getMetaClass called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.getMetaClass() */
	public static RuntimeObject getMetaClass(RuntimeObject self) {
		return self.getMetaclass();
	}

	/** Implementation of method container called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.container() */
	public static RuntimeObject container(RuntimeObject self) {
		if (self.getContainer() == null) return self.getFactory().getMemory().voidINSTANCE;
		return self.getContainer();
	}
	
	/** Implementation of method isInstanceOf called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.isInstanceOf(self, type) */
	public static RuntimeObject isInstanceOf(RuntimeObject self, RuntimeObject cls) {

		fr.irisa.triskell.kermeta.language.structure.Type param_class = null;
		fr.irisa.triskell.kermeta.language.structure.Type actual_class = null;

		// Get the class for the given parameter :
		if(cls.getData().get("kcoreObject") instanceof fr.irisa.triskell.kermeta.language.structure.Type)
			param_class = (fr.irisa.triskell.kermeta.language.structure.Type) cls.getData().get("kcoreObject");

		// Get the class of self :
		if(getMetaClass(self).getData().get("kcoreObject") instanceof fr.irisa.triskell.kermeta.language.structure.Type)
			actual_class = (fr.irisa.triskell.kermeta.language.structure.Type) getMetaClass(self).getData().get("kcoreObject");
		
		// This is just for robusness, it should never occur
		if (actual_class == null)
			throw new KermetaInterpreterError("Error while executing operation isInstanceOf on type Object : The class corresponding to self type could not be determined");
		if (param_class == null)
			throw new KermetaInterpreterError("Error while executing operation isInstanceOf on type Object : The class corresponding to parameter type could not be determined");
		
		// Check type conformance and return the result :
		if (TypeConformanceChecker.conforms(param_class, actual_class))
			return self.getFactory().getMemory().trueINSTANCE;
		else 
			return self.getFactory().getMemory().falseINSTANCE;
	}
	
    /** Implementation of method checkInvariants called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.checkInvariants() */
	public static RuntimeObject checkInvariants(RuntimeObject self) {
		
		 fr.irisa.triskell.kermeta.language.structure.Class metaClass = (fr.irisa.triskell.kermeta.language.structure.Class)self.getMetaclass().getData().get("kcoreObject");
	     ClassDefinition classDef = (ClassDefinition)metaClass.getTypeDefinition();
	     
	     checkConstraintAndPrintMes(classDef, self);
	     checkInheritedInvariants(classDef , self);
         return self.getFactory().getMemory().trueINSTANCE; //if the constraints don't raise any constraint exception then it means that the constraints are true
	}
	
	/**
	 * Search the inherited invariants for a given class defifition 
	 * and call the constraint checking for them
	 * @param cd
	 * @param self
	 * @return
	 */
	protected static RuntimeObject checkInheritedInvariants(ClassDefinition classDef , RuntimeObject self) {
		 Iterator itParents = classDef.getSuperType().iterator();
	     while(itParents.hasNext()) {
	    	 fr.irisa.triskell.kermeta.language.structure.Class metaClass = (fr.irisa.triskell.kermeta.language.structure.Class)itParents.next();
		     ClassDefinition parent = (ClassDefinition)metaClass.getTypeDefinition();
	    	 
		     checkConstraintAndPrintMes(parent, self);		     
	    	 checkInheritedInvariants(parent,self);
	     }
		return self.getFactory().getMemory().trueINSTANCE;
	}
	
	/**
	 * Check the constraints for a given class definition and print a message if a constraint is violated
	 * @param classDef
	 * @param self
	 */
	private static void checkConstraintAndPrintMes(ClassDefinition classDef, RuntimeObject self) {
		java.lang.String message = "";
	     for(Iterator it = classDef.getInv().iterator(); it.hasNext();) {
	    	 Constraint c = (Constraint)it.next();
	    	 if (!checkConstraint(c.getBody(), classDef, self)) {
   			 message += "Inv " + c.getName() + " of class " + classDef.getName() + " violated";
   			 throw KermetaRaisedException.createKermetaException("kermeta::exceptions::ConstraintViolatedInv",
	        			message,
						self.getFactory().getMemory().getCurrentInterpreter(),
						self.getFactory().getMemory(),
						c.getBody(),
						null);
   		 }
	     }
	}
	
	protected static boolean checkConstraint(Expression exp, ClassDefinition classDef, RuntimeObject obj) {
		DynamicExpressionUnit deu = new DynamicExpressionUnit(obj.getFactory().getMemory().getUnit().getPackages(), exp, classDef);
		ExpressionInterpreter interp = obj.getFactory().getMemory().getCurrentInterpreter();
		ExpressionCallFrame ecf = new ExpressionCallFrame(interp.getInterpreterContext(), deu, obj, true);
		return ecf.eval(interp) == obj.getFactory().getMemory().trueINSTANCE;
	}
	

	/** Implementation of method equals called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.equals(element) */
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject param0) {
		if(self == param0) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	

	/** Implementation of method get called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.get(~property) */
	public static RuntimeObject get(RuntimeObject self, RuntimeObject param0) {
		Property property = (Property)param0.getData().get("kcoreObject");
		RuntimeObject result;
		
		if (property.isIsDerived()) {
			fr.irisa.triskell.kermeta.language.structure.Class cls = (fr.irisa.triskell.kermeta.language.structure.Class)self.getMetaclass().getData().get("kcoreObject");
			ExpressionInterpreter interp = self.getFactory().getMemory().getCurrentInterpreter();
			result = interp.getterDerivedProperty(new CallableProperty(property, cls), self, null);
		}
		else {
			result = (RuntimeObject)self.getProperties().get(getPropertyName(param0));
			if (getPropertyUpper(param0) == 1) {
				if (result == null) result = self.getFactory().getMemory().voidINSTANCE;
			}
			else {
				if (result == null) {
					// TODO : Find something to manage uniqueness of properties
					// Note : uniqueness of properties with upper>1 is checked in ReflectiveCollection
					if (!isPropertyOrdered(param0)) result =  ReflectiveCollection.createReflectiveCollection(self, param0);
					else result =  ReflectiveSequence.createReflectiveSequence(self, param0);
					self.getProperties().put(getPropertyName(param0), result);
				}
			}
		}
		return result;
	}

	/** Implementation of method set called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.~set(~property, element)
	 * @param param0 : this RuntimeObject corresponds to a FProperty : 
	 * @param param1 : this RuntimeObject corresponds to the value of the property for self instance (self.getProperties().get(name_of_param0)) 
	 */
	public static RuntimeObject set(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
		set(self, param0, param1, true);
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	public static void set(RuntimeObject self, RuntimeObject param0, RuntimeObject param1, boolean handle_opposite) {
		//setDerivedProperty
		Property property = (Property)param0.getData().get("kcoreObject");
		
		if (property.isIsDerived()) {
			fr.irisa.triskell.kermeta.language.structure.Class cls = (fr.irisa.triskell.kermeta.language.structure.Class)self.getMetaclass().getData().get("kcoreObject");
			ExpressionInterpreter interp = self.getFactory().getMemory().getCurrentInterpreter();
			interp.setDerivedProperty(self, new CallableProperty(property, cls), param1, null);
		}
		else {
			// Unset first if there is an object
			if (isSet(self, param0) == self.getFactory().getMemory().trueINSTANCE)  unSet(self, param0);
	
			if (param1 == self.getFactory().getMemory().voidINSTANCE) return;
			
			// set the new object
			self.getProperties().put(getPropertyName(param0), param1);
			// set containement
			if (isPropertyContainment(param0)) {
			    // if param1 is already contained by an object it should be removed
			    
			    if (param1.getContainer() != null) {
			        removeObjectFromItsContainer(param1);
			    }
			    
			    param1.setContainer(self);
			}
			// handle opposite
			if(handle_opposite) {
				RuntimeObject oproperty = getPropertyOpposite(param0);
				if (oproperty != null) {
					handleOppositeProperySet(param1, oproperty, self);
				}
			}
		}
	}
	
	/**
     * @param param1
     */
    protected static void removeObjectFromItsContainer(RuntimeObject object) {
        RuntimeObject container = object.getContainer();
        if (container == null) return;
        
        // Find the property in which the object is stoted
        fr.irisa.triskell.kermeta.language.structure.Class containerClass = (fr.irisa.triskell.kermeta.language.structure.Class)container.getMetaclass().getData().get("kcoreObject");
        
        Iterator it = InheritanceSearch.callableProperties(containerClass).iterator();
        while (it.hasNext()) {
            CallableProperty cp = (CallableProperty)it.next();
            if (cp.getProperty().isIsComposite()) {
                java.lang.String pname = cp.getProperty().getName();
                if (cp.getProperty().getUpper() == 1) {
                    if (container.getProperties().get(pname) == object) {
                        RuntimeObject prop = container.getFactory().getMemory().getRuntimeObjectForFObject(cp.getProperty());
                        unSet(container, prop);
                    }
                }
                else {
                    RuntimeObject reflect_col = (RuntimeObject)container.getProperties().get(pname);
                    if (reflect_col != null && Collection.getArrayList(reflect_col).contains(object)) {
                        ReflectiveCollection.remove(reflect_col, object);
                    }
                }
                
                
            }
        }
        
    }

    /** Implementation of method container called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.oid() */
	public static RuntimeObject oid(RuntimeObject self) {
		return Integer.create((int)self.getOId(), self.getFactory());
	}

	/** Implementation of method container called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.hashcode() */
	public static RuntimeObject hashcode(RuntimeObject self) {
		return Integer.create((int)self.hashCode(), self.getFactory());
	}
	
	/** Implementation of method container called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.freeze() */
	public static RuntimeObject freeze(RuntimeObject self) {
		self.setFrozen(true);
		
		// If metaclass is kermeta::language::structure::Class
		if(fr.irisa.triskell.kermeta.runtime.language.Class.equals(self.getMetaclass(), self.getFactory().getClassClass()) == self.getFactory().getMemory().trueINSTANCE) {
			RuntimeObject tDef_ro = self.getProperties().get("typeDefinition");

			InterpreterContext ic = self.getFactory().getMemory().getCurrentInterpreter().getInterpreterContext();
			CallFrame cf = (CallFrame) ic.getFrameStack().lastElement();
			fr.irisa.triskell.kermeta.language.structure.Object contextObj = cf.getExpression();

			if(tDef_ro != null) {
				KCoreRuntimeObject tDef_kro = (KCoreRuntimeObject) tDef_ro;
				if(tDef_kro.isFrozen()) {
					StructureFactoryImpl factory = new StructureFactoryImpl();
					fr.irisa.triskell.kermeta.language.structure.Class newClass = factory.createClass();
					
					// Set ClassDefinition
					ClassDefinition cDef = (ClassDefinition) tDef_kro.getData().get("kcoreObject");
					newClass.setTypeDefinition( cDef );
					
					// Set TypeVariableBinding
					RuntimeObject bindings_ro = self.getProperties().get("typeParamBinding");
					if(bindings_ro != null) {
						ArrayList<RuntimeObject> bindings = (ArrayList<RuntimeObject>) bindings_ro.getData().get("CollectionArrayList");
						if(bindings != null) {
							RuntimeObject crtBinding_ro = null;
							TypeVariableBinding typeVB = null;
							RuntimeObject ctrType_ro = null;
							RuntimeObject ctrVar_ro = null;
							fr.irisa.triskell.kermeta.language.structure.Type crtType = null;
							fr.irisa.triskell.kermeta.language.structure.TypeVariable crtTypeVar = null;
							Iterator<RuntimeObject> it = bindings.iterator();
							while(it.hasNext()) {
								crtBinding_ro = it.next();
								
								ctrType_ro = crtBinding_ro.getProperties().get("type");
								crtType = (fr.irisa.triskell.kermeta.language.structure.Type) ctrType_ro.getData().get("kcoreObject"); 
								ctrVar_ro = crtBinding_ro.getProperties().get("variable");
								crtTypeVar = (fr.irisa.triskell.kermeta.language.structure.TypeVariable) ctrVar_ro.getData().get("kcoreObject"); 
								
								typeVB = factory.createTypeVariableBinding();
								typeVB.setType( crtType );
								typeVB.setVariable( crtTypeVar );
								newClass.getTypeParamBinding().add(typeVB);
							}
						}
					}
					
					// If "newClass" compliant with its ClassDefinition "cDef"
					if(checkInvariants(self) == self.getFactory().getMemory().trueINSTANCE) {
						self.getData().put("kcoreObject", newClass);
					}
					else {
						throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
								"Effective parameters of an allocated Class must match formal parameters of its ClassDefinition",
								self.getFactory().getMemory().getCurrentInterpreter(),
								self.getFactory().getMemory(),
								contextObj,
								null);
					}
				}
				else {
					throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
							"ClassDefinition of an allocated Class must be frozen",
							self.getFactory().getMemory().getCurrentInterpreter(),
							self.getFactory().getMemory(),
							contextObj,
							null);
				}
			}
			else {
				throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
						"Allocated Class must have a ClassDefinition before being frozen",
						self.getFactory().getMemory().getCurrentInterpreter(),
						self.getFactory().getMemory(),
						contextObj,
						null); // Throwable
			}
			
		}
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	/** Implementation of method container called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.oid() */
	public static RuntimeObject isFrozen(RuntimeObject self) {
		if (self.isFrozen()) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	/**
	 * @param param1
	 * @param oproperty
	 * @param self
	 */
	public static void handleOppositeProperySet(RuntimeObject object, RuntimeObject property, RuntimeObject value) {
		if (getPropertyUpper(property) == 1) {
		    //Object.unSet(object, property);
			Object.set(object, property, value, false);
		}
		else {
			ReflectiveCollection.add(Object.get(object, property), value, false);
		}
	}

	/** Implementation of method isSet called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.isSet(~property) */
	public static RuntimeObject isSet(RuntimeObject self, RuntimeObject param0) {
	    
		if (self.getProperties().get(getPropertyName(param0)) != null) 
		    return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	/** Implementation of method unSet called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Object.unSet(~property) */
	public static RuntimeObject unSet(RuntimeObject self, RuntimeObject param0) {
		unSet(self,param0, true);
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	public static void unSet(RuntimeObject self, RuntimeObject param0, boolean handle_opposite) {
		if (isSet(self, param0) == self.getFactory().getMemory().falseINSTANCE) return;
		RuntimeObject value = (RuntimeObject)self.getProperties().get(getPropertyName(param0));
		
		if (getPropertyUpper(param0) == 1) {
			if (isPropertyContainment(param0)) value.setContainer(null);
			self.getProperties().remove(getPropertyName(param0));
		}
		else {
			ReflectiveCollection.clear(value);
		}
		if (handle_opposite) {
			RuntimeObject oproperty = getPropertyOpposite(param0);
			if (oproperty != null) {
				handleOppositeProperyUnSet(value, oproperty, self);
			}
		}
	}
	
	public static void handleOppositeProperyUnSet(RuntimeObject object, RuntimeObject property, RuntimeObject value) {
		if (getPropertyUpper(property) == 1) {
			Object.unSet(object, property, false);
		}
		else {
		    
		    RuntimeObject collec = (RuntimeObject)object.getProperties().get(getPropertyName(property));
		    ReflectiveCollection.remove(collec, value, false);
		}
	}
	

	public static int getPropertyUpper(RuntimeObject property) {
		return Integer.getValue((RuntimeObject)property.getProperties().get("upper"));
	}
	
	public static RuntimeObject getPropertyOpposite(RuntimeObject property) {
		return (RuntimeObject)property.getProperties().get("opposite");
	}
	
	public static boolean isPropertyContainment(RuntimeObject property) {
		return Boolean.getValue((RuntimeObject)property.getProperties().get("isComposite"));
	}
	
	public static boolean isPropertyOrdered(RuntimeObject property) {
		return Boolean.getValue((RuntimeObject)property.getProperties().get("isOrdered"));
	}
	
	public static boolean isPropertyUnique(RuntimeObject property) {
		return Boolean.getValue((RuntimeObject)property.getProperties().get("isUnique"));
	}
	
	public static java.lang.String getPropertyName(RuntimeObject property) {
		RuntimeObject ro = (RuntimeObject)property.getProperties().get("name");
		if (ro != null)
			return String.getValue(ro);
		else
			return "";
	}
	
}
/* END OF FILE */
