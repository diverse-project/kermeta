/* $Id: Flora2XSBEngine.java,v 1.7 2007-12-21 15:16:31 bmorin Exp $
 * Project : Kermeta (First iteration)
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 4, 2005
 * Author : rodrigo.tex
 * Description : describe here file content
 * TODO : 
 *  - write here your TODO actions
 *  - ...
 */
package fr.irisa.triskell.kermeta.flora2;

import net.sourceforge.flora.javaAPI.src.FloraObject;
import net.sourceforge.flora.javaAPI.src.FloraSession;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Iterator;
import fr.irisa.triskell.kermeta.runtime.basetypes.Map;
/** 
 * Implementation of input and output methods (see io.kmt)
 */
public class Flora2XSBEngine {
    
    private static FloraSession getSession() {        
        return fr.irisa.triskell.flora2.FloraSessionBuilder.getSession();
    }
    

    public static RuntimeObject executeCommand (RuntimeObject self, RuntimeObject command) {
            java.lang.String strCommand = java.lang.String.valueOf( command.getJavaNativeObject());
            	   getSession().ExecuteCommand(strCommand);
            return self.getFactory().getMemory().voidINSTANCE;
    } 

    public static RuntimeObject executeQueryCommand(RuntimeObject self, RuntimeObject command) {
        java.lang.String strQuery = java.lang.String.valueOf( command.getJavaNativeObject());
        java.util.Iterator ite = getSession().ExecuteQuery(strQuery);
        java.util.List<RuntimeObject> list = new java.util.ArrayList<RuntimeObject>(); 
        while (ite.hasNext()) {
            FloraObject obj = (FloraObject) ite.next();
            RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
            fr.irisa.triskell.kermeta.runtime.basetypes.String.setValue(result, obj.toString());
            list.add(result);
        }
        RuntimeObject iteresult = self.getFactory().createObjectFromClassName("kermeta::standard::Iterator");
        Iterator.setValue(iteresult, list.iterator());    
        return iteresult;
    }
    
    public static RuntimeObject executeQueryCommand(RuntimeObject self, RuntimeObject command, RuntimeObject vars) {
        fr.irisa.triskell.kermeta.language.structure.Class clsString = 
                   createParametrizedClass(self, "kermeta::standard::String", null);             
      
        fr.irisa.triskell.kermeta.language.structure.Class[] hashVariables = {clsString, clsString };
        fr.irisa.triskell.kermeta.language.structure.Class clsHashOfStrings =          
          createParametrizedClass(self, "kermeta::utils::Hashtable", hashVariables);
      
        java.util.List list = new java.util.ArrayList();

        java.lang.String strQuery = java.lang.String.valueOf( command.getJavaNativeObject());
        java.util.Vector<java.lang.String> vectorParams = new java.util.Vector<java.lang.String>();
        
        java.util.ArrayList varlist = Collection.getArrayList(vars);
        java.util.Iterator iteVars = varlist.iterator();
        while ( iteVars.hasNext()){
            String str = java.lang.String.valueOf( ((RuntimeObject) iteVars.next()).getJavaNativeObject());
            vectorParams.add( str);
            //System.out.println("parameters= "+ str);            
        }

        //System.out.println("######################################");               
        //System.out.println("query = "+ strQuery);        
        java.util.Iterator ite = getSession().ExecuteQuery(strQuery, vectorParams); 
        while (ite.hasNext()) {
            //System.out.println("######################################");               
            //System.out.println("The query has responses ");            
            java.util.HashMap hash = (java.util.HashMap) ite.next();
            RuntimeObject hashKermeta = createRuntimeObject(self, clsHashOfStrings);
            
            java.util.Iterator iteKeys = hash.keySet().iterator();
            while (iteKeys.hasNext()) {
               java.lang.String varName = (java.lang.String) iteKeys.next();
               FloraObject value = (FloraObject) hash.get(varName);
               //System.out.println("######################################");               
               //System.out.println("I found "+ varName+" = "+ value.toString());
               RuntimeObject keyKermeta = self.getFactory().createObjectFromClassName("kermeta::standard::String");
               fr.irisa.triskell.kermeta.runtime.basetypes.String.setValue(keyKermeta, varName);
               RuntimeObject valKermeta = self.getFactory().createObjectFromClassName("kermeta::standard::String");
               fr.irisa.triskell.kermeta.runtime.basetypes.String.setValue(valKermeta, value.toString());               
                
               Map.put(hashKermeta, keyKermeta, valKermeta);               
            }
            list.add(hashKermeta);
        } 
       
        
        fr.irisa.triskell.kermeta.language.structure.Class[] iteVariables = {clsHashOfStrings};
        fr.irisa.triskell.kermeta.language.structure.Class clsIteratorOfHash =          
            createParametrizedClass(self, "kermeta::standard::Iterator", iteVariables);       
        
        RuntimeObject iteresult = createRuntimeObject(self, clsIteratorOfHash);
        Iterator.setValue(iteresult, list.iterator());    
        return iteresult;
    }
    
    
    public static RuntimeObject close (RuntimeObject self) {
      close();
      return self.getFactory().getMemory().voidINSTANCE;    
    }
    
    private static void close () {
        FloraSession session = fr.irisa.triskell.flora2.FloraSessionBuilder.getSession();
        if (session != null) session.close();
        session = null;    
      }           
    
    private static RuntimeObject createRuntimeObject(RuntimeObject self, fr.irisa.triskell.kermeta.language.structure.Class classOfObject) {
        return self.getFactory().createRuntimeObjectFromClass(self.getFactory().createMetaClass( classOfObject));        
    }  

    private static fr.irisa.triskell.kermeta.language.structure.Class createParametrizedClass(RuntimeObject self, String className) {
        return createParametrizedClass(self, className, null);        
    }
    
    private static fr.irisa.triskell.kermeta.language.structure.Class createParametrizedClass(RuntimeObject self, String className,
            fr.irisa.triskell.kermeta.language.structure.Class[] variableTypes) {
        // creating a class
        fr.irisa.triskell.kermeta.language.structure.Class it_class = StructureFactory.eINSTANCE.createClass();
        // setting class definition accoarding Classname
        it_class.setTypeDefinition((ClassDefinition) self.getFactory().getMemory().getUnit().getTypeDefinitionByName(className));
        if (variableTypes != null && variableTypes.length > 0) {
            for (int i = 0; i < variableTypes.length; i++) {
                TypeVariableBinding binding = StructureFactory.eINSTANCE.createTypeVariableBinding();
                binding.setVariable((TypeVariable) it_class.getTypeDefinition()
                        .getTypeParameter().get(i));

                binding.setType( variableTypes[i]);
                it_class.getTypeParamBinding().add(binding);                
            }
        } 
        return it_class;
    }
    
    public static void main( java.lang.String[] args){
        getSession();        
        System.out.println("exec sdf command");
          getSession().ExecuteCommand("insert{ A : B}.");
          Flora2XSBEngine.close();          
          System.out.println("End");
      }    

} 
 
